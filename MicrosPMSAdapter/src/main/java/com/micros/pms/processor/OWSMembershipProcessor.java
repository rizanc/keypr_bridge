package com.micros.pms.processor;

import com.cloudkey.pms.micros.og.common.Membership;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.og.membership.AwardPointsInfo;
import com.cloudkey.pms.micros.og.membership.StayPointsInfo;
import com.cloudkey.pms.micros.ows.membership.FetchMemberPointsRequest;
import com.cloudkey.pms.micros.ows.membership.FetchMemberPointsResponse;
import com.cloudkey.pms.micros.services.MembershipServiceStub;
import com.cloudkey.pms.request.memberships.MemberPointsRequest;
import com.cloudkey.pms.response.memberships.MemberPointsResponse;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.parser.MicrosOWSParser;
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

        FetchMemberPointsRequest objRequest;

        MemberPointsResponse response = null;

        objRequest = getFetchMemberPointsRequestObject(objMemberPointsRequest);

        OGHeaderE ogh = getHeaderE();

        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(objRequest));
        FetchMemberPointsResponse resp =
                membershipServiceStub.fetchMemberPoints(objRequest, ogh);
        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(resp));

        response = getMemberPointsResponse(resp);
        MicrosPMSLogger.logInfo(OWSInformationProcessor.class, "processFetchMemberPoints ",
                AdapterUtility.convertToStreamXML(response));

        return response;
    }

    /*
     * this method is used to set request for member points.
     */
    private FetchMemberPointsRequest getFetchMemberPointsRequestObject(MemberPointsRequest objMemberPointsRequest) {

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getFetchMemberPointsRequestObject "," Enter getFetchMemberPointsRequestObject method " );

        FetchMemberPointsRequest objFetchMemberPointsRequest = null;

        objFetchMemberPointsRequest = new FetchMemberPointsRequest();
        objFetchMemberPointsRequest.setMembershipNumber(objMemberPointsRequest.getMembershipNumber());

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getFetchMemberPointsRequestObject "," Exit getFetchMemberPointsRequestObject method " );
        return objFetchMemberPointsRequest;
    }

    /*
     * This method is used to set response for Member points.
     */
    private MemberPointsResponse getMemberPointsResponse(FetchMemberPointsResponse objFetchMemberPointsResponse) {

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getMemberPointsResponse "," Enter getMemberPointsResponse method " );

        MemberPointsResponse objMemberPointsResponse = new MemberPointsResponse();

        //objMemberPointsResponse.setResult(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());
        objMemberPointsResponse.setStatus(objFetchMemberPointsResponse.getResult().getResultStatusFlag().getValue());

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getMemberPointsResponse "," Result Status Set to the response " );

        Membership objMembership = objFetchMemberPointsResponse.getMemberInfo();

        String membername = objMembership.getMemberName();
        String membershipId = objMembership.getMembershipid().getString();

        String membershipType = objMembership.getMembershipType();
        String membershipNumber = objMembership.getMembershipNumber();

        String membershipLevel = objMembership.getMembershipLevel();
        Date effectiveDate = objMembership.getEffectiveDate();
        Date expiredate = objMembership.getExpirationDate();

        Boolean objBoolean = objMembership.getInactive();
        String inactive = String.valueOf(objBoolean);

        UniqueID[] objId =  objMembership.getResvNameId().getUniqueID();

        int uniqueIdLength = objId.length;
        String revId = " ";
        String rev = " ";
        for( int uniqueIdIndex =0; uniqueIdIndex < uniqueIdLength; uniqueIdIndex++) {

            rev = objId[uniqueIdIndex].getString();
            revId.concat(rev).concat(" ");
        }

        AwardPointsInfo objAwardPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getAwardPointsInfo();
	    StayPointsInfo objStayPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getStayPointsInfo();

	    String totalPoints = String.valueOf(objAwardPointsInfo.getTotalPoints());
        String bonusPoints = String.valueOf(objAwardPointsInfo.getBonusPoints());
        String guestTotalNight = String.valueOf(objStayPointsInfo.getGuestTotalNights());
        String guestTotalStay = String.valueOf(objStayPointsInfo.getGuestTotalStays());

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

        MicrosPMSLogger.logInfo( MicrosOWSParser.class, " getMemberPointsResponse "," Exit getMemberPointsResponse method " );
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
