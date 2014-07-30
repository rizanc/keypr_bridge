package com.keypr.webservices;

import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerDropwizard;
import org.eclipse.jetty.servlets.CrossOriginFilter;

import javax.servlet.DispatcherType;
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
    public void run(WebServicesConfiguration configuration, Environment environment) throws Exception {
        environment.servlets().addFilter("CORS", CrossOriginFilter.class)
            .addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/*");

        swaggerDropwizard.onRun(configuration, environment);
    }
}
