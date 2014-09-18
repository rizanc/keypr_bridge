package com.micros.pms.processors.rooms;

import com.cloudkey.message.parser.PMSInterface;
import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.room.RoomFeature;
import com.cloudkey.pms.common.room.RoomSetupInfo;
import com.cloudkey.pms.common.room.RoomSetupInfoBuilder;
import com.cloudkey.pms.common.room.RoomStatusInfo;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.RoomSetup;
import com.cloudkey.pms.micros.og.hotelcommon.RoomStatus;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomSetupResponse;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusRequest;
import com.cloudkey.pms.micros.og.reservation.advanced.FetchRoomStatusResponse;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.services.ResvAdvancedServiceSoap;
import com.cloudkey.pms.request.rooms.GetRoomSetupRequest;
import com.cloudkey.pms.request.rooms.GetRoomStatusRequest;
import com.cloudkey.pms.response.rooms.GetRoomSetupResponse;
import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.rawprocessors.RawFetchRoomStatusProcessor;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.Currency;
import java.util.List;
import java.util.Map;

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
				RoomSetupInfoBuilder res = new RoomSetupInfoBuilder()
					.setRoomNumber(roomSetup.getRoomNumber())
					.setShortDescription(ParagraphHelper.getFirstString(roomSetup.getRoomShortDescription()).orNull())
					.setDescription(ParagraphHelper.getFirstString(roomSetup.getRoomDescription()).orNull())
					.setIsSmokingAllowed(IdUtils.parseIsSmokingAllowedString(roomSetup.getSmokingPreference()))
					.setMaxOccupancy(roomSetup.getMaximumOccupancy())
					.setPhoneNumber(roomSetup.getPhoneNumber())
					.setRackRate(new MonetaryAmount(roomSetup.getRackRate(), defaultCurrency))
					.setRoomTypeCode(roomSetup.getRoomType())
					.setSuiteType(IdUtils.parseSuiteTypeString(roomSetup.getSuiteType()));

				// Some fields are populated from roomStatus
				RoomStatus roomStatusInfo = Strings.isNullOrEmpty(roomSetup.getRoomNumber())
					? null
					: roomStatuses.get(roomSetup.getRoomNumber());

				if (roomStatusInfo != null) {
					List<RoomFeature> roomFeatures = Lists.transform(roomStatusInfo.getFeatures(), new Function<com.cloudkey.pms.micros.og.hotelcommon.RoomFeature, RoomFeature>() {
							@Nullable
							@Override
							public RoomFeature apply(com.cloudkey.pms.micros.og.hotelcommon.RoomFeature roomFeature) {
								return new RoomFeature(roomFeature.getFeature(), roomFeature.getDescription());
							}
						});

						res
							.setFloor(roomStatusInfo.getFloor())
							.setRoomClassCode(roomStatusInfo.getRoomClass())
							.setRoomFeatures(roomFeatures);
				}

				return res.createRoomSetupInfo();
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

		// Start and end date are required for the results to include room features.
		// TODO: Modify this as per consult with Costin or Eric.
		microsRequest.setStartDate(new LocalDate(1000, 1, 1));
		microsRequest.setEndDate(new LocalDate(1000, 1, 2));

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
