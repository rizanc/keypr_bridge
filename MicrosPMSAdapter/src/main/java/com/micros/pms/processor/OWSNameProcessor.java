package com.micros.pms.processor;

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListRequest;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListResponse;
import com.cloudkey.pms.micros.ows.name.NameLookupRequest;
import com.cloudkey.pms.micros.ows.name.NameLookupResponse;
import com.cloudkey.pms.micros.services.NameServiceStub;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.response.memberships.GuestMembershipResponse;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
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

    public GuestMembershipResponse processGuestCardList(GuestMembershipsRequest guestMembershipsRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, " processGuestCardList ", " Enter processGuestCardList method ");
        GuestMembershipResponse response = new GuestMembershipResponse();

        String nameID = guestMembershipsRequest.getNameId();

        NameServiceStub nameServiceStub = getNameServiceStub();

        FetchGuestCardListRequest objRequest = new FetchGuestCardListRequest();

        UniqueID uniqueID = new UniqueID();
        uniqueID.setType(UniqueIDType.INTERNAL);
        uniqueID.setString(nameID);
        objRequest.setNameID(uniqueID);

        OGHeaderE ogh = getHeaderE();

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ",
                AdapterUtility.convertToStreamXML(objRequest));
        FetchGuestCardListResponse resp = nameServiceStub.fetchGuestCardList(objRequest, ogh);
        MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ",
                AdapterUtility.convertToStreamXML(resp));

        FetchGuestCardListResponse objResponse = resp;
        response.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
        response.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processGuestCardList ", errorMessage);
            return response;
        }

        ArrayList<Membership> memberships = new ArrayList<Membership>();
        if (objResponse.getGuestCardList() != null && objResponse.getGuestCardList().getNameMembership() != null) {
            for (NameMembership nameMembership : objResponse.getGuestCardList().getNameMembership()) {

                Membership membership = new Membership();
                memberships.add(membership);

                membership.setMembershipNumber(nameMembership.getMembershipNumber());
                membership.setMembershipType(nameMembership.getMembershipType());
                membership.setMemberName(nameMembership.getMemberName());
                membership.setMembershipLevel(nameMembership.getMembershipLevel());
                membership.setPointsLabel(nameMembership.getPoints_label());
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

        return response;
    }

    public NameIdByMembershipResponse processNameLookupByMembership(NameIdByMembershipRequest nameIdByMembershipRequest) throws RemoteException {

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, " processNameLookupByMembership ", " Enter processNameLookupByMembership method ");
        NameIdByMembershipResponse response = new NameIdByMembershipResponse();

        NameServiceStub nameServiceStub = getNameServiceStub();

        NameLookupRequest objRequest = new NameLookupRequest();

        NameLookupInput nameLookupInput = new NameLookupInput();
        objRequest.setNameLookupCriteria(nameLookupInput);

	    NameLookupAll nameLookup = new NameLookupAll();
	    nameLookupInput.setNameLookup(nameLookup);

        NameLookupCriteriaMembership nameLookupCriteriaMembership = new NameLookupCriteriaMembership();
	    nameLookupInput.setMembership(nameLookupCriteriaMembership);

        nameLookupCriteriaMembership.setMembershipNumber(nameIdByMembershipRequest.getMembershipNumber());
        nameLookupCriteriaMembership.setMembershipType(nameIdByMembershipRequest.getMembershipType());
        nameLookupCriteriaMembership.setLastName(nameIdByMembershipRequest.getLastname().toUpperCase());

        OGHeaderE ogh = getHeaderE();

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                AdapterUtility.convertToStreamXML(objRequest));
        NameLookupResponse resp = nameServiceStub.nameLookup(objRequest, ogh);
        MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                AdapterUtility.convertToStreamXML(resp));

        NameLookupResponse objResponse = resp;
        response.setStatus(objResponse.getResult().getResultStatusFlag().toString());
        if (objResponse.getResult().getResultStatusFlag() == ResultStatusFlag.FAIL) {
            String errorMessage = getErrorMessage(objResponse.getResult());
        response.setErrorMessage(errorMessage);
            MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ", errorMessage);
            return response;
        }

        ProfileList profiles = objResponse.getProfiles();
        if (profiles.getProfile().length > 0) {
            Profile profile = profiles.getProfile()[0];
            if (profile.getProfileIDs() != null && profile.getProfileIDs().getUniqueID() != null) {
                for (UniqueID uniqueID : profile.getProfileIDs().getUniqueID()) {
                    if (uniqueID.getType() == UniqueIDType.INTERNAL) {
                    response.setNameId(uniqueID.getString());
                        break;
                    }
                }
            }
        }

        MicrosPMSLogger.logInfo(OWSNameProcessor.class, "processNameLookupByMembership ",
                AdapterUtility.convertToStreamXML(response));

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

    private HotelReference getDefaultHotelReference() {
        HotelReference objHotelReference = new HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        OGHeader ogHeader = new OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        EndPoint origin = new EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        EndPoint destination = new EndPoint();
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

            Authentication_type0 auth = new Authentication_type0();
            ogHeader.setAuthentication(auth);

            UserCredentials_type0 cred = new UserCredentials_type0();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        OGHeaderE ogHeaderE = new OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }

    private String getErrorMessage(ResultStatus resultStatus) {

        String message = "";
        if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
