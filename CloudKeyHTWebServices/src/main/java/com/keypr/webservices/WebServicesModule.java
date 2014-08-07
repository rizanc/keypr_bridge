package com.keypr.webservices;

import com.cloudkey.message.parser.IParserInterface;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.micros.pms.parser.MicrosOWSParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Module which configures Guava DI
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class WebServicesModule extends AbstractModule {
	protected final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    protected void configure() {
	    Properties properties = new Properties();
	    String popfileName = "pms-adapter-configuration.properties";
	    InputStream propFile = getClass().getClassLoader().getResourceAsStream(popfileName);

	    try {
		    properties.load(propFile);
		    propFile.close();

		    Names.bindProperties(binder(), properties);
	    } catch (IOException e) {
		    log.error("Could not load property file", propFile, e);
	    }

        bind(IParserInterface.class).to(MicrosOWSParser.class).in(Singleton.class);
    }
}
