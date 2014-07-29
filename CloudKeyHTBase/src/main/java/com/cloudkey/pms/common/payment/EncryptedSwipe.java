package com.cloudkey.pms.common.payment;

/**
 * Encrypted information identifying a credit card.
 *
 * Can be used in place of a raw {@link CardNumber} or
 * on-file {@link VaultedCardNumber}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class EncryptedSwipe extends CardNumberReference {
    protected String trackIndicator;
    protected String swiperType;
    protected String swiperID;
    protected String maskedPAN;
    protected String track1;
    protected String track2;
    protected String keySerialNumber;
}
