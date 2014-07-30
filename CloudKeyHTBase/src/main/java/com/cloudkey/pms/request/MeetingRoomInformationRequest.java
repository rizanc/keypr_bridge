package com.cloudkey.pms.request;

/**
 * This class represents the details to be provided for searching meeting room availability
 * in the hotel.
 * 
 * @author vinayk2
 *
 */
public class MeetingRoomInformationRequest {
	
	private String meetingFeature;
	private String searchCodeType;
	private String numberOfAttendees;

    public MeetingRoomInformationRequest(String meetingFeature, String searchCodeType, String numberOfAttendees) {
        this.meetingFeature = meetingFeature;
        this.searchCodeType = searchCodeType;
        this.numberOfAttendees = numberOfAttendees;
    }

    public String getMeetingFeature() {
		
		return meetingFeature;
	}
	
	public void setMeetingFeature(String meetingFeature) {
		
		this.meetingFeature = meetingFeature;
	}
	
	public String getSearchCodeType() {
		
		return searchCodeType;
	}
	
	public void setSearchCodeType(String searchCodeType) {
		
		this.searchCodeType = searchCodeType;
	}
	
	public String getNumberOfAttendees() {
		return numberOfAttendees;
	}
	
	public void setNumberOfAttendees(String numberOfAttendees) {
		
		this.numberOfAttendees = numberOfAttendees;
	}
	
	@Override
	public String toString() {
		
		return "MeetingRoomInformationRequest [meetingFeature="
				+ meetingFeature + ", searchCodeType=" + searchCodeType
				+ ", numberOfAttendees=" + numberOfAttendees + "]";
	}
	
}
