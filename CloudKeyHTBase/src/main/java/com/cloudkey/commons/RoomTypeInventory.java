package com.cloudkey.commons;

import com.google.common.base.Objects;

/**
 * This is a bean class, used to hold details of room inventory
 *
 * @author neham
 */

public class RoomTypeInventory {

	//member variables of class
	private Integer id;
	private RoomType roomType;
	private String roomDescription;
	private Integer totalRooms;
	private Integer totalRoomsAvailable;

	// Getters and Setters of member variables

	public String getRoomDescription() {
		return roomDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RoomType getRoomType() {
		if (roomType == null) {
			roomType = new RoomType();
		}
		return roomType;
	}

	public void setRoomType(RoomType roomType) {

		this.roomType = roomType;
	}

	public Integer getTotalRoomsAvailable() {

		return totalRoomsAvailable;
	}

	public void setTotalRoomsAvailable(Integer totalRoomsAvailable) {

		this.totalRoomsAvailable = totalRoomsAvailable;
	}

	public void setRoomDescription(String roomDescription) {

		this.roomDescription = roomDescription;
	}

	public Integer getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(Integer totalRooms) {

		this.totalRooms = totalRooms;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("id", id)
			.add("roomType", roomType)
			.add("roomDescription", roomDescription)
			.add("totalRooms", totalRooms)
			.add("totalRoomsAvailable", totalRoomsAvailable)
			.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoomTypeInventory that = (RoomTypeInventory) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (roomDescription != null ? !roomDescription.equals(that.roomDescription) : that.roomDescription != null)
			return false;
		if (roomType != null ? !roomType.equals(that.roomType) : that.roomType != null) return false;
		if (totalRooms != null ? !totalRooms.equals(that.totalRooms) : that.totalRooms != null) return false;
		if (totalRoomsAvailable != null ? !totalRoomsAvailable.equals(that.totalRoomsAvailable) : that.totalRoomsAvailable != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (roomType != null ? roomType.hashCode() : 0);
		result = 31 * result + (roomDescription != null ? roomDescription.hashCode() : 0);
		result = 31 * result + (totalRooms != null ? totalRooms.hashCode() : 0);
		result = 31 * result + (totalRoomsAvailable != null ? totalRoomsAvailable.hashCode() : 0);
		return result;
	}
}
