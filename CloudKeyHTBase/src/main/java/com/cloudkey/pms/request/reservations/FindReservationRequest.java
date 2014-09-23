package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * Request for finding a reservation, either by pmsReservationId
 * or by both confirmationNo and legNo.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class FindReservationRequest extends PMSRequest {

	private String pmsReservationId;

	private String confirmationNo;

	private Integer legNo;

	public FindReservationRequest(String pmsReservationId) {
		this(pmsReservationId, null, null);
	}

	public FindReservationRequest(String confirmationNo, Integer legNo) {
		this(null, confirmationNo, legNo);
	}

	public FindReservationRequest(String pmsReservationId, String confirmationNo, Integer legNo) {
		this.pmsReservationId = pmsReservationId;
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

}
