package com.cloudkey.pms.request;

/**This class is used to send the request parameters for HotelInformation .
 * 
 * @author 
 *
 */
public class HotelInformationRequest {
	
	/* variable to store  hotel code number. */

	private String hotelCode;

	public String getHotelCode() {
		
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		
		this.hotelCode = hotelCode;
	}

	@Override
	public String toString() {
		
		return "HotelInformationRequest [hotelCode=" + hotelCode + "]";
	}
	
}
