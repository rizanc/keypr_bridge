package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Strings;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertTrue;

/**
 * Request for finding room statuses by either roomNumber XOR (room type, room class or floor number)
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GetRoomStatusRequest extends PMSRequest {

	@Nullable
	private String roomNumber;

	@Nullable
	private String roomTypeCode;

	@Nullable
	private String roomClassCode;

	@Nullable
	private String floor;

	public GetRoomStatusRequest() {}

	public GetRoomStatusRequest(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public GetRoomStatusRequest(@Nullable String roomTypeCode, @Nullable String roomClassCode, @Nullable String floor) {
		this.roomTypeCode = roomTypeCode;
		this.roomClassCode = roomClassCode;
		this.floor = floor;
	}

	@AssertTrue(message = "No other criteria is specified when room number is present")
	private boolean roomNumberXorOthersSpecified() {
		return isRoomNumberSpecified()
			? (!isRoomTypeCodeSpecified() && !isRoomClassCodeSpecified() && !isFloorNumberSpecified())
			: true;
	}

	@JsonIgnore
	public boolean isRoomTypeCodeSpecified() {
		return !Strings.isNullOrEmpty(roomTypeCode);
	}

	@JsonIgnore
	public boolean isRoomNumberSpecified() {
		return !Strings.isNullOrEmpty(roomNumber);
	}

	@JsonIgnore
	public boolean isRoomClassCodeSpecified() {
		return !Strings.isNullOrEmpty(roomClassCode);
	}

	@JsonIgnore
	public boolean isFloorNumberSpecified() {
		return !Strings.isNullOrEmpty(floor);
	}

	@Nullable
	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	@Nullable
	public String getRoomClassCode() {
		return roomClassCode;
	}

	@Nullable
	public String getRoomNumber() {
		return roomNumber;
	}

	@Nullable
	public String getFloor() {
		return floor;
	}
}
