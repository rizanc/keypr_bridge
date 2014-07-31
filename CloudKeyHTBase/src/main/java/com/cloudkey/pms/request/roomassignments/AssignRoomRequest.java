package com.cloudkey.pms.request.roomassignments;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
public class AssignRoomRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String confirmationNumber;

	@NotBlank
	@ApiModelProperty(required = true)
	private String roomTypeCode;

	protected AssignRoomRequest() { /* For serialization */ }

	public AssignRoomRequest(String confirmationNumber, String roomTypeCode) {
		this.confirmationNumber = confirmationNumber;
		this.roomTypeCode = roomTypeCode;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("confirmationNumber", confirmationNumber)
			.add("roomTypeCode", roomTypeCode)
			.toString();
	}
}
