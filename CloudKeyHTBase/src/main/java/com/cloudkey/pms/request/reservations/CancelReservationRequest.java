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
	private String confirmationNumber;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer legNum;

	private String reason;

	protected CancelReservationRequest() { /* For serialization */ }

	public CancelReservationRequest(String confirmationNumber, Integer legNum, String reason) {
		this.confirmationNumber = confirmationNumber;
		this.legNum = legNum;
		this.reason = reason;
	}

	public String getConfirmationNumber() {
		return confirmationNumber;
	}

	public Integer getLegNum() {
		return legNum;
	}

	public String getReason() {
		return reason;
	}

	@Override
	public String toString() {
		return "CancelReservationRequest{" +
			"confirmationNumber='" + confirmationNumber + '\'' +
			", legNum=" + legNum +
			", reason='" + reason + '\'' +
			'}';
	}
}
