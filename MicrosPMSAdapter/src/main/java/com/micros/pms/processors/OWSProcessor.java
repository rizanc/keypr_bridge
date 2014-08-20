package com.micros.pms.processors;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.request.PMSRequest;
import com.cloudkey.pms.response.PMSResponse;
import com.micros.pms.OWSBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class OWSProcessor<Request extends PMSRequest, Response extends PMSResponse, MicrosRequest, MicrosResponse> extends OWSBase {
	protected final Logger log = LoggerFactory.getLogger(getClass());

	public Response process(Request request) throws PMSInterfaceException {
		log.debug("Processing request: {}", request);

		MicrosRequest microsRequest = toMicrosRequest(request);
		MicrosResponse microsResponse;

		// A WebServiceException will occur for SOAP client communication errors.
		// Wrap this in a PMSInterfaceException to classify the exception as such.
		try {
			microsResponse = callService(microsRequest, createOGHeaderE());
		} catch (WebServiceException e) {
			throw new PMSInterfaceException(e);
		}

		errorIfFailure(getResultStatus(microsResponse));

		Response response = toPmsResponse(microsResponse);
		log.debug("Response: {}", response);

		return response;
	}

	protected abstract ResultStatus getResultStatus(MicrosResponse response);

	protected abstract MicrosResponse callService(MicrosRequest microsRequest, Holder<OGHeader> header);

	protected abstract MicrosRequest toMicrosRequest(Request request);

	protected abstract Response toPmsResponse(MicrosResponse microsResponse);
}
