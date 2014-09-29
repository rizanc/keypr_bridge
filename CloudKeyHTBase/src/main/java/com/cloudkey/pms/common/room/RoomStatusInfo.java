package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class RoomStatusInfo {
	@NotNull
	String roomNumber;

	@NotNull
	BridgeIds.RoomStatus roomStatus;

	Boolean isOccupied;

	BridgeIds.GuestServiceStatus guestServiceStatus;

	// TODO: The value returned for this from Micros is not affected when we change turn down status.
	// 		 Don't include this field until we know what it means.
//	Boolean isTurnDownSomething;

	String roomTypeCode;

	LocalDate nextReservationDate;

	// TODO: Asked Costin about this flag. What does true / false mean?
	Boolean houseKeepingInspectionFlag;
}
