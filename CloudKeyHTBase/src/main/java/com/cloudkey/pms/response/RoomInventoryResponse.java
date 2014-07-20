package com.cloudkey.pms.response;

import com.cloudkey.commons.RoomDetails;

/**
 * This class stores the room inventory details. The information includes
 * response status and room list detail.
 * 
 * @author vinayk2
 *
 */
public class RoomInventoryResponse {
	
	// Variables to store data.
	String status;
	RoomDetails roomDetailList;

	// Getter and Setter for each data member.
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RoomDetails getRoomDetailList() {
		return roomDetailList;
	}

	public void setRoomDetailList(RoomDetails roomDetailList) {
		this.roomDetailList = roomDetailList;
	}

}
