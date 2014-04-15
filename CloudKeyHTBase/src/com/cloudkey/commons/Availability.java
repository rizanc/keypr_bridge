package com.cloudkey.commons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Class stores the information about the room availability. It stores the room
 * type and the its availability status.
 * 
 * @author vinayk2
 * 
 */
public class Availability {
	
	//Date for which availability is checked
	private Date date;
	//list of Room Types that are available
	private List<RoomTypeInventory> roomTypeInventoryList; 
	
	
	//Getter Setters of member variables
	public Date getDate() {
		
		return date;
	}
	
	public void setDate(Date date) {
		
		this.date = date;
	}
	
	public List<RoomTypeInventory> getRoomTypeInventoryList() {
		
		if(roomTypeInventoryList == null) {
			
			roomTypeInventoryList = new ArrayList<RoomTypeInventory>();
		}
		return roomTypeInventoryList;
	}
	
	public void setRoomTypeInventoryList( List<RoomTypeInventory> roomTypeInventoryList) {
		
		this.roomTypeInventoryList = roomTypeInventoryList;
	}
	
	@Override
	public String toString() {
		
		return "Availability [date=" + date + ", roomTypeInventoryList="
				+ roomTypeInventoryList + "]";
	}

}