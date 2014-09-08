package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.IDPair;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.CancelTerm;
import com.cloudkey.pms.micros.og.hotelcommon.CancelTermType;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.ows.reservation.CancelBookingRequest;
import com.cloudkey.pms.micros.ows.reservation.CancelBookingResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.CancelReservationRequest;
import com.cloudkey.pms.response.reservations.CancelReservationResponse;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.ParagraphHelper;

import javax.xml.ws.Holder;

import java.util.Objects;

import static com.cloudkey.pms.micros.ows.IdUtils.internalReservationId;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class CancelReservationProcessor extends OWSProcessor<
	CancelReservationRequest,
	CancelReservationResponse,
	CancelBookingRequest,
	CancelBookingResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(CancelBookingResponse createBookingResponse) {
		return createBookingResponse.getResult();
	}

	@Override
	protected CancelBookingResponse callService(CancelBookingRequest request, Holder<OGHeader> header) {
		return service.cancelBooking(request, header);
	}

	@Override
	protected CancelBookingRequest toMicrosRequest(CancelReservationRequest request) {
		CancelTerm cancelTerm = new CancelTerm()
			.withCancelType(CancelTermType.CANCEL)
			.withCancelReasonCode(MicrosIds.OWS.CANCEL_REASON_CODE);

		if (request.getReason() != null && !request.getReason().isEmpty()) {
			cancelTerm.setCancelReason(ParagraphHelper.createParagraph(request.getReason()));
		}

		return new CancelBookingRequest()
			.withHotelReference(getDefaultHotelReference())
			.withConfirmationNumber(internalReservationId(request.getConfirmationNumber()))
			.withLegNumber(IdUtils.legNumberId(request.getLegNum()))
			.withCancelTerm(cancelTerm);
	}

	@Override
	protected CancelReservationResponse toPmsResponse(CancelBookingResponse createBookingResponse) {
		Optional<IDPair> cancel = Iterables.tryFind(createBookingResponse.getResult().getIDs(), new Predicate<IDPair>() {
			@Override
			public boolean apply(IDPair idPair) {
				return Objects.equals(idPair.getIdType(), "CANCEL");
			}
		});

		String cancellationNumber = cancel.isPresent() ? cancel.get().getOperaId().toString() : null;

		return new CancelReservationResponse(cancellationNumber);
	}

}

