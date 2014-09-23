package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.Value;
import lombok.experimental.NonFinal;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Abstract class for requests which require a pmsReservationId
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
@NonFinal
public class AbstractSingleReservationRequest extends PMSRequest {
	@NonFinal
	@NotBlank
	@ApiModelProperty(required = true)
	String pmsReservationId;

	public AbstractSingleReservationRequest(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public void setPmsReservationId(String pmsReservationId) {
		if (this.pmsReservationId != null) {
			throw new IllegalStateException("pmsReservationId is already set and maybe only set once");
		}

		this.pmsReservationId = pmsReservationId;
	}
}
