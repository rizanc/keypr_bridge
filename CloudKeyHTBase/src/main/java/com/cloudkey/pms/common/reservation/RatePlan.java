package com.cloudkey.pms.common.reservation;

import lombok.Value;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Metadata describing a special room rate.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
@Value
public class RatePlan {
    /**
     * The unique code identifying the rate plan
     *
     * Sometimes, there is no rate plan identifier.
     */
    @Nullable
    String code;

	/**
	 * The name of the rate plan
	 */
	@Nullable
	String name;

	/**
	 * A short verbose human-readable description
	 */
	@Nullable
	String shortDescription;

	/**
	 * A verbose human-readable description
	 */
	@Nullable
	String description;

	@Nullable
    DepositRequirement depositRequirement;

    @Nullable
    Discount discount;

	@Nullable
    String rateRules;

    @Nullable
    String marketingInformation;

    @Nullable
    String depositPolicy;

    @Nullable
    String promotion;

    @Nullable
    String commissionPolicy;

    @Nullable
    String guaranteePolicy;

    @Nullable
    String miscellaneous;

    @Nullable
    String packageOptions;

    @Nullable
    String penaltyPolicy;

    @Nullable
    String taSpecialRequest;

    @Nullable
    String taxInformation;

    @Nullable
    String cancelPolicy;

    @Nullable
    String pointsPolicy;

    List<String> otherNotes;

}
