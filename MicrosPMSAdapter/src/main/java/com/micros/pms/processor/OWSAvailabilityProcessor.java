package com.micros.pms.processor;

import com.cloudkey.commons.DayRoomAvailability;
import com.cloudkey.commons.RoomTypeAvailability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.hotelcommon.RoomTypeInventory;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import java.rmi.RemoteException;

/**
 * @author crizan2
 */
public class OWSAvailabilityProcessor extends OWSBase {

	@Inject
	protected AvailabilityServiceSoap service;

	public com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse processAvailability(com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest request) throws RemoteException {
        log.debug("processAvailability: Enter checkAvailability method.");

        FetchCalendarRequest microsRequest = getAvailabilityRequestObject(request);
		FetchCalendarResponse microsResponse = service.fetchCalendar(microsRequest, createOGHeaderE());

	    errorIfFailure(microsResponse.getResult());

	    return getAvailabilityResponseObject(microsResponse);
    }

	private FetchCalendarRequest getAvailabilityRequestObject(GetAvailabilityRequest availabilityRequest) {
        log.debug("getAvailabilityRequestObject: Enter getAvailabilityRequestObject method.");

		/*To create the request for availability.*/
	    FetchCalendarRequest objFetchCalendarRequest = new FetchCalendarRequest()
		    .withStayDateRange(
			    new TimeSpan()
				    .withStartDate(availabilityRequest.getStartDate().toDateTimeAtStartOfDay().toDate())
				    .withEndDate(availabilityRequest.getEndDate().toDateTimeAtStartOfDay().toDate())
		    )
		    .withHotelReference(getDefaultHotelReference())
		    .withInventoryMode(availabilityRequest.getAvailableOnly() == null ? false : availabilityRequest.getAvailableOnly());

        log.debug("getAvailabilityRequestObject: Exit getAvailabilityRequestObject method. ");

        return objFetchCalendarRequest;
    }

    private GetAvailabilityResponse getAvailabilityResponseObject(FetchCalendarResponse objResponse) {
        log.debug("getAvailabilityResponseObject: Enter getAvailabilityResponseObject method.");

	    return new GetAvailabilityResponse(
		    Lists.transform(objResponse.getCalendar(), new Function<CalendarDailyDetail, DayRoomAvailability>() {
				    @Nullable
				    @Override
				    public DayRoomAvailability apply(@Nullable CalendarDailyDetail calendarDailyDetail) {
					    return new DayRoomAvailability(
						    new LocalDate(calendarDailyDetail.getDate()),
						    Lists.transform(calendarDailyDetail.getOccupancy(), new Function<RoomTypeInventory, RoomTypeAvailability>() {
								    @Nullable
								    @Override
								    public RoomTypeAvailability apply(@Nullable RoomTypeInventory roomTypeInventory) {
									    return new RoomTypeAvailability(
										    roomTypeInventory.getRoomTypeCode(),
										    roomTypeInventory.getTotalRooms().intValue(),
										    roomTypeInventory.getTotalAvailableRooms().intValue(),
										    roomTypeInventory.getOverBookingLimit().intValue()
										    );
								    }
							    }
						    )
					    );
				    }
			    })
	    );
    }

}
