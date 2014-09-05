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
import com.cloudkey.pms.micros.ows.reservation.ModifyBookingRequest;
import com.cloudkey.pms.micros.ows.reservation.ModifyBookingResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.CreateReservationRequest;
import com.cloudkey.pms.request.reservations.ModifyReservationRequest;
import com.cloudkey.pms.response.reservations.CreateReservationResponse;
import com.cloudkey.pms.response.reservations.ModifyReservationResponse;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ModifyReservationProcessor extends OWSProcessor<
	ModifyReservationRequest,
	ModifyReservationResponse,
	ModifyBookingRequest,
	ModifyBookingResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(ModifyBookingResponse modifyBookingResponse) {
		return modifyBookingResponse.getResult();
	}

	@Override
	protected ModifyBookingResponse callService(ModifyBookingRequest modifyBookingRequest, Holder<OGHeader> header) {
		return service.modifyBooking(modifyBookingRequest, header);
	}

	@Override
	protected ModifyBookingRequest toMicrosRequest(ModifyReservationRequest request) {
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
				IdUtils.confirmationNumId(request.getConfirmationNum())
			);
		}

		ModifyBookingRequest modifyBookingRequest = new ModifyBookingRequest()
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
			modifyBookingRequest.setExternalSystemNumber(
				new ExternalReference(request.getExternalReferenceNumber(), request.getExternalReferenceLegNum(), request.getExternalReferenceType())
			);
		}

		return modifyBookingRequest;
	}

	@Override
	protected ModifyReservationResponse toPmsResponse(ModifyBookingResponse modifyBookingResponse) {
		Optional<String> pmsReservationId = IdUtils.findPmsReservationId(modifyBookingResponse.getHotelReservation().getUniqueIDList());

		return new ModifyReservationResponse(pmsReservationId.orNull());
	}

}

