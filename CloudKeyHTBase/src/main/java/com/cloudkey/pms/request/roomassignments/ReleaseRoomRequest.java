package com.cloudkey.pms.request.roomassignments;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
public class ReleaseRoomRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	protected ReleaseRoomRequest() { /* For serialization */ }

	public ReleaseRoomRequest(String pmsReservationId) {
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
