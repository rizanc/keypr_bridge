package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author clamothe
 */
public class CancelReservationRequest extends PMSRequest {

	@NotEmpty
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	private String reason;

	protected CancelReservationRequest() { /* For serialization */ }

	public CancelReservationRequest(String pmsReservationId, String reason) {
		this.pmsReservationId = pmsReservationId;
		this.reason = reason;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getReason() {
		return reason;
	}

	@Override
	public String toString() {
		return "CancelReservationRequest{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			", reason='" + reason + '\'' +
			'}';
	}
}
