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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Joiner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Joiner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfirmationNumber" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="LegNumber" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="ResvNameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="NameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Joiner", namespace = "http://webservices.micros.com/og/4.3/Reservation/", propOrder = {
    "confirmationNumber",
    "legNumber",
    "resvNameId",
    "nameId"
})
public class Joiner {

    @XmlElement(name = "ConfirmationNumber", namespace = "http://webservices.micros.com/og/4.3/Reservation/")
    protected UniqueID confirmationNumber;
    @XmlElement(name = "LegNumber", namespace = "http://webservices.micros.com/og/4.3/Reservation/")
    protected UniqueID legNumber;
    @XmlElement(name = "ResvNameId", namespace = "http://webservices.micros.com/og/4.3/Reservation/")
    protected UniqueID resvNameId;
    @XmlElement(name = "NameId", namespace = "http://webservices.micros.com/og/4.3/Reservation/")
    protected UniqueID nameId;

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setConfirmationNumber(UniqueID value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the legNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getLegNumber() {
        return legNumber;
    }

    /**
     * Sets the value of the legNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setLegNumber(UniqueID value) {
        this.legNumber = value;
    }

    /**
     * Gets the value of the resvNameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getResvNameId() {
        return resvNameId;
    }

    /**
     * Sets the value of the resvNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setResvNameId(UniqueID value) {
        this.resvNameId = value;
    }

    /**
     * Gets the value of the nameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getNameId() {
        return nameId;
    }

    /**
     * Sets the value of the nameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setNameId(UniqueID value) {
        this.nameId = value;
    }

}