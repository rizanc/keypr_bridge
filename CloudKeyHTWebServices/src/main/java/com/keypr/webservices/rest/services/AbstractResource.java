package com.keypr.webservices.rest.services;

import com.cloudkey.message.parser.IParserInterface;
import com.google.inject.Inject;
import com.wordnik.swagger.annotations.Api;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public abstract class AbstractResource {

    @Inject
    IParserInterface messageParser;

}
