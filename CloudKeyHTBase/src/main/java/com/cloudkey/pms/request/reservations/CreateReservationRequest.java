package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
public class CreateReservationRequest extends PMSRequest {

	@NotEmpty
	@ApiModelProperty(required = true)
	String ratePlanCode;

	@NotEmpty
	@ApiModelProperty(required = true)
	String roomTypeCode;

	@NotNull
	@ApiModelProperty(required = true)
	Integer numAdults;

	@NotNull
	@ApiModelProperty(required = true)
	Integer numChildren;

	@NotNull
	@ApiModelProperty(required = true)
	LocalDate arrivalDate;

	@NotNull
	@ApiModelProperty(required = true)
	LocalDate departureDate;

	String creditCardNumber;

	LocalDate expirationDate;

	String cardType;

	String cardHolderName;

	@NotEmpty
	@ApiModelProperty(required = true)
	String firstName;

	@NotEmpty
	@ApiModelProperty(required = true)
	String lastName;

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
