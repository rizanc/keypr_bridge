package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.reservation.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

/**
 * This class has carry response of search reservation request made by the client. It has
 * details of status and list of reservation available.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class SearchReservationResponse extends PMSResponse {

    /* Reference variable to store the reservation data list. */
    List<Reservation> reservationList;

}
