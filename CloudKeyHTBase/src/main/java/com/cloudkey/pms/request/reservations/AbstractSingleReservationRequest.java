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
	private String pmsReservationId;

	protected AbstractSingleReservationRequest() { /* For serialization */ }

	public AbstractSingleReservationRequest(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}
}
