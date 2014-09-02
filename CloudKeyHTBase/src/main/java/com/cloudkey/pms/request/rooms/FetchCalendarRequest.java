package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 */
public class FetchCalendarRequest extends PMSRequest {

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate startDate;

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate endDate;

	/**
	 * If true, only available inventory will be included in the results.
	 */
	@NotNull
	@ApiModelProperty(required = true)
	private Boolean availableOnly = false;

	@NotEmpty
	@ApiModelProperty(required = true)
	private String rateCode;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numAdults;

	@NotNull
	@ApiModelProperty(required = true)
	private Integer numChildren;

	protected FetchCalendarRequest() { /* For serialization */ }

	public FetchCalendarRequest(LocalDate startDate, LocalDate endDate, Boolean availableOnly, String rateCode, Integer numAdults, Integer numChildren) {
		this.startDate = startDate;
		this.endDate = endDate;
		if (availableOnly != null) {
			this.availableOnly = availableOnly;
		}

		this.rateCode = rateCode;
		this.numAdults = numAdults;
		this.numChildren = numChildren;
	}

	@AssertTrue(message = "Start date must be before end date")
	private boolean isValid() {
		return startDate != null && endDate != null && startDate.isBefore(endDate);
	}

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

	public Boolean getAvailableOnly() {
		return availableOnly;
	}

	public String getRateCode() {
		return rateCode;
	}

	public Integer getNumAdults() {
		return numAdults;
	}

	public Integer getNumChildren() {
		return numChildren;
	}

	@Override
	public String toString() {
		return "FetchCalendarRequest{" +
			"startDate=" + startDate +
			", endDate=" + endDate +
			", availableOnly=" + availableOnly +
			", rateCode='" + rateCode + '\'' +
			", numAdults=" + numAdults +
			", numChildren=" + numChildren +
			'}';
	}
}
