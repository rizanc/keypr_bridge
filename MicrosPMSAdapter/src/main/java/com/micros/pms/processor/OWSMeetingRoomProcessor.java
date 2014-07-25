package com.micros.pms.processor;

import com.micros.ows.meetingroom.MeetingRoomServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.util.UUID;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSMeetingRoomProcessor {

    final static String URL_MEETING_ROOM = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/MeetingRoom.asmx";

    private MeetingRoomServiceStub getMeetingRoomServiceStub() {

        if (URL_MEETING_ROOM == null) throw new NullPointerException("getMeetingRoomServiceStub URL is null");

        MeetingRoomServiceStub rstub = null;
        try {
            rstub = new MeetingRoomServiceStub(URL_MEETING_ROOM);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSMeetingRoomProcessor.class, "getNameServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

    private MeetingRoomServiceStub.HotelReference getDefaultHotelReference() {
        MeetingRoomServiceStub.HotelReference objHotelReference = new MeetingRoomServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private MeetingRoomServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        MeetingRoomServiceStub.OGHeader ogHeader = new MeetingRoomServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        MeetingRoomServiceStub.EndPoint origin = new MeetingRoomServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        MeetingRoomServiceStub.EndPoint destination = new MeetingRoomServiceStub.EndPoint();
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

            MeetingRoomServiceStub.OGHeaderAuthentication auth = new MeetingRoomServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            MeetingRoomServiceStub.OGHeaderAuthenticationUserCredentials cred = new MeetingRoomServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        MeetingRoomServiceStub.OGHeaderE ogHeaderE = new MeetingRoomServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }


    private String getErrorMessage(MeetingRoomServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }
        return message;
    }

}
