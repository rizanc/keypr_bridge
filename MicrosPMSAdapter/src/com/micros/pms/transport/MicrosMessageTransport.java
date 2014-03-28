package com.micros.pms.transport;

import com.cloudkey.message.transport.IMessageTransport;
import com.micros.http.connection.HttpClientRequest;
import com.micros.pms.logger.MicrosPMSLogger;


/**
 * This class is used to transport the request message to 
 * the micros simulator using http client.
 * 
 * @author niveditat
 * 
 */
public class MicrosMessageTransport implements IMessageTransport {
	
	@Override
	public String handlePMSRequest(String xmlRequest) {

		
		MicrosPMSLogger.logInfo( MicrosMessageTransport.class , " handlePMSRequest " , " Enter in handlePMSRequest method." );

		String response = null;
		
		HttpClientRequest objClientRequest = new HttpClientRequest();

		try {
		
			response = objClientRequest.getHttpPostResponse("http://localhost:8080/MicrosSimulatorPMS_OWS/call", xmlRequest );

		} catch (Exception exc) {

			MicrosPMSLogger.logError(MicrosMessageTransport.class, " handlePMSRequest " , exc);
		}

		
		MicrosPMSLogger.logInfo( MicrosMessageTransport.class , " handlePMSRequest " , " Response received from OXI Simulator in xml format :: " + response);
		MicrosPMSLogger.logInfo( MicrosMessageTransport.class , " handlePMSRequest " , " Exit  handlePMSRequest method " );
		
		return response;
	}

}
