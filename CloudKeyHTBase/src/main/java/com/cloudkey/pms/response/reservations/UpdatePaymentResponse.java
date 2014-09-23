package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class stores the response of update payment request made by the guest. It has 
 * information of whether the guest request was successfully completed or not.
 *
 * @author vinayk2
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class UpdatePaymentResponse extends PMSResponse {

}
