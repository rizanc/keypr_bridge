package com.micros.pms.processors.rooms;

import com.cloudkey.pms.common.room.RoomAmenity;
import com.cloudkey.pms.common.payment.MonetaryAmount;
import com.cloudkey.pms.common.room.AvailableRoomType;
import com.cloudkey.pms.micros.og.availability.*;
import com.cloudkey.pms.micros.og.common.ResultStatus;
import com.cloudkey.pms.micros.og.core.OGHeader;
import com.cloudkey.pms.micros.og.hotelcommon.*;
import com.cloudkey.pms.micros.ows.ConverterUtils;
import com.cloudkey.pms.micros.ows.IdUtils;
import com.cloudkey.pms.micros.ows.availability.AvailabilityRequest;
import com.cloudkey.pms.micros.ows.availability.AvailabilityResponse;
import com.cloudkey.pms.micros.services.AvailabilityServiceSoap;
import com.cloudkey.pms.response.rooms.DayCharges;
import com.cloudkey.pms.response.rooms.RoomStayCharges;
import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.micros.pms.processors.OWSProcessor;
import com.micros.pms.util.ParagraphHelper;
import org.joda.time.LocalDate;

import javax.annotation.Nullable;
import javax.xml.ws.Holder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author Charlie La Mothe (charlie@keypr.com)
*/
public class AvailabilityProcessor extends OWSProcessor<
	com.cloudkey.pms.request.rooms.AvailabilityRequest,
	com.cloudkey.pms.response.rooms.AvailabilityResponse,
	AvailabilityRequest,
	AvailabilityResponse> {

	@Inject
	protected AvailabilityServiceSoap service;

	@Inject
	protected ConverterUtils converterUtils;

	@Override
	protected ResultStatus getResultStatus(AvailabilityResponse availabilityResponse) {
		return availabilityResponse.getResult();
	}

	@Override
	protected AvailabilityResponse callService(AvailabilityRequest availabilityRequest, Holder<OGHeader> header) {
		return service.availability(availabilityRequest, header);
	}

	@Override
	protected AvailabilityRequest toMicrosRequest(com.cloudkey.pms.request.rooms.AvailabilityRequest request) {
		FluentIterable<ChildAge> childAges = FluentIterable.from(request.getChildrenAges()).transform(new Function<Integer, ChildAge>() {
			@Nullable
			@Override
			public ChildAge apply(@Nullable Integer integer) {
				return new ChildAge(integer, true);
			}
		});

		AvailRequestSegment availRequestSegment = new AvailRequestSegment();

		AvailabilityRequest microsRequest = new AvailabilityRequest()
			.withAvailRequestSegments(availRequestSegment
					.withStayDateRange(new TimeSpan()
							.withStartDate(request.getStartDate().toDateTimeAtStartOfDay())
							.withEndDate(request.getEndDate().toDateTimeAtStartOfDay())
					)
					.withHotelSearchCriteria(new HotelSearchCriterion(getDefaultHotelReference()))
					.withTotalNumberOfGuests(request.getNumAdults())
					.withChildAges(childAges.toList())
					.withNumberOfChildren(childAges.size())
			);

		// If a rate code and room type code are specified, we are making a detailed request
		if (request.getRateCode() != null && request.getRoomTypeCode() != null) {
			microsRequest.setSummaryOnly(false);
			availRequestSegment.withRatePlanCandidates(new RatePlanCandidate().withRatePlanCode(request.getRateCode()));
			availRequestSegment.withRoomStayCandidates(new RoomStayCandidate().withRoomTypeCode(request.getRoomTypeCode()));
		} else {
			microsRequest.setSummaryOnly(true);
		}

		return microsRequest;
	}

	@Override
	protected com.cloudkey.pms.response.rooms.AvailabilityResponse toPmsResponse(AvailabilityResponse microsResponse, com.cloudkey.pms.request.rooms.AvailabilityRequest request) {
		com.cloudkey.pms.response.rooms.AvailabilityResponse.AvailabilityResponseBuilder builder = com.cloudkey.pms.response.rooms.AvailabilityResponse.builder();

		if (!microsResponse.getAvailResponseSegments().isEmpty() && !microsResponse.getAvailResponseSegments().get(0).getRoomStayList().isEmpty()) {
			// Real-world responses and example responses only ever contain up to one room stay.
			RoomStay roomStay = microsResponse.getAvailResponseSegments().get(0).getRoomStayList().get(0);

			builder
				.expectedCharges(convertExpectedCharges(roomStay.getExpectedCharges()))
				.roomTypes(Lists.transform(roomStay.getRoomTypes(), convertRoomType))
				.ratePlans(Lists.transform(roomStay.getRatePlans(), new Function<RatePlan, com.cloudkey.pms.common.reservation.RatePlan>() {
					@Nullable
					@Override
					public com.cloudkey.pms.common.reservation.RatePlan apply(@Nullable RatePlan input) {
						return converterUtils.convertRatePlan(input);
					}
				}))
				.roomRates(converterUtils.convertRoomRates(roomStay.getRoomRates()));
		}

		return builder.build();
	}

	private RoomStayCharges convertExpectedCharges(DailyChargeList expectedCharges) {
		if (expectedCharges == null) {
			return null;
		}

		Map<LocalDate, DayCharges> dayCharges = new HashMap<>();

		for (ChargesForTheDay chargesForTheDay : expectedCharges.getChargesForPostingDates()) {
			DayCharges.DayChargesBuilder builder = DayCharges.builder();

			ChargeList roomRateAndPackages = chargesForTheDay.getRoomRateAndPackages();

			if (roomRateAndPackages != null) {
				Short roomRateDecimals = roomRateAndPackages.getDecimals() == null ? 2 : roomRateAndPackages.getDecimals();

				builder.roomAndPackageTotal(
					new MonetaryAmount(roomRateAndPackages.getTotalCharges(), roomRateDecimals, defaultCurrency)
				);

				builder.roomAndPackageCharges(Lists.transform(roomRateAndPackages.getCharges(), toCharge));
			}

			ChargeList taxesAndFees = chargesForTheDay.getTaxesAndFees();
			if (taxesAndFees != null) {
				Short roomRateDecimals = taxesAndFees.getDecimals() == null ? 2 : taxesAndFees.getDecimals();

				builder.taxAndFeeTotal(
					new MonetaryAmount(taxesAndFees.getTotalCharges(), roomRateDecimals, defaultCurrency)
				);

				builder.taxAndFeeCharges(Lists.transform(roomRateAndPackages.getCharges(), toCharge));
			}

			dayCharges.put(chargesForTheDay.getPostingDate(), builder.build());
		}

		Short decimals = expectedCharges.getDecimals() == null ? 2 : expectedCharges.getDecimals();

		return new RoomStayCharges(
			new MonetaryAmount(expectedCharges.getTotalRoomRateAndPackages(), decimals, defaultCurrency),
			new MonetaryAmount(expectedCharges.getTotalTaxesAndFees(), decimals, defaultCurrency),
			expectedCharges.isTaxInclusive(),
			dayCharges
		);
	}

	/**
	 * Guava function which converts an OWS charge into a Keypr charge
	 */
	private final Function<Charge, com.cloudkey.pms.response.rooms.Charge> toCharge = new Function<Charge, com.cloudkey.pms.response.rooms.Charge>() {
		@Nullable
		@Override
		public com.cloudkey.pms.response.rooms.Charge apply(Charge input) {
			return new com.cloudkey.pms.response.rooms.Charge (
				input.getDescription(),
				input.getAmount() == null ? null : converterUtils.convertAmount(input.getAmount()),
				input.getCodeType(),
				input.getCode()
			);
		}
	};

	private final static Function<RoomType, AvailableRoomType> convertRoomType = new Function<RoomType, AvailableRoomType>() {
		@Nullable
		@Override
		public AvailableRoomType apply(RoomType input) {
			List<RoomAmenity> roomAmenities = input.getAmenityInfo() == null
				? Collections.<RoomAmenity>emptyList()
				: Lists.transform(input.getAmenityInfo().getAmenities(), new Function<Amenity, RoomAmenity>() {
						@Nullable
						@Override
						public RoomAmenity apply(Amenity input) {
							return new RoomAmenity(
								input.getAmenityCode(),
								Iterables.getFirst(input.getAmenityDescriptions(), null),
								IdUtils.fromMicrosEnum(input.getAvailabilityFlag())
							);
						}
					}
				);

			return new AvailableRoomType(
				input.getRoomTypeCode(),
				input.getRoomTypeName(),
				ParagraphHelper.getFirstString(input.getRoomTypeDescription()).orNull(),
				input.getRoomClass(),
				input.getNumberOfUnits(),
				roomAmenities
			);
		}
	};

}
