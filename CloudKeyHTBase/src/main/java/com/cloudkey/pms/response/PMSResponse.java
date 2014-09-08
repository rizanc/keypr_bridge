package com.cloudkey.pms.response;

/**
 * The base class for responses from the web services.
 */
public abstract class PMSResponse {
	private SOAPMessages soapMessages;

	public SOAPMessages getSoapMessages() {
		return soapMessages;
	}

	public void setSoapMessages(SOAPMessages soapMessages) {
		this.soapMessages = soapMessages;
	}
}
