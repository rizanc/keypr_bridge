package com.micros.pms.processor;

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.request.GuestMembershipsRequest;
import com.cloudkey.pms.request.NameIdByMembershipRequest;
import com.cloudkey.pms.response.GuestMembershipResponse;
import com.cloudkey.pms.response.NameIdBymembershipResponse;
import com.micros.ows.name.NameServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSNameProcessor {

    final static String URL_NAME = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Name.asmx";

    public GuestMembershipResponse processGuestCardList(GuestMembershipsRequest guestMembershipsRequest) {

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, " processGuestCardList ", " Enter processGuestCardList method ");
        GuestMembershipResponse response = new GuestMembershipResponse();

        String nameID = guestMembershipsRequest.getNameId();

        NameServiceStub nameServiceStub = getNameServiceStub();

        NameServiceStub.FetchGuestCardListRequest objRequest = new NameServiceStub.FetchGuestCardListRequest();

        NameServiceStub.UniqueID uniqueID = new NameServiceStub.UniqueID();
        uniqueID.setType(NameServiceStub.UniqueIDType.INTERNAL);
        uniqueID.setString(nameID);
        objRequest.setNameID(uniqueID);

        NameServiceStub.FetchGuestCardListRequestE reqE = new NameServiceStub.FetchGuestCardListRequestE();
        reqE.setFetchGuestCardListRequest(objRequest);

        NameServiceStub.OGHeaderE ogh = getHeaderE();

        try {
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ",
                    AdapterUtility.convertToStreamXML(reqE));
            NameServiceStub.FetchGuestCardListResponseE respE = nameServiceStub.fetchGuestCardList(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ",
                    AdapterUtility.convertToStreamXML(respE));

            NameServiceStub.FetchGuestCardListResponse objResponse = respE.getFetchGuestCardListResponse();
            response.setStatus(objResponse.getResult().getResultStatusFlag().toString());
            if (objResponse.getResult().getResultStatusFlag() == NameServiceStub.ResultStatusFlag.FAIL) {
                String errorMessage = getErrorMessage(objResponse.getResult());
                response.setErrorMessage(errorMessage);
                MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ", errorMessage);
                return response;
            }

            ArrayList<Membership> memberships = new ArrayList<Membership>();
            if (objResponse.getGuestCardList() != null && objResponse.getGuestCardList().getNameMembership() != null) {
                for (NameServiceStub.NameMembership nameMembership : objResponse.getGuestCardList().getNameMembership()) {

                    Membership membership = new Membership();
                    memberships.add(membership);

                    membership.setMembershipNumber(nameMembership.getMembershipNumber());
                    membership.setMembershipType(nameMembership.getMembershipType());
                    membership.setMemberName(nameMembership.getMemberName());
                    membership.setMembershipLevel(nameMembership.getMembershipLevel());
                    membership.setPointsLabel(nameMembership.getPointsLabel());
                    membership.setExternalId(nameMembership.getExternalId());
                    membership.setCurrentPoints(nameMembership.getCurrentPoints());
                    membership.setEffectiveDate(nameMembership.getEffectiveDate());
                    membership.setExpirationDate(nameMembership.getExpirationDate());
                    membership.setExternalId(nameMembership.getExternalId());
                    membership.setOperaId(Long.toString(nameMembership.getOperaId()));


                }
            }
            if (!memberships.isEmpty()) {
                response.setMembershipList(memberships);
            }


            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                    AdapterUtility.convertToStreamXML(response));


        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSNameProcessor.class, "processNameLookup ",
                    e.getMessage());
        }


        return response;
    }

    public NameIdBymembershipResponse processNameLookupByMembership(NameIdByMembershipRequest nameIdByMembershipRequest) {

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, " processNameLookupByMembership ", " Enter processNameLookupByMembership method ");
        NameIdBymembershipResponse response = new NameIdBymembershipResponse();

        NameServiceStub nameServiceStub = getNameServiceStub();

        NameServiceStub.NameLookupRequest objRequest = new NameServiceStub.NameLookupRequest();

        NameServiceStub.NameLookupInput nameLookupInput = new NameServiceStub.NameLookupInput();
        objRequest.setNameLookupCriteria(nameLookupInput);

        NameServiceStub.NameLookupInputChoice_type0 nameLookupInputChoice_type0 = new NameServiceStub.NameLookupInputChoice_type0();
        nameLookupInput.setNameLookupInputChoice_type0(nameLookupInputChoice_type0);

        NameServiceStub.NameLookupCriteriaMembership nameLookupCriteriaMembership = new NameServiceStub.NameLookupCriteriaMembership();
        nameLookupInputChoice_type0.setMembership(nameLookupCriteriaMembership);

        nameLookupCriteriaMembership.setMembershipNumber(nameIdByMembershipRequest.getMembershipNumber());
        nameLookupCriteriaMembership.setMembershipType(nameIdByMembershipRequest.getMembershipType());
        nameLookupCriteriaMembership.setLastName(nameIdByMembershipRequest.getLastname().toUpperCase());

        NameServiceStub.NameLookupRequestE reqE = new NameServiceStub.NameLookupRequestE();
        reqE.setNameLookupRequest(objRequest);

        NameServiceStub.OGHeaderE ogh = getHeaderE();

        try {
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                    AdapterUtility.convertToStreamXML(reqE));
            NameServiceStub.NameLookupResponseE respE = nameServiceStub.nameLookup(reqE, ogh);
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                    AdapterUtility.convertToStreamXML(respE));

            NameServiceStub.NameLookupResponse objResponse = respE.getNameLookupResponse();
            response.setStatus(objResponse.getResult().getResultStatusFlag().toString());
            if (objResponse.getResult().getResultStatusFlag() == NameServiceStub.ResultStatusFlag.FAIL) {
                String errorMessage = getErrorMessage(objResponse.getResult());
                response.setErrorMessage(errorMessage);
                MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ", errorMessage);
                return response;
            }

            NameServiceStub.ArrayOfProfile profiles = objResponse.getProfiles();
            if (profiles.getProfile().length > 0) {
                NameServiceStub.Profile profile = profiles.getProfile()[0];
                if (profile.getProfileIDs() != null && profile.getProfileIDs().getUniqueID() != null) {
                    for (com.micros.ows.name.NameServiceStub.UniqueID uniqueID : profile.getProfileIDs().getUniqueID()) {
                        if (uniqueID.getType() == NameServiceStub.UniqueIDType.INTERNAL) {
                            response.setNameId(uniqueID.getString());
                            break;
                        }
                    }
                }
            }

            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                    AdapterUtility.convertToStreamXML(response));


        } catch (RemoteException e) {
            e.printStackTrace();
            MicrosPMSLogger.logError(OWSNameProcessor.class, "processNameLookup ",
                    e.getMessage());
        }


        return response;
    }

    private NameServiceStub getNameServiceStub() {

        if (URL_NAME == null) throw new NullPointerException("getNameServiceStub URL is null");

        NameServiceStub rstub = null;
        try {
            rstub = new NameServiceStub(URL_NAME);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSNameProcessor.class, "getNameServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

    private NameServiceStub.HotelReference getDefaultHotelReference() {
        NameServiceStub.HotelReference objHotelReference = new NameServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private NameServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        NameServiceStub.OGHeader ogHeader = new NameServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        NameServiceStub.EndPoint origin = new NameServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        NameServiceStub.EndPoint destination = new NameServiceStub.EndPoint();
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

            NameServiceStub.OGHeaderAuthentication auth = new NameServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            NameServiceStub.OGHeaderAuthenticationUserCredentials cred = new NameServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        NameServiceStub.OGHeaderE ogHeaderE = new NameServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(NameServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
