package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

// TODO: There is no endpoint or micros method for this request.
/**
 * This class hold the information of room inventory request made by the guest.
 * 
 * @author vinayk2
 *
 */
public class RoomInventoryRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String roomType;

	protected RoomInventoryRequest() { /* For serialization */ }

	public RoomInventoryRequest(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomType() {
		return roomType;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("roomType", roomType)
			.toString();
	}
}
