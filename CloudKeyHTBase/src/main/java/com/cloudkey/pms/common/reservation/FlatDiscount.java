package com.cloudkey.pms.common.reservation;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * A rate plan discount of an exact currency amount
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class FlatDiscount extends Discount {
    MonetaryAmount discountAmount;

    public FlatDiscount(String discountReason, MonetaryAmount discountAmount) {
        super(discountReason);
        this.discountAmount = discountAmount;
    }
}
