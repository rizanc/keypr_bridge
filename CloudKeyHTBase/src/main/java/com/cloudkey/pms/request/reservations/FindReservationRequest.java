package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author Charlie La Mothe (charlie@clamothe.com)
 */
public class FindReservationRequest extends PMSRequest {

	@NotEmpty
	@ApiModelProperty(required = true)
	private String confirmationNum;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer legNum;

	public FindReservationRequest(String confirmationNum, Integer legNum) {
		this.confirmationNum = confirmationNum;
		this.legNum = legNum;
	}

	public String getConfirmationNum() {
		return confirmationNum;
	}

	public Integer getLegNum() {
		return legNum;
	}

	@Override
	public String toString() {
		return "FindReservationRequest{" +
			"confirmationNum='" + confirmationNum + '\'' +
			", legNum=" + legNum +
			'}';
	}
}
