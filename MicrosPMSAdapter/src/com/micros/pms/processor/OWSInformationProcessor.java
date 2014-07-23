package com.micros.pms.processor;


import com.cloudkey.pms.request.HotelInformationRequest;
import com.cloudkey.pms.response.HotelInformationResponse;
import com.micros.ows.information.InformationStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosPMSMessageParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSInformationProcessor {

    final static String URL_INFORMATION = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Information.asmx";

    public HotelInformationResponse processHotelInformation(HotelInformationRequest hotelInformationRequest) {
        MicrosPMSLogger.logInfo(MicrosPMSMessageParser.class, " processHotelInformation ", " Enter processHotelInformation method. ");

        InformationStub informationStub = getInformationServiceStub();

        InformationStub.HotelInformationRequest objRequest;

        HotelInformationResponse response = null;

        objRequest = getHotelInformationRequestObject(hotelInformationRequest);

        InformationStub.HotelInformationRequestE reqE = new InformationStub.HotelInformationRequestE();
        reqE.setHotelInformationRequest(objRequest);

        InformationStub.OGHeaderE ogh = getHeaderE();

        try {
            MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                    AdapterUtility.convertToStreamXML(reqE));
            InformationStub.HotelInformationResponseE respE = informationStub.queryHotelInformation(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                    AdapterUtility.convertToStreamXML(respE));

            response = getHotelInformationResponseObject(respE.getHotelInformationResponse());
            MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processHotelInformation ",
                    AdapterUtility.convertToStreamXML(response));


        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "processHotelInformation ",
                    e.getMessage());
        }

        return response;
    }

    //TODO: Chain required.
    private InformationStub.HotelInformationRequest getHotelInformationRequestObject(HotelInformationRequest hotelInformationRequest) {
        InformationStub.HotelInformationRequest request = new InformationStub.HotelInformationRequest();

        InformationStub.HotelReference defaultHotelReference = getDefaultHotelReference();
        defaultHotelReference.setHotelCode(hotelInformationRequest.getHotelCode());

        request.setHotelInformationQuery(defaultHotelReference);

        return request;
    }

    private HotelInformationResponse getHotelInformationResponseObject(InformationStub.HotelInformationResponse hotelInformationResponse) {

        HotelInformationResponse response = new HotelInformationResponse();

        response.setStatus(hotelInformationResponse.getResult().getResultStatusFlag().toString());
        if (hotelInformationResponse.getResult().getResultStatusFlag() == InformationStub.ResultStatusFlag.FAIL){
            String errorMessage = getErrorMessage(hotelInformationResponse.getResult());
            response.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "getHotelInformationResponseObject ",errorMessage);
            return response;
        }

        InformationStub.HotelInformationResponseHotelInformation hotelInformation = hotelInformationResponse.getHotelInformation();
        InformationStub.HotelReference hotelInformation1 = hotelInformation.getHotelInformation();
        InformationStub.HotelContact hotelContactInformation = hotelInformation.getHotelContactInformation();
        InformationStub.ExtendedHotelInfo hotelExtendedInformation = hotelInformation.getHotelExtendedInformation();

        response.setHotelName(hotelInformation1.getString());
        InformationStub.ArrayOfAddress addresses = hotelContactInformation.getAddresses();
        if (addresses != null && addresses.getAddress() != null && addresses.getAddress().length > 0)
        {
            String addressLine = "";
            InformationStub.Address address = addresses.getAddress()[0];
            if (address != null){

                if (address.getAddressLine() != null)
                {
                    for(String line:address.getAddressLine()){
                        if (!addressLine.isEmpty())
                        {
                            addressLine += "</br>";
                        }
                        addressLine += line;
                    }
                }
                response.setAddress(addressLine);

                if  (address.getCityName() != null)
                {
                    response.setCity(address.getCityName());
                }

                //TODO: Add State/Prov
                if  (address.getStateProv() != null)
                {
                    //response.setState
                }

                if  (address.getPostalCode() != null)
                {
                    response.setPostalCode(address.getPostalCode());
                }

                if  (address.getCountryCode() != null)
                {
                    response.setCountry(address.getCountryCode());
                }
            }
        }

        if (hotelContactInformation.getContactEmails() != null)
        {
            String emails = "";
            for (InformationStub.Email email:hotelContactInformation.getContactEmails().getContactEmail()){
                if (!emails.isEmpty()){
                    emails += ":";
                    emails += email.getString();
                }
            }
        }

        if (hotelContactInformation.getContactPhones() != null){
            String contactPhones = "";
            for (InformationStub.Phone phone:hotelContactInformation.getContactPhones().getPhone())
            {
                if (!contactPhones.isEmpty()){
                    contactPhones += ":";
                    contactPhones += phone.getPhoneChoice_type0().getPhoneNumber();
                }
            }
        }

        return response;
    }

    private InformationStub getInformationServiceStub() {

        if (URL_INFORMATION == null) throw new NullPointerException("Information URL is null");

        InformationStub rstub = null;
        try {
            rstub = new InformationStub(URL_INFORMATION);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSReservationProcessor.class, "getInformationServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

    private InformationStub.HotelReference getDefaultHotelReference() {
        InformationStub.HotelReference objHotelReference = new InformationStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private InformationStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        InformationStub.OGHeader ogHeader = new InformationStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        InformationStub.EndPoint origin = new InformationStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        InformationStub.EndPoint destination = new InformationStub.EndPoint();
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

            InformationStub.OGHeaderAuthentication auth = new InformationStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            InformationStub.OGHeaderAuthenticationUserCredentials cred = new InformationStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        InformationStub.OGHeaderE ogHeaderE = new InformationStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(InformationStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus instanceof InformationStub.GDSResultStatus) {
            InformationStub.GDSResultStatus gdsResultStatus = (InformationStub.GDSResultStatus) resultStatus;
            if (gdsResultStatus.isGDSErrorSpecified()) {
                message = gdsResultStatus.getGDSError().toString();
            } else if (gdsResultStatus.isTextSpecified()) {
                if (gdsResultStatus.getText() != null &&
                        gdsResultStatus.getText().getTextElement() != null &&
                        gdsResultStatus.getText().getTextElement().length > 0
                        )
                    message = gdsResultStatus.getText().getTextElement()[0].toString();
            }
        } else if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
