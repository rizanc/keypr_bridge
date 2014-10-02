package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.CheckOutRequest;
import com.cloudkey.pms.response.reservations.CheckOutResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class CheckOutProcessor extends OWSProcessor<
	CheckOutRequest,
	CheckOutResponse,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponse checkOutResponse) {
		return checkOutResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponse callService(com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest checkOutRequest, Holder<OGHeader> header) {
		return service.checkOut(checkOutRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest toMicrosRequest(CheckOutRequest request) {
		return new com.cloudkey.pms.micros.og.reservation.advanced.CheckOutRequest()
			.withReservationRequest(createReservationRequest(request.getPmsReservationId()));
	}

	@Override
	protected CheckOutResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.CheckOutResponse microsResponse, CheckOutRequest request) {
		return new CheckOutResponse();
	}
}
