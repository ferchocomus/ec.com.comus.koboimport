package com.comus.process;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.POInfo;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Trx;
import org.compiere.util.Util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import com.comus.model.I_COMUS_TechnicalVisit;
import com.comus.model.X_COMUS_TechnicalVisit;
import com.comus.util.KoboClient;

/**
 * Importa submissions de un formulario KoboToolbox (Verificacion tecnica de
 * instalaciones y control agricola) hacia COMUS_TechnicalVisit.
 * Dedup/actualizacion por KoboSubmissionID = _id del submission de Kobo.
 *
 * El mapeo de campos es generico: cada clave del JSON de Kobo (despues de
 * quitar el prefijo de grupo, ej. "infraestructura/empacadora/emp_piso" ->
 * "emp_piso") se convierte a PascalCase ("EmpPiso") y se busca esa columna
 * en COMUS_TechnicalVisit; si existe, se asigna con el tipo correcto segun
 * el diccionario. Los campos que no tienen columna (notas, grupos, campos
 * de sistema de Kobo como _uuid, meta/instanceID) simplemente se ignoran.
 */
public class ImportKoboTechnicalVisit extends SvrProcess {

	private String p_KoboBaseURL;
	private String p_KoboApiToken;
	private String p_KoboAssetUID;
	private int p_OrgId;

	private POInfo poInfo;

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
		poInfo = POInfo.getPOInfo(getCtx(), I_COMUS_TechnicalVisit.Table_ID, get_TrxName());

		int created = 0;
		int updated = 0;
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

			String trxName = Trx.createTrxName("KoboTV");
			Trx trx = Trx.get(trxName, true);
			try {
				X_COMUS_TechnicalVisit visit = new Query(getCtx(),
						I_COMUS_TechnicalVisit.Table_Name,
						I_COMUS_TechnicalVisit.COLUMNNAME_KoboSubmissionID + "=?", trxName)
						.setParameters(koboId)
						.setClient_ID()
						.first();
				boolean isNew = visit == null;
				if (isNew) {
					visit = new X_COMUS_TechnicalVisit(getCtx(), 0, trxName);
					visit.setAD_Org_ID(p_OrgId);
				}

				applyGenericFields(visit, submission);
				applySpecialFields(visit, submission, koboId);
				resolveBPartner(visit);

				visit.saveEx();

				trx.commit(true);
				if (isNew)
					created++;
				else
					updated++;
				addLog(visit.get_ID(), null, null,
						"Kobo " + koboId + (isNew ? " (nuevo)" : " (actualizado)"),
						I_COMUS_TechnicalVisit.Table_ID, visit.get_ID());
			} catch (Exception e) {
				trx.rollback();
				log.log(Level.SEVERE, "Error submission " + koboId + ": " + e.getMessage(), e);
				errors++;
			} finally {
				trx.close();
			}
		}

		return "Creados: " + created + " | Actualizados: " + updated
				+ " | Inválidos: " + invalid + " | Errores: " + errors;
	}

	/**
	 * Recorre todas las claves del submission y las asigna a la columna de
	 * COMUS_TechnicalVisit cuyo nombre coincide (en PascalCase) con el nombre
	 * del campo Kobo (sin el prefijo de grupo).
	 */
	private void applyGenericFields(X_COMUS_TechnicalVisit visit, JsonObject submission) {
		for (Map.Entry<String, JsonElement> entry : submission.entrySet()) {
			JsonElement value = entry.getValue();
			if (value == null || !value.isJsonPrimitive())
				continue;

			String columnName = toPascalCase(leafName(entry.getKey()));
			int idx = poInfo.getColumnIndex(columnName);
			if (idx < 0)
				continue;

			String raw = value.getAsString().trim();
			if (raw.isEmpty())
				continue;

			Object converted = convertValue(raw, poInfo.getColumnClass(idx), columnName);
			if (converted != null)
				visit.set_ValueOfColumn(columnName, converted);
		}
	}

	/** Campos que no siguen el mapeo generico 1:1 nombre-de-campo -> columna. */
	private void applySpecialFields(X_COMUS_TechnicalVisit visit, JsonObject submission, String koboId) {
		visit.setKoboSubmissionID(koboId);
		visit.setRawKoboJSON(submission.toString());

		JsonElement subTime = submission.get("_submission_time");
		if (subTime != null && !subTime.isJsonNull()) {
			Timestamp ts = parseTimestamp(subTime.getAsString().trim());
			if (ts != null)
				visit.setKoboSubmissionTime(ts);
		}

		for (Map.Entry<String, JsonElement> entry : submission.entrySet()) {
			JsonElement value = entry.getValue();
			if (value == null || value.isJsonNull() || !"ubicacion_visita".equals(leafName(entry.getKey())))
				continue;
			applyGeopoint(visit, value.getAsString());
			break;
		}
	}

	/** geopoint de ODK/Kobo: "lat lon alt precision" separado por espacios. */
	private void applyGeopoint(X_COMUS_TechnicalVisit visit, String raw) {
		if (Util.isEmpty(raw, true))
			return;
		String[] tokens = raw.trim().split("\\s+");
		try {
			if (tokens.length > 0)
				visit.setUbicacionLatitud(new BigDecimal(tokens[0]));
			if (tokens.length > 1)
				visit.setUbicacionLongitud(new BigDecimal(tokens[1]));
			if (tokens.length > 2)
				visit.setUbicacionAltitud(new BigDecimal(tokens[2]));
			if (tokens.length > 3)
				visit.setUbicacionPrecision(new BigDecimal(tokens[3]));
		} catch (NumberFormatException e) {
			log.warning("Geopoint inválido: " + raw);
		}
	}

	/**
	 * Resuelve el Tercero (productor) por CodigoProductor contra C_BPartner.Value.
	 * Si no se encuentra, se importa igual sin vincular (no se descarta el registro).
	 */
	private void resolveBPartner(X_COMUS_TechnicalVisit visit) {
		String codigoProductor = visit.getCodigoProductor();
		if (Util.isEmpty(codigoProductor, true))
			return;

		int bpartnerId = DB.getSQLValue(visit.get_TrxName(),
				"SELECT C_BPartner_ID FROM C_BPartner"
				+ " WHERE Value=? AND AD_Client_ID=? AND IsActive='Y'"
				+ " ORDER BY C_BPartner_ID",
				codigoProductor.trim(), getAD_Client_ID());
		if (bpartnerId > 0)
			visit.setC_BPartner_ID(bpartnerId);
		else
			log.warning("No existe Tercero con Value=" + codigoProductor + " — se importa sin vincular");
	}

	private Object convertValue(String raw, Class<?> clazz, String columnName) {
		try {
			if (clazz == String.class)
				return raw;
			if (clazz == BigDecimal.class)
				return new BigDecimal(raw.replace(',', '.'));
			if (clazz == Integer.class)
				return Integer.valueOf(new BigDecimal(raw.replace(',', '.')).intValue());
			if (clazz == Timestamp.class)
				return parseTimestamp(raw);
		} catch (Exception e) {
			log.warning("No se pudo convertir '" + raw + "' para columna " + columnName + ": " + e.getMessage());
		}
		return null;
	}

	/** Soporta fecha simple ("2026-07-11") y datetime ISO8601 con u sin offset. */
	private Timestamp parseTimestamp(String raw) {
		try {
			if (raw.length() == 10)
				return Timestamp.valueOf(LocalDate.parse(raw).atStartOfDay());
			try {
				return Timestamp.from(OffsetDateTime.parse(raw).toInstant());
			} catch (Exception e) {
				String noMillis = raw.length() > 19 ? raw.substring(0, 19) : raw;
				return Timestamp.valueOf(LocalDateTime.parse(noMillis));
			}
		} catch (Exception e) {
			log.warning("Fecha/hora no reconocida: " + raw);
			return null;
		}
	}

	/** "infraestructura/empacadora/emp_piso" -> "emp_piso" */
	private static String leafName(String koboKey) {
		int idx = koboKey.lastIndexOf('/');
		return idx >= 0 ? koboKey.substring(idx + 1) : koboKey;
	}

	/** "emp_piso" -> "EmpPiso" (misma convencion usada al generar las columnas AD). */
	private static String toPascalCase(String snakeCase) {
		StringBuilder sb = new StringBuilder();
		for (String part : snakeCase.split("[_-]+")) {
			if (part.isEmpty())
				continue;
			sb.append(Character.toUpperCase(part.charAt(0)));
			if (part.length() > 1)
				sb.append(part.substring(1));
		}
		return sb.toString();
	}
}
