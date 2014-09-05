package com.micros.pms.processors.roomassignments;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.rooms.AssignRoomRequest;
import com.cloudkey.pms.response.rooms.AssignRoomResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

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
		return new com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest()
			.withHotelReference(getDefaultHotelReference())
			.withResvNameId(internalReservationId(request.getPmsReservationId()));
	}

	@Override
	protected AssignRoomResponse toPmsResponse(com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse microsResponse) {
		return new AssignRoomResponse(microsResponse.getRoomNoAssigned());
	}

}
