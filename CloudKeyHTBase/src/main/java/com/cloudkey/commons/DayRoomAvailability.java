package com.cloudkey.commons;

import lombok.Value;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Class stores the information about the room availability. It stores the room
 * type and the its availability status.
 *
 * @author vinayk2
 *
 */
@Value
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
