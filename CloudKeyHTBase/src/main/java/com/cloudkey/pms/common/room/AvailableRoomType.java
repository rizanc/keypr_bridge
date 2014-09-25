package com.cloudkey.pms.common.room;

import com.cloudkey.pms.common.RoomAmenity;
import com.cloudkey.pms.common.reservation.RoomType;
import lombok.EqualsAndHashCode;
import lombok.Value;

import java.util.List;

/**
 * RoomType information contained in a {@link com.cloudkey.pms.response.rooms.AvailabilityResponse}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class AvailableRoomType extends RoomType {
	Integer numberOfUnits;

	List<RoomAmenity> amenities;

	public AvailableRoomType(String roomTypeCode, String roomTypeName, String roomTypeDescription, String roomClassCode, Integer numberOfUnits, List<RoomAmenity> amenities) {
		super(roomTypeCode, roomTypeName, roomTypeDescription, roomClassCode);
		this.numberOfUnits = numberOfUnits;
		this.amenities = amenities;
	}
}
