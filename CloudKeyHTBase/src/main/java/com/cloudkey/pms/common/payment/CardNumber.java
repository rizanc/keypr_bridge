package com.cloudkey.pms.common.payment;

import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * Contains the full unencrypted credit card number
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class CardNumber extends CardNumberReference {
    @NotNull
    String cardNumber;
}
