package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		FindReservationRequest that = (FindReservationRequest) o;

		if (confirmationNum != null ? !confirmationNum.equals(that.confirmationNum) : that.confirmationNum != null)
			return false;
		if (legNum != null ? !legNum.equals(that.legNum) : that.legNum != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = confirmationNum != null ? confirmationNum.hashCode() : 0;
		result = 31 * result + (legNum != null ? legNum.hashCode() : 0);
		return result;
	}
}
