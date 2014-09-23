package com.cloudkey.pms.response.reservations;

import com.cloudkey.pms.response.PMSResponse;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * This class is used to sote the response status and assign room number .
 *
 * @author niveditat
 *
 */
@EqualsAndHashCode(callSuper = false)
@Value
public class AssignRoomResponse extends PMSResponse {

    String assignRoomNumber;

}
