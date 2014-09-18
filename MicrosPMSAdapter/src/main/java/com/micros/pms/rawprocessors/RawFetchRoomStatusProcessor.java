package com.micros.pms.rawprocessors;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class RawFetchRoomStatusProcessor extends RawOWSProcessor<
	FetchRoomStatusRequest,
	FetchRoomStatusResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FetchRoomStatusResponse fetchRoomStatusResponse) {
		return fetchRoomStatusResponse.getResult();
	}

	@Override
	protected FetchRoomStatusResponse callService(FetchRoomStatusRequest fetchRoomStatusRequest, Holder<OGHeader> header) {
		return service.fetchRoomStatus(fetchRoomStatusRequest, header);
	}
}
