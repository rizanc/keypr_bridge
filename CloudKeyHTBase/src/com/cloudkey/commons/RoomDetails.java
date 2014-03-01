package com.cloudkey.commons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class stores details of room.It has information of room number, roomTypeID,
 * dateModified and dateCredted.
 * 
 * @author niveditat
 * 
 */
public class RoomDetails {

	// Reference Variables.
	private int roomNumber;
	private String frontOfficeStatus;
	private String houseKeeepingStatus;
	
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

	private RoomType roomType;
	/* variable to store the StayRate instance. */
	private List<RoomRate> rateList;

	// Getter and Setter.


	public int getRoomNumber() {
		return roomNumber;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}	

	public List<RoomRate> getRateList() {
		
		if(rateList == null){
			rateList = new ArrayList<RoomRate>();
		}
		return rateList;
	}

	public void setRateList(List<RoomRate> rateList) {
		this.rateList = rateList;
	}

	@Override
	public String toString() {
		return "RoomDetails [roomNumber=" + roomNumber + ", frontOfficeStatus="
				+ frontOfficeStatus + ", houseKeeepingStatus="
				+ houseKeeepingStatus + ", roomType=" + roomType
				+ ", rateList=" + rateList + "]";
	}


}
