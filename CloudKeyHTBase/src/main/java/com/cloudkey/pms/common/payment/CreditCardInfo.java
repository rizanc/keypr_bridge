package com.cloudkey.pms.common.payment;

import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * Credit card information necessary to make a transaction
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class CreditCardInfo {
    @NotNull
    String cardHolderName;

    @NotNull
    CardNumberReference cardNumberReference;

    /**
     * Abbreviation for credit card brand (i.e AX for American Express)
     */
    @NotNull
    String cardType;

    @NotNull
    LocalDate expirationDate;

    LocalDate effectiveDate;

    String cardCode;

    String seriesCode;

    String otherCardType;

    /**
     * Whether the card is a EMV smart card.
     *
     * Not common in the USA as of 2014.
     */
    boolean isChipAndPin = false;
}
