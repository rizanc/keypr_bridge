package com.cloudkey.exceptions;

import com.cloudkey.pms.response.SOAPMessages;
import com.keypr.bridge.ids.BridgeIds;
import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Exception which implementations of {@link com.cloudkey.PMSInterface} may throw
 * when the PMS responds with an error message.
 *
 * When thrown, the REST service will return 400 with a JSON response containing the error message.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
@ToString
public class PMSError extends RuntimeException {
	final String errorCode;

	@Setter
	SOAPMessages soapMessages;

	public static PMSError forMessage(BridgeIds.PMSErrorMessage message) {
		return new PMSError(message.getMessage(), message.name(), null);
	}

	public PMSError(String message, String errorCode, SOAPMessages soapMessages) {
		super(message);
		this.errorCode = errorCode;
		this.soapMessages = soapMessages;
	}

}
