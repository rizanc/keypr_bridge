package com.cloudkey.pms.request.reservations;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Class stores the reservation identifier to release all the rooms assign on it.
 * 
 * @author niveditat
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
public class ReleaseRoomRequest extends AbstractSingleReservationRequest {

	public ReleaseRoomRequest(String pmsReservationId) {
		super(pmsReservationId);
	}
}
