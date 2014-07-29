package com.cloudkey.pms.request;

import com.cloudkey.pms.common.payment.CreditCardApproval;
import com.cloudkey.pms.common.payment.CreditCardInfo;
import com.keypr.pms.micros.oxi.ids.ReservationId;
import com.keypr.pms.micros.oxi.ids.StationId;
import com.keypr.pms.micros.oxi.ids.UserId;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Request bean for posting payment for a reservation that has a status of reserved or due-in,
 * given at least the hotel criteria, reservation identifier or key track, credit card information, and charge amount. Posting date, posting time, short comment, long comment, station identifier, and user identifier are also allowed.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MakePaymentRequest {
    /**
     * The {@link ReservationId} of the reservation to which payment was applied
     */
    @NotNull
    private ReservationId reservationId;

    /**
     * The amount to charge or charged (USD)
     */
    @NotNull
    private Double chargeAmount;

    /**
     * A reference to the credit card used to make the payment
     */
    @NotNull
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

    public MakePaymentRequest() {
    }

    public ReservationId getReservationId() {
        return reservationId;
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
}
