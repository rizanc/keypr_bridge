package com.micros.pms.processors.roomassignments;

import com.cloudkey.commons.DayRoomAvailability;
import com.cloudkey.commons.RoomTypeAvailability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.RoomTypeInventory;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.request.rooms.GetAvailabilityRequest;
import com.cloudkey.pms.response.rooms.GetAvailabilityResponse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GetAvailabilityProcessor extends OWSProcessor<
	GetAvailabilityRequest,
	GetAvailabilityResponse,
	FetchCalendarRequest,
	FetchCalendarResponse> {

	@Inject
	protected AvailabilityServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FetchCalendarResponse fetchCalendarResponse) {
		return fetchCalendarResponse.getResult();
	}

	@Override
	protected FetchCalendarResponse callService(FetchCalendarRequest fetchCalendarRequest, Holder<OGHeader> header) {
		return service.fetchCalendar(fetchCalendarRequest, header);
	}

	@Override
	protected FetchCalendarRequest toMicrosRequest(GetAvailabilityRequest request) {
		return new FetchCalendarRequest()
			.withStayDateRange(
				new TimeSpan()
					.withStartDate(request.getStartDate().toDateTimeAtStartOfDay())
					.withEndDate(request.getEndDate().toDateTimeAtStartOfDay())
			)
			.withHotelReference(getDefaultHotelReference())
			.withInventoryMode(request.getAvailableOnly() == null ? false : request.getAvailableOnly());
	}

	@Override
	protected GetAvailabilityResponse toPmsResponse(FetchCalendarResponse microsResponse) {
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

		return new GetAvailabilityResponse(availabilityList);
	}

	private Integer nullsafeToInteger(BigInteger bigInteger) {
		return bigInteger == null ? null : bigInteger.intValue();
	}
}
