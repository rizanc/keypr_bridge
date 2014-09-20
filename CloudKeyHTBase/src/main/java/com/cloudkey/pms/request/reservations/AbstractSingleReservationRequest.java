package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Abstract class for requests which require a pmsReservationId
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class AbstractSingleReservationRequest extends PMSRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	protected String pmsReservationId;

	protected AbstractSingleReservationRequest() { /* For serialization */ }

	public AbstractSingleReservationRequest(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public void setPmsReservationId(String pmsReservationId) {
		if (this.pmsReservationId != null) {
			throw new IllegalStateException("pmsReservationId is already set and maybe only set once");
		}

		this.pmsReservationId = pmsReservationId;
	}
}
