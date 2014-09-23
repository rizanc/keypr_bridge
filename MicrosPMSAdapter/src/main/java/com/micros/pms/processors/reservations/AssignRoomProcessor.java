package com.micros.pms.processors.reservations;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.GDSResultStatus;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.AssignRoomRequest;
import com.cloudkey.pms.response.reservations.AssignRoomResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.keypr.bridge.ids.BridgeIds;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;
import java.util.Objects;

import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
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
		com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest assignRoomRequest = new com.cloudkey.pms.micros.ows.reservation.AssignRoomRequest()
			.withHotelReference(getDefaultHotelReference())
			.withResvNameId(internalReservationId(request.getPmsReservationId()));

		if (request.isForSpecificRoom()) {
			assignRoomRequest.setRoomNoRequested(request.getRoomNumber());
		}

		return assignRoomRequest;
	}

	@Override
	protected AssignRoomResponse toPmsResponse(com.cloudkey.pms.micros.ows.reservation.AssignRoomResponse microsResponse, AssignRoomRequest request) {
		return new AssignRoomResponse(microsResponse.getRoomNoAssigned());
	}

	@Override
	protected AssignRoomResponse handleError(ResultStatus result) {
		if (result instanceof GDSResultStatus
				&& ((GDSResultStatus) result).getGDSError() != null
				&& Objects.equals(((GDSResultStatus) result).getGDSError().getErrorCode(), "-220")) {
			throw PMSError.forMessage(BridgeIds.PMSErrorMessage.NO_ROOM_AVAILABLE);
		}

		return null;
	}
}
