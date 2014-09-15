package com.micros.harvester.exceptions;

/**
 * Abstract class for errors that occur within a {@link com.micros.harvester.handlers.OXIPushHandler}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public abstract class HandlingException extends Exception {
	public HandlingException(String message) {
		super(message);
	}

	public HandlingException() {
	}

	public HandlingException(String message, Throwable cause) {
		super(message, cause);
	}

	public HandlingException(Throwable cause) {
		super(cause);
	}

	public HandlingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
