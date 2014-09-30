package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import java.util.List;

/**
 * Class stores the information about the room availability. It stores the room
 * type and the its availability status.
 *
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class DayRoomAvailability {

    /**
     * Date for which availability is checked
     */
	LocalDate date;

    /**
     * List of Room Types that are available
     */
	List<RoomTypeAvailability> roomTypeAvailabilities;
	
}
