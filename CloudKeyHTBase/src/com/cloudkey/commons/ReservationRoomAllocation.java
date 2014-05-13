package com.cloudkey.commons;

import java.util.ArrayList;
import java.util.List;

/* @author ektas */

public class ReservationRoomAllocation {

	// Reference variable to store the room details with rate. 
	private int roomNo;
	private List<RoomRate> roomRateList;
	private RoomType roomType;
	private String reservationStatusType; // For status as chcekin , reservaed , canceled.
	
	//setter and getters.

	public String getReservationStatusType() {
		return reservationStatusType;
	}

	public void setReservationStatusType(String reservationStatusType) {
		this.reservationStatusType = reservationStatusType;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public List<RoomRate> getRoomRateList() {

		if(roomRateList == null){

			roomRateList = new ArrayList<RoomRate>();	
		}
		return roomRateList;
	}

	public void setRoomRateList(List<RoomRate> roomRateList) {

		this.roomRateList = roomRateList;
	}

	public int getRoomNo() {

		return roomNo;
	}

	public void setRoomNo(int roomNo) {

		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return "ReservationRoomAllocation [roomNo=" + roomNo
				+ ", roomRateList=" + roomRateList + ", roomType=" + roomType
				+ "]";
	}

}
