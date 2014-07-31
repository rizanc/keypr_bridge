package com.cloudkey.pms.request.roomassignments;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
public class ReleaseRoomRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String reservationId;

	protected ReleaseRoomRequest() { /* For serialization */ }

	public ReleaseRoomRequest(String reservationId) {
		this.reservationId = reservationId;
	}

	public String getReservationId() {
		return reservationId;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservationId", reservationId)
			.toString();
	}
}
