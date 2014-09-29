package com.cloudkey.pms.request.reservations;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class represents the get bill request of the guest.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(callSuper = true)
public class GetFolioRequest extends AbstractSingleReservationRequest {
	public GetFolioRequest(String pmsReservationId) {
		super(pmsReservationId);
	}
}
