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
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;

import javax.xml.ws.Holder;
import java.util.ArrayList;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
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
	protected GuestMembershipsResponse toPmsResponse(FetchGuestCardListResponse microsResponse, GuestMembershipsRequest request) {
		ArrayList<Membership> memberships = new ArrayList<>();
		for (NameMembership microsMembership : microsResponse.getGuestCardList()) {
			Membership membership = new Membership(
				microsMembership.getMembershipType(),
				microsMembership.getMembershipNumber(),
				microsMembership.getMembershipLevel(),
				microsMembership.getOperaId() == null ? null : microsMembership.getOperaId().toString(),
				microsMembership.getExternalId(),
				microsMembership.getPointsLabel(),
				microsMembership.getMembershipid() == null ? null : microsMembership.getMembershipid().getValue(),
				microsMembership.getMemberName(),
				microsMembership.getCurrentPoints(),
				microsMembership.getEffectiveDate(),
				microsMembership.getExpirationDate()
			);

			memberships.add(membership);
		}

		return new GuestMembershipsResponse(memberships);
	}
}
