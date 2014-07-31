package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Response;

/**
 * This class stores the response of booking update request made by the guest.
 * It has the detail of guest reservation.
 *
 * @author vinayk2
 */
public class UpdateBookingResponse extends Response {

    /* Reference variable to store the reservation data */
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
        return "UpdateBookingResponse [reservation=" + reservation
                + ", status=" + status + ", errorMessage=" + errorMessage + "]";
    }

}
