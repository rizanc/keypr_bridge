package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores check out request information of the guest.
 *
 * @author vinayk2
 */
public class CheckOutRequest extends AbstractSingleReservationRequest {

	protected CheckOutRequest() { /* For serialization */ }

    public CheckOutRequest(String pmsReservationId) {
        super(pmsReservationId);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .toString();
    }
}
