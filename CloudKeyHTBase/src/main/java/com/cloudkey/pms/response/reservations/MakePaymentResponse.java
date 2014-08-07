package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Response;
import com.cloudkey.pms.request.reservations.MakePaymentRequest;
import com.keypr.pms.micros.oxi.ids.PmsReservationId;

/**
 * Response to {@link MakePaymentRequest}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MakePaymentResponse extends Response {
    private PmsReservationId pmsReservationId;

    public MakePaymentResponse(PmsReservationId pmsReservationId) {
        this.pmsReservationId = pmsReservationId;
    }

    public PmsReservationId getPmsReservationId() {
        return pmsReservationId;
    }
}
