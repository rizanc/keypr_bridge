//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.ows.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationRequestCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationRequestCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestDescription" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Paragraph" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequestSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RequestType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationRequestCode", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", propOrder = {
    "requestDescription"
})
public class ReservationRequestCode {

    @XmlElement(name = "RequestDescription", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected Paragraph requestDescription;
    @XmlAttribute(name = "RequestCode", required = true)
    protected String requestCode;
    @XmlAttribute(name = "RequestSource")
    protected String requestSource;
    @XmlAttribute(name = "RequestType", required = true)
    protected String requestType;

    /**
     * Gets the value of the requestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Paragraph }
     *     
     */
    public Paragraph getRequestDescription() {
        return requestDescription;
    }

    /**
     * Sets the value of the requestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paragraph }
     *     
     */
    public void setRequestDescription(Paragraph value) {
        this.requestDescription = value;
    }

    /**
     * Gets the value of the requestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

    /**
     * Gets the value of the requestSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSource() {
        return requestSource;
    }

    /**
     * Sets the value of the requestSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSource(String value) {
        this.requestSource = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestType(String value) {
        this.requestType = value;
    }

}
