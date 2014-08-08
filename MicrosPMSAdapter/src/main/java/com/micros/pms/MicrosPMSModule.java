package com.micros.pms;

import com.cloudkey.message.parser.IParserInterface;
import com.cloudkey.pms.micros.ows.OWSSupportModule;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.micros.pms.parser.MicrosOWSParser;

/**
 * Binds {@link IParserInterface} to the Micros-specific implementation.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MicrosPMSModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new OWSSupportModule());
		bind(IParserInterface.class).to(MicrosOWSParser.class).in(Singleton.class);
	}

}
