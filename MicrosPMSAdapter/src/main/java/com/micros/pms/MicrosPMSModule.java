package com.micros.pms;

import com.cloudkey.PMSInterface;
import com.cloudkey.pms.micros.ows.OWSSupportModule;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Binds {@link com.cloudkey.PMSInterface} to the Micros-specific implementation.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class MicrosPMSModule extends AbstractModule {

	@Override
	protected void configure() {
		install(new OWSSupportModule());
		bind(PMSInterface.class).to(OperaOWSPMS.class).in(Singleton.class);
	}

}
