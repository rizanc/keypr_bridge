package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import javax.validation.constraints.AssertFalse;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ModifyReservationRequest extends PMSRequest {

	@NotEmpty
	@ApiModelProperty(required = true)
	private String pmsReservationId;

	private LocalDate arrivalDate;

	private LocalDate departureDate;

	private String firstName;

	private String lastName;

	private Integer numAdults;

	private Integer numChildren;

	private String ratePlanCode;

	private String roomTypeCode;

	private LocalDate expirationDate;

	private String cardType;

	private String cardHolderName;

	private String creditCardNumber;

	protected ModifyReservationRequest() { /* For serialization */ }

	public ModifyReservationRequest(LocalDate arrivalDate, LocalDate departureDate, String firstName, String lastName, Integer numAdults, Integer numChildren, String ratePlanCode, String roomTypeCode, String pmsReservationId, String externalReferenceNumber, String externalReferenceType, LocalDate expirationDate, String cardType, String cardHolderName, String creditCardNumber) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
		this.ratePlanCode = ratePlanCode;
		this.roomTypeCode = roomTypeCode;
		this.pmsReservationId = pmsReservationId;
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

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public void setPmsReservationId(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getRatePlanCode() {
		return ratePlanCode;
	}

	public String getRoomTypeCode() {
		return roomTypeCode;
	}

	public Integer getNumAdults() {
		return numAdults;
	}

	public Integer getNumChildren() {
		return numChildren;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public String getCardType() {
		return cardType;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "ModifyReservationRequest{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			", arrivalDate=" + arrivalDate +
			", departureDate=" + departureDate +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", numAdults=" + numAdults +
			", numChildren=" + numChildren +
			", ratePlanCode='" + ratePlanCode + '\'' +
			", roomTypeCode='" + roomTypeCode + '\'' +
			", expirationDate=" + expirationDate +
			", cardType='" + cardType + '\'' +
			", cardHolderName='" + cardHolderName + '\'' +
			", creditCardNumber='" + creditCardNumber + '\'' +
			'}';
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
