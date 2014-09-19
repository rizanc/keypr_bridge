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
            LOVItem lovItem = new LOVItem();
            lovItems.add(lovItem);

            lovItem.setQualifierType(lovQueryResultType.getQualifierType());
            lovItem.setQualifierValue(lovQueryResultType.getQualifierValue());
            lovItem.setSecondaryQualifierType(lovQueryResultType.getSecondaryQualifierType());
            lovItem.setSecondaryQualifierValue(lovQueryResultType.getSecondaryQualifierValue());
            lovItem.setTertiaryQualifierType(lovQueryResultType.getTertiaryQualifierType());
            lovItem.setTertiaryQualifierValue(lovQueryResultType.getTertiaryQualifierValue());
            lovItem.setQuaternaryQualifierType(lovQueryResultType.getQuaternaryQualifierType());
            lovItem.setQuaternaryQualifierValue(lovQueryResultType.getQuaternaryQualifierValue());
            lovItem.setQuinaryQualifierType(lovQueryResultType.getQuinaryQualifierType());
            lovItem.setQuinaryQualifierValue(lovQueryResultType.getQuinaryQualifierValue());

			List<LOVValue> lovValues = new ArrayList<>();

			for (LovValueType value : lovQueryResultType.getLovValues()) {
				lovValues.add(new LOVValue(value.getDescription(), value.getValue()));
            }

			lovItem.setLovValues(lovValues);
        }

        return new LOVResponse(lovItems);
    }
}
