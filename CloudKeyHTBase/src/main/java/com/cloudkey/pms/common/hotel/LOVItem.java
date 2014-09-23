package com.cloudkey.pms.common.hotel;

import lombok.Value;
import lombok.experimental.Builder;

import java.util.List;

/**
 * Created by crizan2 on 04/09/2014.
 */
@Value
@Builder
public class LOVItem {
    String qualifierType;
    String qualifierValue;
    String secondaryQualifierType;
    String secondaryQualifierValue;
    String tertiaryQualifierType;
    String tertiaryQualifierValue;
    String quaternaryQualifierType;
    String quaternaryQualifierValue;
    String quinaryQualifierType;
    String quinaryQualifierValue;
    List<LOVValue> lovValues;
}
