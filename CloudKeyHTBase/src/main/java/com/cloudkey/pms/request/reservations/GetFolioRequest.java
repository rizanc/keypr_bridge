package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class represents the get bill request of the guest.
 *
 * @author vinayk2
 */
public class GetFolioRequest {
    @NotBlank
    @ApiModelProperty(required = true)
    private String pmsReservationId;

	protected GetFolioRequest() { /* For serialization */ }

	public GetFolioRequest(String pmsReservationId) {
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
