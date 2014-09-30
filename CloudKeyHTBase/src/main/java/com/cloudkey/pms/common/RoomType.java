package com.cloudkey.pms.common;

import com.cloudkey.pms.common.hotel.HotelAmenity;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.util.List;

/**
 * Class stores room type information.It has information of room code,
 * with all the features and descriptions.
 * 
 * @author niveditat
 *
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomType {
	String code;
	String description;
	List<HotelAmenity> amenities;
	Integer maxOccupancy;
}
