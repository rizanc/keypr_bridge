package com.cloudkey.pms.common.reservation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
abstract public class RatePlanDiscount {
    protected String discountReason;

    public RatePlanDiscount(String discountReason) {
        this.discountReason = discountReason;
    }

    public String getDiscountReason() {
        return discountReason;
    }
}
