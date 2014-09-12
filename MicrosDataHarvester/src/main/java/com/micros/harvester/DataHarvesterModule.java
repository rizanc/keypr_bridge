package com.micros.harvester;

import com.cloudkey.db.DatabaseModule;
import com.cloudkey.pms.micros.ows.OWSSupportModule;
import com.cloudkey.util.GuiceUtils;
import com.google.inject.AbstractModule;
import com.micros.harvester.dao.IMicrosDAO;
import com.micros.harvester.dao.MicrosDAOImpl;
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
		bind(IMicrosDAO.class).to(MicrosDAOImpl.class);
	}
}
