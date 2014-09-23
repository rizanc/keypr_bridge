package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrder;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

/**
 * This Class has information of bill requested by the guest. It has details of reservations 
 * as well as charges for the facility, avail by the guest.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class GetFolioResponse extends PMSResponse {
    /* Reference variable to store the reservation data */
    Reservation reservation;

    /* Reference variable to store the bill information */
    List<ReservationOrder> reservationOrderList;
}
