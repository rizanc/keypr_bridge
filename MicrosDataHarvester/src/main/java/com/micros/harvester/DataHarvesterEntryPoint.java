package com.micros.harvester;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.inject.servlet.GuiceFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import javax.servlet.DispatcherType;

import static java.util.EnumSet.allOf;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class DataHarvesterEntryPoint {

	@Inject
	public DataHarvesterEntryPoint(@Named("keypr.bridge.micros.harvester.oxi.listener.port") Integer port) throws Exception {
		Server server = new Server(port);

		// Setup servlet handler configuration via Guice (DataHarvesterServletModule)
		ServletContextHandler handler = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
		handler.addFilter(GuiceFilter.class, "/*", allOf(DispatcherType.class));
		handler.addServlet(DefaultServlet.class, "/");

		server.start();
		server.join();
	}
}
