package com.micros.pms.processors.memberships;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.name.NameLookupAll;
import com.cloudkey.pms.micros.og.name.NameLookupCriteriaMembership;
import com.cloudkey.pms.micros.og.name.NameLookupInput;
import com.cloudkey.pms.micros.og.name.Profile;
import com.cloudkey.pms.micros.services.NameServiceSoap;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
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
public class NameLookupProcessor extends OWSProcessor<
	NameLookupRequest,
	NameLookupResponse,
	com.cloudkey.pms.micros.ows.name.NameLookupRequest,
	com.cloudkey.pms.micros.ows.name.NameLookupResponse> {

	@Inject
	protected NameServiceSoap service;

	@Override
	protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.name.NameLookupResponse nameLookupResponse) {
		return nameLookupResponse.getResult();
	}

	@Override
	protected com.cloudkey.pms.micros.ows.name.NameLookupResponse callService(com.cloudkey.pms.micros.ows.name.NameLookupRequest nameLookupRequest, Holder<OGHeader> header) {
		return service.nameLookup(nameLookupRequest, header);
	}

	@Override
	protected com.cloudkey.pms.micros.ows.name.NameLookupRequest toMicrosRequest(NameLookupRequest request) {
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
	protected NameLookupResponse toPmsResponse(com.cloudkey.pms.micros.ows.name.NameLookupResponse microsResponse, NameLookupRequest request) {

		Optional<Profile> firstProfileOpt = FluentIterable.from(microsResponse.getProfiles()).first();

		if (firstProfileOpt.isPresent()) {
			Optional<UniqueID> internalIdOpt = Iterables.tryFind(firstProfileOpt.get().getProfileIDs(), new Predicate<UniqueID>() {
				@Override
				public boolean apply(@Nullable UniqueID uniqueID) {
					return uniqueID.getType() == UniqueIDType.INTERNAL;
				}
			});

			if (internalIdOpt.isPresent()) {
				return new NameLookupResponse(internalIdOpt.get().getValue());
			}
		}

		return new NameLookupResponse(null);
	}
}
