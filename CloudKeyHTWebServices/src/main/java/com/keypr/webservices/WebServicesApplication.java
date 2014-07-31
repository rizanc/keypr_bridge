package com.keypr.webservices;

import com.hubspot.dropwizard.guice.GuiceBundle;
import com.sun.jersey.api.container.filter.LoggingFilter;
import com.sun.jersey.api.core.ResourceConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerDropwizard;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import java.util.EnumSet;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class WebServicesApplication extends Application<WebServicesConfiguration> {

    private final SwaggerDropwizard swaggerDropwizard = new SwaggerDropwizard();

    public static void main(String[] args) throws Exception {
        new WebServicesApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<WebServicesConfiguration> bootstrap) {
        // Guice
        GuiceBundle<WebServicesConfiguration> guiceBundle = GuiceBundle.<WebServicesConfiguration>newBuilder()
                .addModule(new WebServicesModule())
                .setConfigClass(WebServicesConfiguration.class)

                // Auto-discover @Api annotated classes in this package
                .enableAutoConfig(getClass().getPackage().getName())
                .build();

        bootstrap.addBundle(guiceBundle);

        // Swagger UI
        swaggerDropwizard.onInitialize(bootstrap);
    }

    @Override
    public void run(WebServicesConfiguration config, Environment environment) throws Exception {

	    FilterRegistration.Dynamic filter = environment.servlets().addFilter("CORS", CrossOriginFilter.class);
	    filter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");
	    filter.setInitParameter("allowedOrigins", "*");
	    filter.setInitParameter("allowedHeaders", "Content-Type,Authorization,X-Requested-With,Content-Length,Accept,Origin");
	    filter.setInitParameter("allowedMethods", "GET,PUT,POST,DELETE,OPTIONS");
	    filter.setInitParameter("preflightMaxAge", "5184000"); // 2 months
	    filter.setInitParameter("allowCredentials", "true");

	    // Make request and response objects available to logger
        environment.jersey().property(ResourceConfig.PROPERTY_CONTAINER_REQUEST_FILTERS, LoggingFilter.class.getName());
        environment.jersey().property(ResourceConfig.PROPERTY_CONTAINER_RESPONSE_FILTERS, LoggingFilter.class.getName());

        swaggerDropwizard.onRun(config, environment);
    }
}
