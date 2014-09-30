package com.micros.harvester;

import com.keypr.guice.GuiceUtils;
import com.google.inject.AbstractModule;
import com.micros.pms.MicrosPMSModule;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class DataHarvesterModule extends AbstractModule {
	@Override
	protected void configure() {
		install(new MicrosPMSModule());
		install(new com.keypr.jackson.KeyprJacksonModule());

		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream("dataharvester.properties"));
	}
}
