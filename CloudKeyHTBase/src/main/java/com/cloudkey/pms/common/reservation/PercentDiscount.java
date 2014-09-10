package com.cloudkey.pms.common.reservation;

/**
 * A rate plan discount by a percentage
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class PercentDiscount extends Discount {
    protected Double discountPercentage;

    public PercentDiscount(String discountReason, Double discountPercentage) {
        super(discountReason);
        this.discountPercentage = discountPercentage;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }
}
