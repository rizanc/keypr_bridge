package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Response;
import com.google.common.base.Objects;

/**
 * This class stores the check in response details of the guest. It store the status of
 * check in request made by the guest and details of guest reservation.
 *
 * @author vinayk2
 *
 */
public class CheckInResponse extends Response {

    /* Reference variable to store the reservation data. */
    private Reservation reservation ;

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservation", reservation)
			.toString();
	}
}
