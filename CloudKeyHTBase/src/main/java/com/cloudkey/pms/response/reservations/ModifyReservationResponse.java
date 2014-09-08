package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;

/**
 * @author clamothe
 */
public class ModifyReservationResponse extends PMSResponse {

	// TODO: Include a full reservation in the response
	private String pmsReservationId;

	protected ModifyReservationResponse() { /* For serialization */ }

	public ModifyReservationResponse(String pmsReservationId) {
		this.pmsReservationId = pmsReservationId;
	}

	public String getPmsReservationId() {
		return pmsReservationId;
	}

	@Override
	public String toString() {
		return "ModifyReservationResponse{" +
			"pmsReservationId='" + pmsReservationId + '\'' +
			'}';
	}
}
