package com.cloudkey.commons;

import com.cloudkey.pms.common.HotelAmenity;
import com.google.common.collect.ImmutableList;
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

	//Reference Variables.
	String code;
	String description;
	List<HotelAmenity> amenities;
	Integer maxOccupancy;

	public RoomType(String code, String description, List<HotelAmenity> amenities, Integer maxOccupancy) {
		this.code = code;
		this.description = description;
		this.amenities = ImmutableList.copyOf(amenities);
		this.maxOccupancy = maxOccupancy;
	}

}
