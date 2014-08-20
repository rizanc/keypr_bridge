package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.common.payment.CreditCardApproval;
import com.cloudkey.pms.common.payment.CreditCardInfo;
import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.keypr.pms.micros.oxi.ids.PmsReservationId;
import com.keypr.pms.micros.oxi.ids.StationId;
import com.keypr.pms.micros.oxi.ids.UserId;
import com.wordnik.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Request bean for posting payment for a reservation that has a status of reserved or due-in,
 * given at least the hotel criteria, reservation identifier or key track, credit card information, and charge amount. Posting date, posting time, short comment, long comment, station identifier, and user identifier are also allowed.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MakePaymentRequest extends PMSRequest {
    /**
     * The {@link com.keypr.pms.micros.oxi.ids.PmsReservationId} of the reservation to which payment was applied
     */
    @NotNull
    @ApiModelProperty(required = true)
    private PmsReservationId pmsReservationId;

    /**
     * The amount to charge or charged (USD)
     */
    @NotNull
    @ApiModelProperty(required = true)
    private Double chargeAmount;

    /**
     * A reference to the credit card used to make the payment
     */
    @NotNull
    @ApiModelProperty(required = true)
    private CreditCardInfo creditCardInfo;

    /**
     * The credit card transaction approval details, if the payment has already cleared approval
     */
    private CreditCardApproval creditCardApproval;

    /**
     * The time and date of the payment posting
     */
    private Date postDateTime;

    /**
     * A short description of the payment reason (COKE, ROOM, etc)
     */
    private String shortInfo;

    /**
     * An extended description of the payment reason (Drink purchase at bar)
     */
    private String longInfo;

    /**
     * Reference information for the payment
     */
    private String reference;

    /**
     * The station at which payment occurred (i.e. KIOSK1)
     */
    private StationId stationId;

    /**
     * The agent who processed the payment (SUPERVISOR)
     */
    private UserId userId;

    /**
     * The number of the folio view to make the payment on
     */
    private Integer folioViewNo;

	protected MakePaymentRequest() { /* For serialization */ }

	public MakePaymentRequest(PmsReservationId pmsReservationId, Double chargeAmount, CreditCardInfo creditCardInfo, CreditCardApproval creditCardApproval, Date postDateTime, String shortInfo, String longInfo, String reference, StationId stationId, UserId userId, Integer folioViewNo) {
		this.pmsReservationId = pmsReservationId;
		this.chargeAmount = chargeAmount;
		this.creditCardInfo = creditCardInfo;
		this.creditCardApproval = creditCardApproval;
		this.postDateTime = postDateTime;
		this.shortInfo = shortInfo;
		this.longInfo = longInfo;
		this.reference = reference;
		this.stationId = stationId;
		this.userId = userId;
		this.folioViewNo = folioViewNo;
	}

	public PmsReservationId getPmsReservationId() {
        return pmsReservationId;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public CreditCardApproval getCreditCardApproval() {
        return creditCardApproval;
    }

    public Date getPostDateTime() {
        return postDateTime;
    }

    public String getShortInfo() {
        return shortInfo;
    }

    public String getLongInfo() {
        return longInfo;
    }

    public String getReference() {
        return reference;
    }

    public StationId getStationId() {
        return stationId;
    }

    public UserId getUserId() {
        return userId;
    }

    public Integer getFolioViewNo() {
        return folioViewNo;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("pmsReservationId", pmsReservationId)
                .add("chargeAmount", chargeAmount)
                .add("creditCardInfo", creditCardInfo)
                .add("creditCardApproval", creditCardApproval)
                .add("postDateTime", postDateTime)
                .add("shortInfo", shortInfo)
                .add("longInfo", longInfo)
                .add("reference", reference)
                .add("stationId", stationId)
                .add("userId", userId)
                .add("folioViewNo", folioViewNo)
                .toString();
    }
}
