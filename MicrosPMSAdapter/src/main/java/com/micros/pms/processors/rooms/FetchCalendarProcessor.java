package com.micros.pms.processors.rooms;

import com.cloudkey.pms.common.DayRoomAvailability;
import com.cloudkey.pms.common.RoomTypeAvailability;
import com.cloudkey.pms.common.reservation.*;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.ConverterUtils;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.request.rooms.FetchCalendarRequest;
import com.cloudkey.pms.response.rooms.FetchCalendarResponse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class FetchCalendarProcessor extends OWSProcessor<
	FetchCalendarRequest,
	FetchCalendarResponse,
	com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest,
	com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse> {

	@Inject
	protected AvailabilityServiceSoap service;

	@Inject
	protected ConverterUtils converterUtils;

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
	protected FetchCalendarResponse toPmsResponse(com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse microsResponse, FetchCalendarRequest request) {

		List<DayRoomAvailability> availabilityList = Lists.transform(microsResponse.getCalendar(), new Function<CalendarDailyDetail, DayRoomAvailability>() {
			@Nullable
			@Override
			public DayRoomAvailability apply(CalendarDailyDetail calendarDailyDetail) {
				DayRoomAvailability.DayRoomAvailabilityBuilder ava = DayRoomAvailability.builder();
				ava.date(calendarDailyDetail.getDate());
				ava.roomTypeAvailabilities(
					Lists.transform(calendarDailyDetail.getOccupancy(), new Function<RoomTypeInventory, RoomTypeAvailability>() {
							@Nullable
							@Override
							public RoomTypeAvailability apply(@Nullable RoomTypeInventory roomTypeInventory) {
								return new RoomTypeAvailability(
									roomTypeInventory.getRoomTypeCode(),
									nullsafeToInteger(roomTypeInventory.getTotalRooms()),
									nullsafeToInteger(roomTypeInventory.getTotalAvailableRooms()),
									nullsafeToInteger(roomTypeInventory.getOverBookingLimit()),
									nullsafeToInteger(roomTypeInventory.getSoldDeductible()),
									nullsafeToInteger(roomTypeInventory.getSoldNonDeductible())
								);
							}
						}
					)
				);

				if (calendarDailyDetail.getRates() != null) {
					ava.rates(converterUtils.convertRoomRates(calendarDailyDetail.getRates().getRateList()));
					ava.restrictions(converterUtils.convertRestrictions(calendarDailyDetail.getRates().getRestrictionList()));
				}

				return ava.build();
			}
		});

		return new FetchCalendarResponse(availabilityList);
	}

	private Integer nullsafeToInteger(BigInteger bigInteger) {
		return bigInteger == null ? null : bigInteger.intValue();
	}
}
