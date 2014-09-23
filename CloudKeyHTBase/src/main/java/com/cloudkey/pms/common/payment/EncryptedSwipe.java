package com.cloudkey.pms.common.payment;

import lombok.Value;

/**
 * Encrypted information identifying a credit card.
 *
 * Can be used in place of a raw {@link CardNumber} or
 * on-file {@link VaultedCardNumber}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class EncryptedSwipe extends CardNumberReference {
    String trackIndicator;
    String swiperType;
    String swiperID;
    String maskedPAN;
    String track1;
    String track2;
    String keySerialNumber;
}
