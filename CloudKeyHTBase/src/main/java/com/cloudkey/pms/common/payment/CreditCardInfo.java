package com.cloudkey.pms.common.payment;

import com.google.common.base.Objects;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Credit card information necessary to make a transaction
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CreditCardInfo {
    @NotNull
    private String cardHolderName;

    @NotNull
    private CardNumberReference cardNumberReference;

    /**
     * Abbreviation for credit card brand (i.e AX for American Express)
     */
    @NotNull
    private String cardType;

    @NotNull
    private Date expirationDate;

    private Date effectiveDate;

    private String cardCode;

    private String seriesCode;

    private String otherCardType;

    /**
     * Whether the card is a EMV smart card.
     *
     * Not common in the USA as of 2014.
     */
    private boolean isChipAndPin = false;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public CardNumberReference getCardNumberReference() {
        return cardNumberReference;
    }

    public String getCardType() {
        return cardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public String getCardCode() {
        return cardCode;
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public String getOtherCardType() {
        return otherCardType;
    }

    public boolean isChipAndPin() {
        return isChipAndPin;
    }

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("cardHolderName", cardHolderName)
			.add("cardNumberReference", cardNumberReference)
			.add("cardType", cardType)
			.add("expirationDate", expirationDate)
			.add("effectiveDate", effectiveDate)
			.add("cardCode", cardCode)
			.add("seriesCode", seriesCode)
			.add("otherCardType", otherCardType)
			.add("isChipAndPin", isChipAndPin)
			.toString();
	}
}
