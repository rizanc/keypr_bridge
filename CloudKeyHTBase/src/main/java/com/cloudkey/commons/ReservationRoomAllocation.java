package com.cloudkey.commons;

import com.google.common.base.Objects;

import java.util.List;

/* @author ektas */

public class ReservationRoomAllocation {

	// Reference variable to store the room details with rate. 
	private String roomNo;
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

		return roomRateList;
	}

	public void setRoomRateList(List<RoomRate> roomRateList) {

		this.roomRateList = roomRateList;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("roomNo", roomNo)
			.add("roomRateList", roomRateList)
			.add("roomType", roomType)
			.add("reservationStatusType", reservationStatusType)
			.toString();
	}
}
