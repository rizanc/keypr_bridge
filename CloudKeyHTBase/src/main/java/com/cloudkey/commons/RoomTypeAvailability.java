package com.cloudkey.commons;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomTypeAvailability {
	String roomTypeCode;

	Integer totalRooms;

	Integer totalAvailableRooms;

	Integer overBookingLimit;

	Integer soldDeductible;

	Integer soldNonDeductible;
}
