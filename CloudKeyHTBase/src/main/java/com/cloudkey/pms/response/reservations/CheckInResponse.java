package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.profile.CustomerProfile;
import com.cloudkey.pms.common.reservation.Room;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * This class stores the check in response details of the guest. It store the status of
 * check in request made by the guest and details of guest reservation.
 *
 * @author vinayk2
 *
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class CheckInResponse extends PMSResponse {
	String roomNumber;
}
