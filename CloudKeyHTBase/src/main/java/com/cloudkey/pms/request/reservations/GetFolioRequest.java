package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class represents the get bill request of the guest.
 *
 * @author vinayk2
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class GetFolioRequest extends AbstractSingleReservationRequest {

	public GetFolioRequest(String pmsReservationId) {
		super(pmsReservationId);
	}
}
