//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.pms.bean;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for ReservationDispositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReservationDispositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="DUEIN"/>
 *     &lt;enumeration value="INHOUSE"/>
 *     &lt;enumeration value="DUEOUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ReservationDispositionType {

    NONE,
    DUEIN,
    INHOUSE,
    DUEOUT;

    public String value() {
        return name();
    }

    public static ReservationDispositionType fromValue(String v) {
        return valueOf(v);
    }

}