package com.cloudkey.pms.common.hotel;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.Builder;

import java.util.List;

/**
 * Created by crizan2 on 04/09/2014.
 */
@Getter
@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
@EqualsAndHashCode
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
