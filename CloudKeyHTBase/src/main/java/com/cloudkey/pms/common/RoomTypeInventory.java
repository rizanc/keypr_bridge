package com.cloudkey.pms.common;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This is a bean class, used to hold details of room inventory
 *
 * @author neham
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomTypeInventory {

	//member variables of class
	Integer id;
	RoomType roomType;
	String roomDescription;
	Integer totalRooms;
	Integer totalRoomsAvailable;

}
