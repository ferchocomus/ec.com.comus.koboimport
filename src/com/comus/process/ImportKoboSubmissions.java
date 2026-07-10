package com.comus.process;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MBPartner;
import org.compiere.model.MUser;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Trx;
import org.compiere.util.Util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.comus.util.KoboClient;

/**
 * Importa submissions de un formulario KoboToolbox y crea
 * Terceros (C_BPartner) con su contacto (AD_User).
 * Dedup por Value = "KOBO-" + _id del submission.
 */
public class ImportKoboSubmissions extends SvrProcess {

	/** Data Column Names del formulario Kobo del demo COMUS (hardcodeados) */
	private static final String FIELD_NAME  = "Nombre";
	private static final String FIELD_TAXID = "TaxID";
	private static final String FIELD_PHONE = "teléfono";
	private static final String FIELD_EMAIL = "email";

	private String p_KoboBaseURL;
	private String p_KoboApiToken;
	private String p_KoboAssetUID;
	private int p_BPGroupId;
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
			case "BPGroupId":
				p_BPGroupId = para.getParameterAsInt();
				break;
			case "OrgId":
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
		if (p_BPGroupId <= 0)
			throw new AdempiereException("Parámetro requerido faltante: BPGroupId");
		if (p_OrgId < 0)
			throw new AdempiereException("Parámetro requerido faltante: OrgId");
	}

	@Override
	protected String doIt() throws Exception {
		int created = 0;
		int skipped = 0;
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
			long koboId = idElement.getAsLong();
			String searchKey = "KOBO-" + koboId;

			String nombre = getField(submission, FIELD_NAME);
			if (Util.isEmpty(nombre, true)) {
				log.warning("Submission " + koboId + " sin nombre — omitido");
				invalid++;
				continue;
			}

			int existingId = DB.getSQLValue(null,
					"SELECT C_BPartner_ID FROM C_BPartner WHERE Value=? AND AD_Client_ID=?",
					searchKey, getAD_Client_ID());
			if (existingId > 0) {
				skipped++;
				continue;
			}

			String taxId = getField(submission, FIELD_TAXID);
			String phone = getField(submission, FIELD_PHONE);
			String email = getField(submission, FIELD_EMAIL);

			String trxName = Trx.createTrxName("KoboImp");
			Trx trx = Trx.get(trxName, true);
			try {
				MBPartner bp = new MBPartner(getCtx(), 0, trxName);
				bp.setAD_Org_ID(p_OrgId);
				bp.setValue(searchKey);
				bp.setName(nombre);
				bp.setC_BP_Group_ID(p_BPGroupId);
				bp.setIsCustomer(true);
				if (!Util.isEmpty(taxId, true))
					bp.setTaxID(taxId);
				bp.setDescription("KoboToolbox submission " + koboId);
				bp.saveEx();

				if (!Util.isEmpty(email, true) || !Util.isEmpty(phone, true)) {
					MUser user = new MUser(getCtx(), 0, trxName);
					user.setAD_Org_ID(p_OrgId);
					user.setC_BPartner_ID(bp.getC_BPartner_ID());
					user.setName(nombre);
					if (!Util.isEmpty(email, true))
						user.setEMail(email);
					if (!Util.isEmpty(phone, true))
						user.setPhone(phone);
					user.saveEx();
				}

				trx.commit(true);
				created++;
				addLog(bp.getC_BPartner_ID(), null, null, searchKey + " - " + nombre,
						MBPartner.Table_ID, bp.getC_BPartner_ID());
			} catch (Exception e) {
				trx.rollback();
				log.log(Level.SEVERE, "Error submission " + koboId + ": " + e.getMessage(), e);
				errors++;
			} finally {
				trx.close();
			}
		}

		return "Creados: " + created + " | Omitidos: " + skipped
				+ " | Inválidos: " + invalid + " | Errores: " + errors;
	}

	/**
	 * Obtiene el valor de un campo del submission. Primero match exacto;
	 * si no, match por sufijo "grupo/campo" (soporte de grupos de Kobo).
	 */
	private String getField(JsonObject sub, String fieldName) {
		if (sub.has(fieldName) && !sub.get(fieldName).isJsonNull())
			return sub.get(fieldName).getAsString().trim();

		for (Map.Entry<String, JsonElement> e : sub.entrySet()) {
			if (e.getKey().endsWith("/" + fieldName) && !e.getValue().isJsonNull())
				return e.getValue().getAsString().trim();
		}
		return null;
	}
}
