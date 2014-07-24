package com.cloudkey.commons;

public class Response {
	
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
