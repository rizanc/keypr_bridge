package com.micros.harvester.http;

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
public class OXIListenerServer {

	@Inject
	public OXIListenerServer(@Named("keypr.bridge.micros.harvester.oxi.listener.port") Integer port) throws Exception {
		Server server = new Server(port);

		// Setup servlet handler configuration via Guice
		ServletContextHandler handler = new ServletContextHandler(server, "/", ServletContextHandler.SESSIONS);
		handler.addFilter(GuiceFilter.class, "/*", allOf(DispatcherType.class));
		handler.addServlet(DefaultServlet.class, "/");

		server.start();
		server.join();
	}
}
