package com.cloudkey.exceptions;

import com.cloudkey.pms.response.SOAPMessages;
import com.keypr.bridge.ids.BridgeIds;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Exception which implementations of {@link com.cloudkey.message.parser.PMSInterface} may throw
 * when the PMS responds with an error message.
 *
 * When thrown, the REST service will return 400 with a JSON response containing the error message.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = true)
@Value
public class PMSError extends RuntimeException {
	String errorCode;

	@NonFinal
	SOAPMessages soapMessages = null;

	public PMSError(BridgeIds.PMSErrorMessage message) {
		this(message.getMessage(), message.name(), null);
	}

	public PMSError(String message, String errorCode, SOAPMessages soapMessages) {
		super(message);
		this.errorCode = errorCode;
		this.soapMessages = soapMessages;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public SOAPMessages getSoapMessages() {
		return soapMessages;
	}

	public void setSoapMessages(SOAPMessages soapMessages) {
		if (this.soapMessages != null) {
			throw new IllegalStateException("soapMessages already set");
		}

		this.soapMessages = soapMessages;
	}

}
