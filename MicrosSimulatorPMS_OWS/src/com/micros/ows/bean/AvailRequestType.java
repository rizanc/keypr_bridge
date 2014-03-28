//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.ows.bean;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for AvailRequestType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailRequestType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Room"/>
 *     &lt;enumeration value="NonRoom"/>
 *     &lt;enumeration value="Both"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="BestAvailable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AvailRequestType {

    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("NonRoom")
    NON_ROOM("NonRoom"),
    @XmlEnumValue("Both")
    BOTH("Both"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("BestAvailable")
    BEST_AVAILABLE("BestAvailable");
    private final String value;

    AvailRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailRequestType fromValue(String v) {
        for (AvailRequestType c: AvailRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
