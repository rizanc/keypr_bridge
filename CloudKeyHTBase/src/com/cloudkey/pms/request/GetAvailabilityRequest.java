package com.cloudkey.pms.request;

import java.util.Date;

/**
 * Class stores the room availability information. 
 * 
 * @author vinayk2
 *
 */
public class GetAvailabilityRequest {
	
	/*To store date criteria */
	private Date startDate;
	private Date endDate;
	
	//Getter and Setters.
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "GetAvailabilityRequest [startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	
}
