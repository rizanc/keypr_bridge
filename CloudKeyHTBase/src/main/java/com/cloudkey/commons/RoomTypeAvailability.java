package com.cloudkey.commons;

import com.google.common.base.Objects;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class RoomTypeAvailability {
	protected String roomTypeCode;

	protected Integer totalRooms;

	protected Integer totalAvailableRooms;

	protected Integer overBookingLimit;

	public RoomTypeAvailability(String roomTypeCode, Integer totalRooms, Integer totalAvailableRooms, Integer overBookingLimit) {
		this.roomTypeCode = roomTypeCode;
		this.totalRooms = totalRooms;
		this.totalAvailableRooms = totalAvailableRooms;
		this.overBookingLimit = overBookingLimit;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public Integer getTotalRooms() {
		return totalRooms;
	}

	public Integer getTotalAvailableRooms() {
		return totalAvailableRooms;
	}

	public Integer getOverBookingLimit() {
		return overBookingLimit;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("roomTypeCode", roomTypeCode)
			.add("totalRooms", totalRooms)
			.add("totalAvailableRooms", totalAvailableRooms)
			.add("overBookingLimit", overBookingLimit)
			.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomTypeAvailability that = (RoomTypeAvailability) o;

		if (overBookingLimit != null ? !overBookingLimit.equals(that.overBookingLimit) : that.overBookingLimit != null)
			return false;
		if (roomTypeCode != null ? !roomTypeCode.equals(that.roomTypeCode) : that.roomTypeCode != null) return false;
		if (totalAvailableRooms != null ? !totalAvailableRooms.equals(that.totalAvailableRooms) : that.totalAvailableRooms != null)
			return false;
		if (totalRooms != null ? !totalRooms.equals(that.totalRooms) : that.totalRooms != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = roomTypeCode != null ? roomTypeCode.hashCode() : 0;
		result = 31 * result + (totalRooms != null ? totalRooms.hashCode() : 0);
		result = 31 * result + (overBookingLimit != null ? overBookingLimit.hashCode() : 0);
		result = 31 * result + (totalAvailableRooms != null ? totalAvailableRooms.hashCode() : 0);
		return result;
	}
}
