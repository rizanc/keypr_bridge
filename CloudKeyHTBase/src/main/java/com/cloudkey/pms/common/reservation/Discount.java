package com.cloudkey.pms.common.reservation;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
abstract public class Discount {
    protected String discountReason;

    public Discount(String discountReason) {
        this.discountReason = discountReason;
    }

    public String getDiscountReason() {
        return discountReason;
    }
}
