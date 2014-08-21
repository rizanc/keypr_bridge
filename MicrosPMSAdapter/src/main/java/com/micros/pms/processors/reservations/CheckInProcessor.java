package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.micros.og.common.CreditCard;
import com.cloudkey.pms.micros.og.common.PersonName;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.Text;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.Room;
import com.cloudkey.pms.micros.og.hotelcommon.RoomFeature;
import com.cloudkey.pms.micros.og.hotelcommon.RoomType;
import com.cloudkey.pms.micros.og.name.NameCreditCard;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.og.reservation.advanced.CheckInComplete;
import com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.CheckInRequest;
import com.cloudkey.pms.response.reservations.CheckInResponse;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import com.micros.pms.util.IdUtils;
import com.micros.pms.util.ParagraphHelper;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
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
	protected CheckInResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse microsResponse) {
		com.cloudkey.pms.response.reservations.CheckInResponse response = new com.cloudkey.pms.response.reservations.CheckInResponse();

		Reservation objReservation = new Reservation();
		response.setReservation(objReservation);

		CheckInComplete objCheckInComplete = microsResponse.getCheckInComplete();

		Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(objCheckInComplete.getReservationID());

		if (pmsReservationIdOpt.isPresent()) {
			objReservation.setPmsReservationId(pmsReservationIdOpt.get());
		}

		ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation();

		objReservation.setReservationRoomAllocationList(new ArrayList<ReservationRoomAllocation>());
		objReservation.getReservationRoomAllocationList().add(objReservationRoomAllocation);

		Room objRoom = objCheckInComplete.getRoom();
		com.cloudkey.commons.RoomType objRoomType = null;

		if (objRoom != null) {
			objReservationRoomAllocation.setRoomNo(objRoom.getRoomNumber());

			RoomType obRoomType = objRoom.getRoomType();
			String roomTypeCode = obRoomType.getRoomTypeCode();

			objRoomType = new com.cloudkey.commons.RoomType(
				roomTypeCode,
				objRoom.getRoomDescription() == null ? null : ParagraphHelper.getFirstStringOfParagraphs(Arrays.asList(objRoom.getRoomDescription())).orNull(),
				obRoomType.getAmenityInfo() == null ? Collections.<HotelAmenity>emptyList() : HotelInformationConverter.convertAmenities(obRoomType.getAmenityInfo().getAmenities()),
				null
			);
		}

		objReservationRoomAllocation.setRoomType(objRoomType);
		//		objReservationRoomAllocation.setRoomRateList( objRoomRateList );

		// Note :  checkin response has only 1 profile information.

		Profile objProfile = microsResponse.getProfile();

		if (objProfile != null) {
			for (NameCreditCard objNameCreditCard : objProfile.getCreditCards()) { // To traverse name credit card.
				log.debug("getCheckInResponseObject: Iterating NameCreditCard Array.");

				objReservation.setCreditCardNumber(objNameCreditCard.getCardNumber());

				log.debug("getCheckInResponseObject: Credit Card Number is set.");
			} // End loop for name credit card.

			if (objProfile.getCustomer() != null && objProfile.getCustomer().getPersonName() != null) {
				PersonName objPersonName = objProfile.getCustomer().getPersonName();

				// Set the first name and last name
				objReservation.setFirstName(objPersonName.getFirstName());
				objReservation.setLastName(objPersonName.getLastName());
			}
		}

		log.debug("getCheckInResponseObject: Exit Profile.");
		response.setReservation(objReservation);

		log.debug("getCheckInResponseObject: Enter in getCheckInResponseObject method.");

		return response;
	}
}
