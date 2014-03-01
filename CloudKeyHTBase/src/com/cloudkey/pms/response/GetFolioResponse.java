package com.cloudkey.pms.response;

import java.util.ArrayList;
import java.util.List;

import com.cloudkey.commons.Charges;
import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrders;

/**
 * This Class has information of bill requested by the guest. It has details of reservations 
 * as well as charges for the facility, avail by the guest.
 * 
 * @author vinayk2
 */

public class GetFolioResponse {

	/* Reference variable to store the reservation data */
	private Reservation reservation ;
	/* Reference variable to store the bill information */
	private List<ReservationOrders> reservationOrderList;

	/* Getter and Setter for each Data Member. */

	public Reservation getReservation() {

		return reservation;
	}

	public void setReservation(Reservation reservation) {

		this.reservation = reservation;
	}

	public List<ReservationOrders> getReservationOrderList() {
		
		if(reservationOrderList == null){
			
			reservationOrderList = new  ArrayList<ReservationOrders>();
		}
		return reservationOrderList;
	}

	public void setReservationOrderList(List<ReservationOrders> reservationOrderList) {
		this.reservationOrderList = reservationOrderList;
	}

	@Override
	public String toString() {
		return "GetFolioResponse [reservation=" + reservation
				+ ", reservationOrderList=" + reservationOrderList + "]";
	}

	
}
