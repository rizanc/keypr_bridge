package com.micros.pms.processors;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.common.ResultStatusFlag;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.request.PMSRequest;
import com.cloudkey.pms.response.PMSResponse;
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
public abstract class OWSProcessor<Request extends PMSRequest, Response extends PMSResponse, MicrosRequest, MicrosResponse> extends OWSBase {
	protected final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    @Named("keypr.bridge.micros.ows.response.includeSoap")
    protected boolean includeSoap;

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
		SOAPMessages soapMessages = getSoapMessages(microsRequest, microsResponse);

		if (result.getResultStatusFlag() == ResultStatusFlag.FAIL) {
			try {
				response = handleError(result);
			} catch (PMSError error) {
				error.setSoapMessages(soapMessages);
				throw error;
			}

			if (response == null) {
				PMSError pmsError = new PMSError(
					getErrorMessage(result),
					result.getOperaErrorCode(),
					soapMessages
				);

				log.debug("OWS Response ResultStatus was FAIL. Throwing exception", pmsError);
				throw pmsError;
			}
		} else {
			response = toPmsResponse(microsResponse);
		}

		response.setSoapMessages(soapMessages);

		log.debug("Response: {}", response);

		return response;
	}

	protected Response handleError(ResultStatus result) {
		return null;
	}

	private SOAPMessages getSoapMessages(MicrosRequest microsRequest, MicrosResponse microsResponse) {
		if (includeSoap) {
			try {
				return new SOAPMessages(
					marshallToString(microsRequest),
					marshallToString(microsResponse)
				);
			} catch (JAXBException e) {
				log.error("Error occured while initializing jaxbContext: {} ", e);
			}
		}

		return null;
	}

	private String marshallToString(Object obj) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter stringWriter = new StringWriter();
		jaxbMarshaller.marshal(obj, stringWriter);
		return stringWriter.toString();
	}


	protected abstract ResultStatus getResultStatus(MicrosResponse response);

	protected abstract MicrosResponse callService(MicrosRequest microsRequest, Holder<OGHeader> header);

	protected abstract MicrosRequest toMicrosRequest(Request request);

	protected abstract Response toPmsResponse(MicrosResponse microsResponse);
}
