package com.micros.pms.processor;

import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.*;
import com.cloudkey.pms.micros.og.hotelcommon.HotelReference;
import com.cloudkey.pms.micros.services.MeetingRoomServiceStub;
import com.micros.pms.constant.IMicrosConstants;
import com.micros.pms.logger.MicrosPMSLogger;
import com.micros.pms.util.AdapterUtility;
import com.micros.pms.util.ParserConfigurationReader;
import org.apache.axis2.AxisFault;

import java.util.UUID;

/**
 * Created by crizan2 on 16/07/2014.
 */
public class OWSMeetingRoomProcessor extends AbstractOWSProcessor {

    final static String URL_MEETING_ROOM = ParserConfigurationReader.getProperty(IMicrosConstants.OWS_URL_ROOT) + "/MeetingRoom.asmx";

    private MeetingRoomServiceStub getMeetingRoomServiceStub() {

        if (URL_MEETING_ROOM == null) throw new NullPointerException("getMeetingRoomServiceStub URL is null");

        MeetingRoomServiceStub rstub = null;
        try {
            rstub = new MeetingRoomServiceStub(URL_MEETING_ROOM);

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            MicrosPMSLogger.logError(OWSMeetingRoomProcessor.class, "getNameServiceStub ",
                    axisFault.getMessage());
        }
        return rstub;
    }

}
