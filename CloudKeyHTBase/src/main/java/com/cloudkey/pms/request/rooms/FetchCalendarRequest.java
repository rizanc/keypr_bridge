package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 */
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
//@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode(callSuper = false)
public class FetchCalendarRequest extends PMSRequest {

    @NotNull
    @ApiModelProperty(required = true)
    LocalDate startDate;

    @NotNull
    @ApiModelProperty(required = true)
    LocalDate endDate;

	/**
	 * If true, only available inventory will be included in the results.
	 */
	@NotNull
	@ApiModelProperty(required = true)
	Boolean availableOnly;

	@NotEmpty
	@ApiModelProperty(required = true)
	String rateCode;

	@NotNull
	@ApiModelProperty(required = true)
	Integer numAdults;

	@NotNull
	@ApiModelProperty(required = true)
	Integer numChildren;

	public FetchCalendarRequest(LocalDate startDate, LocalDate endDate, Boolean availableOnly, String rateCode, Integer numAdults, Integer numChildren) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.availableOnly = availableOnly == null
			? false
			: availableOnly;

		this.rateCode = rateCode;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
	}

	@AssertTrue(message = "Start date must be before end date")
	private boolean isValid() {
		return startDate != null && endDate != null && startDate.isBefore(endDate);
	}

}
