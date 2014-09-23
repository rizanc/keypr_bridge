package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Strings;
import lombok.Value;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertTrue;

/**
 * Request for finding room statuses by either roomNumber XOR (room type, room class or floor number)
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class GetRoomStatusRequest extends PMSRequest {

	@Nullable
	private String roomNumber;

	@Nullable
	private String roomTypeCode;

	@Nullable
	private String roomClassCode;

	@Nullable
	private String floor;

	public GetRoomStatusRequest() {
		this(null, null, null, null);
	}

	public GetRoomStatusRequest(String roomNumber) {
		this(roomNumber, null, null, null);
	}

	public GetRoomStatusRequest(@Nullable String roomTypeCode, @Nullable String roomClassCode, @Nullable String floor) {
		this(null, roomTypeCode, roomClassCode, floor);
	}

	public GetRoomStatusRequest(String roomNumber, String roomTypeCode, String roomClassCode, String floor) {
		this.roomNumber = roomNumber;
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

}
