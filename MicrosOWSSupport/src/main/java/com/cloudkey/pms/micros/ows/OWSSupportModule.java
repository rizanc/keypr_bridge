package com.cloudkey.pms.micros.ows;

import com.cloudkey.pms.micros.services.*;
import com.cloudkey.util.GuiceUtils;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	public AvailabilityService provideAvailabilityService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.availability.path") String servicePath
	) {
		try {
			return new AvailabilityServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", AvailabilityService.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public Information provideInformationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.information.path") String servicePath
	) {
		try {
			return new InformationStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", Information.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public MeetingRoomService provideMeetingroomService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.meetingroom.path") String servicePath
	) {
		try {
			return new MeetingRoomServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", MeetingRoomService.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public MembershipService provideMembershipService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.membership.path") String servicePath
	) {
		try {
			return new MembershipServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", MembershipService.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public NameService provideNameService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.name.path") String servicePath
	) {
		try {
			return new NameServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", NameService.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public ReservationService provideReservationService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.reservation.path") String servicePath
	) {
		try {
			return new ReservationServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", ReservationService.class, axisFault);
			return null;
		}
	}

	@Provides
	@Singleton
	public ResvAdvancedService provideResvAdvancedService(
		@Named("keypr.bridge.micros.ows.url") String targetEndpoint,
		@Named("keypr.bridge.micros.ows.resvadvanced.path") String servicePath
	) {
		try {
			return new ResvAdvancedServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", ResvAdvancedService.class, axisFault);
			return null;
		}
	}
}
