package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.reservation.advanced.Posting;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.reservations.PostChargeRequest;
import com.cloudkey.pms.response.reservations.PostChargeResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;
import java.util.Date;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PostChargeProcessor extends OWSProcessor<
	PostChargeRequest,
	PostChargeResponse,
	com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest,
	com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponse postChargeResponse) {
		return postChargeResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponse callService(com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest microsRequest, Holder<OGHeader> header) {
		return service.postCharge(microsRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest toMicrosRequest(PostChargeRequest request) {
		Date postDate = request.getPostDateTime() == null ? null : request.getPostDateTime().toDate();

		Posting posting = new Posting()
			.withReservationRequestBase(createReservationRequest(request.getPmsReservationId()))
			.withCharge(request.getChargeAmount())
			.withFolioViewNo(request.getFolioViewNo())
			.withLongInfo(request.getLongInfo())
			.withShortInfo(request.getShortInfo())
			.withPostDate(postDate)
			.withPostTime(postDate)
			.withStationID(stationId)
			.withUserID(request.getUserId());

		return new com.cloudkey.pms.micros.og.reservation.advanced.PostChargeRequest(posting, request.getAccount(), request.getArticle());
	}

	@Override
	protected PostChargeResponse toPmsResponse(com.cloudkey.pms.micros.og.reservation.advanced.PostChargeResponse microsResponse) {
		return new com.cloudkey.pms.response.reservations.PostChargeResponse();
	}
}
