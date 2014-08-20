package com.cloudkey.commons;


import com.google.common.base.Objects;

/**
 * Class stores details of room.
 *
 * @author vinayk2
 */

public class RoomDetails {
	private int id;
	private String roomNumber;

	private RoomType roomType;
	private String roomStatus;
	private String frontOfficeStatus;
	private String houseKeeepingStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public String getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getFrontOfficeStatus() {
		return frontOfficeStatus;
	}

	public void setFrontOfficeStatus(String frontOfficeStatus) {
		this.frontOfficeStatus = frontOfficeStatus;
	}

	public String getHouseKeeepingStatus() {
		return houseKeeepingStatus;
	}

	public void setHouseKeeepingStatus(String houseKeeepingStatus) {
		this.houseKeeepingStatus = houseKeeepingStatus;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomDetails that = (RoomDetails) o;

		if (id != that.id) return false;
		if (frontOfficeStatus != null ? !frontOfficeStatus.equals(that.frontOfficeStatus) : that.frontOfficeStatus != null)
			return false;
		if (houseKeeepingStatus != null ? !houseKeeepingStatus.equals(that.houseKeeepingStatus) : that.houseKeeepingStatus != null)
			return false;
		if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
		if (roomStatus != null ? !roomStatus.equals(that.roomStatus) : that.roomStatus != null) return false;
		if (roomType != null ? !roomType.equals(that.roomType) : that.roomType != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (roomNumber != null ? roomNumber.hashCode() : 0);
		result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
		result = 31 * result + (roomStatus != null ? roomStatus.hashCode() : 0);
		result = 31 * result + (frontOfficeStatus != null ? frontOfficeStatus.hashCode() : 0);
		result = 31 * result + (houseKeeepingStatus != null ? houseKeeepingStatus.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("id", id)
			.add("roomNumber", roomNumber)
			.add("roomType", roomType)
			.add("roomStatus", roomStatus)
			.add("frontOfficeStatus", frontOfficeStatus)
			.add("houseKeeepingStatus", houseKeeepingStatus)
			.toString();
	}
}
