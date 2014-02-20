package com.cloudkey.commons;

import java.util.Date;
/**
 * Class stores details of room.It has information of room number,
 * roomTypeID, dateModified and dateCredted.
 * 
 * @author niveditat
 *
 */
public class RoomDetails {

	// Reference Variables.
	private int roomNumber;
	private int roomTypeId;
	private Date dateModified;
	private Date dateCreated;
	
	// Getter and Setter.
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "RoomDetails [roomNumber=" + roomNumber + ", roomTypeId="
				+ roomTypeId + ", dateModified=" + dateModified
				+ ", dateCreated=" + dateCreated + "]";
	}
			
}
