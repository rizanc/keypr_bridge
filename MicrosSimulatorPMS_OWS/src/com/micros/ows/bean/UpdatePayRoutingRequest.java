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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationRequest" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}ReservationRequestBase"/>
 *         &lt;element name="PayRoutings" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}PayRouting"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationRequest",
    "payRoutings"
})
@XmlRootElement(name = "UpdatePayRoutingRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class UpdatePayRoutingRequest {

    @XmlElement(name = "ReservationRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlElement(name = "PayRoutings", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected PayRouting payRoutings;

    /**
     * Gets the value of the reservationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationRequestBase }
     *     
     */
    public ReservationRequestBase getReservationRequest() {
        return reservationRequest;
    }

    /**
     * Sets the value of the reservationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationRequestBase }
     *     
     */
    public void setReservationRequest(ReservationRequestBase value) {
        this.reservationRequest = value;
    }

    /**
     * Gets the value of the payRoutings property.
     * 
     * @return
     *     possible object is
     *     {@link PayRouting }
     *     
     */
    public PayRouting getPayRoutings() {
        return payRoutings;
    }

    /**
     * Sets the value of the payRoutings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayRouting }
     *     
     */
    public void setPayRoutings(PayRouting value) {
        this.payRoutings = value;
    }

}
