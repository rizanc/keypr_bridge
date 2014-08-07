package com.micros.pms.processor;

import com.cloudkey.pms.micros.services.MeetingRoomService;
import com.cloudkey.pms.micros.services.MeetingRoomServiceStub;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.micros.pms.OWSBase;
import org.apache.axis2.AxisFault;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSMeetingRoomProcessor extends OWSBase {
	protected MeetingRoomService service;

	@Inject
	public OWSMeetingRoomProcessor(
		@Named("com.micros.ows.url") String targetEndpoint,
		@Named("com.micros.ows.meetingroom.path") String servicePath
	) {
		try {
			this.service = new MeetingRoomServiceStub(targetEndpoint + "/" + servicePath);
		} catch (AxisFault axisFault) {
			log.error("Could not instantiate service", MeetingRoomService.class, axisFault);
		}
	}
}
