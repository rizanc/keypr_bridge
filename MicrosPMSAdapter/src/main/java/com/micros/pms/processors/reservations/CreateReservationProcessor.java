package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.CreditCard;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.og.name.Customer;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.ExternalReference;
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
import com.micros.pms.processors.OWSProcessor;

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
			.withTimeSpan(new TimeSpan()
				.withStartDate(request.getArrivalDate().toDateTimeAtStartOfDay())
				.withEndDate(request.getDepartureDate().toDateTimeAtStartOfDay()));

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

		HotelReservation hotelReservation = new HotelReservation();

		if (request.hasConfirmationNumber()) {
			hotelReservation.withUniqueIDList(
				IdUtils.confirmationNumId(request.getConfirmationNum()),
				IdUtils.legNumberId(request.getLegNum())
			);
		}

		CreateBookingRequest createBookingRequest = new CreateBookingRequest()
			.withHotelReservation(hotelReservation
					.withRoomStays(roomStay
						.withResGuestRPHs(new ResGuestRPH(0)))
					.withResGuests(new ResGuest()
						.withProfiles(new Profile()
							.withCustomer(new Customer()
								.withPersonName(new PersonName()
									.withFirstName(request.getFirstName())
									.withLastName(request.getLastName())))))
			);

		if (request.hasExternalReference()) {
			createBookingRequest.setExternalSystemNumber(
				new ExternalReference(request.getExternalReferenceNumber(), request.getLegNum(), request.getExternalReferenceType())
			);
		}

		return createBookingRequest;
	}

	@Override
	protected CreateReservationResponse toPmsResponse(CreateBookingResponse createBookingResponse) {
		Optional<String> pmsReservationId = IdUtils.findPmsReservationId(createBookingResponse.getHotelReservation().getUniqueIDList());

		return new CreateReservationResponse(pmsReservationId.orNull());
	}

}

