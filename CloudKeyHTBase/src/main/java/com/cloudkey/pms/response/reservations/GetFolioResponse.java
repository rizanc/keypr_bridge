package com.cloudkey.pms.response.reservations;

import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.ReservationOrder;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * This Class has information of bill requested by the guest. It has details of reservations 
 * as well as charges for the facility, avail by the guest.
 *
 * @author vinayk2
 */

public class GetFolioResponse extends PMSResponse {

    /* Reference variable to store the reservation data */
    private Reservation reservation;

    /* Reference variable to store the bill information */
    private List<ReservationOrder> reservationOrderList;

	public GetFolioResponse(Reservation reservation, List<ReservationOrder> reservationOrderList) {
		this.reservation = reservation;
		this.reservationOrderList = ImmutableList.copyOf(reservationOrderList);
	}

	public Reservation getReservation() {
		return reservation;
	}

	public List<ReservationOrder> getReservationOrderList() {
		return reservationOrderList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservation", reservation)
			.add("reservationOrderList", reservationOrderList)
			.toString();
	}
}
