package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Class stores check out request information of the guest.
 *
 * @author vinayk2
 */
public class CheckOutRequest {
    @NotBlank
    @ApiModelProperty(required = true)
    private String pmsReservationId;

	protected CheckOutRequest() { /* For serialization */ }

    public CheckOutRequest(String pmsReservationId) {
        this.pmsReservationId = pmsReservationId;
    }

    public String getPmsReservationId() {
        return pmsReservationId;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("pmsReservationId", pmsReservationId)
                .toString();
    }
}
