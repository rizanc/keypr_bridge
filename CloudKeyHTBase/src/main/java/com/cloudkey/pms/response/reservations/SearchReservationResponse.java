package com.cloudkey.pms.response.reservations;

import java.util.List;

import com.cloudkey.commons.Reservation;
import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/**
 * This class has carry response of search reservation request made by the client. It has
 * details of status and list of reservation available.
 *
 * @author vinayk2
 *
 */
public class SearchReservationResponse extends PMSResponse {

    /* Reference variable to store the reservation data list. */
    private List<Reservation> reservationList;

	protected SearchReservationResponse() { /* For Serialization */ }

	public SearchReservationResponse(List<Reservation> reservationList) {
		this.reservationList = ImmutableList.copyOf(reservationList);
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("reservationList", reservationList)
			.toString();
	}
}
