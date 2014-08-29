package com.cloudkey.pms.response;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class SOAPMessages {
	private String soapRequest;

	private String soapResponse;

	protected SOAPMessages() {}

	public SOAPMessages(String soapRequest, String soapResponse) {
		this.soapRequest = soapRequest;
		this.soapResponse = soapResponse;
	}

	public String getSoapRequest() {
		return soapRequest;
	}

	public String getSoapResponse() {
		return soapResponse;
	}
}