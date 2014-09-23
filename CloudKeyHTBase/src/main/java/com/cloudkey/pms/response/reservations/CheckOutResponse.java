package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * The Class stores the check out response for the guest. It has the details of check out response
 * from the property management system as well as all information of the reservation.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class CheckOutResponse extends PMSResponse {

    /* Reference variable to store the reservation data. */
    Reservation reservation ;

}
