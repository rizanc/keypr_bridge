package com.cloudkey.pms.request;

import com.cloudkey.commons.Reservation;


/**This class is used to send the request parameters for assign the room .
 * 
 * @author niveditat
 *
 */
public class AssignRoomRequest {

	/*Variable to store the response.*/
	private Reservation reservation ;
	private String roomTypeCode;

	/*Setter and Getters.*/
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public String getRoomTypeCode() {
		return roomTypeCode;
	}
	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	@Override
	public String toString() {
		return "AssignRoomRequest [reservation=" + reservation
				+ ", roomTypeCode=" + roomTypeCode + "]";
	}

}
