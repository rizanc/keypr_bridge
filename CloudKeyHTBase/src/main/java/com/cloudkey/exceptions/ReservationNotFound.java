package com.cloudkey.exceptions;

import lombok.EqualsAndHashCode;
import org.eclipse.jetty.server.Response;

import javax.ws.rs.WebApplicationException;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ReservationNotFound extends WebApplicationException {

	public ReservationNotFound() {
		super(Response.SC_NOT_FOUND);
	}

}
