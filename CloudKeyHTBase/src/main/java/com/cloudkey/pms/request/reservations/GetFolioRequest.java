package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class represents the get bill request of the guest.
 *
 * @author vinayk2
 */
public class GetFolioRequest extends AbstractSingleReservationRequest {

	protected GetFolioRequest() { /* For serialization */ }

	public GetFolioRequest(String pmsReservationId) {
		super(pmsReservationId);
	}

	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .toString();
    }
}
