package com.cloudkey.pms.request.reservations;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
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
@Value
@EqualsAndHashCode(callSuper = true)
public class CheckInRequest extends AbstractSingleReservationRequest {
	@NotBlank
	@ApiModelProperty(required = true)
	private String creditCardNumber;

	@NotNull
	@ApiModelProperty(required = true)
	private LocalDate expirationDate;

	private String cardHolderName;

	@NotBlank
	@ApiModelProperty(required = true)
	private String cardType;

	public CheckInRequest(String pmsReservationId, String creditCardNumber, LocalDate expirationDate, String cardHolderName, String cardType) {
		super(pmsReservationId);
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cardHolderName = cardHolderName;
		this.cardType = cardType;
	}

}
