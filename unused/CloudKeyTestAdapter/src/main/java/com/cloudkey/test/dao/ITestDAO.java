package com.cloudkey.test.dao;

import com.cloudkey.pms.request.CheckInRequest;
import com.cloudkey.pms.request.CheckOutRequest;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.request.GetFolioRequest;
import com.cloudkey.pms.request.SearchReservationRequest;
import com.cloudkey.pms.request.UpdateBookingRequest;
import com.cloudkey.pms.request.UpdatePaymentRequest;
import com.cloudkey.pms.response.CheckInResponse;
import com.cloudkey.pms.response.CheckOutResponse;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.cloudkey.pms.response.GetFolioResponse;
import com.cloudkey.pms.response.SearchReservationResponse;
import com.cloudkey.pms.response.UpdateBookingResponse;
import com.cloudkey.pms.response.UpdatePaymentResponse;

/**
 * This interface declare all the methods for the message parser.
 * Message Parser will implements this interface and define the methods for generate the response. 
 * 
 * @author vinayk2
 * 
 */
public interface ITestDAO {
	
	/**
	 * This method searches for the reservation details on the basis of email id, confirmation number, credit card,
	 * first name and last name of the guest. It returns details of the reservations along with status of the guest.
	 * 
	 * @param reservationRquest
	 * @return
	 */
	public SearchReservationResponse searchReservationData(SearchReservationRequest reservationRquest);
	
	/**
	 * 
	 * This method generates bill information for the guest. It uses
	 * confirmation number of the guest to generate the bill details.
	 * 
	 * @param folioReq
	 * @return
	 */
	public GetFolioResponse retrieveFolioInfo(GetFolioRequest folioReq);
	
	/**
	 *  
	 *  This method makes check in request for the guest to the property management system.
	 * It uses guest reservation data for check in. It returns the reservation data with the status of check in.
	 * 
	 * @param checkInReq
	 * @return
	 */
	public CheckInResponse guestCheckIn(CheckInRequest checkInReq);
	
	/**
	 * This method makes check out request for the guest to the property management system.
	 * It uses confirmation number of the guest for check out and returns reservation details along
	 * with status.
	 * 
	 * @param checkOutReq
	 * @return
	 */
	public CheckOutResponse guestCheckOut(CheckOutRequest checkOutReq);
	
	/**
	 * This method makes update booking request of the guest to the property management system.
	 * It uses confirmation number and notes details of the guest for making request. It returns
	 * guest reservation detail as response.
	 * 
	 * @param upBookingReq
	 * @return
	 */
	public UpdateBookingResponse updateBooking(UpdateBookingRequest upBookingReq);
	
	/**
	 * This method makes update Payment request of the guest to the property management system.
	 * It uses guest confirmation number and payments details.It returns status as response.
	 * 
	 * @param upPatmentReq
	 * @return
	 */
	public UpdatePaymentResponse updatePayment(UpdatePaymentRequest upPatmentReq);
	
	/**
	 * This method checks for the available rooms provided the date range. Guest provides the start date
	 * and end date of the period against which searching is to be done. The method returns status along
	 * with list of available rooms.
	 * 
	 * @param availReq
	 * @return
	 */
	public GetAvailabilityResponse checkAvailability(GetAvailabilityRequest availReq);
	
}
