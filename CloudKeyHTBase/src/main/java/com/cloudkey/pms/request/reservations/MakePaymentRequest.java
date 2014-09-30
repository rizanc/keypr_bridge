package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.common.payment.CreditCardApproval;
import com.cloudkey.pms.common.payment.CreditCardInfo;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.DateTime;

import javax.validation.constraints.NotNull;

/**
 * Request bean for posting payment for a reservation that has a status of reserved or due-in,
 * given at least the hotel criteria, reservation identifier or key track, credit card information, and charge amount. Posting date, posting time, short comment, long comment, station identifier, and user identifier are also allowed.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(callSuper = true)
public class MakePaymentRequest extends AbstractSingleReservationRequest {

    /**
     * The amount to charge or charged (USD)
     */
    @NotNull
    @ApiModelProperty(required = true)
    Double chargeAmount;

    /**
     * A reference to the credit card used to make the payment
     */
    @NotNull
    @ApiModelProperty(required = true)
    CreditCardInfo creditCardInfo;

    /**
     * The credit card transaction approval details, if the payment has already cleared approval
     */
    CreditCardApproval creditCardApproval;

    /**
     * The time and date of the payment posting
     */
    DateTime postDateTime;

    /**
     * A short description of the payment reason (COKE, ROOM, etc)
     */
    String shortInfo;

    /**
     * An extended description of the payment reason (Drink purchase at bar)
     */
    String longInfo;

    /**
     * Reference information for the payment
     */
    String reference;

    /**
     * The station at which payment occurred (i.e. KIOSK1)
     */
    String stationId;

    /**
     * The agent who processed the payment (SUPERVISOR)
     */
    String userId;

    /**
     * The number of the folio view to make the payment on
     */
    Integer folioViewNo;

}
