package com.micros.pms.processors;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.request.PMSRequest;
import com.cloudkey.pms.response.PMSResponse;
import com.cloudkey.pms.response.SOAPMessages;
import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * OWS Processor for PMSRequest and PMSResponses.
 *
 * Automatically sets the soapMessages field of the response, when includeSoap is enabled.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class OWSProcessor<Request extends PMSRequest, Response extends PMSResponse, MicrosRequest, MicrosResponse> extends BaseOWSProcessor<Request, Response, MicrosRequest, MicrosResponse> {
	protected final Logger log = LoggerFactory.getLogger(getClass());

    @Inject
    @Named("keypr.bridge.micros.ows.response.includeSoap")
    protected boolean includeSoap;

	@Override
	protected void errorFilter(PMSError error, MicrosRequest microsRequest, MicrosResponse microsResponse) {
		if (includeSoap) {
			error.setSoapMessages(getSoapMessages(microsRequest, microsResponse));
		}
	}

	@Override
	protected void responseFilter(Response response, MicrosRequest microsRequest, MicrosResponse microsResponse) {
		if (includeSoap) {
			response.setSoapMessages(getSoapMessages(microsRequest, microsResponse));
		}
	}

	protected SOAPMessages getSoapMessages(MicrosRequest microsRequest, MicrosResponse microsResponse) {
		try {
			return new SOAPMessages(
				marshallToString(microsRequest),
				marshallToString(microsResponse)
			);
		} catch (JAXBException e) {
			log.error("Error occurred while initializing jaxbContext: {} ", e);
		}

		return null;
	}

	private static String marshallToString(Object obj) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(obj.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		StringWriter stringWriter = new StringWriter();
		jaxbMarshaller.marshal(obj, stringWriter);
		return stringWriter.toString();
	}
}
