package com.cloudkey.commons;

public class Response {

    // TODO: Remove these. Status should be HTTP status instead
    // Validation should be used for field validity and PMS communication errors should be logged and have
    // 502 response
	protected String status;
	protected String errorMessage;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", errorMessage=" + errorMessage
				+ "]";
	}

}
