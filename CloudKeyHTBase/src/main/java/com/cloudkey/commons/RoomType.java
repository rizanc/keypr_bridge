package com.cloudkey.commons;

import com.cloudkey.pms.common.HotelAmenity;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Class stores room type information.It has information of room code,
 * with all the features and descriptions.
 * 
 * @author niveditat
 *
 */
public class RoomType {

	//Reference Variables.
	private String code;
	private String description;
	private List<HotelAmenity> amenities;
	private Integer maxOccupancy;

	public RoomType() {}

	public RoomType(String code, String description, List<HotelAmenity> amenities, Integer maxOccupancy) {
		this.code = code;
		this.description = description;
		this.amenities = ImmutableList.copyOf(amenities);
		this.maxOccupancy = maxOccupancy;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<HotelAmenity> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<HotelAmenity> amenities) {
		this.amenities = amenities;
	}

	public Integer getMaxOccupancy() {
		return maxOccupancy;
	}

	public void setMaxOccupancy(Integer maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("code", code)
			.add("description", description)
			.add("amenities", amenities)
			.add("maxOccupancy", maxOccupancy)
			.toString();
	}
}
