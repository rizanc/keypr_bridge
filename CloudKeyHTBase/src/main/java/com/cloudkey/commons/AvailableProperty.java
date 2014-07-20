package com.cloudkey.commons;

import java.util.List;
/**
 * This class represents the details of the meeting room in the hotel.
 * 
 * @author vinayk2
 *
 */
public class AvailableProperty {
	
	private String hotel = null;
	private String city = null;
	private String postal = null;
	
	private String largestSeatingCapacity = null;
	private String smallestSeatingCapacity = null;
	private String totalMeetingRooms = null;
	
	private List<MeetingRoom> MeetingRoom = null;

	public String getHotel() {
		
		return hotel;
	}

	public void setHotel(String hotel) {
		
		this.hotel = hotel;
	}

	public String getCity() {
		
		return city;
	}

	public void setCity(String city) {
		
		this.city = city;
	}

	public String getPostal() {
		
		return postal;
	}

	public void setPostal(String postal) {
		
		this.postal = postal;
	}

	public String getLargestSeatingCapacity() {
		
		return largestSeatingCapacity;
	}

	public void setLargestSeatingCapacity(String largestSeatingCapacity) {
		
		this.largestSeatingCapacity = largestSeatingCapacity;
	}

	public String getSmallestSeatingCapacity() {
		
		return smallestSeatingCapacity;
	}

	public void setSmallestSeatingCapacity(String smallestSeatingCapacity) {
		
		this.smallestSeatingCapacity = smallestSeatingCapacity;
	}

	public String getTotalMeetingRooms() {
		
		return totalMeetingRooms;
	}

	public void setTotalMeetingRooms(String totalMeetingRooms) {
		
		this.totalMeetingRooms = totalMeetingRooms;
	}

	public List<MeetingRoom> getMeetingRoom() {
		
		return MeetingRoom;
	}

	public void setMeetingRoom(List<MeetingRoom> meetingRoom) {
		
		MeetingRoom = meetingRoom;
	}

	@Override
	public String toString() {
		
		return "AvailableProperty [hotel=" + hotel + ", city=" + city
				+ ", postal=" + postal + ", largestSeatingCapacity="
				+ largestSeatingCapacity + ", smallestSeatingCapacity="
				+ smallestSeatingCapacity + ", totalMeetingRooms="
				+ totalMeetingRooms + ", MeetingRoom=" + MeetingRoom
				+ ", getHotel()=" + getHotel() + ", getCity()=" + getCity()
				+ ", getPostal()=" + getPostal()
				+ ", getLargestSeatingCapacity()="
				+ getLargestSeatingCapacity()
				+ ", getSmallestSeatingCapacity()="
				+ getSmallestSeatingCapacity() + ", getTotalMeetingRooms()="
				+ getTotalMeetingRooms() + ", getMeetingRoom()="
				+ getMeetingRoom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}