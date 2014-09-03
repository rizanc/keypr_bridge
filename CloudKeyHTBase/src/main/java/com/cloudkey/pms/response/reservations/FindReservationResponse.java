package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.base.Optional;

/**
 * @author clamothe
 */
public class FindReservationResponse extends PMSResponse {

	private Optional<Reservation> reservation;

	public FindReservationResponse(Optional<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Optional<Reservation> getReservation() {
		return reservation;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservation", reservation)
			.toString();
	}
}
