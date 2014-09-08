package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;

/**
 * @author clamothe
 */
public class CreateReservationResponse extends PMSResponse {

	private String pmsReservationId;

	protected CreateReservationResponse() { /* For serialization */ }

	public CreateReservationResponse(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	@Override
	public String toString() {
		return "CreateReservationResponse{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			'}';
	}
}
