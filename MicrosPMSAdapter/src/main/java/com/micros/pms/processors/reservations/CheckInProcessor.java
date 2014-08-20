package com.micros.pms.processors.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationRoomAllocation;
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
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.HotelInformationConverter;
import com.micros.pms.util.IdUtils;
import com.micros.pms.util.ParagraphHelper;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.Arrays;
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
					new CreditCard().withCardNumber(request.getCreditCardNumber())
				)
			);
	}

	@Override
	protected CheckInResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse microsResponse) {
		com.cloudkey.pms.response.reservations.CheckInResponse response = new com.cloudkey.pms.response.reservations.CheckInResponse();

		Reservation objReservation = new Reservation();
		response.setReservation(objReservation);

		String roomTypeCode;
		String feature;
		String roomNumber;
		StringBuffer objStringBuffer;

		CheckInComplete objCheckInComplete = microsResponse.getCheckInComplete();

		Optional<String> pmsReservationIdOpt = IdUtils.findPmsReservationId(objCheckInComplete.getReservationID());

		if (pmsReservationIdOpt.isPresent()) {
			objReservation.setPmsReservationId(pmsReservationIdOpt.get());
		}

		ReservationRoomAllocation objReservationRoomAllocation = new ReservationRoomAllocation();

		objReservation.setReservationRoomAllocationList(new ArrayList<ReservationRoomAllocation>());
		objReservation.getReservationRoomAllocationList().add(objReservationRoomAllocation);

		Room objRoom = objCheckInComplete.getRoom();

		roomNumber = objRoom.getRoomNumber();
		RoomType obRoomType = objRoom.getRoomType();

		roomTypeCode = obRoomType.getRoomTypeCode();
		feature = obRoomType.getFeature();

		String roomDescription = "";
		List<Text> paragraphs = ParagraphHelper.getTextList(objRoom.getRoomDescription());

		for (Text paragraph : paragraphs) {
			roomDescription += paragraph.getValue();
		}

		// To set the more than 1 feature.
		List<RoomFeature> arrRoomFeatures = obRoomType.getRoomFeatures();
		objStringBuffer = new StringBuffer();

		for (RoomFeature objRoomFeature : arrRoomFeatures) {
			feature = objRoomFeature.getFeature();
			objStringBuffer.append(feature).append(";");
		}

		com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType(
			roomTypeCode,
			ParagraphHelper.getFirstStringOfParagraphs(Arrays.asList(objRoom.getRoomDescription())).orNull(),
			HotelInformationConverter.convertAmenities(obRoomType.getAmenityInfo().getAmenities()),
			null
		);

		objReservationRoomAllocation.setRoomNo(roomNumber);
		objReservationRoomAllocation.setRoomType(objRoomType);
		//		objReservationRoomAllocation.setRoomRateList( objRoomRateList );

		// Note :  checkin response has only 1 profile information.

		Profile objProfile = microsResponse.getProfile();

		for (NameCreditCard objNameCreditCard : objProfile.getCreditCards()) { // To traverse name credit card.
			log.debug("getCheckInResponseObject: Iterating NameCreditCard Array.");

			objReservation.setCreditCardNumber(objNameCreditCard.getCardNumber());

			log.debug("getCheckInResponseObject: Credit Card Number is set.");
		} // End loop for name credit card.

		PersonName objPersonName = objProfile.getCustomer().getPersonName();

		// Set the first name and last name
		objReservation.setFirstName(objPersonName.getFirstName());
		objReservation.setLastName(objPersonName.getLastName());

		log.debug("getCheckInResponseObject: Exit Profile.");
		response.setReservation(objReservation);

		log.debug("getCheckInResponseObject: Enter in getCheckInResponseObject method.");

		return response;
	}
}
