package com.micros.harvester.exceptions;

/**
 * Exception raised if a {@link com.micros.harvester.handlers.AbstractUploadHandler} implementation
 * cannot successfully POST data to the upload endpoint.
 *
 * When this occurs, the upload should be reattempted later.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class UploadFailureException extends HandlingException {
	public UploadFailureException(String message) {
		super(message);
	}

	public UploadFailureException() {
	}

	public UploadFailureException(String message, Throwable cause) {
		super(message, cause);
	}

	public UploadFailureException(Throwable cause) {
		super(cause);
	}

	public UploadFailureException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
