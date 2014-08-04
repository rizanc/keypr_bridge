package com.micros.pms.processor;

import com.cloudkey.pms.micros.services.MeetingRoomServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSMeetingRoomProcessor extends AbstractOWSProcessor {

	final static Logger log = LoggerFactory.getLogger(OWSMeetingRoomProcessor.class);

	final static String URL_MEETING_ROOM = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/MeetingRoom.asmx";

    private MeetingRoomServiceStub getMeetingRoomServiceStub() {

        if (URL_MEETING_ROOM == null) throw new NullPointerException("getMeetingRoomServiceStub URL is null");

        MeetingRoomServiceStub rstub = null;
        try {
            rstub = new MeetingRoomServiceStub(URL_MEETING_ROOM);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            log.error("getNameServiceStub ", axisFault);
        }
        return rstub;
    }

}
