package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.RoomDetails;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.*;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.GuestCount;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStay;
import com.cloudkey.pms.micros.og.hotelcommon.RoomType;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
import com.cloudkey.pms.micros.og.reservation.FetchBookingFilters;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.ReservationConverter;
import com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryRequest;
import com.cloudkey.pms.micros.ows.reservation.FutureBookingSummaryResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.SearchReservationRequest;
import com.cloudkey.pms.response.reservations.SearchReservationResponse;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.*;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.cloudkey.pms.micros.ows.IdUtils.confirmationNumId;
import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class SearchReservationProcessor extends OWSProcessor<
	SearchReservationRequest,
	SearchReservationResponse,
	FutureBookingSummaryRequest,
	FutureBookingSummaryResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Inject
	protected ReservationConverter reservationConverter;

	@Override
	protected ResultStatus getResultStatus(FutureBookingSummaryResponse response) {
		return response.getResult();
	}

	@Override
	protected FutureBookingSummaryResponse callService(FutureBookingSummaryRequest request, Holder<OGHeader> header) {
		return service.futureBookingSummary(request, header);
	}

	@Override
	protected FutureBookingSummaryRequest toMicrosRequest(SearchReservationRequest request) {
		FutureBookingSummaryRequest microsRequest = new FutureBookingSummaryRequest()
			.withAdditionalFilters(new FetchBookingFilters()
				.withHotelReference(getDefaultHotelReference())
			);

		if (request.getConfirmationNumber() != null) {
			microsRequest.getAdditionalFilters().setConfirmationNumber(confirmationNumId(request.getConfirmationNumber()));
		}

		if (request.getCreditCardNumber() != null) {
			microsRequest.setCreditCardNumber(request.getCreditCardNumber());
		}

		if (request.getExtReferenceNumber() != null || request.getExtReferenceType() != null || request.getExtRefLegNumber() != null) {
			microsRequest.getAdditionalFilters().setExternalSystemNumber(new ExternalReference(
				request.getExtReferenceNumber(),
				request.getExtRefLegNumber(),
				request.getExtReferenceType()
			));
		}

		if (request.getFirstName() != null) {
			microsRequest.setFirstName(request.getFirstName());
		}

		if (request.getLastName() != null) {
			microsRequest.setLastName(request.getLastName());
		}

		if (request.getMembershipType() != null || request.getMembershipNumber() != null) {
			microsRequest.getAdditionalFilters().setMembership(
				new Membership()
					.withMembershipNumber(request.getMembershipNumber())
					.withMembershipType(request.getMembershipType())
			);
		}

		if (request.getPmsReservationId() != null) {
			microsRequest.getAdditionalFilters().setResvNameId(internalReservationId(request.getPmsReservationId()));
		}

		return microsRequest;
	}

	@Override
	protected SearchReservationResponse toPmsResponse(FutureBookingSummaryResponse microsResponse) {
		/* Populate response into Reservation instance */
		return new SearchReservationResponse(Lists.transform(microsResponse.getHotelReservations(), new Function<HotelReservation, com.cloudkey.pms.common.reservation.Reservation>() {
			@Nullable
			@Override
			public com.cloudkey.pms.common.reservation.Reservation apply(@Nullable HotelReservation hotelReservation) {
				return reservationConverter.convertReservation(hotelReservation);
			}
		}));
	}
}

