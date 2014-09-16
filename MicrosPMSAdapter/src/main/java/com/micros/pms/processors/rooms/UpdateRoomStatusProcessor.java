package com.micros.pms.processors.rooms;

import com.cloudkey.pms.common.room.RoomRepair;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.guestservices.RoomRepairType;
import com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusResponse;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.ows.guestservices.GuestServicesServiceSoap;
import com.cloudkey.pms.request.rooms.UpdateRoomStatusRequest;
import com.cloudkey.pms.response.EmptyResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

import static com.cloudkey.pms.micros.ows.IdUtils.toMicrosEnum;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class UpdateRoomStatusProcessor extends OWSProcessor<
    UpdateRoomStatusRequest,
    EmptyResponse,
    com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusRequest,
    UpdateRoomStatusResponse> {

	@Inject
	protected GuestServicesServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(UpdateRoomStatusResponse response) {
		return response.getResult();
	}

	@Override
	protected UpdateRoomStatusResponse callService(com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusRequest updateRoomStatusRequest, Holder<OGHeader> header) {
		return service.updateRoomStatus(updateRoomStatusRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusRequest toMicrosRequest(UpdateRoomStatusRequest request) {
		com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusRequest microsRequest = new com.cloudkey.pms.micros.og.guestservices.UpdateRoomStatusRequest()
			.withHotelReference(getDefaultHotelReference())
			.withRoomNumber(request.getRoomNumber())
			.withGuestServiceStatus(toMicrosEnum(request.getGuestServiceStatus()))
			.withRoomStatus(toMicrosEnum(request.getRoomStatus()))
			.withTurnDownStatus(toMicrosEnum(request.getTurnDownStatus()));

		RoomRepair repair = request.getRoomRepair();
		if (repair != null) {
			microsRequest.setRoomRepair(new RoomRepairType()
				.withRepairStatus(toMicrosEnum(repair.getRepairStatus()))
				.withReturnStatus(toMicrosEnum(repair.getReturnStatus()))
				.withRepairReason(repair.getRepairReason())
				.withRepairType(repair.getRepairType())
				.withRepairRemarks(repair.getRepairRemarks())
			);

			if (repair.getStart() != null || repair.getEnd() != null) {
				microsRequest.getRoomRepair().setRepairDate(
					new TimeSpan()
						.withStartDate(repair.getStart())
						.withEndDate(repair.getEnd())
				);
			}
		}

		return microsRequest;
	}

	@Override
	protected EmptyResponse toPmsResponse(UpdateRoomStatusResponse updateRoomStatusResponse) {
		return new EmptyResponse();
	}
}
