package com.cloudkey.exceptions;

import lombok.EqualsAndHashCode;

import javax.ws.rs.WebApplicationException;

/**
 * Exception which implementations of {@link com.cloudkey.message.parser.PMSInterface} may throw when a PMS communication error occurs.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PMSInterfaceException extends WebApplicationException {
    public PMSInterfaceException(Throwable cause)
    {
        super(cause, 502 /* bad gateway */);
    }
}
