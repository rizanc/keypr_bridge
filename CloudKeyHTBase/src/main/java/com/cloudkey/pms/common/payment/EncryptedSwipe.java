package com.cloudkey.pms.common.payment;

import lombok.*;
import lombok.experimental.FieldDefaults;


/**
 * Encrypted information identifying a credit card.
 *
 * Can be used in place of a raw {@link CardNumber} or
 * on-file {@link VaultedCardNumber}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class EncryptedSwipe extends CardNumberReference {
    String trackIndicator;
    String swiperType;
    String swiperID;
    String maskedPAN;
    String track1;
    String track2;
    String keySerialNumber;
}
