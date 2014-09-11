package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;

/**
 * A rate plan discount of an exact currency amount
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class FlatDiscount extends Discount {
    protected MonetaryAmount discountAmount;

    public FlatDiscount(String discountReason, MonetaryAmount discountAmount) {
        super(discountReason);
        this.discountAmount = discountAmount;
    }

    public MonetaryAmount getDiscountAmount() {
        return discountAmount;
    }
}
