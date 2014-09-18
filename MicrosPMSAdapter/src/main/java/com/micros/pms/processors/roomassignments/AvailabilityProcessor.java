package com.micros.pms.processors.roomassignments;

import com.cloudkey.pms.micros.og.availability.*;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.ows.availability.AvailabilityRequest;
import com.cloudkey.pms.micros.ows.availability.AvailabilityResponse;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.response.EmptyResponse;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;

/**
* @author Charlie La Mothe (charlie@keypr.com)
*/
public class AvailabilityProcessor extends OWSProcessor<
	com.cloudkey.pms.request.rooms.AvailabilityRequest,
	// TODO: Parse the response
	EmptyResponse,
	AvailabilityRequest,
	AvailabilityResponse> {

	@Inject
	protected AvailabilityServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(AvailabilityResponse availabilityResponse) {
		return availabilityResponse.getResult();
	}

	@Override
	protected AvailabilityResponse callService(AvailabilityRequest availabilityRequest, Holder<OGHeader> header) {
		return service.availability(availabilityRequest, header);
	}

	@Override
	protected AvailabilityRequest toMicrosRequest(com.cloudkey.pms.request.rooms.AvailabilityRequest request) {
		FluentIterable<ChildAge> childAges = FluentIterable.from(request.getChildrenAges()).transform(new Function<Integer, ChildAge>() {
			@Nullable
			@Override
			public ChildAge apply(@Nullable Integer integer) {
				return new ChildAge(integer, true);
			}
		});

		AvailRequestSegment availRequestSegment = new AvailRequestSegment();

		AvailabilityRequest microsRequest = new AvailabilityRequest()
			.withAvailRequestSegments(availRequestSegment
					.withStayDateRange(new TimeSpan()
							.withStartDate(request.getStartDate().toDateTimeAtStartOfDay())
							.withEndDate(request.getEndDate().toDateTimeAtStartOfDay())
					)
					.withHotelSearchCriteria(new HotelSearchCriterion(getDefaultHotelReference()))
					.withTotalNumberOfGuests(request.getNumAdults())
					.withChildAges(childAges.toList())
					.withNumberOfChildren(childAges.size())
			);

		// If a rate code and room type code are specified, we are making a detailed request
		if (request.getRateCode() != null && request.getRoomTypeCode() != null) {
			microsRequest.setSummaryOnly(false);
			availRequestSegment.withRatePlanCandidates(new RatePlanCandidate().withRatePlanCode(request.getRateCode()));
			availRequestSegment.withRoomStayCandidates(new RoomStayCandidate().withRoomTypeCode(request.getRoomTypeCode()));
		} else {
			microsRequest.setSummaryOnly(true);
		}

		return microsRequest;
	}

	@Override
	protected EmptyResponse toPmsResponse(AvailabilityResponse microsResponse, com.cloudkey.pms.request.rooms.AvailabilityRequest request) {
		return new EmptyResponse();
	}
}
