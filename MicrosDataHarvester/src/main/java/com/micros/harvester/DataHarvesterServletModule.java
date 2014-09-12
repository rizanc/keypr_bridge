package com.micros.harvester;

import com.google.inject.servlet.ServletModule;
import com.micros.harvester.http.OXIServlet;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class DataHarvesterServletModule extends ServletModule {
	@Override
	protected void configureServlets() {
		serve("/servlets/ORSInterface*").with(OXIServlet.class);
	}
}
