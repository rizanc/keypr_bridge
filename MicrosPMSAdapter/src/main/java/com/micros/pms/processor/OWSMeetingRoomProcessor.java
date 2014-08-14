package com.micros.pms.processor;

import com.cloudkey.commons.MeetingRoom;
import com.cloudkey.pms.micros.services.MeetingRoomServiceSoap;
import com.google.inject.Inject;
import com.micros.pms.OWSBase;

/**
 * Created by crizan2 on 16/07/2014.
 */

public class OWSMeetingRoomProcessor extends OWSBase {
	@Inject
	protected MeetingRoomServiceSoap service;
}
