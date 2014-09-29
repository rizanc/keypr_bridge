package com.cloudkey.pms.request.reservations;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * @author clamothe
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(callSuper = true)
public class CancelReservationRequest extends AbstractSingleReservationRequest {

	String reason;

	public CancelReservationRequest(String pmsReservationId, String reason) {
		super(pmsReservationId);
		this.reason = reason;
	}

}
