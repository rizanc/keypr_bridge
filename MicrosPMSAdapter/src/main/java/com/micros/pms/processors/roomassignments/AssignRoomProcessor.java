package com.micros.pms.processors.roomassignments;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStatus;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.roomassignments.AssignRoomRequest;
import com.cloudkey.pms.response.roomassignments.AssignRoomResponse;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class AssignRoomProcessor extends OWSProcessor<
	AssignRoomRequest,
	AssignRoomResponse,
	com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest,
	com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Inject
	protected ResvAdvancedServiceSoap advService;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse assignRoomResponse) {
		return assignRoomResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse callService(com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest assignRoomRequest, Holder<OGHeader> header) {
		return service.assignRoom(assignRoomRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest toMicrosRequest(AssignRoomRequest request) {
		String roomTypeCode = request.getRoomTypeCode();

		com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest objAssignRoomRequest = null;

		String nextAvailableRoom = getNextAvailableRoomNumber(roomTypeCode);
		if (nextAvailableRoom != null) {
			objAssignRoomRequest = new com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest();
			objAssignRoomRequest.setRoomNoRequested(nextAvailableRoom);

			objAssignRoomRequest.setResvNameId(internalReservationId(request.getPmsReservationId()));

			HotelReference objHotelReference = getDefaultHotelReference();
			objAssignRoomRequest.setHotelReference(objHotelReference);

			objAssignRoomRequest.setStationID(stationId);

			log.debug("getAssignRoomRequestObject: Exit getAssignRoomRequestObject method ");
		}

		return objAssignRoomRequest;
	}

	@Override
	protected AssignRoomResponse toPmsResponse(com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse microsResponse) {
		return new AssignRoomResponse(microsResponse.getRoomNoAssigned());
	}

	private String getNextAvailableRoomNumber(String roomType) {
		log.debug("getNextAvailableRoomNumber: Enter.");

		FetchRoomStatusRequest req = new FetchRoomStatusRequest()
			.withHotelReference(getDefaultHotelReference())
			.withRoomType(roomType);

		FetchRoomStatusResponse microsResponse = advService.fetchRoomStatus(req, createOGHeaderE());

		errorIfFailure(microsResponse.getResult());

		Optional<RoomStatus> availableRoomOpt = FluentIterable.from(microsResponse.getRoomStatuses()).first();

		String roomNumber = null;

		if (!availableRoomOpt.isPresent()) {
			roomNumber = availableRoomOpt.get().getRoomNumber();
		}

		log.debug("getNextAvailableRoomNumber: {}", roomNumber);

		return roomNumber;
	}

}
