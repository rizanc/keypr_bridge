package com.cloudkey.pms.response.reservations;

import com.cloudkey.commons.Response;

/**
 * This class stores the response of update payment request made by the guest. It has 
 * information of whether the guest request was successfully completed or not.
 *
 * @author vinayk2
 */
public class UpdatePaymentResponse extends Response {

    @Override
    public String toString() {
        return "UpdatePaymentResponse [status=" + status + ", errorMessage="
                + errorMessage + "]";
    }

}
