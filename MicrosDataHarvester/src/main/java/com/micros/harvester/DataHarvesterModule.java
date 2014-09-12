package com.micros.harvester;

import com.cloudkey.db.DatabaseModule;
import com.cloudkey.util.GuiceUtils;
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
		install(new DatabaseModule());

		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream("dataharvester.properties"));
	}
}
