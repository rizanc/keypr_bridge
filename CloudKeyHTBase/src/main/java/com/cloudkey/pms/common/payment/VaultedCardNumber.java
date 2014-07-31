package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

import javax.validation.constraints.NotNull;

/**
 * Reference to a credit card stored the PMS's vault
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class VaultedCardNumber extends CardNumberReference {
    /**
     * The key identifying the card in the vault
     */
    @NotNull
    private String vaultedCardId;

    /**
     * The last four digits of the card number
     */
    @NotNull
    private Integer lastFourDigits;

	protected VaultedCardNumber() { /* For serialization */ }

	public VaultedCardNumber(String vaultedCardId, Integer lastFourDigits) {
		this.vaultedCardId = vaultedCardId;
		this.lastFourDigits = lastFourDigits;
	}

	public String getVaultedCardId() {
        return vaultedCardId;
    }

    public Integer getLastFourDigits() {
        return lastFourDigits;
    }

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("lastFourDigits", lastFourDigits)
			.add("vaultedCardId", vaultedCardId)
			.toString();
	}
}
