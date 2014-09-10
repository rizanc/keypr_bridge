package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class Room {
	private RoomType roomType;

	@Nullable
	private String roomTypeName;

    @Nullable
    private String roomNumber;

	@Nullable
    private String roomBlockCode;

	public Room(RoomType roomType, @Nullable String roomTypeName, @Nullable String roomNumber, String roomBlockCode) {
		this.roomType = roomType;
		this.roomTypeName = roomTypeName;
		this.roomNumber = roomNumber;
		this.roomBlockCode = roomBlockCode;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	@Nullable
	public String getRoomNumber() {
		return roomNumber;
	}

	@Nullable
	public String getRoomBlockCode() {
		return roomBlockCode;
	}

	@Override
	public String toString() {
		return "Room{" +
			"roomType=" + roomType +
			", roomNumber=" + roomNumber +
			", roomBlockCode=" + roomBlockCode +
			'}';
	}
}
