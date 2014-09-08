package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.ows.reservation.FetchBookingRequest;
import com.cloudkey.pms.micros.ows.reservation.FetchBookingResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.FindReservationRequest;
import com.cloudkey.pms.response.reservations.FindReservationResponse;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.cloudkey.pms.micros.ows.IdUtils;

import javax.xml.ws.Holder;
import java.util.Objects;

import static com.cloudkey.pms.micros.ows.IdUtils.confirmationNumId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class FindReservationProcessor extends OWSProcessor<
	FindReservationRequest,
	FindReservationResponse,
	FetchBookingRequest,
	FetchBookingResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FetchBookingResponse response) {
		return response.getResult();
	}

	@Override
	protected FetchBookingResponse callService(FetchBookingRequest request, Holder<OGHeader> header) {
		return service.fetchBooking(request, header);
	}

	@Override
	protected FetchBookingRequest toMicrosRequest(FindReservationRequest request) {
		return new FetchBookingRequest()
			.withHotelReference(getDefaultHotelReference())
			.withConfirmationNumber(confirmationNumId(request.getConfirmationNum()))
			.withLegNumber(IdUtils.legNumberId(request.getLegNum()));
	}

	@Override
	protected FindReservationResponse toPmsResponse(FetchBookingResponse microsResponse) {
		// TODO: Fill out real response
		Reservation reservation = null;

		if (microsResponse.getHotelReservation() != null) {
			reservation = new Reservation();
			Optional<String> pmsReservationId = IdUtils.findPmsReservationId(microsResponse.getHotelReservation().getUniqueIDList());

			if (pmsReservationId.isPresent()) {
				reservation.setPmsReservationId(pmsReservationId.get());
			}
		}

		return new FindReservationResponse(Optional.fromNullable(reservation));
	}

	@Override
	protected FindReservationResponse handleError(ResultStatus result) {
		if (Objects.equals(result.getOperaErrorCode(), "BOOKING_NOT_FOUND")) {
			return new FindReservationResponse(Optional.<Reservation>absent());
		}

		return null;
	}
}
