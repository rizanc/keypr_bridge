package com.cloudkey.pms.common.payment;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.validation.constraints.NotNull;

/**
 * Contains the full unencrypted credit card number
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
@EqualsAndHashCode(callSuper = false)
@Getter
@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@ToString
public class CardNumber extends CardNumberReference {
    @NotNull
    String cardNumber;
}
