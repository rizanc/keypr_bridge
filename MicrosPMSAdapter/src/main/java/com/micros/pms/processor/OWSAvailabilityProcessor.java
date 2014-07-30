package com.micros.pms.processor;

import com.cloudkey.commons.Availability;
import com.cloudkey.pms.request.GetAvailabilityRequest;
import com.cloudkey.pms.response.GetAvailabilityResponse;
import com.micros.ows.availability.AvailabilityServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosPMSMessageParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;
import org.joda.time.LocalDate;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSAvailabilityProcessor {

    final static String URL_AVAILABILITY = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Availability.asmx";


    public GetAvailabilityResponse processAvailability(GetAvailabilityRequest availabilityRequest) {
        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " Enter checkAvailability method. ");

        AvailabilityServiceStub astub = getAvailabilityServiceStub();

        AvailabilityServiceStub.FetchCalendarRequest objFetchCalendarRequest = null;
        AvailabilityServiceStub.FetchCalendarResponse objResponse = null;
        GetAvailabilityResponse objGetAvailabilityResponse = null;
        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

        String xmlResponse = "";

        int counter = 0;
        int threadTime = 0;
        int timeUnitCounter = 0;

        if (objEDate.isBefore(objSDate)) {

            objGetAvailabilityResponse = new GetAvailabilityResponse();
            objGetAvailabilityResponse.setStatus(IMicrosConstants.RESPONSE_FAIL);

            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " Start Date " + objSDate);
            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " End Date " + objEDate);

        } else {

            objFetchCalendarRequest = getAvailabiltyRequestObject(availabilityRequest);
            AvailabilityServiceStub.FetchCalendarRequestE reqE = new AvailabilityServiceStub.FetchCalendarRequestE();
            reqE.setFetchCalendarRequest(objFetchCalendarRequest);

            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " Start Date " + objSDate);
            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " End Date " + objEDate);

            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processAvailability ", " Convert request into xml form ");

            AvailabilityServiceStub.OGHeaderE ogh = getHeaderE();

            try {
                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAvailability ",
                        AdapterUtility.convertToStreamXML(reqE));
                AvailabilityServiceStub.FetchCalendarResponseE respE = astub.fetchCalendar(reqE, ogh);
                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAvailability ",
                        AdapterUtility.convertToStreamXML(respE));

                objGetAvailabilityResponse = getAvailabilityResponseObject(respE.getFetchCalendarResponse());
                MicrosPMSLogger.logInfo(OWSReservationProcessor.class, "processAvailability ",
                        AdapterUtility.convertToStreamXML(objGetAvailabilityResponse));


            } catch (RemoteException e) {
                e.printStackTrace();
                MicrosPMSLogger.logError(OWSReservationProcessor.class, "processAvailability ",
                        e.getMessage());
            }
        }
        return objGetAvailabilityResponse;
    }

    private AvailabilityServiceStub.FetchCalendarRequest getAvailabiltyRequestObject(GetAvailabilityRequest availabilityRequest) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Enter getAvailabiltyRequestObject method. ");

        AvailabilityServiceStub.FetchCalendarRequest objFetchCalendarRequest = null;
        /*To get the request parameters*/
        LocalDate objSDate = availabilityRequest.getStartDate();
        LocalDate objEDate = availabilityRequest.getEndDate();

		/*To create the request for availability.*/
        objFetchCalendarRequest = new AvailabilityServiceStub.FetchCalendarRequest();

        AvailabilityServiceStub.TimeSpan objTimeSpan = new AvailabilityServiceStub.TimeSpan();

        objFetchCalendarRequest.setHotelReference(getDefaultHotelReference());

		/*To set start and end date.*/
        objTimeSpan.setStartDate(objSDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        AvailabilityServiceStub.TimeSpanChoice_type0 objType0 = new AvailabilityServiceStub.TimeSpanChoice_type0();

        objType0.setEndDate(objEDate.toDateTimeAtStartOfDay().toGregorianCalendar());
        objTimeSpan.setTimeSpanChoice_type0(objType0);

		/*To set time span in fetch calendar request.*/
        objFetchCalendarRequest.setStayDateRange(objTimeSpan);

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabiltyRequestObject ", " Exit getAvailabiltyRequestObject method. ");

        return objFetchCalendarRequest;
    }

    private GetAvailabilityResponse getAvailabilityResponseObject(AvailabilityServiceStub.FetchCalendarResponse objResponse) {

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Enter getAvailabilityResponseObject method.");

        GetAvailabilityResponse objAvailabilityResponse = new GetAvailabilityResponse();

        objAvailabilityResponse.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == AvailabilityServiceStub.ResultStatusFlag.FAIL) {
            String message = getErrorMessage(objResponse.getResult());
            objAvailabilityResponse.setErrorMessage(message);
            MicrosPMSLogger.logInfo(OWSResvAdvancedProcessor.class, " getAvailabilityResponseObject ", " Availability Failed:" + message);
            return objAvailabilityResponse;
        }

		/*To get the list from availability response.*/
        List<Availability> objLiAvailabilities = new ArrayList<>();
        /*To get the calendar daily detail array from response.*/
        AvailabilityServiceStub.CalendarDailyDetail[] arrCalendarDailyDetail = objResponse.getCalendar().getCalendarDay();

        for (AvailabilityServiceStub.CalendarDailyDetail objCalendarDailyDetail : arrCalendarDailyDetail) { // To traverse calendar daily detail.

            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Enter for traversing calendar details.");

			/*To set the date in response.*/
            Availability objAvailability = new Availability();
            objAvailability.setDate(objCalendarDailyDetail.getDate());

			/*To set the roomInventory in response.*/
            List<com.cloudkey.commons.RoomTypeInventory> objLInventories = new ArrayList<>();

            AvailabilityServiceStub.RoomTypeInventory[] arrRoomTypeInventories = objCalendarDailyDetail.getOccupancy().getRoomTypeInventory();

            for (AvailabilityServiceStub.RoomTypeInventory objRTypeInventory : arrRoomTypeInventories) { // To traverse room type inventory.

                MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Traversing room type inventory. ");

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

                MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit loop for room type inventory. ");

            }// End room type inventory loop.
            objAvailability.setRoomTypeInventoryList(objLInventories);

			/*To add availability object into list.*/
            objLiAvailabilities.add(objAvailability);

            MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit traversing calendar details. ");
        } // End loop for calendar details.

        objAvailabilityResponse.setAvailList(objLiAvailabilities);

        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " getAvailabilityResponseObject ", " Exit getAvailabilityResponseObject method. ");

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

    private AvailabilityServiceStub.HotelReference getDefaultHotelReference() {
        AvailabilityServiceStub.HotelReference objHotelReference = new AvailabilityServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private AvailabilityServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        AvailabilityServiceStub.OGHeader ogHeader = new AvailabilityServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        AvailabilityServiceStub.EndPoint origin = new AvailabilityServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        AvailabilityServiceStub.EndPoint destination = new AvailabilityServiceStub.EndPoint();
        String destEntityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_DESTINATION_ID);

        destination.setEntityID(destEntityId);
        String destSystemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_DEST_TYPE);
        destination.setSystemType(destSystemType);

        // sets time stamp
        ogHeader.setTimeStamp(AdapterUtility.getCalender());

        // prepares OGHeader
        ogHeader.setOrigin(origin);
        ogHeader.setDestination(destination);

        String username = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_NAME);
        String password = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_USER_PASS);

        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {

            AvailabilityServiceStub.OGHeaderAuthentication auth = new AvailabilityServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            AvailabilityServiceStub.OGHeaderAuthenticationUserCredentials cred = new AvailabilityServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        AvailabilityServiceStub.OGHeaderE ogHeaderE = new AvailabilityServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }


    private String getErrorMessage(AvailabilityServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus instanceof AvailabilityServiceStub.GDSResultStatus) {
            AvailabilityServiceStub.GDSResultStatus gdsResultStatus = (AvailabilityServiceStub.GDSResultStatus) resultStatus;
            if (gdsResultStatus.isGDSErrorSpecified()) {
                message = gdsResultStatus.getGDSError().toString();
            } else if (gdsResultStatus.isTextSpecified()){
                if (gdsResultStatus.getText() != null &&
                        gdsResultStatus.getText().getTextElement() != null &&
                        gdsResultStatus.getText().getTextElement().length > 0
                        )
                    message=  gdsResultStatus.getText().getTextElement()[0].toString();
            }
        } else if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
