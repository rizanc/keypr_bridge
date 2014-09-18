package com.micros.pms.processors.rooms;

import com.cloudkey.pms.common.room.RoomStatusInfo;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStatus;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.rooms.GetRoomStatusRequest;
import com.cloudkey.pms.response.rooms.GetRoomStatusResponse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class GetRoomStatusProcessor extends OWSProcessor<
	GetRoomStatusRequest,
	GetRoomStatusResponse,
	FetchRoomStatusRequest,
	FetchRoomStatusResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FetchRoomStatusResponse fetchRoomStatusResponse) {
		return fetchRoomStatusResponse.getResult();
	}

	@Override
	protected FetchRoomStatusResponse callService(FetchRoomStatusRequest fetchRoomStatusRequest, Holder<OGHeader> header) {
		return service.fetchRoomStatus(fetchRoomStatusRequest, header);
	}

	@Override
	protected FetchRoomStatusRequest toMicrosRequest(GetRoomStatusRequest request) {
		FetchRoomStatusRequest microsRequest = new FetchRoomStatusRequest()
			.withHotelReference(getDefaultHotelReference());

		if (request.isRoomNumberSpecified()) {
			microsRequest.setRoomNumber(request.getRoomNumber());
		}

		if (request.isRoomTypeCodeSpecified()) {
			microsRequest.setRoomType(request.getRoomTypeCode());
		}

		if (request.isRoomClassCodeSpecified()) {
			microsRequest.withRoomClass(request.getRoomClassCode());
		}

		if (request.isFloorNumberSpecified()) {
			microsRequest.withFloorNumber(request.getFloor());
		}

		return microsRequest;
	}

	@Override
	protected GetRoomStatusResponse toPmsResponse(FetchRoomStatusResponse microsResponse, GetRoomStatusRequest request) {
		return new GetRoomStatusResponse(Lists.transform(microsResponse.getRoomStatuses(), new Function<RoomStatus, RoomStatusInfo>() {
			@Nullable
			@Override
			public RoomStatusInfo apply(RoomStatus status) {
				return new RoomStatusInfo(
					status.getRoomNumber(),
					MicrosIds.OWS.RoomStatus.parseString(status.getRoomStatus()),
					MicrosIds.OWS.FrontOfficeStatus.parseString(status.getFrontOfficeStatus()),
					MicrosIds.OWS.ServiceStatus.parseString(status.getServiceStatus()),
					status.getRoomType(),
					status.getNextReservationDate(),
					IdUtils.parseYNString(status.getHouseKeepingInspectionFlag())
				);
			}
		}));
	}
}
