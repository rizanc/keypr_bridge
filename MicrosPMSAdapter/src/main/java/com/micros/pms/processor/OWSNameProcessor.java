package com.micros.pms.processor;

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListRequest;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListResponse;
import com.cloudkey.pms.micros.ows.name.NameLookupRequest;
import com.cloudkey.pms.micros.ows.name.NameLookupResponse;
import com.cloudkey.pms.micros.services.NameService;
import com.cloudkey.pms.micros.services.NameServiceSoap;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.response.memberships.GuestMembershipResponse;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import com.micros.pms.util.AdapterUtility;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSNameProcessor extends OWSBase {
	@Inject
	protected NameServiceSoap service;

	public GuestMembershipResponse processGuestCardList(GuestMembershipsRequest guestMembershipsRequest) throws RemoteException {
        log.debug("processGuestCardList: Enter processGuestCardList method ");

        FetchGuestCardListRequest request = new FetchGuestCardListRequest();
        request.setNameID(new UniqueID(guestMembershipsRequest.getPmsNameId(), UniqueIDType.INTERNAL, null));

		log.debug("processGuestCardList", AdapterUtility.convertToStreamXML(request));

        FetchGuestCardListResponse objResponse = service.fetchGuestCardList(request, createOGHeaderE());
        log.debug("processGuestCardList", AdapterUtility.convertToStreamXML(objResponse));

	    errorIfFailure(objResponse.getResult());

	    GuestMembershipResponse response = new GuestMembershipResponse();

        ArrayList<Membership> memberships = new ArrayList<Membership>();
        for (NameMembership nameMembership : objResponse.getGuestCardList()) {

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

        if (!memberships.isEmpty()) {
	        response.setMembershipList(memberships);
        }

        return response;
    }

    public NameIdByMembershipResponse processNameLookupByMembership(NameIdByMembershipRequest nameIdByMembershipRequest) throws RemoteException {
        log.debug("processNameLookupByMembership: Enter processNameLookupByMembership method ");

        NameLookupRequest objRequest = new NameLookupRequest();

        NameLookupInput nameLookupInput = new NameLookupInput();
        objRequest.setNameLookupCriteria(nameLookupInput);

        NameLookupCriteriaMembership criteriaMembership = new NameLookupCriteriaMembership();

        criteriaMembership.setMembershipNumber(nameIdByMembershipRequest.getMembershipNumber());
        criteriaMembership.setMembershipType(nameIdByMembershipRequest.getMembershipType());
        criteriaMembership.setLastName(nameIdByMembershipRequest.getLastname().toUpperCase());

	    nameLookupInput.setMembership(criteriaMembership);

        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(objRequest));
        NameLookupResponse objResponse = service.nameLookup(objRequest, createOGHeaderE());
        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(objResponse));

	    errorIfFailure(objResponse.getResult());

	    NameIdByMembershipResponse response = new NameIdByMembershipResponse();

	    if (!objResponse.getProfiles().isEmpty()) {
		    Profile profile = objResponse.getProfiles().get(0);
		    for (UniqueID uniqueID : profile.getProfileIDs()) {
			    if (uniqueID.getType() == UniqueIDType.INTERNAL) {
				    response.setNameId(uniqueID.getValue());
				    break;
			    }
		    }
	    }

        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(response));

        return response;
    }

}
