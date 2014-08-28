package com.cloudkey.pms.common.reservation;

import com.google.common.collect.ImmutableList;
import com.keypr.bridge.ids.RatePlanCode;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Metadata describing a special room rate.
 *
 * @author Charlie La Mothe (charlie@concentricsky.com)
 */
public class RatePlan {
    /**
     * The unique code identifying the rate plan
     *
     * Sometimes, there is no rate plan identifier.
     */
    @Nullable
    private RatePlanCode code;

    @Nullable
    private DepositRequirement depositRequirement;

    @Nullable
    private RatePlanDiscount discount;

    /**
     * The name of the rate plan
     */
    @Nullable
    private String name;

    /**
     * A short verbose human-readable description
     */
    @Nullable
    private String shortDescription;

    /**
     * A verbose human-readable description
     */
    private String description;

    @Nullable
    private String rateRules;

    @Nullable
    private String marketingInformation;

    @Nullable
    private String depositPolicy;

    @Nullable
    private String promotion;

    @Nullable
    private String commissionPolicy;

    @Nullable
    private String guaranteePolicy;

    @Nullable
    private String miscellaneous;

    @Nullable
    private String packageOptions;

    @Nullable
    private String penaltyPolicy;

    @Nullable
    private String taSpecialRequest;

    @Nullable
    private String taxInformation;

    @Nullable
    private String cancelPolicy;

    @Nullable
    private String pointsPolicy;

    private List<String> otherNotes;

    public RatePlan(RatePlanCode code, DepositRequirement depositRequirement, RatePlanDiscount discount, String name, String shortDescription, String description, String rateRules, String marketingInformation, String depositPolicy, String promotion, String commissionPolicy, String guaranteePolicy, String miscellaneous, String packageOptions, String penaltyPolicy, String taSpecialRequest, String taxInformation, String cancelPolicy, String pointsPolicy, List<String> otherNotes) {
        this.code = code;
        this.depositRequirement = depositRequirement;
        this.discount = discount;
        this.name = name;
        this.shortDescription = shortDescription;
        this.description = description;
        this.rateRules = rateRules;
        this.marketingInformation = marketingInformation;
        this.depositPolicy = depositPolicy;
        this.promotion = promotion;
        this.commissionPolicy = commissionPolicy;
        this.guaranteePolicy = guaranteePolicy;
        this.miscellaneous = miscellaneous;
        this.packageOptions = packageOptions;
        this.penaltyPolicy = penaltyPolicy;
        this.taSpecialRequest = taSpecialRequest;
        this.taxInformation = taxInformation;
        this.cancelPolicy = cancelPolicy;
        this.pointsPolicy = pointsPolicy;
        this.otherNotes = ImmutableList.copyOf(otherNotes);
    }

    @Nullable
    public RatePlanCode getCode() {
        return code;
    }

    @Nullable
    public DepositRequirement getDepositRequirement() {
        return depositRequirement;
    }

    @Nullable
    public RatePlanDiscount getDiscount() {
        return discount;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nullable
    public String getShortDescription() {
        return shortDescription;
    }

    public String getDescription() {
        return description;
    }

    @Nullable
    public String getRateRules() {
        return rateRules;
    }

    @Nullable
    public String getMarketingInformation() {
        return marketingInformation;
    }

    @Nullable
    public String getDepositPolicy() {
        return depositPolicy;
    }

    @Nullable
    public String getPromotion() {
        return promotion;
    }

    @Nullable
    public String getCommissionPolicy() {
        return commissionPolicy;
    }

    @Nullable
    public String getGuaranteePolicy() {
        return guaranteePolicy;
    }

    @Nullable
    public String getMiscellaneous() {
        return miscellaneous;
    }

    @Nullable
    public String getPackageOptions() {
        return packageOptions;
    }

    @Nullable
    public String getPenaltyPolicy() {
        return penaltyPolicy;
    }

    @Nullable
    public String getTaSpecialRequest() {
        return taSpecialRequest;
    }

    @Nullable
    public String getTaxInformation() {
        return taxInformation;
    }

    @Nullable
    public String getCancelPolicy() {
        return cancelPolicy;
    }

    @Nullable
    public String getPointsPolicy() {
        return pointsPolicy;
    }

    public List<String> getOtherNotes() {
        return otherNotes;
    }

    @Override
    public String toString() {
        return "RatePlan{" +
                "code=" + code +
                ", depositRequirement=" + depositRequirement +
                ", discount=" + discount +
                ", name='" + name + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", description='" + description + '\'' +
                ", rateRules='" + rateRules + '\'' +
                ", marketingInformation='" + marketingInformation + '\'' +
                ", depositPolicy='" + depositPolicy + '\'' +
                ", promotion='" + promotion + '\'' +
                ", commissionPolicy='" + commissionPolicy + '\'' +
                ", guaranteePolicy='" + guaranteePolicy + '\'' +
                ", miscellaneous='" + miscellaneous + '\'' +
                ", packageOptions='" + packageOptions + '\'' +
                ", penaltyPolicy='" + penaltyPolicy + '\'' +
                ", taSpecialRequest='" + taSpecialRequest + '\'' +
                ", taxInformation='" + taxInformation + '\'' +
                ", cancelPolicy='" + cancelPolicy + '\'' +
                ", pointsPolicy='" + pointsPolicy + '\'' +
                ", otherNotes=" + otherNotes +
                '}';
    }
}
