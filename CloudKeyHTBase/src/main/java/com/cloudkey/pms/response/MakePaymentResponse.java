package com.cloudkey.pms.response;

import com.cloudkey.commons.Response;
import com.cloudkey.pms.request.MakePaymentRequest;
import com.keypr.pms.micros.oxi.ids.ReservationId;

/**
 * Response to {@link MakePaymentRequest}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MakePaymentResponse extends Response {
    private ReservationId reservationId;

    public MakePaymentResponse(ReservationId reservationId) {
        this.reservationId = reservationId;
    }

    public ReservationId getReservationId() {
        return reservationId;
    }
}
