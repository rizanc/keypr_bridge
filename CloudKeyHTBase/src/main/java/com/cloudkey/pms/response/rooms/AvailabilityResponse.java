package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.reservation.RatePlan;
import com.cloudkey.pms.common.reservation.RoomRate;
import com.cloudkey.pms.common.room.AvailableRoomType;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Builder;

import java.util.List;

/**
 * @author clamothe
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@Builder
public class AvailabilityResponse extends PMSResponse {
	// TODO: This was created from the RatePlan contained in reservation. Create another one, or reconcile.
	List<RatePlan> ratePlans;

	List<AvailableRoomType> roomTypes;

	List<RoomRate> roomRates;

	RoomStayCharges expectedCharges;

}
