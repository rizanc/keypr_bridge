package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.common.room.RoomRepair;
import com.cloudkey.pms.request.PMSRequest;
import com.keypr.bridge.ids.BridgeIds.GuestServiceStatus;
import com.keypr.bridge.ids.BridgeIds.RoomStatus;
import com.keypr.bridge.ids.BridgeIds.TurnDownStatus;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertTrue;

/**
 * Request for updating a room's status, and the turn down service and guest service statuses for the room.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class UpdateRoomStatusRequest extends PMSRequest {

	@ApiModelProperty(required = true)
	private String roomNumber;

	@Nullable
	private RoomStatus roomStatus;

	@Nullable
	private TurnDownStatus turnDownStatus;

	@Nullable
	private GuestServiceStatus guestServiceStatus;

	@Nullable
	private RoomRepair roomRepair;

	protected UpdateRoomStatusRequest() { /* For serialization */ }

	public UpdateRoomStatusRequest(String roomNumber, @Nullable RoomStatus roomStatus, @Nullable TurnDownStatus turnDownStatus, @Nullable GuestServiceStatus guestServiceStatus, RoomRepair roomRepair) {
		this.roomNumber = roomNumber;
		this.roomStatus = roomStatus;
		this.turnDownStatus = turnDownStatus;
		this.guestServiceStatus = guestServiceStatus;
		this.roomRepair = roomRepair;
	}

	@AssertTrue(message = "At least one of roomStatus, turnDownStatus, guestServicesStatus or roomRepair must be specified")
	private boolean isValid() {
		return (roomStatus != null || turnDownStatus != null || guestServiceStatus != null || roomRepair != null);
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		if (this.roomNumber == null) {
			throw new IllegalStateException("Room number is already set and maybe only set once");
		}

		this.roomNumber = roomNumber;
	}

	@Nullable
	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	@Nullable
	public TurnDownStatus getTurnDownStatus() {
		return turnDownStatus;
	}

	@Nullable
	public GuestServiceStatus getGuestServiceStatus() {
		return guestServiceStatus;
	}

	@Nullable
	public RoomRepair getRoomRepair() {
		return roomRepair;
	}

	@Override
	public String toString() {
		return "UpdateRoomStatusRequest{" +
			"roomNumber='" + roomNumber + '\'' +
			", roomStatus=" + roomStatus +
			", turnDownStatus=" + turnDownStatus +
			", guestServiceStatus=" + guestServiceStatus +
			", roomRepair=" + roomRepair +
			'}';
	}
}
