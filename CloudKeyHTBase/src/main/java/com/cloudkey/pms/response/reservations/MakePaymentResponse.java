package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.request.reservations.MakePaymentRequest;
import com.cloudkey.pms.response.PMSResponse;
import com.keypr.bridge.ids.PmsReservationId;

/**
 * Response to {@link MakePaymentRequest}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MakePaymentResponse extends PMSResponse {
    private PmsReservationId pmsReservationId;

    public MakePaymentResponse(PmsReservationId pmsReservationId) {
        this.pmsReservationId = pmsReservationId;
    }

    public PmsReservationId getPmsReservationId() {
        return pmsReservationId;
    }
}
