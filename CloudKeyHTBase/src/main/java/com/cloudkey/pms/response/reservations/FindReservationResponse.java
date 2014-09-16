package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.common.reservation.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;

/**
 * @author clamothe
 */
public class FindReservationResponse extends PMSResponse {

	private Reservation reservation;

	public FindReservationResponse(Reservation reservation) {
		this.reservation = reservation;
	}

	public Reservation getReservation() {
		return reservation;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservation", reservation)
			.toString();
	}
}
