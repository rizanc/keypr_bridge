package com.cloudkey.pms.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The base class for responses from the web services.
 */
@EqualsAndHashCode
public abstract class PMSResponse {
	@Getter
	@Setter
	private SOAPMessages soapMessages = null;

	public PMSResponse() {
	}
}
