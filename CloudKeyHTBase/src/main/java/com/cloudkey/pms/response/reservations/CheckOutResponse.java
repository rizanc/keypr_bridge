package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;

/**
 * The Class stores the check out response for the guest. It has the details of check out response
 * from the property management system as well as all information of the reservation.
 *
 * @author vinayk2
 *
 */
public class CheckOutResponse extends PMSResponse {

    /* Reference variable to store the reservation data. */
    private Reservation reservation ;

	/* Getter and Setter for each Data Member. */

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
