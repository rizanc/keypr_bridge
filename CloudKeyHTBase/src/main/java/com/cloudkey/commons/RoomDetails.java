package com.cloudkey.commons;


import lombok.Value;

/**
 * Class stores details of room.
 *
 * @author vinayk2
 */
@Value
public class RoomDetails {
	Integer id;
	String roomNumber;

	RoomType roomType;
	String roomStatus;
	String frontOfficeStatus;
	String houseKeeepingStatus;

}
