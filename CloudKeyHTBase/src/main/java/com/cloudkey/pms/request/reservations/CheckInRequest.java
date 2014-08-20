package com.cloudkey.pms.request.reservations;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

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

    // TODO: This probably needs to be expanded to at least card holder name and exp date
    private String creditCardNumber;

	protected CheckInRequest() { /* For serialization */ }

	public CheckInRequest(String pmsReservationId, String creditCardNumber) {
		this.pmsReservationId = pmsReservationId;
		this.creditCardNumber = creditCardNumber;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	@Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("pmsReservationId", pmsReservationId)
                .add("creditCardNumber", creditCardNumber)
                .toString();
    }
}
