package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.CreditCard;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.Customer;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.HotelReservation;
import com.cloudkey.pms.micros.og.reservation.ResGuest;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.ows.reservation.CreateBookingRequest;
import com.cloudkey.pms.micros.ows.reservation.CreateBookingResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.CreateReservationRequest;
import com.cloudkey.pms.response.reservations.CreateReservationResponse;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.micros.pms.processors.OWSProcessor;
import org.joda.time.DateTimeZone;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CreateReservationProcessor extends OWSProcessor<
	CreateReservationRequest,
	CreateReservationResponse,
	CreateBookingRequest,
	CreateBookingResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Inject
	@Named("keypr.bridge.micros.timeZoneId")
	protected String timeZoneId;

	@Override
	protected ResultStatus getResultStatus(CreateBookingResponse createBookingResponse) {
		return createBookingResponse.getResult();
	}

	@Override
	protected CreateBookingResponse callService(CreateBookingRequest createBookingRequest, Holder<OGHeader> header) {
		return service.createBooking(createBookingRequest, header);
	}

	@Override
	protected CreateBookingRequest toMicrosRequest(CreateReservationRequest request) {
		TimeSpan value = new TimeSpan(
			request.getArrivalDate().toDateTimeAtStartOfDay().withZone(DateTimeZone.forID(timeZoneId)),
			request.getDepartureDate().toDateTimeAtStartOfDay().withZone(DateTimeZone.forID(timeZoneId)),
			null
		);

		RoomStay roomStay = new RoomStay()
			.withHotelReference(getDefaultHotelReference())
			.withRatePlans(new RatePlan()
				.withRatePlanCode(request.getRatePlanCode()))
			.withRoomTypes(new RoomType()
				.withRoomTypeCode(request.getRoomTypeCode())
				.withNumberOfUnits(1))
			.withRoomRates(new RoomRate()
				.withRoomTypeCode(request.getRoomTypeCode())
				.withRatePlanCode(request.getRatePlanCode()))
			.withGuestCounts(new GuestCountList()
				.withGuestCounts(
					new GuestCount()
						.withAgeQualifyingCode(AgeQualifyingCode.ADULT)
						.withCount(request.getNumAdults()),
					new GuestCount()
						.withAgeQualifyingCode(AgeQualifyingCode.CHILD)
						.withCount(request.getNumChildren()))
				.withIsPerRoom(false))
			.withTimeSpan(value);

		if (request.hasCreditCardDetails()) {
			roomStay.withGuarantee(new Guarantee()
				.withGuaranteeType("CC")
				.withGuaranteesAccepted(new GuaranteeAccepted()
					.withGuaranteeCreditCard(new CreditCard()
							.withCardCode(request.getCardType())
							.withCardHolderName(request.getCardHolderName())
							.withCardNumber(request.getCreditCardNumber())
							.withExpirationDate(request.getExpirationDate())
					)));
		}

		CreateBookingRequest createBookingRequest = new CreateBookingRequest()
			.withHotelReservation(new HotelReservation()
					.withRoomStays(roomStay
						.withResGuestRPHs(new ResGuestRPH(0)))
					.withResGuests(new ResGuest()
						.withProfiles(new Profile()
							.withCustomer(new Customer()
								.withPersonName(new PersonName()
									.withFirstName(request.getFirstName())
									.withLastName(request.getLastName())))))
			);

		return createBookingRequest;
	}

	@Override
	protected CreateReservationResponse toPmsResponse(CreateBookingResponse createBookingResponse) {
		Optional<String> pmsReservationId = IdUtils.findPmsReservationId(createBookingResponse.getHotelReservation().getUniqueIDList());

		return new CreateReservationResponse(pmsReservationId.orNull());
	}

}

