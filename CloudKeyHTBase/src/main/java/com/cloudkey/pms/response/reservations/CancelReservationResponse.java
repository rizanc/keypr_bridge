package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;

/**
 * @author clamothe
 */
public class CancelReservationResponse extends PMSResponse {

	private String cancellationNumber;

	protected CancelReservationResponse() { /* For serialization */ }

	public CancelReservationResponse(String cancellationNumber) {
		this.cancellationNumber = cancellationNumber;
	}

	public String getCancellationNumber() {
		return cancellationNumber;
	}

	@Override
	public String toString() {
		return "CancelReservationResponse{" +
			"cancellationNumber='" + cancellationNumber + '\'' +
			'}';
	}
}
