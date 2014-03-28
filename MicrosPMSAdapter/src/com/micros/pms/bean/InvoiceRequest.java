//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.pms.bean;

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
 *         &lt;element name="Printer" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}Printer" minOccurs="0"/>
 *         &lt;element name="ReturnFixedCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "printer",
    "returnFixedCharges"
})
@XmlRootElement(name = "InvoiceRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class InvoiceRequest {

    @XmlElement(name = "ReservationRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlElement(name = "Printer", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected Printer printer;
    @XmlElement(name = "ReturnFixedCharges", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected String returnFixedCharges;

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
     * Gets the value of the printer property.
     * 
     * @return
     *     possible object is
     *     {@link Printer }
     *     
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * Sets the value of the printer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Printer }
     *     
     */
    public void setPrinter(Printer value) {
        this.printer = value;
    }

    /**
     * Gets the value of the returnFixedCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnFixedCharges() {
        return returnFixedCharges;
    }

    /**
     * Sets the value of the returnFixedCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnFixedCharges(String value) {
        this.returnFixedCharges = value;
    }

}
