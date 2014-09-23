package com.cloudkey.pms.response;

import lombok.Value;

/**
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
public class SOAPMessages {
	String soapRequest;

	String soapResponse;
}