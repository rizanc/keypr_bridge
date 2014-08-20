package com.cloudkey.pms.request.roomassignments;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for assign the room.
 * 
 * @author niveditat
 */
public class AssignRoomRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	@NotBlank
	@ApiModelProperty(required = true)
	private String roomTypeCode;

	protected AssignRoomRequest() { /* For serialization */ }

	public AssignRoomRequest(String pmsReservationId, String roomTypeCode) {
		this.pmsReservationId = pmsReservationId;
		this.roomTypeCode = roomTypeCode;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.add("roomTypeCode", roomTypeCode)
			.toString();
	}
}
