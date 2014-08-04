package com.cloudkey.pms.request.roomassignments;

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
public class GetAvailabilityRequest {

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate startDate;

    @NotNull
    @ApiModelProperty(required = true)
    private LocalDate endDate;

	protected GetAvailabilityRequest() { /* For serialization */ }

	public GetAvailabilityRequest(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
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

    @Override
	public String toString() {
		return "GetAvailabilityRequest [startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
}
