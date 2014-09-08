package com.cloudkey.pms.common.room;

import com.keypr.bridge.ids.BridgeIds.RepairStatus;
import com.keypr.bridge.ids.BridgeIds.RoomStatus;
import org.joda.time.DateTime;

import javax.annotation.Nullable;

/**
 * Details about a room repair
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RoomRepair {
    private RoomStatus returnStatus;

    private RepairStatus repairStatus;

    @Nullable
    private DateTime start;

    @Nullable
    private DateTime end;

    @Nullable
    private String repairReason;

    @Nullable
    private String repairType;

    @Nullable
    private String repairRemarks;

	protected RoomRepair() { /* For serialization */ }

	public RoomRepair(RoomStatus returnStatus, RepairStatus repairStatus, @Nullable DateTime start, @Nullable DateTime end, @Nullable String repairReason, @Nullable String repairType, @Nullable String repairRemarks) {
		this.returnStatus = returnStatus;
		this.repairStatus = repairStatus;
		this.start = start;
		this.end = end;
		this.repairReason = repairReason;
		this.repairType = repairType;
		this.repairRemarks = repairRemarks;
	}

	public RoomStatus getReturnStatus() {
		return returnStatus;
	}

	public RepairStatus getRepairStatus() {
		return repairStatus;
	}

	@Nullable
	public DateTime getStart() {
		return start;
	}

	@Nullable
	public DateTime getEnd() {
		return end;
	}

	@Nullable
	public String getRepairReason() {
		return repairReason;
	}

	@Nullable
	public String getRepairType() {
		return repairType;
	}

	@Nullable
	public String getRepairRemarks() {
		return repairRemarks;
	}

	@Override
	public String toString() {
		return "RoomRepair{" +
			"returnStatus=" + returnStatus +
			", repairStatus=" + repairStatus +
			", start=" + start +
			", end=" + end +
			", repairReason='" + repairReason + '\'' +
			", repairType='" + repairType + '\'' +
			", repairRemarks='" + repairRemarks + '\'' +
			'}';
	}
}
