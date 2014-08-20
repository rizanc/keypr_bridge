package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import com.google.common.base.Objects;

import java.util.List;

/**
 * This class stores the response of booking update request made by the guest.
 * It has the detail of guest reservation.
 *
 * @author vinayk2
 */
public class AddReservationNotesResponse extends PMSResponse {

    /* Reference variable to store the reservation data */
    private List<String> currentNotes;

	public AddReservationNotesResponse(List<String> currentNotes) {
		this.currentNotes = currentNotes;
	}

	public List<String> getCurrentNotes() {
		return currentNotes;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("currentNotes", currentNotes)
			.toString();
	}
}
