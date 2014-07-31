package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Reservation;
import com.cloudkey.commons.Response;

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


    /* Getter and Setter for each Data Member. */
    public Reservation getReservation() {

        return reservation;
    }

    public void setReservation(Reservation reservation) {

        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "CheckInResponse [reservation=" + reservation + ", status="
                + status + ", errorMessage=" + errorMessage + "]";
    }

}
