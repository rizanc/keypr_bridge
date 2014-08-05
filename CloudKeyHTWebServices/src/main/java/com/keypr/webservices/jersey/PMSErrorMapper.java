package com.keypr.webservices.jersey;

import com.cloudkey.exceptions.PMSError;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Provider
public class PMSErrorMapper implements ExceptionMapper<PMSError> {
	@Override
	public Response toResponse(PMSError pmsError) {
		return Response
			.status(Response.Status.BAD_REQUEST)
			.entity(new PMSErrorResponse(pmsError.getMessage(), pmsError.getErrorCode()))
			.build();
	}

	static class PMSErrorResponse {
		private String message;

		private String errorCode;

		PMSErrorResponse(String message, String errorCode) {
			this.message = message;
			this.errorCode = errorCode;
		}

		public String getMessage() {
			return message;
		}

		public String getErrorCode() {
			return errorCode;
		}
	}
}
