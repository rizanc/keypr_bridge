package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * This class stores the response of update payment request made by the guest. It has 
 * information of whether the guest request was successfully completed or not.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
//@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class UpdatePaymentResponse extends PMSResponse {

}
