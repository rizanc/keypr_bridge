package com.cloudkey.pms.response;

import com.cloudkey.commons.RoomDetails;
import com.cloudkey.commons.RoomTypeInventory;

public class RoomInventoryResponse {
	String status;
	RoomDetails roomDetailList;

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
