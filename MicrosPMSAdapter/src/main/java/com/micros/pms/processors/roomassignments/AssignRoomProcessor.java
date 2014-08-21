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
			.withStationID(stationId)
			.withResvNameId(internalReservationId(request.getPmsReservationId()));
	}

	@Override
	protected AssignRoomResponse toPmsResponse(com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse microsResponse) {
		return new AssignRoomResponse(microsResponse.getRoomNoAssigned());
	}

}
