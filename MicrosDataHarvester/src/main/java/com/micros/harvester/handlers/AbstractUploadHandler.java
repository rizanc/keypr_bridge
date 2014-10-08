package com.micros.harvester.handlers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.micros.harvester.exceptions.HandlingException;
import com.micros.harvester.exceptions.UploadFailureException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.server.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

/**
 * Abstract {@link com.micros.harvester.handlers.OXIPushHandler} implementation
 * for handlers which POST a list of data, serialized as JSON, to an external endpoint.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class AbstractUploadHandler<T, C> implements OXIPushHandler<T> {

	private final Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * Given an OXI message of a specific type, returns any number of objects
	 * to serialize and POST to the upload endpoint.
	 *
	 * @param oxiMessage
	 */
	protected abstract List<C> getObjectsToUpload(T oxiMessage);

	protected abstract String getUploadPathSuffix();

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate.url")
	protected String affiliateServiceUrl;

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate")
	protected String affiliateId;

	@Inject
	protected ObjectMapper objectMapper;

	@Override
	public void handle(T oxiMessage) throws HandlingException {
		List<C> objectsToUpload = getObjectsToUpload(oxiMessage);
		upload(objectsToUpload);
	}

	/**
	 * Uploads a list of objects to an endpoint, by sending an HTTP POST
	 * with a body containing the json-serialization of the object list.
	 *
	 * @param objs
	 */
	private void upload(List<C> objs) throws UploadFailureException {
		if (!objs.isEmpty()) {
			// Write the list to json
			String jsonList = null;

			try {
				jsonList = objectMapper.writeValueAsString(objs);
			} catch (JsonProcessingException e) {
				// We should never come across this.
				log.error("Could not serialize the reservation list to json", e);
			}

			if (jsonList != null) {
				// Post the json to the push endpoint
				log.info("Attempting upload");

				try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
					String uploadEndPoint = affiliateServiceUrl + affiliateId + "/" + getUploadPathSuffix();

					HttpPost httpPost = new HttpPost(uploadEndPoint);
					httpPost.setEntity(new StringEntity(jsonList));

					log.info("Uploading to: {} {}", httpPost.getMethod(), httpPost.getURI());
					log.info("Payload: {}", EntityUtils.toString(httpPost.getEntity()));

					CloseableHttpResponse response = httpClient.execute(httpPost);

					if (response.getStatusLine().getStatusCode() != Response.SC_OK) {
						log.error("Upload failed. Response: {}", response);
						throw new UploadFailureException("Status code not OK: " + response.getStatusLine().getStatusCode());
					} else {
						log.info("Upload successful");
					}
				} catch (IOException e) {
					log.error("Error connecting to the upload endpoint", e);
					throw new UploadFailureException(e);
				}
			}
		}
	}
}
