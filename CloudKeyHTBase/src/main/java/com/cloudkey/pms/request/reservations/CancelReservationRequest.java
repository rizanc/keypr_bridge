package com.cloudkey.pms.request.reservations;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * @author clamothe
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class CancelReservationRequest extends AbstractSingleReservationRequest {

	String reason;

	public CancelReservationRequest(String pmsReservationId, String reason) {
		super(pmsReservationId);
		this.reason = reason;
	}

}
