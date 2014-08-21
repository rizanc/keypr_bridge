package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * Class stores the check in information of the guest. It has details of check
 * in date, check out date, room number and all details related to the stay at
 * the hotel.
 *
 * @author vinayk2
 */
public class CheckInRequest extends PMSRequest {
    @NotBlank
    @ApiModelProperty(required = true)
    private String pmsReservationId;

	@NotBlank
	@ApiModelProperty(required = true)
	private String creditCardNumber;

	@NotNull
	@ApiModelProperty(required = true)
	private LocalDate expirationDate;

	@NotBlank
	@ApiModelProperty(required = true)
	private String cardType;

	private String cardHolderName;

	protected CheckInRequest() { /* For serialization */ }

	public CheckInRequest(String pmsReservationId, String creditCardNumber, LocalDate expirationDate, String cardHolderName, String cardType) {
		this.pmsReservationId = pmsReservationId;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCardType() {
		return cardType;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("pmsReservationId", pmsReservationId)
			.add("creditCardNumber", creditCardNumber)
			.add("expirationDate", expirationDate)
			.add("cardHolderName", cardHolderName)
			.add("cardType", cardType)
			.toString();
	}
}
