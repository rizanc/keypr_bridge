package com.cloudkey.pms.request;

/**
 * This class hold the information of room inventory request made by the guest.
 * 
 * @author vinayk2
 *
 */
public class RoomInventoryRequest {
	
	//member variable
	private String roomType;
	
	// Getter and Setter for each data member.
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

}
