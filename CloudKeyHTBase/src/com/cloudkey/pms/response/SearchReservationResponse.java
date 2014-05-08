package com.cloudkey.pms.response;

import java.util.ArrayList;

import java.util.List;

import com.cloudkey.commons.Reservation;

/**
 * This class has carry response of search reservation request made by the client. It has
 * details of status and list of reservation available.
 * 
 * @author vinayk2
 * 
 */
public class SearchReservationResponse {

	/* Reference variable to store the room status. */
	private String status ;
	/* Reference variable to store the reservation data list. */
	private List<Reservation> reservationList ;


	/* Getter and Setter for each Data Member. */

	public String getStatus() {

		return status;
	}

	public void setStatus(String status) {

		this.status = status;
	}

	public List<Reservation> getReservationList() {

		if(reservationList == null){
			
			reservationList = new ArrayList<Reservation>();
		}
		
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {

		this.reservationList = reservationList;
	}

	@Override
	public String toString() {
		
		return "SearchReservationResponse [status=" + status + ", reservationList=" + reservationList + "]";
	}

}
