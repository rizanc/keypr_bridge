package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.reservation.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * This class has carry response of search reservation request made by the client. It has
 * details of status and list of reservation available.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class SearchReservationResponse extends PMSResponse {

    /* Reference variable to store the reservation data list. */
    List<Reservation> reservationList;

}
