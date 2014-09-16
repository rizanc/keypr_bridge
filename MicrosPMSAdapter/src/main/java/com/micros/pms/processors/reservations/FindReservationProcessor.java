package com.micros.pms.processors.reservations;

import com.cloudkey.exceptions.ReservationNotFound;
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
		FetchBookingRequest microsRequest = new FetchBookingRequest()
			.withHotelReference(getDefaultHotelReference());

		if (request.hasPmsReservationId()) {
			microsRequest
				.withResvNameId(IdUtils.internalReservationId(request.getPmsReservationId()));
		} else {
			microsRequest
				.withConfirmationNumber(IdUtils.confirmationNumId(request.getConfirmationNo()))
				.withLegNumber(IdUtils.legNumberId(request.getLegNo()));
		}

		return microsRequest;
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

		if (reservationOpt.isPresent()) {
			return new FindReservationResponse(reservationOpt.get());
		} else {
			throw new ReservationNotFound();
		}
	}

	@Override
	protected FindReservationResponse handleError(ResultStatus result) {
		if (Objects.equals(result.getOperaErrorCode(), "BOOKING_NOT_FOUND")) {
			throw new ReservationNotFound();
		}

		return null;
	}
}
