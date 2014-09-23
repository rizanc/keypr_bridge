package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author clamothe
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class CreateReservationResponse extends PMSResponse {

	String pmsReservationId;

}
