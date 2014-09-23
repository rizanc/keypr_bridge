package com.cloudkey.pms.request.reservations;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Class stores check out request information of the guest.
 *
 * @author vinayk2
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class CheckOutRequest extends AbstractSingleReservationRequest {

    public CheckOutRequest(String pmsReservationId) {
        super(pmsReservationId);
    }
}
