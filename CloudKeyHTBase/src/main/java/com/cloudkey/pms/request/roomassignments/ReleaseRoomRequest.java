package com.cloudkey.pms.request.roomassignments;

import com.google.common.base.Objects;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
public class ReleaseRoomRequest {
	@NotBlank
	private String reservationId;

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
