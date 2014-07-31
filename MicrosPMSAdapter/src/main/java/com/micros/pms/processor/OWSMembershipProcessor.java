package com.micros.pms.processor;

import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.micros.ows.membership.MembershipServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosPMSMessageParser;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSMembershipProcessor {

    final static String URL_MEMBERSHIP = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/Membership.asmx";

    //TODO: Get Samples
    public MemberPointsResponse processFetchMemberPoints(MemberPointsRequest objMemberPointsRequest) throws RemoteException {
        MicrosPMSLogger.logInfo( OWSInformationProcessor.class, " processFetchMemberPoints "," Enter processFetchMemberPoints method " );

        MembershipServiceStub membershipServiceStub =  getMembershipServiceStub();

        MembershipServiceStub.FetchMemberPointsRequest objRequest;

        MemberPointsResponse response = null;

        objRequest = getFetchMemberPointsRequestObject(objMemberPointsRequest);

        MembershipServiceStub.OGHeaderE ogh = getHeaderE();

        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(objRequest));
        MembershipServiceStub.FetchMemberPointsResponse respE =
                membershipServiceStub.fetchMemberPoints(objRequest, ogh);
        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(respE));

        response = getMemberPointsResponse(respE);
        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    /*
     * this method is used to set request for member points.
     */
    private MembershipServiceStub.FetchMemberPointsRequest getFetchMemberPointsRequestObject(MemberPointsRequest objMemberPointsRequest) {

        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject "," Enter getFetchMemberPointsRequestObject method " );

        MembershipServiceStub.FetchMemberPointsRequest objFetchMemberPointsRequest = null;

        objFetchMemberPointsRequest = new MembershipServiceStub.FetchMemberPointsRequest();
        objFetchMemberPointsRequest.setMembershipNumber(objMemberPointsRequest.getMembershipNumber());

        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getFetchMemberPointsRequestObject "," Exit getFetchMemberPointsRequestObject method " );
        return objFetchMemberPointsRequest;
    }

    /*
     * This method is used to set response for Member points.
     */
    private MemberPointsResponse getMemberPointsResponse(MembershipServiceStub.FetchMemberPointsResponse objFetchMemberPointsResponse) {

        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Enter getMemberPointsResponse method " );

        MemberPointsResponse objMemberPointsResponse = new MemberPointsResponse();

        //objMemberPointsResponse.setResult(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());
        objMemberPointsResponse.setStatus(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());

        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Result Status Set to the response " );

        MembershipServiceStub.Membership objMembership = objFetchMemberPointsResponse.getMemberInfo();

        String membername = objMembership.getMemberName();
        String membershipId = objMembership.getMembershipid().getString();

        String membershipType = objMembership.getMembershipType();
        String membershipNumber = objMembership.getMembershipNumber();

        String membershipLevel = objMembership.getMembershipLevel();
        Date effectiveDate = objMembership.getEffectiveDate();
        Date expiredate = objMembership.getExpirationDate();

        Boolean objBoolean = objMembership.getInactive();
        String inactive = String.valueOf(objBoolean);

        MembershipServiceStub.UniqueID[] objId =  objMembership.getResvNameId().getUniqueID();

        int uniqueIdLength = objId.length;
        String revId = " ";
        String rev = " ";
        for( int uniqueIdIndex =0; uniqueIdIndex < uniqueIdLength; uniqueIdIndex++) {

            rev = objId[uniqueIdIndex].getString();
            revId.concat(rev).concat(" ");
        }

        MembershipServiceStub.AwardPointsInfo[] objAwardPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getAwardPointsInfo();

        int awardpointsInfoLength = objAwardPointsInfo.length;
        double bonusPoint = 0.0;
        double totalPoint = 0.0;

        for( int awardPointsIndex = 0; awardPointsIndex < awardpointsInfoLength; awardPointsIndex++ ) {

            bonusPoint = objAwardPointsInfo[awardPointsIndex].getBonusPoints();
            totalPoint = objAwardPointsInfo[awardPointsIndex].getTotalPoints();

        }
        MembershipServiceStub.StayPointsInfo[] objStayPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getStayPointsInfo();

        int stayPointsInfoLength = objStayPointsInfo.length;
        int totalNight = 0;
        int totalStay = 0;

        for( int stayPointIndex = 0; stayPointIndex < stayPointsInfoLength; stayPointIndex++ ) {

            totalNight = objStayPointsInfo[stayPointIndex].getGuestTotalNights();
            totalStay = objStayPointsInfo[stayPointIndex].getGuestTotalStays();
        }

        String totalPoints = String.valueOf(totalPoint);
        String bonusPoints = String.valueOf(bonusPoint);
        String guestTotalNight = String.valueOf(totalNight);
        String guestTotalStay = String.valueOf(totalStay);

        objMemberPointsResponse.setMemberName(membername);
        objMemberPointsResponse.setMembershipId(membershipId);
        objMemberPointsResponse.setMembershipType(membershipType);

        objMemberPointsResponse.setMembershipNumber(membershipNumber);
        objMemberPointsResponse.setMembershipLevel(membershipLevel);
        objMemberPointsResponse.setEffectiveDate(effectiveDate);
        objMemberPointsResponse.setExpireDate(expiredate);
        objMemberPointsResponse.setInactive(inactive);

        objMemberPointsResponse.setResvnameId(revId);
        objMemberPointsResponse.setTotalPoints(totalPoints);
        objMemberPointsResponse.setBonuspoints(bonusPoints);
        objMemberPointsResponse.setGuestTotalNights(guestTotalNight);

        objMemberPointsResponse.setGuestTotalStay(guestTotalStay);

        MicrosPMSLogger.logInfo( MicrosPMSMessageParser.class, " getMemberPointsResponse "," Exit getMemberPointsResponse method " );
        return objMemberPointsResponse;
    }


    private MembershipServiceStub getMembershipServiceStub() {

        if (URL_MEMBERSHIP == null) throw new NullPointerException("Membership URL is null");

        MembershipServiceStub rstub = null;
        try {
            rstub = new MembershipServiceStub(URL_MEMBERSHIP);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSMembershipProcessor.class, "getMembershipServiceStub ",
                    axisFault.getMessage());
        }

        return rstub;
    }

    private MembershipServiceStub.HotelReference getDefaultHotelReference() {
        MembershipServiceStub.HotelReference objHotelReference = new MembershipServiceStub.HotelReference();
        String hotelCode = ParserConfigurationReader.getProperty(IMicrosConstants.HOTEL_CODE);
        String chainCode = ParserConfigurationReader.getProperty(IMicrosConstants.CHAIN_CODE);
        objHotelReference.setHotelCode(hotelCode);
        objHotelReference.setString("");
        objHotelReference.setChainCode(chainCode);
        return objHotelReference;
    }

    private MembershipServiceStub.OGHeaderE getHeaderE() {

        String transactionId = UUID.randomUUID().toString(); //TransIdGenerator.getTransactionId();
        // Sets Transaction Identifier
        MembershipServiceStub.OGHeader ogHeader = new MembershipServiceStub.OGHeader();

        ogHeader.setTransactionID(transactionId);

        // creates origin end point of header.
        MembershipServiceStub.EndPoint origin = new MembershipServiceStub.EndPoint();

        String entityId = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORIGIN_ID);
        origin.setEntityID(entityId);

        String systemType = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_ORI_SYSTEM_TYPE);
        origin.setSystemType(systemType);

        // creates destination end point of header.
        MembershipServiceStub.EndPoint destination = new MembershipServiceStub.EndPoint();
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

            MembershipServiceStub.OGHeaderAuthentication auth = new MembershipServiceStub.OGHeaderAuthentication();
            ogHeader.setAuthentication(auth);

            MembershipServiceStub.OGHeaderAuthenticationUserCredentials cred = new MembershipServiceStub.OGHeaderAuthenticationUserCredentials();
            auth.setUserCredentials(cred);

            cred.setUserName(username);
            cred.setUserPassword(password);
        }

        MembershipServiceStub.OGHeaderE ogHeaderE = new MembershipServiceStub.OGHeaderE();
        ogHeaderE.setOGHeader(ogHeader);
        return ogHeaderE;
    }


    private String getErrorMessage(MembershipServiceStub.ResultStatus resultStatus) {

        String message = "";
        if (resultStatus.getText() != null &&
                resultStatus.getText().getTextElement() != null &&
                resultStatus.getText().getTextElement().length > 0) {
            message = resultStatus.getText().getTextElement()[0].toString();
        }

        return message;
    }

}
