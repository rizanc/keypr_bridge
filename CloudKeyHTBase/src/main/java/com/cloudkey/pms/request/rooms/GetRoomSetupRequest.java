package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Strings;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertFalse;

/**
 * Request for finding room statuses by either roomNumber XOR (room type, room class or floor number)
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class GetRoomSetupRequest extends PMSRequest {

	@Nullable
	String roomNumber;

	@Nullable
	String roomTypeCode;

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

}
