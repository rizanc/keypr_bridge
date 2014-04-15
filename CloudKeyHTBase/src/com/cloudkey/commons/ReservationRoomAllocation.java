package com.cloudkey.commons;

/* @author ektas */

public class ReservationRoomAllocation {


	private int id;
	private int reservationId;
	private int requestId;
	private int roomNo;
	private Boolean isDeleted;

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public int getReservationId() {

		return reservationId;
	}

	public void setReservationId(int reservationId) {

		this.reservationId = reservationId;
	}

	public int getRequestId() {

		return requestId;
	}

	public void setRequestId(int requestId) {

		this.requestId = requestId;
	}

	public int getRoomNo() {

		return roomNo;
	}

	public void setRoomNo(int roomNo) {

		this.roomNo = roomNo;
	}

	public Boolean getIsDeleted() {

		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {

		this.isDeleted = isDeleted;
	}

	@Override

	public String toString()
	{
		return "ReservationRoomAllocation[id=" +id+ " , requestId=" +requestId+ " , reservationId=" +reservationId+ " , roomNo=" +roomNo+ ", isDeleted=" +isDeleted+ "]";
	}



}
