package com.cloudkey.pms.common.payment;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CardNumber.class, name = "raw"),
        @JsonSubTypes.Type(value = VaultedCardNumber.class, name = "vaulted"),
        @JsonSubTypes.Type(value = EncryptedSwipe.class, name = "encrypted")
})
public abstract class CardNumberReference {
}
