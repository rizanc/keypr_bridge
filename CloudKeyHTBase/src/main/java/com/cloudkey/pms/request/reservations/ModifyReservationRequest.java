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
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ModifyReservationRequest extends PMSRequest {

	private LocalDate arrivalDate;

	private LocalDate departureDate;

	private String firstName;

	private String lastName;

	private Integer numAdults;

	private Integer numChildren;

	private String ratePlanCode;

	private String roomTypeCode;

	@NotEmpty
	private String confirmationNum;

	@NotNull
	private Integer legNum;

	private String externalReferenceNumber;

	private String externalReferenceType;

	private LocalDate expirationDate;

	private String cardType;

	private String cardHolderName;

	private String creditCardNumber;

	protected ModifyReservationRequest() { /* For serialization */ }

	public ModifyReservationRequest(String confirmationNum, Integer legNum, String ratePlanCode, String roomTypeCode, Integer numAdults, Integer numChildren, LocalDate arrivalDate, LocalDate departureDate, String creditCardNumber, LocalDate expirationDate, String cardType, String cardHolderName, String firstName, String lastName, String externalReferenceNumber, String externalReferenceType) {
		this.confirmationNum = confirmationNum;
		this.legNum = legNum;
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
		this.externalReferenceNumber = externalReferenceNumber;
		this.externalReferenceType = externalReferenceType;
	}

//	@AssertFalse(message = "Has confirmation number or external reference details but not both")
//	public boolean hasConfirmNumOrExternalRef() {
//		return hasExternalReference() ^ hasConfirmationNumber();
//	}

	public boolean hasConfirmationNumber() {
		return confirmationNum == null || confirmationNum.isEmpty();
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

	@AssertFalse(message = "External reference details are partially complete")
	public boolean hasPartialExternalReference() {
		List<String> details = Arrays.asList(externalReferenceNumber, externalReferenceType);

		return Iterables.any(details, nonEmpty) && !Iterables.all(details, nonEmpty);
	}

	public boolean hasCreditCardDetails() {
		List<Object> details =
			Arrays.<Object>asList(expirationDate, creditCardNumber, cardType, cardHolderName);

		return Iterables.all(details, Predicates.notNull());
	}

	public boolean hasExternalReference() {
		List<Object> details = Arrays.<Object>asList(externalReferenceNumber, externalReferenceType, legNum);

		return Iterables.any(details, nonEmpty) && !Iterables.all(details, nonEmpty);
	}

	public String getConfirmationNum() {
		return confirmationNum;
	}

	public Integer getExternalReferenceLegNum() {
		return legNum;
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

	public String getExternalReferenceNumber() {
		return externalReferenceNumber;
	}

	public String getExternalReferenceType() {
		return externalReferenceType;
	}

	@Override
	public String toString() {
		return "CreateReservationRequest{" +
			"confirmationNum='" + confirmationNum + '\'' +
			", legNum=" + legNum +
			", ratePlanCode='" + ratePlanCode + '\'' +
			", roomTypeCode='" + roomTypeCode + '\'' +
			", numAdults=" + numAdults +
			", numChildren=" + numChildren +
			", arrivalDate=" + arrivalDate +
			", departureDate=" + departureDate +
			", creditCardNumber='" + creditCardNumber + '\'' +
			", expirationDate=" + expirationDate +
			", cardType='" + cardType + '\'' +
			", cardHolderName='" + cardHolderName + '\'' +
			", firstName='" + firstName + '\'' +
			", lastName='" + lastName + '\'' +
			", externalReferenceNumber='" + externalReferenceNumber + '\'' +
			", externalReferenceType='" + externalReferenceType + '\'' +
			'}';
	}

	private static Predicate<Object> nonEmpty = new Predicate<Object>() {
		@Override
		public boolean apply(@Nullable Object o ) {
			return o != null
				&& (!(o instanceof String) || !((String) o).isEmpty())
				&& (!(o instanceof Collection) || !((Collection) o).isEmpty());
		}
	};
}
