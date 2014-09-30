package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.request.reservations.MakePaymentRequest;
import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Response to {@link MakePaymentRequest}
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class MakePaymentResponse extends PMSResponse {
    String pmsReservationId;
}
