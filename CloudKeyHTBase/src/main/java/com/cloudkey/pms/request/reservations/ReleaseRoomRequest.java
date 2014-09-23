package com.cloudkey.pms.request.reservations;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class ReleaseRoomRequest extends AbstractSingleReservationRequest {
	public ReleaseRoomRequest(String pmsReservationId) {
		super(pmsReservationId);
	}
}
