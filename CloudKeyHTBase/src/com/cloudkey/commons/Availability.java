package com.cloudkey.commons;


/**
 * Class stores the information about the room availability. It stores the room
 * type and the its availability status.
 * 
 * @author vinayk2
 * 
 */
public class Availability {

	/* Variable to store the type of the room. */
	private String roomType ;
	/* Variable to store the status of room availability. */
	private String availablity ;
	/* Variable to store the roomNumber. */
	private int roomNumber;
	/* Variable to store the roomAmount. */
	private double roomAmount;
	
	/*
	 * Getter and Setter methods for each data member.
	 */

	public int getRoomNumber() {
		return roomNumber;
	}

	public double getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(double roomAmount) {
		this.roomAmount = roomAmount;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {

		return roomType;
	}

	public void setRoomType( String roomType ) {

		this.roomType = roomType;
	}

	public String getAvailablity() {
		return availablity;
	}

	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}

	@Override
	public String toString() {
		return "Availability [roomType=" + roomType + ", availablity="
				+ availablity + ", roomNumber=" + roomNumber + ", roomAmount="
				+ roomAmount + "]";
	}

}