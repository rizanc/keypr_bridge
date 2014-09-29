package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.reservation.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * @author clamothe
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class FindReservationResponse extends PMSResponse {
	Reservation reservation;
}
