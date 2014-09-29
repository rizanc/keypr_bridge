package com.cloudkey.pms.common.payment;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;

/**
 * Reference to a credit card stored the PMS's vault
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class VaultedCardNumber extends CardNumberReference {
    /**
     * The key identifying the card in the vault
     */
    @NotNull
    String vaultedCardId;

    /**
     * The last four digits of the card number
     */
    @NotNull
    Integer lastFourDigits;
}
