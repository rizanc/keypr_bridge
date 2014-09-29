package com.cloudkey.commons;


import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Class stores details of room.
 *
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomDetails {
	Integer id;
	String roomNumber;

	RoomType roomType;
	String roomStatus;
	String frontOfficeStatus;
	String houseKeeepingStatus;

}
