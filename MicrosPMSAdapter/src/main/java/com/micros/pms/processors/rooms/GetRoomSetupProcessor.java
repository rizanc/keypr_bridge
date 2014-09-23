package com.micros.pms.processors.rooms;

import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.room.RoomFeature;
import com.cloudkey.pms.common.room.RoomSetupInfo;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.RoomSetup;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStatus;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupResponse;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.rooms.GetRoomSetupRequest;
import com.cloudkey.pms.response.rooms.GetRoomSetupResponse;
import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.*;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.rawprocessors.RawFetchRoomStatusProcessor;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.*;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@Singleton
public class GetRoomSetupProcessor extends OWSProcessor<
	GetRoomSetupRequest,
	GetRoomSetupResponse,
	FetchRoomSetupRequest,
	FetchRoomSetupResponse> {

	@Inject
	protected ResvAdvancedServiceSoap service;

	@Inject
	protected Currency defaultCurrency;

	@Inject
	protected RawFetchRoomStatusProcessor fetchRoomStatusProcessor;

	@Override
	protected ResultStatus getResultStatus(FetchRoomSetupResponse microsResponse) {
		return microsResponse.getResult();
	}

	@Override
	protected FetchRoomSetupResponse callService(FetchRoomSetupRequest microsRequest, Holder<OGHeader> header) {
		return service.fetchRoomSetup(microsRequest, header);
	}

	@Override
	protected FetchRoomSetupRequest toMicrosRequest(GetRoomSetupRequest request) {
		return new FetchRoomSetupRequest(
			getDefaultHotelReference(),
			request.getRoomTypeCode(),
			request.getRoomNumber()
		);
	}

	@Override
	protected GetRoomSetupResponse toPmsResponse(FetchRoomSetupResponse fetchRoomSetupResponse, GetRoomSetupRequest request) {
		final Map<String, RoomStatus> roomStatuses = getRoomStatuses(request);

		return new GetRoomSetupResponse(Lists.transform(fetchRoomSetupResponse.getRoomSetups(), new Function<RoomSetup, RoomSetupInfo>() {
			@Nullable
			@Override
			public RoomSetupInfo apply(RoomSetup roomSetup) {
				RoomSetupInfo.RoomSetupInfoBuilder res = RoomSetupInfo.builder()
					.roomNumber(roomSetup.getRoomNumber())
					.shortDescription(ParagraphHelper.getFirstString(roomSetup.getRoomShortDescription()).orNull())
					.description(ParagraphHelper.getFirstString(roomSetup.getRoomDescription()).orNull())
					.isSmokingAllowed(MicrosIds.OWS.SmokingPreference.parseString(roomSetup.getSmokingPreference()))
					.maxOccupancy(roomSetup.getMaximumOccupancy())
					.phoneNumber(roomSetup.getPhoneNumber())
					.rackRate(roomSetup.getRackRate() == null
							? null
							: new MonetaryAmount(roomSetup.getRackRate(), defaultCurrency)
					)
					.roomTypeCode(roomSetup.getRoomType())
					.suiteType(MicrosIds.OWS.SuiteType.parseString(roomSetup.getSuiteType()))
					.houseKeepingSectionCode(roomSetup.getHouseKeepingSectionCode())
					.rateCode(roomSetup.getRateCode());

				// Some fields are populated from roomStatus
				RoomStatus roomStatusInfo = Strings.isNullOrEmpty(roomSetup.getRoomNumber())
					? null
					: roomStatuses.get(roomSetup.getRoomNumber());

				// Psuedo rooms will not have a room status, but they do not have features, a class code, or floor,/
				// so there is no problem with this.
				if (roomStatusInfo != null) {
					List<RoomFeature> roomFeatures = Lists.transform(roomStatusInfo.getFeatures(), new Function<com.cloudkey.pms.micros.og.hotelcommon.RoomFeature, RoomFeature>() {
						@Nullable
						@Override
						public RoomFeature apply(com.cloudkey.pms.micros.og.hotelcommon.RoomFeature roomFeature) {
							return new RoomFeature(roomFeature.getFeature(), roomFeature.getDescription());
						}
					});

					res
						.floor(roomStatusInfo.getFloor())
						.roomClassCode(roomStatusInfo.getRoomClass())
						.roomFeatures(roomFeatures);
				} else {
					res.roomFeatures(Collections.<RoomFeature>emptyList());
				}

				return res.build();
			}
		}));
	}

	/**
	 * Calls {@link com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequest} and returns
	 * a map of room number to {@link com.cloudkey.pms.micros.og.hotelcommon.RoomStatus}.
	 *
	 * @param request
	 * @return
	 */
	private Map<String, RoomStatus> getRoomStatuses(GetRoomSetupRequest request) {
		FetchRoomStatusRequest microsRequest = new FetchRoomStatusRequest()
			.withHotelReference(getDefaultHotelReference());

		/*
		 NOTE: This is a hack for retrieving room features.
		 If no start and end date are provided in the request, room features are withheld from the response.
		 In the absence of a straight-forward method for retrieving room features, let's make this call with dates
		 very far in the future, a time when all hotel rooms are vacant and thus will be included in the results.

		 NOTE: Psuedo (non-physical, billing-purposes-only) rooms are not be included in this response when dates are provided.
		 This is OK though, as they do not contain a value for any of the fields this data is utilized for:
		 room features, floor and class code.
		*/
		microsRequest.setStartDate(new LocalDate(5010, 1, 1));
		microsRequest.setEndDate(new LocalDate(5010, 1, 2));

		if (request.isRoomNumberSpecified()) {
			microsRequest.setRoomNumber(request.getRoomNumber());
		}

		if (request.isRoomTypeCodeSpecified()) {
			microsRequest.setRoomType(request.getRoomTypeCode());
		}

		List<RoomStatus> roomStatusList = fetchRoomStatusProcessor.process(microsRequest).getRoomStatuses();

		final ImmutableMap<String, RoomStatus> roomStatusesByNumber = Maps.uniqueIndex(roomStatusList,
			new Function<RoomStatus, String>() {
				@Nullable
				@Override
				public String apply(RoomStatus roomStatusInfo) {
					return roomStatusInfo.getRoomNumber();
				}
			});

		return roomStatusesByNumber;
	}
}
