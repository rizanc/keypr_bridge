package com.cloudkey.pms.common.payment;

import lombok.Value;

import javax.validation.constraints.NotNull;

/**
 * Reference to a credit card stored the PMS's vault
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
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
