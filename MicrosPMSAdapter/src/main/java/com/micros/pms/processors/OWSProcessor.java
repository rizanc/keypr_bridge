package com.micros.pms.processors;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.request.PMSRequest;
import com.cloudkey.pms.response.PMSResponse;
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
import java.io.OutputStream;
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

		errorIfFailure(getResultStatus(microsResponse));

		Response response = toPmsResponse(microsResponse);

        if (includeSoap) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(microsResponse.getClass());
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

                StringWriter stringWriter = new StringWriter();
                jaxbMarshaller.marshal(microsResponse, stringWriter);

                response.setSoapResponse(stringWriter.toString());
            } catch (JAXBException e) {
                log.error("Error occured while initializing jaxbContext: {} ", e);
            }
        }

		log.debug("Response: {}", response);

		return response;
	}

	protected abstract ResultStatus getResultStatus(MicrosResponse response);

	protected abstract MicrosResponse callService(MicrosRequest microsRequest, Holder<OGHeader> header);

	protected abstract MicrosRequest toMicrosRequest(Request request);

	protected abstract Response toPmsResponse(MicrosResponse microsResponse);
}
