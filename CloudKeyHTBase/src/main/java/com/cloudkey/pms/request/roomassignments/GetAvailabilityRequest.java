package com.cloudkey.pms.request.roomassignments;

import org.joda.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 *
 */
public class GetAvailabilityRequest {

    @NotNull
	private LocalDate startDate;

    @NotNull
	private LocalDate endDate;

    public GetAvailabilityRequest(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
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
