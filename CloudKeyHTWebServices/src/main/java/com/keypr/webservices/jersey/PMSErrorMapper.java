package com.keypr.webservices.jersey;

import com.cloudkey.exceptions.PMSError;
import com.cloudkey.pms.response.PMSResponse;
import com.cloudkey.pms.response.SOAPMessages;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Maps throwned {@link com.cloudkey.exceptions.PMSError}s into web responses.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Provider
public class PMSErrorMapper implements ExceptionMapper<PMSError> {
	@Override
	public Response toResponse(PMSError pmsError) {
		return Response
			.status(Response.Status.BAD_REQUEST)
			.entity(new PMSErrorResponse(pmsError.getMessage(), pmsError.getErrorCode(), pmsError.getSoapMessages()))
			.build();
	}

	static class PMSErrorResponse extends PMSResponse {
		private String message;

		private String errorCode;

		PMSErrorResponse(String message, String errorCode, SOAPMessages soapMessages) {
			this.message = message;
			this.errorCode = errorCode;
			setSoapMessages(soapMessages);
		}

		public String getMessage() {
			return message;
		}

		public String getErrorCode() {
			return errorCode;
		}
	}
}
