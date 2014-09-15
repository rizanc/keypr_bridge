package com.cloudkey.exceptions;

import com.cloudkey.pms.response.SOAPMessages;
import com.keypr.bridge.ids.BridgeIds;

/**
 * Exception which implementations of {@link com.cloudkey.message.parser.PMSInterface} may throw
 * when the PMS responds with an error message.
 *
 * When thrown, the REST service will return 400 with a JSON response containing the error message.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PMSError extends RuntimeException {
	private final String errorCode;

	private SOAPMessages soapMessages = null;

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

	@Override
	public String toString() {
		return "PMSError{" +
			"errorCode='" + errorCode + '\'' +
			", soapMessages=" + soapMessages +
			'}';
	}
}
