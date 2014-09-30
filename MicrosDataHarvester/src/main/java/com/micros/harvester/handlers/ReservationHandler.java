package com.micros.harvester.handlers;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.exceptions.ReservationNotFound;
import com.cloudkey.PMSInterface;
import com.cloudkey.pms.request.reservations.FindReservationRequest;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.keypr.pms.micros.oxi.jaxb.reservation.ResGuest;
import com.keypr.pms.micros.oxi.jaxb.reservation.Reservation;
import com.keypr.pms.micros.oxi.jaxb.reservation.ReservationReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * The {@link com.micros.harvester.handlers.OXIPushHandler} which handles
 * {@link com.keypr.pms.micros.oxi.jaxb.reservation.Reservation} pushes from OXI.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ReservationHandler extends AbstractUploadHandler<Reservation, com.cloudkey.pms.common.reservation.Reservation> {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Inject
	protected PMSInterface pms;

	@Override
	protected String getUploadPathSuffix() {
		return "reservation_data";
	}

	@Override
	protected List<com.cloudkey.pms.common.reservation.Reservation> getObjectsToUpload(Reservation reservation) {
		Set<FindReservationRequest> findReservationRequests = createFindReservationRequests(reservation);

		// Attempt to fetch each reservation from OWS
		return findReservations(findReservationRequests);
	}

	/**
	 * Returns a {@link com.cloudkey.pms.request.reservations.FindReservationRequest} for
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
			com.cloudkey.pms.common.reservation.Reservation reservation;
			try {
				reservation = pms.findReservation(findReservationRequest).getReservation();
			} catch (PMSInterfaceException e) {
				log.error("PMS Interface exception occurred while attempting to fetch reservation. Aborting");
				throw e;
			} catch (ReservationNotFound e) {
				// If a reservation cannot be found, skip that reservation
				log.debug("Could not find reservation with confirmNo {} and legNo {}. Ignoring",
					findReservationRequest.getConfirmationNo(),
					findReservationRequest.getLegNo()
				);
				continue;
			}

			owsReservations.add(reservation);
		}

		return owsReservations;
	}
}
