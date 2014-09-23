package com.cloudkey.pms.request.reservations;

import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class represents the get bill request of the guest.
 *
 * @author vinayk2
 */
@Value
@EqualsAndHashCode(callSuper = true)
public class GetFolioRequest extends AbstractSingleReservationRequest {
	public GetFolioRequest(String pmsReservationId) {
		super(pmsReservationId);
	}
}
