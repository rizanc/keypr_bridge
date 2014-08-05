package com.micros.pms.processor;

import com.cloudkey.commons.Availability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.core.OGHeaderE;
import com.cloudkey.pms.micros.og.hotelcommon.RoomTypeInventory;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpan;
import com.cloudkey.pms.micros.og.hotelcommon.TimeSpanChoice_type0;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE;
import com.cloudkey.pms.micros.services.AvailabilityServiceStub;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.micros.pms.OWSBase;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;
import org.joda.time.LocalDate;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author crizan2
 */
public class OWSAvailabilityProcessor extends OWSBase {
    final static String URL_AVAILABILITY = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Availability.asmx";

    public com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse processAvailability(com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest availabilityRequest) throws RemoteException {
        log.debug("processAvailability", "Enter checkAvailability method.");

        AvailabilityServiceStub astub = getAvailabilityServiceStub();

        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

	    log.debug("processAvailability", "Start Date", objSDate);
	    log.debug("processAvailability", "End Date", objEDate);

        FetchCalendarRequest req = getAvailabilityRequestObject(availabilityRequest);
        FetchCalendarRequestE requestE = new FetchCalendarRequestE();
	    requestE.setFetchCalendarRequest(req);

        log.debug("processAvailability", "Convert request into xml form");

        OGHeaderE ogh = getHeaderE();

        log.debug("processAvailability", AdapterUtility.convertToStreamXML(req));
        FetchCalendarResponseE responseE = astub.fetchCalendar(requestE, ogh);
        log.debug("processAvailability", AdapterUtility.convertToStreamXML(responseE));

	    errorIfFailure(responseE.getFetchCalendarResponse().getResult());

	    return getAvailabilityResponseObject(responseE.getFetchCalendarResponse());
    }

	private FetchCalendarRequest getAvailabilityRequestObject(GetAvailabilityRequest availabilityRequest) {
        log.debug("getAvailabilityRequestObject", "Enter getAvailabilityRequestObject method.");

        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

		/*To create the request for availability.*/
	    FetchCalendarRequest objFetchCalendarRequest = new FetchCalendarRequest();

        objFetchCalendarRequest.setHotelReference(getDefaultHotelReference());

		/*To set start and end date.*/
	    TimeSpan objTimeSpan = new TimeSpan();

	    objTimeSpan.setStartDate(objSDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        TimeSpanChoice_type0 objType0 = new TimeSpanChoice_type0();

        objType0.setEndDate(objEDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        objTimeSpan.setTimeSpanChoice_type0(objType0);

		/*To set time span in fetch calendar request.*/
        objFetchCalendarRequest.setStayDateRange(objTimeSpan);

        log.debug("getAvailabilityRequestObject", "Exit getAvailabilityRequestObject method. ");

        return objFetchCalendarRequest;
    }

    private GetAvailabilityResponse getAvailabilityResponseObject(FetchCalendarResponse objResponse) {

        log.debug("getAvailabilityResponseObject", "Enter getAvailabilityResponseObject method.");

        GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();

		/*To get the list from availability response.*/
        List<Availability> objLiAvailabilities = new ArrayList<>();
        /*To get the calendar daily detail array from response.*/
        CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

        for (CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail) { // To traverse calendar daily detail.

            log.debug("getAvailabilityResponseObject", "Enter for traversing calendar details.");

			/*To set the date in response.*/
            Availability objAvailability = new Availability();
            objAvailability.setDate(objCalendarDailyDetail.getDate());

			/*To set the roomInventory in response.*/
            List<com.cloudkey.commons.RoomTypeInventory> objLInventories = new ArrayList<>();

            RoomTypeInventory[] arrRoomTypeInventories = objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

            for (RoomTypeInventory objRTypeInventory : arrRoomTypeInventories) { // To traverse room type inventory.

                log.debug("getAvailabilityResponseObject", "Traversing room type inventory. ");

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

                log.debug("getAvailabilityResponseObject", "Exit loop for room type inventory. ");

            }// End room type inventory loop.
            objAvailability.setRoomTypeInventoryList(objLInventories);

			/*To add availability object into list.*/
            objLiAvailabilities.add(objAvailability);

            log.debug("getAvailabilityResponseObject", "Exit traversing calendar details. ");
        } // End loop for calendar details.

        objAvailabilityResponse.setAvailList(objLiAvailabilities);

        log.debug("getAvailabilityResponseObject", "Exit getAvailabilityResponseObject method. ");

        return objAvailabilityResponse;
    }

    private AvailabilityServiceStub getAvailabilityServiceStub() {

        if (URL_AVAILABILITY == null) throw new NullPointerException("Availability URL is null");

        AvailabilityServiceStub rstub = null;
        try {
            rstub = new AvailabilityServiceStub(URL_AVAILABILITY);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            log.error("getReservationServiceStub", axisFault);
        }
        return rstub;
    }

}
