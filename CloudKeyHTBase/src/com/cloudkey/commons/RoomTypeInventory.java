package com.cloudkey.commons;

/**
 * This is a bean class, used to hold details of room inventory
 * @author neham
 * 
 * */


public class RoomTypeInventory {

	//member variables of class
	private int id;
	private RoomType roomType;
	private String roomDescription;
	private int totalRooms;
	private int totalRoomsAvailable;

	// Getters and Setters of member variables
		
	public String getRoomDescription() {
		
		return roomDescription;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RoomType getRoomType() {

		if( roomType == null ) {

			roomType = new RoomType();
		}
		return roomType;
	}

	public void setRoomType(RoomType roomType) {

		this.roomType = roomType;
	}

	public int getTotalRoomsAvailable() {

		return totalRoomsAvailable;
	}

	public void setTotalRoomsAvailable(int totalRoomsAvailable) {

		this.totalRoomsAvailable = totalRoomsAvailable;
	}

	public void setRoomDescription(String roomDescription) {

		this.roomDescription = roomDescription;
	}
	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {

		this.totalRooms = totalRooms;
	}

	public int getRoomsAvailable() {

		return totalRoomsAvailable;
	}

	public void setRoomsAvailable(int roomsAvailable) {

		this.totalRoomsAvailable = roomsAvailable;
	}
	@Override
	public String toString() {

		return "RoomTypeInventory [roomType=" + roomType + ", roomDescription="
				+ roomDescription + ", totalRooms=" + totalRooms
				+ ", totalRoomsAvailable=" + totalRoomsAvailable + "]";
	}

	public boolean equals ( Object object ) {

		boolean result = false;

		if( object == null || object.getClass() != getClass() ) {

			result = false;
		}
		else {

			RoomTypeInventory objRoomTypeInventory = (RoomTypeInventory) object;

			if( this.totalRooms == objRoomTypeInventory.getTotalRooms() 
					&& this.totalRoomsAvailable == objRoomTypeInventory.getTotalRoomsAvailable()) {

				result = true;
			}
			else {

				result = false;
			}

		}
		return result;
	}

}
