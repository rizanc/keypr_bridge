package com.cloudkey.exceptions;

/**
 * Exception which implementations of {@link com.cloudkey.message.parser.IParserInterface} may throw
 * when the PMS responds with an error message.
 *
 * When thrown, the REST service will return 400 with a JSON response containing the error message.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PMSError extends RuntimeException {
	private final String errorCode;

	public PMSError(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
