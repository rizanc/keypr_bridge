package com.keypr.webservices;

import com.cloudkey.message.parser.IParserInterface;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.micros.pms.parser.MicrosOWSParser;

/**
 * Module which configures Guava DI
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class WebServicesModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IParserInterface.class).to(MicrosOWSParser.class).in(Singleton.class);
    }
}
