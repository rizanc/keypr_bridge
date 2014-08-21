package com.micros.pms.processors.memberships;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership;
import com.cloudkey.pms.micros.og.name.NameLookupInput;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.ows.name.NameLookupRequest;
import com.cloudkey.pms.micros.ows.name.NameLookupResponse;
import com.cloudkey.pms.micros.services.NameServiceSoap;
import com.cloudkey.pms.request.memberships.NameIdByMembershipRequest;
import com.cloudkey.pms.response.memberships.NameIdByMembershipResponse;
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
public class NameIdByMembershipProcessor extends OWSProcessor<
	NameIdByMembershipRequest,
	NameIdByMembershipResponse,
	NameLookupRequest,
	NameLookupResponse> {

	@Inject
	protected NameServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(NameLookupResponse nameLookupResponse) {
		return nameLookupResponse.getResult();
	}

	@Override
	protected NameLookupResponse callService(NameLookupRequest nameLookupRequest, Holder<OGHeader> header) {
		return service.nameLookup(nameLookupRequest, header);
	}

	@Override
	protected NameLookupRequest toMicrosRequest(NameIdByMembershipRequest request) {
		return new NameLookupRequest(
			new NameLookupInput()
				.withMembership(
					new NameLookupCriteriaMembership()
						.withLastName(request.getLastname())
						.withMembershipNumber(request.getMembershipNumber())
						.withMembershipType(request.getMembershipType())
				)
		);
	}

	@Override
	protected NameIdByMembershipResponse toPmsResponse(NameLookupResponse microsResponse) {
		NameIdByMembershipResponse response = new NameIdByMembershipResponse();

		Optional<Profile> firstProfileOpt = FluentIterable.from(microsResponse.getProfiles()).first();

		if (firstProfileOpt.isPresent()) {
			Optional<UniqueID> internalIdOpt = Iterables.tryFind(firstProfileOpt.get().getProfileIDs(), new Predicate<UniqueID>() {
				@Override
				public boolean apply(@Nullable UniqueID uniqueID) {
					return uniqueID.getType() == UniqueIDType.INTERNAL;
				}
			});

			if (internalIdOpt.isPresent()) {
				response.setNameId(internalIdOpt.get().getValue());
			}
		}

		return response;
	}
}