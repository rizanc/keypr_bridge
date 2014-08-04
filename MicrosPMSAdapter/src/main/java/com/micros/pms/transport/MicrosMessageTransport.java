package com.micros.pms.transport;

import com.cloudkey.message.transport.IMessageTransport;
import com.micros.http.connection.HttpClientRequest;
import com.micros.pms.constant.IMicrosConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * This class is used to transport the request message to 
 * the micros simulator using http client.
 * 
 * @author niveditat
 * 
 */
public class MicrosMessageTransport implements IMessageTransport {
	final static Logger log = LoggerFactory.getLogger(MicrosMessageTransport.class);

	@Override
	public String handlePMSRequest(String xmlRequest) {
		log.debug("handlePMSRequest", "Enter in handlePMSRequest method." );

		String response = null;
		
		HttpClientRequest objClientRequest = new HttpClientRequest();

		try {
			
			log.debug("handlePMSRequest", "Request made to the MicrosOWS. Waiting for response... " );
			response = objClientRequest.getHttpPostResponse( IMicrosConstants.PMS_SERVER_URL, xmlRequest );

		} catch ( Exception exc ) {

			log.error(" handlePMSRequest ", exc);
		}

		log.debug("handlePMSRequest", "Response received from PMS " + response );
		log.debug("handlePMSRequest", "Exit  handlePMSRequest method " );
		
		return response;
	}

}
