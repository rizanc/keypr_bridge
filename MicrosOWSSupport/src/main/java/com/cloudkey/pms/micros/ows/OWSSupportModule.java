package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.ows.guestservices.GuestServicesService;
import com.cloudkey.pms.micros.ows.guestservices.GuestServicesServiceSoap;
import com.cloudkey.pms.micros.services.*;
import com.cloudkey.util.GuiceUtils;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Currency;

/**
 * Guice module which provides the properties in ows.properties to {@link com.google.inject.name.Named} injections
 * and enables injection of the CXF clients in {@link com.cloudkey.pms.micros.services}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class OWSSupportModule extends AbstractModule {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure() {
		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream("ows.properties"));
	}

	private <T> T configureService(T soap, URL url, Integer loggingLimit) {
		// Add in/out interceptors to the client to log the SOAP requests and responses
		Client client = ClientProxy.getClient(soap);
		client.getInInterceptors().add(new LoggingInInterceptor(loggingLimit));
		client.getOutInterceptors().add(new LoggingOutInterceptor(loggingLimit));

		// The WSDL may not point to the correct service port.
		// demoserver3's wsdls, for example, pointed at port 4301 instead of 4300, which was false.
		BindingProvider bindingProvider = (BindingProvider) soap;
		bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url.toString());

		return soap;
	}

	@Provides
	@Singleton
	public Currency provideDefaultCurrency(
		@Named("keypr.bridge.micros.currencyCode") String currencyCode
	) {
		Currency instance = Currency.getInstance(currencyCode);

		if (instance == null) {
			System.out.println(currencyCode);
			throw new IllegalArgumentException("currencyCode is not valid: " + currencyCode);
		}

		return instance;
	}

	@Provides
	@Singleton
	public AvailabilityServiceSoap provideAvailabilityService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.availability.path") String servicePath,
	    @Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new AvailabilityService().getAvailabilityServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public InformationSoap provideInformationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.information.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new Information().getInformationSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public GuestServicesServiceSoap provideGuestServicesService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.guestservices.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new GuestServicesService().getGuestServicesServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public MeetingRoomServiceSoap provideMeetingroomService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.meetingroom.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new MeetingRoomService().getMeetingRoomServiceSoap12(), 
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public MembershipServiceSoap provideMembershipService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.membership.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new MembershipService().getMembershipServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public NameServiceSoap provideNameService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.name.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new NameService().getNameServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public ReservationServiceSoap provideReservationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.reservation.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new ReservationService().getReservationServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public ResvAdvancedServiceSoap provideResvAdvancedService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.resvadvanced.path") String servicePath,
		@Named("keypr.bridge.micros.ows.logging.limit") Integer loggingLimit
	) {
		try {
			return configureService(
				new ResvAdvancedService().getResvAdvancedServiceSoap12(),
				new URL(new URL(targetEndpoint), servicePath),
				loggingLimit
			);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
