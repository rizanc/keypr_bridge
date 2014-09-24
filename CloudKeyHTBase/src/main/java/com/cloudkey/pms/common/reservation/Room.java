package com.cloudkey.pms.common.reservation;

import lombok.Value;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class Room {
	RoomType roomType;

	@Nullable
    String roomNumber;

	@Nullable
    String roomBlockCode;
}
