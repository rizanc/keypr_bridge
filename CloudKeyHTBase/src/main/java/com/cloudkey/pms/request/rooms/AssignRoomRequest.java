package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
public class AssignRoomRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	private String roomNumber;

	protected AssignRoomRequest() { /* For serialization */ }

	public AssignRoomRequest(String pmsReservationId, String roomNumber) {
		this.pmsReservationId = pmsReservationId;
		this.roomNumber = roomNumber;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	@JsonIgnore
	public boolean isForSpecificRoom() {
		return roomNumber != null && !roomNumber.isEmpty();
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.toString();
	}
}
