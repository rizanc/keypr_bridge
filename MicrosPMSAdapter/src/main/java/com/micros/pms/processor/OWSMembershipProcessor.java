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
import com.google.common.collect.Iterables;
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
public class OWSMembershipProcessor extends AbstractOWSProcessor {

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

        MicrosPMSLogger.logInfo(MicrosOWSParser.class, " getFetchMemberPointsRequestObject ", " Exit getFetchMemberPointsRequestObject method ");
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

        AwardPointsInfo[] objAwardPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getAwardPointsInfo();

	    double bonusPoint = 0.0;
	    double totalPoint = 0.0;

	    for (AwardPointsInfo anObjAwardPointsInfo : objAwardPointsInfo) {
		    bonusPoint = anObjAwardPointsInfo.getBonusPoints();
		    totalPoint = anObjAwardPointsInfo.getTotalPoints();
	    }

	    StayPointsInfo[] objStayPointsInfo = objFetchMemberPointsResponse.getPointsInfo().getStayPointsInfo();

	    int totalNight = 0;
	    int totalStay = 0;

	    for (StayPointsInfo anObjStayPointsInfo : objStayPointsInfo) {
		    totalNight = anObjStayPointsInfo.getGuestTotalNights();
		    totalStay = anObjStayPointsInfo.getGuestTotalStays();
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

}
