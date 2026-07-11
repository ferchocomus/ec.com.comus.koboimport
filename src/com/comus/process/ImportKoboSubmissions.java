package com.comus.process;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Trx;
import org.compiere.util.Util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.comus.model.I_C_BPartner_Extradata;
import com.comus.model.X_C_BPartner_Extradata;
import com.comus.util.KoboClient;

/**
 * Importa submissions de un formulario KoboToolbox hacia C_BPartner_Extradata.
 * Busca el Tercero existente por TaxID y lo asigna al registro.
 * Dedup/actualización por KoboSubmissionID = _id del submission de Kobo.
 */
public class ImportKoboSubmissions extends SvrProcess {

	/** Data Column Names del formulario Kobo del demo COMUS (hardcodeados) */
	private static final String FIELD_TAXID   = "TaxID";
	private static final String FIELD_NATURAL = "Persona Natural";
	private static final String FIELD_GENDER  = "Genero";

	private String p_KoboBaseURL;
	private String p_KoboApiToken;
	private String p_KoboAssetUID;
	private int p_OrgId;

	@Override
	protected void prepare() {
		for (ProcessInfoParameter para : getParameter()) {
			String name = para.getParameterName();
			if (para.getParameter() == null)
				continue;
			switch (name) {
			case "KoboBaseURL":
				p_KoboBaseURL = para.getParameterAsString();
				break;
			case "KoboApiToken":
				p_KoboApiToken = para.getParameterAsString();
				break;
			case "KoboAssetUID":
				p_KoboAssetUID = para.getParameterAsString();
				break;
			case "AD_Org_ID":
				p_OrgId = para.getParameterAsInt();
				break;
			default:
				log.log(Level.WARNING, "Parámetro desconocido: " + name);
				break;
			}
		}

		if (Util.isEmpty(p_KoboBaseURL, true))
			throw new AdempiereException("Parámetro requerido faltante: KoboBaseURL");
		if (Util.isEmpty(p_KoboApiToken, true))
			throw new AdempiereException("Parámetro requerido faltante: KoboApiToken");
		if (Util.isEmpty(p_KoboAssetUID, true))
			throw new AdempiereException("Parámetro requerido faltante: KoboAssetUID");
		if (p_OrgId < 0)
			throw new AdempiereException("Parámetro requerido faltante: OrgId");
	}

	@Override
	protected String doIt() throws Exception {
		int created = 0;
		int updated = 0;
		int noBPartner = 0;
		int invalid = 0;
		int errors = 0;

		KoboClient client = new KoboClient(p_KoboBaseURL, p_KoboApiToken, p_KoboAssetUID);
		List<JsonObject> submissions;
		try {
			submissions = client.getSubmissions();
		} catch (Exception e) {
			log.log(Level.SEVERE, "Error consultando KoboToolbox", e);
			throw new AdempiereException("Error consultando KoboToolbox: " + e.getMessage());
		}

		if (log.isLoggable(Level.INFO))
			log.info("Submissions recibidos: " + submissions.size());

		for (JsonObject submission : submissions) {
			JsonElement idElement = submission.get("_id");
			if (idElement == null || idElement.isJsonNull()) {
				log.warning("Submission sin _id — omitido");
				invalid++;
				continue;
			}
			String koboId = idElement.getAsString().trim();

			String taxId = getField(submission, FIELD_TAXID);
			if (Util.isEmpty(taxId, true)) {
				log.warning("Submission " + koboId + " sin TaxID — omitido");
				invalid++;
				continue;
			}

			int bpartnerId = DB.getSQLValue(null,
					"SELECT C_BPartner_ID FROM C_BPartner"
					+ " WHERE TaxID=? AND AD_Client_ID=? AND IsActive='Y'"
					+ " ORDER BY C_BPartner_ID",
					taxId, getAD_Client_ID());
			if (bpartnerId <= 0) {
				log.warning("Submission " + koboId + ": no existe Tercero con TaxID "
						+ taxId + " — omitido");
				noBPartner++;
				continue;
			}

			String naturalPerson = getField(submission, FIELD_NATURAL);
			String gender = toGenderListValue(getField(submission, FIELD_GENDER));

			String trxName = Trx.createTrxName("KoboImp");
			Trx trx = Trx.get(trxName, true);
			try {
				X_C_BPartner_Extradata extra = new Query(getCtx(),
						I_C_BPartner_Extradata.Table_Name,
						I_C_BPartner_Extradata.COLUMNNAME_KoboSubmissionID + "=?", trxName)
						.setParameters(koboId)
						.setClient_ID()
						.first();
				boolean isNew = extra == null;
				if (isNew) {
					extra = new X_C_BPartner_Extradata(getCtx(), 0, trxName);
					extra.setAD_Org_ID(p_OrgId);
					extra.setKoboSubmissionID(koboId);
				}
				extra.setC_BPartner_ID(bpartnerId);
				// "Persona Natural" es una pregunta acknowledge de Kobo: llega "OK" cuando fue marcada
				extra.setIsNaturalPerson(!Util.isEmpty(naturalPerson, true));
				extra.setGender(gender);
				extra.saveEx();

				trx.commit(true);
				if (isNew)
					created++;
				else
					updated++;
				addLog(extra.getC_BPartner_Extradata_ID(), null, null,
						"Kobo " + koboId + " -> TaxID " + taxId
						+ (isNew ? " (nuevo)" : " (actualizado)"),
						I_C_BPartner_Extradata.Table_ID, extra.getC_BPartner_Extradata_ID());
			} catch (Exception e) {
				trx.rollback();
				log.log(Level.SEVERE, "Error submission " + koboId + ": " + e.getMessage(), e);
				errors++;
			} finally {
				trx.close();
			}
		}

		return "Creados: " + created + " | Actualizados: " + updated
				+ " | Sin Tercero: " + noBPartner
				+ " | Inválidos: " + invalid + " | Errores: " + errors;
	}

	/**
	 * Obtiene el valor de un campo del submission. Primero match exacto;
	 * si no, la variante con "_" en lugar de espacios (nombres XML de Kobo);
	 * si no, match por sufijo "grupo/campo" (soporte de grupos de Kobo).
	 */
	private String getField(JsonObject sub, String fieldName) {
		String[] candidates = { fieldName, fieldName.replace(' ', '_') };
		for (String candidate : candidates) {
			if (sub.has(candidate) && !sub.get(candidate).isJsonNull())
				return sub.get(candidate).getAsString().trim();
		}
		for (Map.Entry<String, JsonElement> e : sub.entrySet()) {
			for (String candidate : candidates) {
				if (e.getKey().endsWith("/" + candidate) && !e.getValue().isJsonNull())
					return e.getValue().getAsString().trim();
			}
		}
		return null;
	}

	/**
	 * Mapea el valor de "Genero" del formulario Kobo (ej. MASCULINO/FEMENINO/
	 * SUBREPRESENTADO, en cualquier capitalización) al valor de la lista
	 * Gender de C_BPartner_Extradata (MA/FE/SU). Devuelve null si no matchea.
	 */
	private String toGenderListValue(String koboGender) {
		if (Util.isEmpty(koboGender, true))
			return null;
		String value = koboGender.trim().toUpperCase();
		if (value.startsWith("MASCUL"))
			return X_C_BPartner_Extradata.GENDER_Masculino;
		if (value.startsWith("FEMEN"))
			return X_C_BPartner_Extradata.GENDER_Femenino;
		if (value.startsWith("SUBREPRESENT"))
			return X_C_BPartner_Extradata.GENDER_Subrepresentado;
		log.warning("Genero no reconocido: " + koboGender);
		return null;
	}
}
