package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.commons.RoomRate;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.CreditCard;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.Room;
import com.cloudkey.pms.micros.og.hotelcommon.RoomType;
import com.cloudkey.pms.micros.og.name.NameCreditCard;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.advanced.CheckInComplete;
import com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.CheckInRequest;
import com.cloudkey.pms.response.reservations.CheckInResponse;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.micros.pms.util.ParagraphHelper;

import javax.xml.ws.Holder;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class CheckInProcessor extends OWSProcessor<
	CheckInRequest,
	CheckInResponse,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse checkInResponse) {
		return checkInResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse callService(com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest checkInRequest, Holder<OGHeader> header) {
		return service.checkIn(checkInRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest toMicrosRequest(CheckInRequest request) {
		return new com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest()
			.withReservationRequest(createReservationRequest(request.getPmsReservationId()))
			.withCreditCardInfo(
				new CreditCardInfo().withCreditCard(
					new CreditCard()
						.withCardNumber(request.getCreditCardNumber())
						.withExpirationDate(request.getExpirationDate())
						.withCardType(request.getCardType())
						.withCardHolderName(request.getCardHolderName())
				)
			);
	}

	@Override
	protected CheckInResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse microsResponse, CheckInRequest request) {
		Reservation.ReservationBuilder reservationBuilder = Reservation.builder();

		CheckInComplete objCheckInComplete = microsResponse.getCheckInComplete();

		Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(objCheckInComplete.getReservationID());

		if (pmsReservationIdOpt.isPresent()) {
			reservationBuilder.pmsReservationId(pmsReservationIdOpt.get());
		}



		Room objRoom = objCheckInComplete.getRoom();

		com.cloudkey.commons.RoomType objRoomType = null;

		if (objRoom != null) {
			RoomType obRoomType = objRoom.getRoomType();
			String roomTypeCode = obRoomType.getRoomTypeCode();

			objRoomType = new com.cloudkey.commons.RoomType(
				roomTypeCode,
				objRoom.getRoomDescription() == null ? null : ParagraphHelper.getFirstStringOfParagraphs(Arrays.asList(objRoom.getRoomDescription())).orNull(),
				obRoomType.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(obRoomType.getAmenityInfo().getAmenities()),
				null
			);
		}

		ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation(
			objRoom == null ? null : objRoom.getRoomNumber(),
			Collections.<RoomRate>emptyList(),
			objRoomType,
			null
		);

		reservationBuilder.reservationRoomAllocationList(Arrays.asList(objReservationRoomAllocation));

		//		objReservationRoomAllocation.setRoomRateList( objRoomRateList );

		// Note :  checkin response has only 1 profile information.

		Profile objProfile = microsResponse.getProfile();

		if (objProfile != null) {
			for (NameCreditCard objNameCreditCard : objProfile.getCreditCards()) { // To traverse name credit card.
				log.debug("getCheckInResponseObject: Iterating NameCreditCard Array.");

				reservationBuilder.creditCardNumber(objNameCreditCard.getCardNumber());

				log.debug("getCheckInResponseObject: Credit Card Number is set.");
			} // End loop for name credit card.

			if (objProfile.getCustomer() != null && objProfile.getCustomer().getPersonName() != null) {
				PersonName objPersonName = objProfile.getCustomer().getPersonName();

				// Set the first name and last name
				reservationBuilder.firstName(objPersonName.getFirstName());
				reservationBuilder.lastName(objPersonName.getLastName());
			}
		}

		return new CheckInResponse(reservationBuilder.build());
	}
}
