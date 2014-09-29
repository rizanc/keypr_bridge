package com.cloudkey.pms.request.reservations;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Class stores check out request information of the guest.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(callSuper = true)
public class CheckOutRequest extends AbstractSingleReservationRequest {

	public CheckOutRequest(String pmsReservationId) {
        super(pmsReservationId);
    }
}
