package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class stores the check in response details of the guest. It store the status of
 * check in request made by the guest and details of guest reservation.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class CheckInResponse extends PMSResponse {
    Reservation reservation;
}
