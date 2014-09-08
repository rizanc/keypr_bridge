package com.micros.pms.processors.roomassignments;

import com.cloudkey.commons.DayRoomAvailability;
import com.cloudkey.commons.RoomTypeAvailability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.request.rooms.FetchCalendarRequest;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class FetchCalendarProcessor extends OWSProcessor<
	FetchCalendarRequest,
	FetchCalendarResponse,
	com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest,
	com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse> {

	@Inject
	protected AvailabilityServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse fetchCalendarResponse) {
		return fetchCalendarResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse callService(com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest fetchCalendarRequest, Holder<OGHeader> header) {
		return service.fetchCalendar(fetchCalendarRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest toMicrosRequest(FetchCalendarRequest request) {
		return new com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest()
			.withStayDateRange(
				new TimeSpan()
					.withStartDate(request.getStartDate().toDateTimeAtStartOfDay())
					.withEndDate(request.getEndDate().toDateTimeAtStartOfDay())
			)
			.withGuestCount(new GuestCountList()
				.withGuestCounts(
					new GuestCount(AgeQualifyingCode.ADULT, null, null, request.getNumAdults()),
					new GuestCount(AgeQualifyingCode.CHILD, null, null, request.getNumChildren())
				)
			)
			.withRatePlanCode(request.getRateCode())
			.withHotelReference(getDefaultHotelReference())
			.withInventoryMode(request.getAvailableOnly() == null ? false : request.getAvailableOnly());
	}

	@Override
	protected FetchCalendarResponse toPmsResponse(com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse microsResponse) {
		List<DayRoomAvailability> availabilityList = Lists.transform(microsResponse.getCalendar(), new Function<CalendarDailyDetail, DayRoomAvailability>() {
			@Nullable
			@Override
			public DayRoomAvailability apply(@Nullable CalendarDailyDetail calendarDailyDetail) {
				return new DayRoomAvailability(
					calendarDailyDetail.getDate(),
					Lists.transform(calendarDailyDetail.getOccupancy(), new Function<RoomTypeInventory, RoomTypeAvailability>() {
							@Nullable
							@Override
							public RoomTypeAvailability apply(@Nullable RoomTypeInventory roomTypeInventory) {
								return new RoomTypeAvailability(
									roomTypeInventory.getRoomTypeCode(),
									nullsafeToInteger(roomTypeInventory.getTotalRooms()),
									nullsafeToInteger(roomTypeInventory.getTotalAvailableRooms()),
									nullsafeToInteger(roomTypeInventory.getOverBookingLimit())
								);
							}
						}
					)
				);
			}
		});

		return new FetchCalendarResponse(availabilityList);
	}

	private Integer nullsafeToInteger(BigInteger bigInteger) {
		return bigInteger == null ? null : bigInteger.intValue();
	}
}
