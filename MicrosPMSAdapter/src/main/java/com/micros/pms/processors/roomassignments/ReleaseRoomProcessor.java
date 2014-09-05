package com.micros.pms.processors.roomassignments;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.rooms.ReleaseRoomRequest;
import com.cloudkey.pms.response.rooms.ReleaseRoomResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ReleaseRoomProcessor extends OWSProcessor<
	ReleaseRoomRequest,
	ReleaseRoomResponse,
	com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest,
	com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse releaseRoomResponse) {
		return releaseRoomResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse callService(com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest releaseRoomRequest, Holder<OGHeader> header) {
		return service.releaseRoom(releaseRoomRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest toMicrosRequest(ReleaseRoomRequest request) {
		return new com.cloudkey.pms.micros.ows.reservation.ReleaseRoomRequest()
			.withHotelReference(getDefaultHotelReference())
			.withResvNameId(internalReservationId(request.getPmsReservationId()));
	}

	@Override
	protected ReleaseRoomResponse toPmsResponse(com.cloudkey.pms.micros.ows.reservation.ReleaseRoomResponse microsResponse) {
		return new ReleaseRoomResponse();
	}

}
