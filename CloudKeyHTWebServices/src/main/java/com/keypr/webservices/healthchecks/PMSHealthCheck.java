package com.keypr.webservices.healthchecks;

import com.cloudkey.PMSInterface;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.codahale.metrics.health.HealthCheck;
import com.google.inject.Inject;

/**
 * Health check for PMS connectivity, by verifying that HotelInformation is retrievable and non-null.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PMSHealthCheck extends HealthCheck {

	private final PMSInterface pmsInterface;

	@Inject
	public PMSHealthCheck(PMSInterface pmsInterface) {
		this.pmsInterface = pmsInterface;
	}

	@Override
	protected Result check() throws Exception {
		HotelInformationResponse info = pmsInterface.hotelInformationQuery(new HotelInformationRequest());

		if (info != null) {
			return Result.healthy();
		} else {
			return Result.unhealthy("Received null HotelInformationResponse from pmsInterface");
		}
	}
}
