package com.micros.pms.processor;

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.OGHeaderE;
import com.cloudkey.pms.micros.og.name.*;
import com.cloudkey.pms.micros.ows.name.*;
import com.cloudkey.pms.micros.services.NameService;
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
	protected NameService service;

	public GuestMembershipResponse processGuestCardList(GuestMembershipsRequest guestMembershipsRequest) throws RemoteException {
        log.debug("processGuestCardList", "Enter processGuestCardList method ");

        FetchGuestCardListRequest request = new FetchGuestCardListRequest();
        request.setNameID(uniqueID(guestMembershipsRequest.getPmsNameId(), UniqueIDType.INTERNAL, null));

	    FetchGuestCardListRequestE requestE = new FetchGuestCardListRequestE();
		log.debug("processGuestCardList", AdapterUtility.convertToStreamXML(requestE));

        FetchGuestCardListResponseE responseE = service.fetchGuestCardList(requestE, createOGHeaderE());
        log.debug("processGuestCardList", AdapterUtility.convertToStreamXML(responseE));

        FetchGuestCardListResponse objResponse = responseE.getFetchGuestCardListResponse();
	    errorIfFailure(objResponse.getResult());

	    GuestMembershipResponse response = new GuestMembershipResponse();

        ArrayList<Membership> memberships = new ArrayList<Membership>();
        if (objResponse.getGuestCardList() != null && objResponse.getGuestCardList().getNameMembership() != null) {
            for (NameMembership nameMembership : objResponse.getGuestCardList().getNameMembership()) {

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

        return response;
    }

    public NameIdByMembershipResponse processNameLookupByMembership(NameIdByMembershipRequest nameIdByMembershipRequest) throws RemoteException {
        log.debug("processNameLookupByMembership", "Enter processNameLookupByMembership method ");

        NameLookupRequest objRequest = new NameLookupRequest();

        NameLookupInput nameLookupInput = new NameLookupInput();
        objRequest.setNameLookupCriteria(nameLookupInput);

	    NameLookupInputChoice_type0 nameLookupInputChoice = new NameLookupInputChoice_type0();
	    nameLookupInput.setNameLookupInputChoice_type0(nameLookupInputChoice);

        NameLookupCriteriaMembership nameLookupCriteriaMembership = new NameLookupCriteriaMembership();
	    nameLookupInputChoice.setMembership(nameLookupCriteriaMembership);

        nameLookupCriteriaMembership.setMembershipNumber(nameIdByMembershipRequest.getMembershipNumber());
        nameLookupCriteriaMembership.setMembershipType(nameIdByMembershipRequest.getMembershipType());
        nameLookupCriteriaMembership.setLastName(nameIdByMembershipRequest.getLastname().toUpperCase());

        OGHeaderE ogh = createOGHeaderE();

	    NameLookupRequestE requestE = new NameLookupRequestE();
	    requestE.setNameLookupRequest(objRequest);

        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(requestE));
        NameLookupResponseE resp = service.nameLookup(requestE, ogh);
        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(resp));

        NameLookupResponse objResponse = resp.getNameLookupResponse();
	    errorIfFailure(objResponse.getResult());

	    NameIdByMembershipResponse response = new NameIdByMembershipResponse();

        ArrayOfProfile profiles = objResponse.getProfiles();
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

        log.debug("processNameLookupByMembership",
	        AdapterUtility.convertToStreamXML(response));

        return response;
    }

}
