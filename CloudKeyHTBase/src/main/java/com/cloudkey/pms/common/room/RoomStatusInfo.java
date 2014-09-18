package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds;

import javax.validation.constraints.NotNull;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class RoomStatusInfo {
	@NotNull
	private String roomNumber;

	@NotNull
	private BridgeIds.RoomStatus roomStatus;

	private Boolean isOccupied;

	private String roomTypeCode;

	// TODO: Ask Costin about this flag. What does true / false mean?
	private Boolean houseKeepingInspectionFlag;

	// TODO: It's unclear what serviceStatus is or what it's possible values are.
	// Run this by Costin, and possibly implement
//	private boolean serviceStatus;

	public RoomStatusInfo(String roomNumber, BridgeIds.RoomStatus roomStatus, Boolean isOccupied, String roomTypeCode, Boolean houseKeepingInspectionFlag) {
		this.roomNumber = roomNumber;
		this.roomStatus = roomStatus;
		this.isOccupied = isOccupied;
		this.roomTypeCode = roomTypeCode;
		this.houseKeepingInspectionFlag = houseKeepingInspectionFlag;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public BridgeIds.RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public Boolean getIsOccupied() {
		return isOccupied;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public Boolean getHouseKeepingInspectionFlag() {
		return houseKeepingInspectionFlag;
	}

	@Override
	public String toString() {
		return "RoomStatusInfo{" +
			"roomNumber='" + roomNumber + '\'' +
			", roomStatus=" + roomStatus +
			", isOccupied=" + isOccupied +
			", roomTypeCode='" + roomTypeCode + '\'' +
			", houseKeepingInspectionFlag=" + houseKeepingInspectionFlag +
			'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomStatusInfo that = (RoomStatusInfo) o;

		if (houseKeepingInspectionFlag != null ? !houseKeepingInspectionFlag.equals(that.houseKeepingInspectionFlag) : that.houseKeepingInspectionFlag != null)
			return false;
		if (isOccupied != null ? !isOccupied.equals(that.isOccupied) : that.isOccupied != null) return false;
		if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
		if (roomStatus != that.roomStatus) return false;
		if (roomTypeCode != null ? !roomTypeCode.equals(that.roomTypeCode) : that.roomTypeCode != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = roomNumber != null ? roomNumber.hashCode() : 0;
		result = 31 * result + (roomStatus != null ? roomStatus.hashCode() : 0);
		result = 31 * result + (isOccupied != null ? isOccupied.hashCode() : 0);
		result = 31 * result + (roomTypeCode != null ? roomTypeCode.hashCode() : 0);
		result = 31 * result + (houseKeepingInspectionFlag != null ? houseKeepingInspectionFlag.hashCode() : 0);
		return result;
	}
}
