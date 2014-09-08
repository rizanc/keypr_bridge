package com.cloudkey.pms.request.rooms;

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

	protected AssignRoomRequest() { /* For serialization */ }

	public AssignRoomRequest(String pmsReservationId, String roomTypeCode) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.toString();
	}
}
