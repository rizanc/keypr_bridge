package com.cloudkey.commons;

import lombok.Value;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class RoomTypeAvailability {
	String roomTypeCode;

	Integer totalRooms;

	Integer totalAvailableRooms;

	Integer overBookingLimit;
}
