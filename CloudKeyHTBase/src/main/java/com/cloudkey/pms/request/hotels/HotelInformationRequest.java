package com.cloudkey.pms.request.hotels;

import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * This class is used to send the request parameters for HotelInformation.
 *
 * @author chetu
 */
public class HotelInformationRequest {
    @NotBlank
    @ApiModelProperty(required = true)
	private String hotelCode;

	protected HotelInformationRequest() { /* For serialization */ }

	public HotelInformationRequest(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("hotelCode", hotelCode)
                .toString();
    }
}
