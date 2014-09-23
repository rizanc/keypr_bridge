package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.request.reservations.MakePaymentRequest;
import com.cloudkey.pms.response.PMSResponse;
import com.keypr.bridge.ids.PmsReservationId;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Response to {@link MakePaymentRequest}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class MakePaymentResponse extends PMSResponse {
    PmsReservationId pmsReservationId;
}
