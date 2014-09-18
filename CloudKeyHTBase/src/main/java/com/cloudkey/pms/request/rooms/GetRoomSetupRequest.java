package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Strings;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

/**
 * Request for finding room statuses by either roomNumber XOR (room type, room class or floor number)
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GetRoomSetupRequest extends PMSRequest {

	@Nullable
	private String roomNumber;

	@Nullable
	private String roomTypeCode;

	protected GetRoomSetupRequest() { /* For serialization */ }

	public GetRoomSetupRequest(@Nullable String roomNumber, @Nullable String roomTypeCode) {
		this.roomNumber = roomNumber;
		this.roomTypeCode = roomTypeCode;
	}

	@AssertFalse(message = "Room number and type are not both specified")
	private boolean roomNumberXorOthersSpecified() {
		return isRoomNumberSpecified() && isRoomTypeCodeSpecified();
	}

	@JsonIgnore
	public boolean isRoomTypeCodeSpecified() {
		return !Strings.isNullOrEmpty(roomTypeCode);
	}

	@JsonIgnore
	public boolean isRoomNumberSpecified() {
		return !Strings.isNullOrEmpty(roomNumber);
	}

	@Nullable
	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	@Nullable
	public String getRoomNumber() {
		return roomNumber;
	}

}
