package com.cloudkey.commons;

import lombok.Value;

import java.util.List;
/**
 * This class represents the details of the meeting room in the hotel.
 * 
 * @author vinayk2
 *
 */
@Value
public class AvailableProperty {
	String hotel;
	String city;
	String postal;
	
	String largestSeatingCapacity;
	String smallestSeatingCapacity;
	String totalMeetingRooms;
	
	List<MeetingRoom> MeetingRoom;
}