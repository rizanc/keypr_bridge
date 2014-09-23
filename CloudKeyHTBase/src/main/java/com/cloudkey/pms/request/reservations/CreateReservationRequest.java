package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Value
public class CreateReservationRequest extends PMSRequest {

	@NotNull
	@ApiModelProperty(required = true)
	private LocalDate arrivalDate;

	@NotNull
	@ApiModelProperty(required = true)
	private LocalDate departureDate;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String firstName;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String lastName;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numAdults;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numChildren;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String ratePlanCode;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String roomTypeCode;

	private LocalDate expirationDate;

	private String cardType;

	private String cardHolderName;

	private String creditCardNumber;

	public CreateReservationRequest(String ratePlanCode, String roomTypeCode, Integer numAdults, Integer numChildren, LocalDate arrivalDate, LocalDate departureDate, String creditCardNumber, LocalDate expirationDate, String cardType, String cardHolderName, String firstName, String lastName, String externalReferenceNumber, String externalReferenceType) {
		this.ratePlanCode = ratePlanCode;
		this.roomTypeCode = roomTypeCode;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cardType = cardType;
		this.cardHolderName = cardHolderName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@AssertFalse(message = "Credit card details are partially complete")
	public boolean hasPartialCreditCardDetails() {
		List<Object> details =
			Arrays.<Object>asList(expirationDate, creditCardNumber, cardType, cardHolderName);

		return Iterables.any(details, Predicates.notNull()) && !Iterables.all(details, Predicates.notNull());
	}

	public boolean hasCreditCardDetails() {
		List<Object> details =
			Arrays.<Object>asList(expirationDate, creditCardNumber, cardType, cardHolderName);

		return Iterables.all(details, Predicates.notNull());
	}


}
