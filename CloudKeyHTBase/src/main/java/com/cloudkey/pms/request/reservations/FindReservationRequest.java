package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * Request for finding a reservation, either by pmsReservationId
 * or by both confirmationNo and legNo.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class FindReservationRequest extends PMSRequest {

	private String pmsReservationId;

	private String confirmationNo;

	private Integer legNo;

	public FindReservationRequest(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public FindReservationRequest(String confirmationNo, Integer legNo) {
		this.confirmationNo = confirmationNo;
		this.legNo = legNo;
	}

	@AssertTrue(message = "Either pmsReservationId or confirmationNo and legNo are specified")
	private boolean isValid() {
		return hasPmsReservationId()
			|| hasConfirmationNoAndLegNo();
	}

	public boolean hasConfirmationNoAndLegNo() {
		return confirmationNo != null && !confirmationNo.isEmpty() && legNo != null;
	}

	public boolean hasPmsReservationId() {
		return pmsReservationId != null && !pmsReservationId.isEmpty();
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getConfirmationNo() {
		return confirmationNo;
	}

	public Integer getLegNo() {
		return legNo;
	}

	@Override
	public String toString() {
		return "FindReservationRequest{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			", confirmationNo='" + confirmationNo + '\'' +
			", legNo=" + legNo +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		FindReservationRequest that = (FindReservationRequest) o;

		if (confirmationNo != null ? !confirmationNo.equals(that.confirmationNo) : that.confirmationNo != null)
			return false;
		if (legNo != null ? !legNo.equals(that.legNo) : that.legNo != null) return false;
		if (pmsReservationId != null ? !pmsReservationId.equals(that.pmsReservationId) : that.pmsReservationId != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = pmsReservationId != null ? pmsReservationId.hashCode() : 0;
		result = 31 * result + (confirmationNo != null ? confirmationNo.hashCode() : 0);
		result = 31 * result + (legNo != null ? legNo.hashCode() : 0);
		return result;
	}
}
