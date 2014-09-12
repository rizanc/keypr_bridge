package com.micros.harvester.handlers;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.request.reservations.FindReservationRequest;
import com.cloudkey.pms.response.reservations.FindReservationResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.keypr.pms.micros.oxi.jaxb.reservation.ResGuest;
import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
import com.keypr.pms.micros.oxi.jaxb.reservation.ReservationReference;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.eclipse.jetty.server.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.*;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ReservationHandler implements OXIPushHandler<Reservation> {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	protected IParserInterface ows;

	@Inject
	protected ObjectMapper objectMapper;

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate.url")
	protected String affiliateServiceUrl;

	@Inject
	@Named("keypr.bridge.micros.harvester.upload.affiliate")
	protected String affiliateId;

	/**
	 * Handle an incoming reservation update from OXI.
	 *
	 * @param reservation
	 */
	@Override
	public void handle(Reservation reservation) {
		Set<FindReservationRequest> findReservationRequests = createFindReservationRequests(reservation);

		// Attempt to fetch each reservation from OWS
		List<com.cloudkey.pms.common.reservation.Reservation> owsReservations = findReservations(findReservationRequests);

		if (!owsReservations.isEmpty()) {
			// Write the reservation list to json
			String jsonReservationsList = null;

			try {
				jsonReservationsList = objectMapper.writeValueAsString(owsReservations);
			} catch (JsonProcessingException e) {
				// We should never come across this.
				log.error("Could not serialize the reservation list to json", e);
			}

			if (jsonReservationsList != null) {
				// Post the json to the keypr_affiliate reservation push endpoint
				try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
					HttpPost httpPost = new HttpPost(getReservationUploadEndpoint());
					httpPost.setEntity(new StringEntity(jsonReservationsList));

					CloseableHttpResponse response = httpClient.execute(httpPost);

					if (response.getStatusLine().getStatusCode() != Response.SC_OK) {
						log.error("Upload responded with status code {}", response.getStatusLine().getStatusCode());

					};
				} catch (IOException e) {
					log.error("Could not connect to the upload endpoint");
				}
			}
		}
	}

	/**
	 * Returns a set of {@link com.cloudkey.pms.request.reservations.FindReservationRequest}s for
	 * each reservation and leg number combination referenced in an OXI Reservation message.
	 *
	 * @param reservation
	 * @return
	 */
	protected Set<FindReservationRequest> createFindReservationRequests(Reservation reservation) {
		Set<FindReservationRequest> findReservationRequests = new HashSet<>();

		// Create a list of FindReservationRequests, one for each referenced reservation.
		// This is expected to be either one reservation or the many legs of the same reservation series.
		for (ResGuest resGuest : reservation.getResGuests()) {
			for (ReservationReference reservationReference : resGuest.getReservationReferences()) {
				// For each reservation ID with a leg number that's a valid integer, add a FindReservationRequest.
				if (Objects.equals(reservationReference.getType(), MicrosIds.OXI.RESERVATION_REFERENCE_ID_TYPE)) {
					Integer legNo = null;

					try {
						legNo = Integer.parseInt(reservationReference.getLegNumber());
					} catch (NumberFormatException e) {
						log.error("Could not parse leg no '{}' of reservation {} as an integer. Skipping",
							reservationReference.getLegNumber(), reservationReference.getReferenceNumber());
					}

					if (legNo != null && reservationReference.getReferenceNumber() != null && !reservationReference.getReferenceNumber().isEmpty()) {
						findReservationRequests.add(new FindReservationRequest(reservationReference.getReferenceNumber(), legNo));
					}
				}
			}
		}
		return findReservationRequests;
	}

	/**
	 * Processes the given {@link com.cloudkey.pms.request.reservations.FindReservationRequest}s,
	 * returning a list of all matching reservations as fetched via OWS.
	 *
	 * @param findReservationRequests
	 * @return
	 */
	protected List<com.cloudkey.pms.common.reservation.Reservation> findReservations(Set<FindReservationRequest> findReservationRequests) {
		List<com.cloudkey.pms.common.reservation.Reservation> owsReservations = new ArrayList<>();

		for (FindReservationRequest findReservationRequest : findReservationRequests) {
			FindReservationResponse reservationResponse;
			try {
				reservationResponse = ows.findReservation(findReservationRequest);
			} catch (PMSInterfaceException e) {
				log.error("PMS Interface exception occurred while attempting to fetch reservation. Aborting", e);
				throw e;
			}

			// If a reservation cannot be found, continue
			if (reservationResponse.getReservation().isPresent()) {
				owsReservations.add(reservationResponse.getReservation().get());
			}
		}

		return owsReservations;
	}

	protected String getReservationUploadEndpoint() {
		return affiliateServiceUrl + affiliateId + "/reservation_data";
	}

}
