package com.micros.pms;

import com.cloudkey.exceptions.PMSInterfaceException;
import com.cloudkey.PMSInterface;
import com.cloudkey.pms.common.hotel.LOVItem;
import com.cloudkey.pms.common.hotel.LOVValue;
import com.cloudkey.pms.request.hotels.HotelInformationRequest;
import com.cloudkey.pms.request.hotels.HotelItemCodesRequest;
import com.cloudkey.pms.request.hotels.LOVRequest;
import com.cloudkey.pms.request.memberships.GuestMembershipsRequest;
import com.cloudkey.pms.request.memberships.NameLookupRequest;
import com.cloudkey.pms.request.reservations.*;
import com.cloudkey.pms.request.rooms.*;
import com.cloudkey.pms.response.EmptyResponse;
import com.cloudkey.pms.response.hotels.HotelInformationResponse;
import com.cloudkey.pms.response.hotels.HotelItemCodesResponse;
import com.cloudkey.pms.response.hotels.LOVResponse;
import com.cloudkey.pms.response.memberships.GuestMembershipsResponse;
import com.cloudkey.pms.response.memberships.NameLookupResponse;
import com.cloudkey.pms.response.reservations.*;
import com.cloudkey.pms.response.rooms.*;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.inject.Inject;
import com.micros.pms.processors.hotels.HotelInformationProcessor;
import com.micros.pms.processors.hotels.LOVQueryProcessor;
import com.micros.pms.processors.memberships.GuestMembershipsProcessor;
import com.micros.pms.processors.memberships.NameLookupProcessor;
import com.micros.pms.processors.reservations.*;
import com.micros.pms.processors.reservations.AssignRoomProcessor;
import com.micros.pms.processors.rooms.AvailabilityProcessor;
import com.micros.pms.processors.rooms.FetchCalendarProcessor;
import com.micros.pms.processors.reservations.ReleaseRoomProcessor;
import com.micros.pms.processors.rooms.GetRoomSetupProcessor;
import com.micros.pms.processors.rooms.GetRoomStatusProcessor;
import com.micros.pms.processors.rooms.UpdateRoomStatusProcessor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author crizan2
 */
public class OperaOWSPMS extends OWSBase implements PMSInterface {

    @Inject
    LOVQueryProcessor lovQueryProcessor;

	// Reservations
	@Inject
	CreateReservationProcessor createReservationProcessor;

	@Inject
	ModifyReservationProcessor modifyReservationProcessor;

	@Inject
	CancelReservationProcessor cancelReservationProcessor;

	@Inject
	PostChargeProcessor postChargeProcessor;

	@Inject
	AddReservationNotesProcessor addReservationNotesProcessor;

	@Inject
	CheckInProcessor checkInProcessor;

	@Inject
	CheckOutProcessor checkOutProcessor;

	@Inject
	GetFolioProcessor getFolioProcessor;

	@Inject
	SearchReservationProcessor searchReservationProcessor;

	@Inject
	FindReservationProcessor findReservationProcessor;

	@Inject
	AssignRoomProcessor assignRoomProcessor;

	@Inject
	ReleaseRoomProcessor releaseRoomProcessor;

	// Rooms
	@Inject
	FetchCalendarProcessor fetchCalendarProcessor;

	@Inject
	AvailabilityProcessor availabilityProcessor;

	@Inject
	GetRoomStatusProcessor getRoomStatusProcessor;

	@Inject
	GetRoomSetupProcessor getRoomSetupProcessor;

	// Hotels
	@Inject
	HotelInformationProcessor hotelInformationProcessor;

	// Memberships
	@Inject
	NameLookupProcessor nameLookupProcessor;

	@Inject
	GuestMembershipsProcessor guestMembershipsProcessor;

	// Guest Services
	@Inject
	UpdateRoomStatusProcessor updateRoomStatusProcessor;

	@Override
    public GetFolioResponse retrieveFolioInfo(GetFolioRequest request) throws PMSInterfaceException {
        log.debug("retrieveFolioInfo: Enter method.");
		return getFolioProcessor.process(request);
    }

    @Override
    public ReleaseRoomResponse releaseRoom(ReleaseRoomRequest request) throws PMSInterfaceException {
        log.debug("releaseRoom: Enter method.");
	    return releaseRoomProcessor.process(request);
    }

    @Override
    public CheckInResponse checkIn(CheckInRequest request) throws PMSInterfaceException {
        log.debug("checkIn: Enter method.");
        return checkInProcessor.process(request);
    }

    @Override
    public AssignRoomResponse assignRoom(AssignRoomRequest request) throws PMSInterfaceException {
        log.debug("assignRoom: Enter method.");
	    return assignRoomProcessor.process(request);
    }

    @Override
    public CheckOutResponse checkOut(CheckOutRequest request) throws PMSInterfaceException {
        log.debug("checkOut: Enter method.");
        return checkOutProcessor.process(request);
    }

    @Override
    public AddReservationNotesResponse addReservationNotes(AddReservationNotesRequest request) throws PMSInterfaceException {
        log.debug("addReservationNotes: Enter method.");
        return addReservationNotesProcessor.process(request);
    }

	@Override
	public PostChargeResponse postCharge(PostChargeRequest request) throws PMSInterfaceException {
		log.debug("postCharge: Enter method.");
		return postChargeProcessor.process(request);
	}

    @Override
    public FetchCalendarResponse fetchCalendar(FetchCalendarRequest request) throws PMSInterfaceException {
	    log.debug("fetchCalendar: Enter method.");
	    return fetchCalendarProcessor.process(request);
    }

    @Override
    public SearchReservationResponse searchReservations(SearchReservationRequest request) throws PMSInterfaceException {
	    log.debug("searchReservations: Enter method.");
	    return searchReservationProcessor.process(request);
    }

    @Override
    public GuestMembershipsResponse getMembershipInformation(GuestMembershipsRequest request) throws PMSInterfaceException {
	    log.debug("getMembershipInformation: Enter method.");
	    return guestMembershipsProcessor.process(request);
    }

    @Override
    public NameLookupResponse getNameIdInformation(NameLookupRequest request) throws PMSInterfaceException {
        log.debug("getNameIdInformation: Enter method.");
	    return nameLookupProcessor.process(request);
    }

    @Override
    public HotelInformationResponse hotelInformationQuery(HotelInformationRequest request) throws PMSInterfaceException {
        log.debug("hotelInformationQuery: Enter method.");
		return hotelInformationProcessor.process(request);
    }

	@Override
	public EmptyResponse updateRoomStatus(UpdateRoomStatusRequest request) throws PMSInterfaceException {
		log.debug("updateRoomStatus: Enter method.");
		return updateRoomStatusProcessor.process(request);
	}

	@Override
	public AvailabilityResponse fetchAvailability(AvailabilityRequest request) {
		log.debug("fetchAvailability: Enter method.");
		return availabilityProcessor.process(request);
	}

	@Override
	public FindReservationResponse findReservation(FindReservationRequest request) {
		log.debug("findReservation: Enter method.");
		return findReservationProcessor.process(request);
	}

	@Override
	public CreateReservationResponse createReservation(CreateReservationRequest request) {
		log.debug("createReservation: Enter method.");
		return createReservationProcessor.process(request);
	}

	@Override
	public EmptyResponse modifyReservation(ModifyReservationRequest request) {
		log.debug("modifyReservation: Enter method.");
		return modifyReservationProcessor.process(request);
	}

	@Override
	public GetRoomStatusResponse getRoomStatus(GetRoomStatusRequest request) {
		log.debug("getRoomStatus: Enter method.");
		return getRoomStatusProcessor.process(request);
	}

	@Override
	public GetRoomSetupResponse getRoomSetup(GetRoomSetupRequest request) {
		log.debug("getRoomSetup: Enter method.");
		return getRoomSetupProcessor.process(request);
	}

	@Override
	public CancelReservationResponse cancelReservation(CancelReservationRequest request) {
		log.debug("cancelReservation: Enter method.");
		return cancelReservationProcessor.process(request);
	}

	@Override
	public HotelItemCodesResponse hotelItemCodes(HotelItemCodesRequest request) {
		LOVResponse trxCodesResponse = lovQueryProcessor.process(new LOVRequest("TRXCODES"));
		LOVResponse articleCodesResponse = lovQueryProcessor.process(new LOVRequest("ARTICLECODES"));

		Map<String, String> accountsByCode = new HashMap<>();

		for (LOVItem lovItem : trxCodesResponse.getLovItems()) {
			for (LOVValue lovValue : lovItem.getLovValues()) {
				accountsByCode.put(lovValue.getValue(), lovValue.getDescription());
			}
		}

		Map<String, String> itemsByCode = new HashMap<>();

		for (LOVItem lovItem : articleCodesResponse.getLovItems()) {
			Optional<LOVValue> first = FluentIterable.from(lovItem.getLovValues()).first();

			if (first.isPresent()) {
				itemsByCode.put(lovItem.getQualifierValue(), first.get().getDescription());
			}
		}

		return new HotelItemCodesResponse(itemsByCode, accountsByCode);
	}
}
