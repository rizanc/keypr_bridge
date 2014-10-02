package com.micros.pms.processors.memberships;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.name.NameLookupAll;
import com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership;
import com.cloudkey.pms.micros.og.name.NameLookupInput;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.ows.ConverterUtils;
import com.cloudkey.pms.micros.services.NameServiceSoap;
import com.cloudkey.pms.request.memberships.SearchMembershipsRequest;
import com.cloudkey.pms.response.memberships.SearchMembershipsResponse;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class SearchMembershipsProcessor extends OWSProcessor<
	SearchMembershipsRequest,
	SearchMembershipsResponse,
	com.cloudkey.pms.micros.ows.name.NameLookupRequest,
	com.cloudkey.pms.micros.ows.name.NameLookupResponse> {

	@Inject
	protected NameServiceSoap service;

	@Inject
	protected ConverterUtils converterUtils;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.name.NameLookupResponse nameLookupResponse) {
		return nameLookupResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.name.NameLookupResponse callService(com.cloudkey.pms.micros.ows.name.NameLookupRequest nameLookupRequest, Holder<OGHeader> header) {
		return service.nameLookup(nameLookupRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.name.NameLookupRequest toMicrosRequest(SearchMembershipsRequest request) {
		NameLookupInput nameLookupInput = new NameLookupInput();
		if (request.getMembershipNumber() != null) {
			nameLookupInput.setMembership(new NameLookupCriteriaMembership()
				.withMembershipNumber(request.getMembershipNumber())
				.withMembershipType(request.getMembershipType())
				.withFirstName(request.getFirstName())
				.withLastName(request.getLastName())
			);
		} else {
			nameLookupInput.setNameLookup(new NameLookupAll()
				.withFirstName(request.getFirstName())
				.withLastName(request.getLastName())
			);
		}

		return new com.cloudkey.pms.micros.ows.name.NameLookupRequest(nameLookupInput);
	}

	@Override
	protected SearchMembershipsResponse toPmsResponse(com.cloudkey.pms.micros.ows.name.NameLookupResponse microsResponse, SearchMembershipsRequest request) {
		return new SearchMembershipsResponse(
			converterUtils.convertCustomerProfiles(microsResponse.getProfiles())
		);
	}
}
