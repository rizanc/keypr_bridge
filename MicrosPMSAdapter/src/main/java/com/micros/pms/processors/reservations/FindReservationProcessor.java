package com.micros.pms.processors.reservations;

import com.cloudkey.pms.common.reservation.Reservation;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.ows.ReservationConverter;
import com.cloudkey.pms.micros.ows.reservation.FetchBookingRequest;
import com.cloudkey.pms.micros.ows.reservation.FetchBookingResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.FindReservationRequest;
import com.cloudkey.pms.response.reservations.FindReservationResponse;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
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

	@Inject
	protected ReservationConverter reservationConverter;

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
		Optional<Reservation> reservationOpt = Optional.fromNullable(microsResponse.getHotelReservation()).transform(new Function<HotelReservation, Reservation>() {
			@Nullable
			@Override
			public Reservation apply(HotelReservation hotelReservation) {
				return reservationConverter.convertReservation(hotelReservation);
			}
		});

		return new FindReservationResponse(reservationOpt);
	}

	@Override
	protected FindReservationResponse handleError(ResultStatus result) {
		if (Objects.equals(result.getOperaErrorCode(), "BOOKING_NOT_FOUND")) {
			return new FindReservationResponse(Optional.<Reservation>absent());
		}

		return null;
	}
}
