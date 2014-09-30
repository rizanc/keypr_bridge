package com.cloudkey.exceptions;

import org.eclipse.jetty.server.Response;

import javax.ws.rs.WebApplicationException;

/**
 * Exception thrown when a reservation cannot be found.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class ReservationNotFound extends WebApplicationException {

	public ReservationNotFound() {
		super(Response.SC_NOT_FOUND);
	}

}
