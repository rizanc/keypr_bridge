package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;
/**
 * This class represents the details of the meeting room in the hotel.
 * 
 * @author vinayk2
 *
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class AvailableProperty {
	String hotel;
	String city;
	String postal;
	
	String largestSeatingCapacity;
	String smallestSeatingCapacity;
	String totalMeetingRooms;
	
	List<MeetingRoom> MeetingRoom;
}