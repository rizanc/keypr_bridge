package com.cloudkey.commons;


/**
 * Class stores details of room.It has information of room number, roomTypeID,
 * dateModified and dateCredted.
 * 
 * @author vinayk2
 *
 */

public class RoomDetails {

	// Reference Variables.
	private int id;
	private int roomNumber;
	
	private RoomType roomType;
	private String roomStatus;
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
	
	public int getId() {
		
		return id;
	}

	public void setId(int id) {
		
		this.id = id;
	}

	public String getRoomStatus() {
		
		return roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		
		this.roomStatus = roomStatus;
	}

	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((frontOfficeStatus == null) ? 0 : frontOfficeStatus
						.hashCode());
		result = prime
				* result
				+ ((houseKeeepingStatus == null) ? 0 : houseKeeepingStatus
						.hashCode());
		result = prime * result
				+ ((roomType == null) ? 0 : roomType.hashCode());
		return result;
	}

	
public boolean equals( Object object ) {
		
		boolean result = false;
		if( object == null || object.getClass() != getClass() ) {
			
			result = false;
		}
		else {
			
			RoomDetails objRoomDetails = (RoomDetails)object;
			
			if( this.frontOfficeStatus.equals( objRoomDetails.getFrontOfficeStatus())
				&& this.houseKeeepingStatus.equals(objRoomDetails.getHouseKeeepingStatus())
				&& this.getRoomType().getCode().equals(objRoomDetails.getRoomType().getCode()) ) {
				result =  true;
				
			}
			
			else {
				
				result = false;
			}		}
		
		return result;
	}

	
}
