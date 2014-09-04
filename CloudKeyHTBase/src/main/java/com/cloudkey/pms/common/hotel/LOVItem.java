package com.cloudkey.pms.common.hotel;

import java.util.List;

/**
 * Created by crizan2 on 04/09/2014.
 */
public class LOVItem {
    private String qualifierType;
    private String qualifierValue;
    private String secondaryQualifierType;
    private String secondaryQualifierValue;
    private String tertiaryQualifierType;
    private String tertiaryQualifierValue;
    private String quaternaryQualifierType;
    private String quaternaryQualifierValue;
    private String quinaryQualifierType;
    private String quinaryQualifierValue;
    private List<LOVValue> lovValues;

    public String getQualifierType() {
        return qualifierType;
    }

    public void setQualifierType(String qualifierType) {
        this.qualifierType = qualifierType;
    }

    public String getQualifierValue() {
        return qualifierValue;
    }

    public void setQualifierValue(String qualifierValue) {
        this.qualifierValue = qualifierValue;
    }

    public String getSecondaryQualifierType() {
        return secondaryQualifierType;
    }

    public void setSecondaryQualifierType(String secondaryQualifierType) {
        this.secondaryQualifierType = secondaryQualifierType;
    }

    public String getSecondaryQualifierValue() {
        return secondaryQualifierValue;
    }

    public void setSecondaryQualifierValue(String secondaryQualifierValue) {
        this.secondaryQualifierValue = secondaryQualifierValue;
    }

    public String getTertiaryQualifierType() {
        return tertiaryQualifierType;
    }

    public void setTertiaryQualifierType(String tertiaryQualifierType) {
        this.tertiaryQualifierType = tertiaryQualifierType;
    }

    public String getTertiaryQualifierValue() {
        return tertiaryQualifierValue;
    }

    public void setTertiaryQualifierValue(String tertiaryQualifierValue) {
        this.tertiaryQualifierValue = tertiaryQualifierValue;
    }

    public String getQuaternaryQualifierType() {
        return quaternaryQualifierType;
    }

    public void setQuaternaryQualifierType(String quaternaryQualifierType) {
        this.quaternaryQualifierType = quaternaryQualifierType;
    }

    public String getQuaternaryQualifierValue() {
        return quaternaryQualifierValue;
    }

    public void setQuaternaryQualifierValue(String quaternaryQualifierValue) {
        this.quaternaryQualifierValue = quaternaryQualifierValue;
    }

    public String getQuinaryQualifierType() {
        return quinaryQualifierType;
    }

    public void setQuinaryQualifierType(String quinaryQualifierType) {
        this.quinaryQualifierType = quinaryQualifierType;
    }

    public String getQuinaryQualifierValue() {
        return quinaryQualifierValue;
    }

    public void setQuinaryQualifierValue(String quinaryQualifierValue) {
        this.quinaryQualifierValue = quinaryQualifierValue;
    }

    public List<LOVValue> getLovValues() {
        return lovValues;
    }

    public void setLovValues(List<LOVValue> lovValues) {
        this.lovValues = lovValues;
    }
}
