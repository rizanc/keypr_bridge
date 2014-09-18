package com.micros.pms.processors;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.response.SOAPMessages;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
import java.io.StringWriter;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class BaseOWSProcessor<Request, Response, MicrosRequest, MicrosResponse> extends OWSBase {
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

		ResultStatus result = getResultStatus(microsResponse);

		Response response;

		if (result.getResultStatusFlag() == ResultStatusFlag.FAIL) {
			try {
				response = handleError(result);
			} catch (PMSError error) {
				errorFilter(error, microsRequest, microsResponse);
				throw error;
			}

			if (response == null) {
				PMSError pmsError = new PMSError(
					getErrorMessage(result),
					result.getOperaErrorCode(),
					null
				);

				errorFilter(pmsError, microsRequest, microsResponse);

				log.debug("OWS Response ResultStatus was FAIL. Throwing exception", pmsError);
				throw pmsError;
			}
		} else {
			response = toPmsResponse(microsResponse, request);
		}

		responseFilter(response, microsRequest, microsResponse);

		log.debug("Response: {}", response);

		return response;
	}

	protected void responseFilter(Response response, MicrosRequest microsRequest, MicrosResponse microsResponse) {
	}

	protected void errorFilter(PMSError error, MicrosRequest microsRequest, MicrosResponse microsResponse) {
	}

	protected Response handleError(ResultStatus result) {
		return null;
	}

	protected abstract ResultStatus getResultStatus(MicrosResponse response);

	protected abstract MicrosResponse callService(MicrosRequest microsRequest, Holder<OGHeader> header);

	protected abstract MicrosRequest toMicrosRequest(Request request);

	protected abstract Response toPmsResponse(MicrosResponse microsResponse, Request request);
}
