package com.cloudkey.test.dao;

import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;

public interface ITestDAO {

	// methods for the web service request processing .
	
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRquest);
	
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioReq);
	
	public CheckInResponse guestCheckIn(CheckInRequest checkInReq);
	
	public UpdateBookingResponse updateBooking(UpdateBookingRequest upBookingReq);
	
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPatmentReq);
	
	public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest availReq);
	
	
}
