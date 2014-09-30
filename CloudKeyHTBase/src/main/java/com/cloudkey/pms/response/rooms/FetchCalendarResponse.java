package com.cloudkey.pms.response.rooms;

import com.cloudkey.pms.common.DayRoomAvailability;
import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

/**
 * The Class has the details of reservation availability. It has the information of response status
 * as well as details of all rooms available in the hotel.
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
public class FetchCalendarResponse extends PMSResponse {

    List<DayRoomAvailability> availabilityList;

}
