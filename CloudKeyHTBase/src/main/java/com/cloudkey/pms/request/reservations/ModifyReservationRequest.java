package com.cloudkey.pms.request.reservations;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertFalse;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = true)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
public class ModifyReservationRequest extends AbstractSingleReservationRequest {

	LocalDate arrivalDate;

	LocalDate departureDate;

	String firstName;

	String lastName;

	Integer numAdults;

	Integer numChildren;

	String ratePlanCode;

	String roomTypeCode;

	LocalDate expirationDate;

	String cardType;

	String cardHolderName;

	String creditCardNumber;

	public ModifyReservationRequest(LocalDate arrivalDate, LocalDate departureDate, String firstName, String lastName, Integer numAdults, Integer numChildren, String ratePlanCode, String roomTypeCode, String pmsReservationId, String externalReferenceNumber, String externalReferenceType, LocalDate expirationDate, String cardType, String cardHolderName, String creditCardNumber) {
		super(pmsReservationId);
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
		this.ratePlanCode = ratePlanCode;
		this.roomTypeCode = roomTypeCode;
		this.expirationDate = expirationDate;
		this.cardType = cardType;
		this.cardHolderName = cardHolderName;
		this.creditCardNumber = creditCardNumber;
	}

	@AssertFalse(message = "Credit card details are partially complete")
	public boolean hasPartialCreditCardDetails() {
		List<Object> details =
			Arrays.<Object>asList(expirationDate, creditCardNumber, cardType, cardHolderName);

		return Iterables.any(details, Predicates.notNull()) && !Iterables.all(details, Predicates.notNull());
	}

	@AssertFalse(message = "Name details are partially complete")
	public boolean hasPartialName() {
		List<Object> details =
			Arrays.<Object>asList(firstName, lastName);

		return Iterables.any(details, nonEmpty) && !Iterables.all(details, nonEmpty);
	}

	public boolean hasCreditCardDetails() {
		List<Object> details =
			Arrays.<Object>asList(expirationDate, creditCardNumber, cardType, cardHolderName);

		return Iterables.all(details, Predicates.notNull());
	}

	private static final Predicate<Object> nonEmpty = new Predicate<Object>() {
		@Override
		public boolean apply(@Nullable Object o ) {
			return o != null
				&& (!(o instanceof String) || !((String) o).isEmpty())
				&& (!(o instanceof Collection) || !((Collection) o).isEmpty());
		}
	};
}
