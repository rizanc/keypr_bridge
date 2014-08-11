package com.micros.pms.processor;

import com.cloudkey.commons.Availability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.hotelcommon.RoomTypeInventory;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpanChoice_type0;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE;
import com.cloudkey.pms.micros.services.AvailabilityService;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author crizan2
 */
public class OWSAvailabilityProcessor extends OWSBase {

	@Inject
	protected AvailabilityService service;

	public com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse processAvailability(com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest request) throws RemoteException {
        log.debug("processAvailability: Enter checkAvailability method.");

        FetchCalendarRequest microsRequest = getAvailabilityRequestObject(request);
		log.debug("processAvailability", AdapterUtility.convertToStreamXML(microsRequest));

		FetchCalendarRequestE microsRequestE = new FetchCalendarRequestE();
		microsRequestE.setFetchCalendarRequest(microsRequest);

		FetchCalendarResponseE microsResponseE = service.fetchCalendar(microsRequestE, createOGHeaderE());
        log.debug("processAvailability", AdapterUtility.convertToStreamXML(microsResponseE));

	    errorIfFailure(microsResponseE.getFetchCalendarResponse().getResult());

	    return getAvailabilityResponseObject(microsResponseE.getFetchCalendarResponse());
    }

	private FetchCalendarRequest getAvailabilityRequestObject(GetAvailabilityRequest availabilityRequest) {
        log.debug("getAvailabilityRequestObject: Enter getAvailabilityRequestObject method.");

		/*To create the request for availability.*/
	    FetchCalendarRequest objFetchCalendarRequest = new FetchCalendarRequest();
        objFetchCalendarRequest.setHotelReference(getDefaultHotelReference());

		/*To set start and end date.*/
	    TimeSpan objTimeSpan = new TimeSpan();

	    objTimeSpan.setStartDate(availabilityRequest.getStartDate().toDateTimeAtStartOfDay().toGregorianCalendar());
        TimeSpanChoice_type0 objType0 = new TimeSpanChoice_type0();

        objType0.setEndDate(availabilityRequest.getEndDate().toDateTimeAtStartOfDay().toGregorianCalendar());
        objTimeSpan.setTimeSpanChoice_type0(objType0);

		/*To set time span in fetch calendar request.*/
        objFetchCalendarRequest.setStayDateRange(objTimeSpan);

        log.debug("getAvailabilityRequestObject: Exit getAvailabilityRequestObject method. ");

        return objFetchCalendarRequest;
    }

    private GetAvailabilityResponse getAvailabilityResponseObject(FetchCalendarResponse objResponse) {
        log.debug("getAvailabilityResponseObject: Enter getAvailabilityResponseObject method.");

        GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();

		/*To get the list from availability response.*/
        List<Availability> availabilities = new ArrayList<>();

        /*To get the calendar daily detail array from response.*/
        CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

        for (CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail) { // To traverse calendar daily detail.

            log.debug("getAvailabilityResponseObject: Enter for traversing calendar details.");

			/*To set the date in response.*/
            Availability objAvailability = new Availability();
            objAvailability.setDate(objCalendarDailyDetail.getDate());

			/*To set the roomInventory in response.*/
            List<com.cloudkey.commons.RoomTypeInventory> objLInventories = new ArrayList<>();

            RoomTypeInventory[] arrRoomTypeInventories = objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

            for (RoomTypeInventory objRTypeInventory : arrRoomTypeInventories) { // To traverse room type inventory.

                log.debug("getAvailabilityResponseObject: Traversing room type inventory. ");

                com.cloudkey.commons.RoomTypeInventory objRoomTypeInventory = new com.cloudkey.commons.RoomTypeInventory();

				/*To set room type on room inventory.*/
                com.cloudkey.commons.RoomType objRoomType = new com.cloudkey.commons.RoomType();

                objRoomType.setCode(objRTypeInventory.getRoomTypeCode());
                objRoomTypeInventory.setRoomType(objRoomType);

                //objRoomTypeInventory.setRoomDescription( objRTypeInventory.get );
                objRoomTypeInventory.setTotalRoomsAvailable(objRTypeInventory.getTotalAvailableRooms().intValue());
                objRoomTypeInventory.setTotalRooms(objRTypeInventory.getTotalRooms().intValue());

				/*To add roomtype inventory in inventory list.*/
                objLInventories.add(objRoomTypeInventory);

                log.debug("getAvailabilityResponseObject: Exit loop for room type inventory. ");

            }// End room type inventory loop.
            objAvailability.setRoomTypeInventoryList(objLInventories);

			/*To add availability object into list.*/
            availabilities.add(objAvailability);

            log.debug("getAvailabilityResponseObject: Exit traversing calendar details. ");
        } // End loop for calendar details.

        objAvailabilityResponse.setAvailList(availabilities);

        log.debug("getAvailabilityResponseObject: Exit getAvailabilityResponseObject method. ");

        return objAvailabilityResponse;
    }

}
