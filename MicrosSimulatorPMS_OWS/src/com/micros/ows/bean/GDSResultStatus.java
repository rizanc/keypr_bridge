//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.ows.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Extends "regular" ResultStatus object to include the possiblity of regurning various predefined error codes and responses.  Used primarily for ADS / GDS interfaces.
 * 
 * <p>Java class for GDSResultStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDSResultStatus">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservices.micros.com/og/4.3/Common/}ResultStatus">
 *       &lt;sequence>
 *         &lt;element name="GDSError" type="{http://webservices.micros.com/og/4.3/HotelCommon/}GDSError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDSResultStatus", propOrder = {
    "gdsError"
})
public class GDSResultStatus
    extends ResultStatus
{

    @XmlElement(name = "GDSError")
    protected GDSError gdsError;

    /**
     * Gets the value of the gdsError property.
     * 
     * @return
     *     possible object is
     *     {@link GDSError }
     *     
     */
    public GDSError getGDSError() {
        return gdsError;
    }

    /**
     * Sets the value of the gdsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDSError }
     *     
     */
    public void setGDSError(GDSError value) {
        this.gdsError = value;
    }

}
