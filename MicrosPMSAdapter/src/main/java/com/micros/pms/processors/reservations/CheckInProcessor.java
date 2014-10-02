package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.CreditCard;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.advanced.CreditCardInfo;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.CheckInRequest;
import com.cloudkey.pms.response.reservations.CheckInResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class CheckInProcessor extends OWSProcessor<
	CheckInRequest,
	CheckInResponse,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest,
	com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse checkInResponse) {
		return checkInResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse callService(com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest checkInRequest, Holder<OGHeader> header) {
		return service.checkIn(checkInRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest toMicrosRequest(CheckInRequest request) {
		return new com.cloudkey.pms.micros.og.reservation.advanced.CheckInRequest()
			.withReservationRequest(createReservationRequest(request.getPmsReservationId()))
			.withCreditCardInfo(
				new CreditCardInfo().withCreditCard(
					new CreditCard()
						.withCardNumber(request.getCreditCardNumber())
						.withExpirationDate(request.getExpirationDate())
						.withCardType(request.getCardType())
						.withCardHolderName(request.getCardHolderName())
				)
			);
	}

	@Override
	protected CheckInResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.CheckInResponse microsResponse, CheckInRequest request) {
		return new CheckInResponse(microsResponse.getCheckInComplete().getRoom().getRoomNumber());
	}
}
