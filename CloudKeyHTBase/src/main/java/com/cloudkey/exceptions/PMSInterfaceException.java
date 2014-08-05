package com.cloudkey.exceptions;

import com.cloudkey.message.parser.IParserInterface;

import javax.ws.rs.WebApplicationException;

/**
 * Exception which implementations of {@link IParserInterface} may throw when a PMS communication error occurs.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class PMSInterfaceException extends WebApplicationException {
    public PMSInterfaceException(Throwable cause)
    {
        super(cause, 502 /* bad gateway */);
    }
}
