package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.common.room.RoomRepair;
import com.cloudkey.pms.request.PMSRequest;
import com.keypr.bridge.ids.BridgeIds.GuestServiceStatus;
import com.keypr.bridge.ids.BridgeIds.RoomStatus;
import com.keypr.bridge.ids.BridgeIds.TurnDownStatus;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import lombok.experimental.NonFinal;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertTrue;

/**
 * Request for updating a room's status, and the turn down service and guest service statuses for the room.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class UpdateRoomStatusRequest extends PMSRequest {

	@ApiModelProperty(required = true)
	String roomNumber;

	@Nullable
	RoomStatus roomStatus;

	@Nullable
	TurnDownStatus turnDownStatus;

	@Nullable
	GuestServiceStatus guestServiceStatus;

	@Nullable
	RoomRepair roomRepair;

	@AssertTrue(message = "At least one of roomStatus, turnDownStatus, guestServicesStatus or roomRepair must be specified")
	private boolean isValid() {
		return (roomStatus != null || turnDownStatus != null || guestServiceStatus != null || roomRepair != null);
	}

	public void setRoomNumber(String roomNumber) {
		if (this.roomNumber != null) {
			throw new IllegalStateException("Room number is already set and maybe only set once");
		}

		this.roomNumber = roomNumber;
	}

}
