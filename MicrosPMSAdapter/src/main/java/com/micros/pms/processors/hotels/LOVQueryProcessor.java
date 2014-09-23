package com.micros.pms.processors.hotels;

import com.cloudkey.pms.common.hotel.LOVItem;
import com.cloudkey.pms.common.hotel.LOVValue;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.ows.information.*;
import com.cloudkey.pms.micros.services.InformationSoap;

import com.cloudkey.pms.request.hotels.LOVRequest;
import com.cloudkey.pms.response.hotels.LOVResponse;
import com.micros.pms.processors.OWSProcessor;

import com.google.inject.Inject;

import javax.xml.ws.Holder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author crizan
 */
public class LOVQueryProcessor extends OWSProcessor<
        LOVRequest,
        LOVResponse,
        com.cloudkey.pms.micros.ows.information.LovRequest,
        com.cloudkey.pms.micros.ows.information.LovResponse> {

    @Inject
    protected InformationSoap service;

    @Override
    protected ResultStatus getResultStatus(com.cloudkey.pms.micros.ows.information.LovResponse lovQueryResponse) {
        return lovQueryResponse.getResult();
    }

    @Override
    protected com.cloudkey.pms.micros.ows.information.LovResponse callService(com.cloudkey.pms.micros.ows.information.LovRequest lovRequest, Holder<OGHeader> header) {
        return service.queryLov(lovRequest, header);
    }

    @Override
    protected com.cloudkey.pms.micros.ows.information.LovRequest toMicrosRequest(LOVRequest request) {
        com.cloudkey.pms.micros.ows.information.LovRequest microsRequest = new com.cloudkey.pms.micros.ows.information.LovRequest();

        microsRequest.setLovQuery2(new LovQueryType2()
                .withLovIdentifier(request.getIdentifier()));

		// Oddly enough, this is the origin entityId is the expected value for host.
        LovQueryQualifierType host = new LovQueryQualifierType().
                withQualifierType("HOST").
                withValue(entityId);

        LovQueryQualifierType resort = new LovQueryQualifierType().
                withQualifierType("RESORT").
                withValue(hotelCode);

        ArrayList<LovQueryQualifierType> qualifiers = new ArrayList<>();
        qualifiers.add(host);
        qualifiers.add(resort);
        microsRequest.getLovQuery2().withLovQueryQualifiers(qualifiers);

        return microsRequest;
    }

	@Override
	protected LOVResponse toPmsResponse(LovResponse microsResponse, LOVRequest lovRequest) {
		List<LOVItem> lovItems = new ArrayList<>();

        List<LovQueryResultType> results = microsResponse.getLovQueryResults();

        for (LovQueryResultType lovQueryResultType : results) {
			List<LOVValue> lovValues = new ArrayList<>();

			for (LovValueType value : lovQueryResultType.getLovValues()) {
				lovValues.add(new LOVValue(value.getDescription(), value.getValue()));
			}


			LOVItem.LOVItemBuilder lovItemBuilder = LOVItem.builder();

			lovItemBuilder.lovValues(lovValues);
            lovItemBuilder.qualifierType(lovQueryResultType.getQualifierType());
            lovItemBuilder.qualifierValue(lovQueryResultType.getQualifierValue());
            lovItemBuilder.secondaryQualifierType(lovQueryResultType.getSecondaryQualifierType());
            lovItemBuilder.secondaryQualifierValue(lovQueryResultType.getSecondaryQualifierValue());
            lovItemBuilder.tertiaryQualifierType(lovQueryResultType.getTertiaryQualifierType());
            lovItemBuilder.tertiaryQualifierValue(lovQueryResultType.getTertiaryQualifierValue());
            lovItemBuilder.quaternaryQualifierType(lovQueryResultType.getQuaternaryQualifierType());
            lovItemBuilder.quaternaryQualifierValue(lovQueryResultType.getQuaternaryQualifierValue());
            lovItemBuilder.quinaryQualifierType(lovQueryResultType.getQuinaryQualifierType());
			lovItemBuilder.quinaryQualifierValue(lovQueryResultType.getQuinaryQualifierValue());

			lovItems.add(lovItemBuilder.build());
		}

        return new LOVResponse(lovItems);
    }
}
