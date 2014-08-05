package com.cloudkey.pms.response.reservations;

import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Response;
import com.google.common.base.Objects;

/**
 * This class has carry response of search reservation request made by the client. It has
 * details of status and list of reservation available.
 *
 * @author vinayk2
 *
 */
public class SearchReservationResponse  extends Response{

    /* Reference variable to store the reservation data list. */
    private List<Reservation> reservationList ;


	/* Getter and Setter for each Data Member. */

    public List<Reservation> getReservationList() {

        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {

        this.reservationList = reservationList;
    }

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservationList", reservationList)
			.toString();
	}
}
