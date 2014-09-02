package com.cloudkey.pms.request.rooms;

import com.cloudkey.pms.request.PMSRequest;
import com.google.common.base.Objects;
import com.wordnik.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 *
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
	private Boolean availableOnly = false;

	protected FetchCalendarRequest() { /* For serialization */ }

	public FetchCalendarRequest(LocalDate startDate, LocalDate endDate, Boolean availableOnly) {
		this.startDate = startDate;
		this.endDate = endDate;

		if (availableOnly != null) {
			this.availableOnly = availableOnly;
		}
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

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
			.add("startDate", startDate)
			.add("endDate", endDate)
			.add("availableOnly", availableOnly)
			.toString();
	}
}
