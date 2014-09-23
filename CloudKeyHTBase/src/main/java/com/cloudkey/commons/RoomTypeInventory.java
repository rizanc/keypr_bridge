package com.cloudkey.commons;

import lombok.Value;

/**
 * This is a bean class, used to hold details of room inventory
 *
 * @author neham
 */
@Value
public class RoomTypeInventory {

	//member variables of class
	Integer id;
	RoomType roomType;
	String roomDescription;
	Integer totalRooms;
	Integer totalRoomsAvailable;

}
