package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.services.*;
import com.cloudkey.util.GuiceUtils;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Guice module which provides the properties in ows.properties to {@link com.google.inject.name.Named} injections
 * and enables injection of the services in {@link com.cloudkey.pms.micros.services}.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class OWSSupportModule extends AbstractModule {

	protected final Logger log = LoggerFactory.getLogger(getClass());

	@Override
	protected void configure() {
		GuiceUtils.bindProperties(binder(), getClass().getResourceAsStream("ows.properties"));
	}

	@Provides
	@Singleton
	public AvailabilityServiceSoap provideAvailabilityService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.availability.path") String servicePath
	) {
		try {
			return new AvailabilityService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getAvailabilityServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public InformationSoap provideInformationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.information.path") String servicePath
	) {
		try {
			return new Information(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getInformationSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public MeetingRoomServiceSoap provideMeetingroomService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.meetingroom.path") String servicePath
	) {
		try {
			return new MeetingRoomService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getMeetingRoomServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public MembershipServiceSoap provideMembershipService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.membership.path") String servicePath
	) {
		try {
			return new MembershipService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getMembershipServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public NameServiceSoap provideNameService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.name.path") String servicePath
	) {
		try {
			return new NameService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getNameServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public ReservationServiceSoap provideReservationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.reservation.path") String servicePath
	) {
		try {
			return new ReservationService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getReservationServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Provides
	@Singleton
	public ResvAdvancedServiceSoap provideResvAdvancedService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.resvadvanced.path") String servicePath
	) {
		try {
			return new ResvAdvancedService(new URL(targetEndpoint + "/" + servicePath + "?wsdl")).getResvAdvancedServiceSoap12();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
