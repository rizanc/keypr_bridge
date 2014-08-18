package com.micros.pms.util;

import com.cloudkey.pms.micros.og.common.UniqueID;
import com.cloudkey.pms.micros.og.common.UniqueIDType;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.keypr.pms.micros.oxi.ids.MicrosIds;

import javax.annotation.Nullable;
import java.util.Collection;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
public class IdUtils {
	public static com.google.common.base.Optional<String> findPmsReservationId(Collection<UniqueID> uniqueIDs) {
		return Iterables.tryFind(uniqueIDs, new Predicate<UniqueID>() {
			@Override
			public boolean apply(@Nullable UniqueID uniqueID) {
				return Objects.equal(uniqueID.getType(), UniqueIDType.INTERNAL)
					&& Objects.equal(uniqueID.getSource(), MicrosIds.OWS.RESERVATION_ID_SOURCE);
			}
		}).transform(new Function<UniqueID, String>() {
			@Nullable
			@Override
			public String apply(@Nullable UniqueID uniqueID) {
				return uniqueID.getValue();
			}
		});
	}
}
