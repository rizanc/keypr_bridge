package com.micros.pms.processors.reservations;

import com.cloudkey.pms.micros.og.common.RequestActionType;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.Text;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.GuestRequests;
import com.cloudkey.pms.micros.og.hotelcommon.ReservationComment;
import com.cloudkey.pms.micros.ows.reservation.GuestRequestsRequest;
import com.cloudkey.pms.micros.ows.reservation.GuestRequestsResponse;
import com.cloudkey.pms.micros.services.ReservationServiceSoap;
import com.cloudkey.pms.request.reservations.AddReservationNotesRequest;
import com.cloudkey.pms.response.reservations.AddReservationNotesResponse;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.ParagraphHelper;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class AddReservationNotesProcessor extends OWSProcessor<
	AddReservationNotesRequest,
	AddReservationNotesResponse,
	GuestRequestsRequest,
	GuestRequestsResponse> {

	@Inject
	protected ReservationServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(GuestRequestsResponse guestRequestsResponse) {
		return guestRequestsResponse.getResult();
	}

	@Override
	protected GuestRequestsResponse callService(GuestRequestsRequest microsRequest, Holder<OGHeader> header) {
		return service.guestRequests(microsRequest, header);
	}

	@Override
	protected GuestRequestsRequest toMicrosRequest(AddReservationNotesRequest request) {
		return new GuestRequestsRequest()
			.withHotelReference(getDefaultHotelReference())
			.withActionType(RequestActionType.ADD)
			.withResvNameId(internalReservationId(request.getPmsReservationId()))
			.withRequestType("COMMENTS")
			.withGuestRequests(new GuestRequests().withComments(
				Lists.transform(request.getNotes(), new Function<String, ReservationComment>() {
					@Nullable
					@Override
					public ReservationComment apply(@Nullable String s) {
						return new ReservationComment()
							.withImagesAndURLSAndTexts(ParagraphHelper.createParagraph(s))
							.withGuestViewable(false);
					}
				})));
	}

	@Override
	protected AddReservationNotesResponse toPmsResponse(GuestRequestsResponse microsResponse) {
		return new AddReservationNotesResponse(
			FluentIterable.from(microsResponse.getGuestRequests().getComments())
				.transformAndConcat(new Function<ReservationComment, List<Text>>() {
					@Nullable
					@Override
					public List<Text> apply(@Nullable ReservationComment reservationComment) {
						return ParagraphHelper.getTextList(reservationComment);
					}
				})
				.transform(new Function<Text, String>() {
					@Nullable
					@Override
					public String apply(@Nullable Text text) {
						return text.getValue();
					}
				})
				.toList()
		);
	}
}
