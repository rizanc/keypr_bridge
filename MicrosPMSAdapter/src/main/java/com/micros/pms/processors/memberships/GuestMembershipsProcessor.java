package com.micros.pms.processors.memberships;

import com.cloudkey.commons.Membership;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.name.NameMembership;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListRequest;
import com.cloudkey.pms.micros.ows.name.FetchGuestCardListResponse;
import com.cloudkey.pms.micros.services.NameServiceSoap;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;
import java.util.ArrayList;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class GuestMembershipsProcessor extends OWSProcessor<
	GuestMembershipsRequest,
	GuestMembershipsResponse,
	FetchGuestCardListRequest,
	FetchGuestCardListResponse> {

	@Inject
	protected NameServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(FetchGuestCardListResponse microsResponse) {
		return microsResponse.getResult();
	}

	@Override
	protected FetchGuestCardListResponse callService(FetchGuestCardListRequest fetchGuestCardListRequest, Holder<OGHeader> header) {
		return service.fetchGuestCardList(fetchGuestCardListRequest, header);
	}

	@Override
	protected FetchGuestCardListRequest toMicrosRequest(GuestMembershipsRequest request) {
		return new FetchGuestCardListRequest()
			.withNameID(new UniqueID(request.getPmsNameId(), UniqueIDType.INTERNAL, null));
	}

	@Override
	protected GuestMembershipsResponse toPmsResponse(FetchGuestCardListResponse microsResponse) {
		ArrayList<Membership> memberships = new ArrayList<>();
		for (NameMembership nameMembership : microsResponse.getGuestCardList()) {

			Membership membership = new Membership();
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
			membership.setOperaId(nameMembership.getOperaId().toString());

			memberships.add(membership);
		}

		return new GuestMembershipsResponse(memberships);
	}
}
