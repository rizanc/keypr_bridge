package com.cloudkey.pms.common.reservation;

import javax.annotation.Nullable;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RoomType {
    private String roomTypeCode;

	@Nullable
    private String roomTypeName;

	@Nullable
    private String roomTypeDescription;

    @Nullable
    private String roomClassCode;

	public RoomType(String roomTypeCode, @Nullable String roomTypeName, @Nullable String roomTypeDescription, @Nullable String roomClassCode) {
		this.roomTypeCode = roomTypeCode;
		this.roomTypeName = roomTypeName;
		this.roomTypeDescription = roomTypeDescription;
		this.roomClassCode = roomClassCode;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	@Nullable
	public String getRoomTypeName() {
		return roomTypeName;
	}

	@Nullable
	public String getRoomTypeDescription() {
		return roomTypeDescription;
	}

	@Nullable
	public String getRoomClassCode() {
		return roomClassCode;
	}

	@Override
	public String toString() {
		return "RoomType{" +
			"roomTypeCode=" + roomTypeCode +
			", roomTypeName='" + roomTypeName + '\'' +
			", roomTypeDescription='" + roomTypeDescription + '\'' +
			", roomClassCode=" + roomClassCode +
			'}';
	}
}
