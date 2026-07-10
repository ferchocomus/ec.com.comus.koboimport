package com.comus.util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import org.compiere.util.CLogger;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Cliente REST para la API v2 de KoboToolbox.
 * Descarga los submissions de un formulario siguiendo la paginación.
 */
public class KoboClient {

	private static final CLogger log = CLogger.getCLogger(KoboClient.class);

	/** Tope de seguridad de paginación */
	private static final int MAX_PAGES = 20;

	private final String baseUrl;
	private final String apiToken;
	private final String assetUid;
	private final HttpClient httpClient;

	public KoboClient(String baseUrl, String apiToken, String assetUid) {
		this.baseUrl = baseUrl.endsWith("/") ? baseUrl.substring(0, baseUrl.length() - 1) : baseUrl;
		this.apiToken = apiToken;
		this.assetUid = assetUid;
		this.httpClient = HttpClient.newBuilder()
				.connectTimeout(Duration.ofSeconds(10))
				.followRedirects(HttpClient.Redirect.NORMAL)
				.build();
	}

	/**
	 * Devuelve todos los submissions del formulario.
	 * Sigue el campo "next" de la respuesta hasta que sea null (máx. {@value #MAX_PAGES} páginas).
	 */
	public List<JsonObject> getSubmissions() throws Exception {
		List<JsonObject> submissions = new ArrayList<>();
		String url = baseUrl + "/api/v2/assets/" + assetUid + "/data.json";
		int page = 0;

		while (url != null && page < MAX_PAGES) {
			page++;
			if (log.isLoggable(Level.INFO))
				log.info("GET " + url + " (page " + page + ")");

			JsonObject body = fetchPage(url);

			JsonElement results = body.get("results");
			if (results != null && results.isJsonArray()) {
				JsonArray array = results.getAsJsonArray();
				for (JsonElement element : array) {
					if (element.isJsonObject())
						submissions.add(element.getAsJsonObject());
				}
			}

			JsonElement next = body.get("next");
			url = (next != null && !next.isJsonNull()) ? next.getAsString() : null;
		}

		if (url != null)
			log.warning("Se alcanzó el tope de " + MAX_PAGES + " páginas; import parcial");

		return submissions;
	}

	private JsonObject fetchPage(String url) throws Exception {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.timeout(Duration.ofSeconds(30))
				.header("Authorization", "Token " + apiToken)
				.header("Accept", "application/json")
				.GET()
				.build();

		HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

		if (response.statusCode() != 200) {
			String body = response.body() == null ? "" : response.body();
			if (body.length() > 300)
				body = body.substring(0, 300);
			throw new Exception("Kobo API HTTP " + response.statusCode() + ": " + body);
		}

		// gson 2.8.2 (target platform 8.2): JsonParser.parseString estático no existe aún
		return new JsonParser().parse(response.body()).getAsJsonObject();
	}
}
