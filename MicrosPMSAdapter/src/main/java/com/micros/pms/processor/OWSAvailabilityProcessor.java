package com.micros.pms.processor;

import com.cloudkey.commons.Availability;
import com.cloudkey.pms.micros.og.availability.CalendarDailyDetail;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequest;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarRequestE;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponse;
import com.cloudkey.pms.micros.ows.availability.FetchCalendarResponseE;
import com.cloudkey.pms.micros.services.AvailabilityServiceStub;
import com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest;
import com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosOWSParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;
import org.joda.time.LocalDate;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSAvailabilityProcessor extends AbstractOWSProcessor {

    final static String URL_AVAILABILITY = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Availability.asmx";

    public com.cloudkey.pms.response.roomassignments.GetAvailabilityResponse processAvailability(com.cloudkey.pms.request.roomassignments.GetAvailabilityRequest availabilityRequest) throws RemoteException {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processAvailability ", " Enter checkAvailability method. ");

        AvailabilityServiceStub astub = getAvailabilityServiceStub();

        GetAvailabilityResponse objGetAvailabilityResponse;

        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

	    MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processAvailability ", " Start Date " + objSDate);
	    MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processAvailability ", " End Date " + objEDate);

	    if (objEDate.isBefore(objSDate)) {
            objGetAvailabilityResponse = new GetAvailabilityResponse();
            objGetAvailabilityResponse.setStatus(IMicrosConstants.RESPONSE_FAIL);
        } else {
	        FetchCalendarRequest req = getAvailabiltyRequestObject(availabilityRequest);
	        FetchCalendarRequestE requestE = new FetchCalendarRequestE();
		    requestE.setFetchCalendarRequest(req);

            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " processAvailability ", " Convert request into xml form ");

            OGHeaderE ogh = getHeaderE();

            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAvailability ",
                    AdapterUtility.convertToStreamXML(req));
            FetchCalendarResponseE responseE = astub.fetchCalendar(requestE, ogh);
            MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAvailability ",
                    AdapterUtility.convertToStreamXML(responseE));

            objGetAvailabilityResponse = getAvailabilityResponseObject(responseE.getFetchCalendarResponse());
        }

	    return objGetAvailabilityResponse;
    }

    private FetchCalendarRequest getAvailabiltyRequestObject(GetAvailabilityRequest availabilityRequest) {
        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabiltyRequestObject ", " Enter getAvailabiltyRequestObject method. ");

        FetchCalendarRequest objFetchCalendarRequest = null;
        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

		/*To create the request for availability.*/
        objFetchCalendarRequest = new FetchCalendarRequest();

        TimeSpan objTimeSpan = new TimeSpan();

        objFetchCalendarRequest.setHotelReference(getDefaultHotelReference());

		/*To set start and end date.*/
        objTimeSpan.setStartDate(objSDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        TimeSpanChoice_type0 objType0 = new TimeSpanChoice_type0();

        objType0.setEndDate(objEDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        objTimeSpan.setTimeSpanChoice_type0(objType0);

		/*To set time span in fetch calendar request.*/
        objFetchCalendarRequest.setStayDateRange(objTimeSpan);

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabiltyRequestObject ", " Exit getAvailabiltyRequestObject method. ");

        return objFetchCalendarRequest;
    }

    private GetAvailabilityResponse getAvailabilityResponseObject(FetchCalendarResponse objResponse) {

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Enter getAvailabilityResponseObject method.");

        GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();

        objAvailabilityResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String message = getErrorMessage(objResponse.getResult());
            objAvailabilityResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getAvailabilityResponseObject ", " Availability Failed:" + message);
            return objAvailabilityResponse;
        }

		/*To get the list from availability response.*/
        List<Availability> objLiAvailabilities = new ArrayList<>();
        /*To get the calendar daily detail array from response.*/
        CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

        for (CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail) { // To traverse calendar daily detail.

            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Enter for traversing calendar details.");

			/*To set the date in response.*/
            Availability objAvailability = new Availability();
            objAvailability.setDate(objCalendarDailyDetail.getDate());

			/*To set the roomInventory in response.*/
            List<com.cloudkey.commons.RoomTypeInventory> objLInventories = new ArrayList<>();

            RoomTypeInventory[] arrRoomTypeInventories = objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

            for (RoomTypeInventory objRTypeInventory : arrRoomTypeInventories) { // To traverse room type inventory.

                MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Traversing room type inventory. ");

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

                MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Exit loop for room type inventory. ");

            }// End room type inventory loop.
            objAvailability.setRoomTypeInventoryList(objLInventories);

			/*To add availability object into list.*/
            objLiAvailabilities.add(objAvailability);

            MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Exit traversing calendar details. ");
        } // End loop for calendar details.

        objAvailabilityResponse.setAvailList(objLiAvailabilities);

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getAvailabilityResponseObject ", " Exit getAvailabilityResponseObject method. ");

        return objAvailabilityResponse;
    }

    private AvailabilityServiceStub getAvailabilityServiceStub() {

        if (URL_AVAILABILITY == null) throw new NullPointerException("Availability URL is null");

        AvailabilityServiceStub rstub = null;
        try {
            rstub = new AvailabilityServiceStub(URL_AVAILABILITY);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "getReservationServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

}
