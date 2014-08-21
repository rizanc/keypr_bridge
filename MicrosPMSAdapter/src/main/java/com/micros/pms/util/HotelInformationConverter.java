package com.micros.pms.util;

import com.cloudkey.pms.common.HotelAmenity;
import com.cloudkey.pms.common.contact.StreetAddress;
import com.cloudkey.pms.micros.og.common.Address;
import com.cloudkey.pms.micros.og.hotelcommon.Amenity;
import com.cloudkey.pms.micros.og.hotelcommon.HotelInfo;
import com.cloudkey.pms.micros.og.hotelcommon.HotelInfoType;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.keypr.pms.micros.oxi.ids.MicrosIds;
import org.joda.time.LocalTime;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class HotelInformationConverter {
	public static class HotelInfoByType implements Predicate<HotelInfo> {

		private HotelInfoType infoType;

		public HotelInfoByType(HotelInfoType infoType) {
			this.infoType = infoType;
		}

		@Override
		public boolean apply(@Nullable HotelInfo hotelInfo) {
			return hotelInfo != null && hotelInfo.getHotelInfoType() != null && hotelInfo.getHotelInfoType().equals(infoType);
		}
	}

	public static class HotelInfoByOtherType extends HotelInfoByType {

		private String otherType;

		public HotelInfoByOtherType(String otherType) {
			super(HotelInfoType.OTHER);
			this.otherType = otherType;
		}

		public HotelInfoByOtherType(MicrosIds.OWS.OtherHotelInfoType otherType) {
			this(otherType.getTypeValue());
		}

		@Override
		public boolean apply(@Nullable HotelInfo hotelInfo) {
			return super.apply(hotelInfo)
				&& hotelInfo.getOtherHotelInfoType() != null
				&& hotelInfo.getOtherHotelInfoType().equals(otherType);
		}
	}

//	public static final Function<HotelInfo, String> toText = new Function<HotelInfo, String>() {
//		@Nullable
//		@Override
//		public String apply(@Nullable HotelInfo hotelInfo) {
//			return (hotelInfo != null ? hotelInfo.getText().get(0).toString() : null);
//		}
//	};

//	public static final Function<HotelInfo, String> toUrl = new Function<HotelInfo, String>() {
//		@Nullable
//		@Override
//		public String apply(@Nullable HotelInfo hotelInfo) {
//			return (hotelInfo != null ? hotelInfo.getUrl() : null);
//		}
//	};

//	public static final Function<HotelInfo, String> toUrl = new Function<HotelInfo, String>() {
//		@Nullable
//		@Override
//		public String apply(@Nullable HotelInfo hotelInfo) {
//			return (hotelInfo != null ? hotelInfo.getUrl() : null);
//		}
//	};

	public static Function<String, LocalTime> toLocalTime = new Function<String, LocalTime>() {
		@Nullable
		@Override
		public LocalTime apply(@Nullable String s) {
			return LocalTime.parse(s);
		}
	};

	/**
	 * Converts OWS {@link Amenity} into PMS-agnostic {@link HotelAmenity}.
	 * @param from
	 * @return
	 */
	public static List<HotelAmenity> convertAmenities(List<Amenity> from) {
		List<HotelAmenity> amenities = new ArrayList<>();
		for (Amenity amenity : from) {
			String description = null;

			if (!amenity.getAmenityDescriptions().isEmpty()) {
				description = amenity.getAmenityDescriptions().get(0);
			}

			amenities.add(new HotelAmenity(
				amenity.getAmenityCode(),
				amenity.getAmenityType().value(),
				description
			));
		}

		return amenities;
	}

	public static final Function<Address, StreetAddress> convertAddress = new Function<Address, StreetAddress>() {
		@Nullable
		@Override
		public StreetAddress apply(@Nullable Address address) {
			return convertAddress(address);
		}
	};

	/**
	 * Converts an OWS {@link Address} into a PMS-agnostic {@link StreetAddress}.
	 *
	 * @param address
	 * @return
	 */
	public static StreetAddress convertAddress(Address address) {
		return address == null ? null : new StreetAddress(
			address.getAddressLines() == null ? Collections.<String>emptyList() : ImmutableList.copyOf(address.getAddressLines()),
			address.getCityName(),
			address.getStateProv(),
			address.getCountryCode(),
			address.getPostalCode(),
			address.getBarCode(),
			address.getCityExtension(),
			address.getAddressType(),
			address.getOtherAddressType(),
			address.getLanguageCode()
		);
	}

	/**
	 * Retrieves the main text of a {@link HotelInfo}.
	 *
	 * @param infos
	 * @param predicate
	 * @return
	 */
	public static Optional<String> getInfoTextIfPresent(Collection<HotelInfo> infos, Predicate<HotelInfo> predicate) {
		// Scala's flatmap would be cleaner here
		if (infos == null) {
			return Optional.absent();
		}

		Optional<Optional<String>> transform = Iterables.tryFind(infos, predicate).transform(new Function<HotelInfo, Optional<String>>() {
			@Nullable
			@Override
			public Optional<String> apply(@Nullable HotelInfo hotelInfo) {
				if (hotelInfo.getUrl() != null) {
					return Optional.of(hotelInfo.getUrl());
				} else {
					return ParagraphHelper.getFirstString(hotelInfo.getText());
				}
			}
		});

		// Unwrap the additional Optional level.
		return transform.isPresent() ? transform.get() : Optional.<String>absent();
	}
}
