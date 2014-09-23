package com.cloudkey.commons;

import com.cloudkey.pms.common.HotelAmenity;
import lombok.Value;

import java.util.List;

/**
 * Class stores room type information.It has information of room code,
 * with all the features and descriptions.
 * 
 * @author niveditat
 *
 */
@Value
public class RoomType {
	String code;
	String description;
	List<HotelAmenity> amenities;
	Integer maxOccupancy;
}
