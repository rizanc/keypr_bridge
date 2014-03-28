//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 06:33:28 PM IST 
//


package com.micros.pms.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FavoriteGuest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FavoriteGuest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="GuestNameID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://webservices.micros.com/og/4.3/Common/}PersonName"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="inactive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavoriteGuest", namespace = "http://webservices.micros.com/og/4.3/Membership/", propOrder = {
    "guestID",
    "guestNameID",
    "personName",
    "emailAddress"
})
public class FavoriteGuest {

    @XmlElement(name = "GuestID", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID guestID;
    @XmlElement(name = "GuestNameID", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID guestNameID;
    @XmlElement(name = "PersonName", namespace = "http://webservices.micros.com/og/4.3/Membership/", required = true)
    protected PersonName personName;
    @XmlElement(name = "EmailAddress", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String emailAddress;
    @XmlAttribute
    protected Boolean inactive;

    /**
     * Gets the value of the guestID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getGuestID() {
        return guestID;
    }

    /**
     * Sets the value of the guestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setGuestID(UniqueID value) {
        this.guestID = value;
    }

    /**
     * Gets the value of the guestNameID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getGuestNameID() {
        return guestNameID;
    }

    /**
     * Sets the value of the guestNameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setGuestNameID(UniqueID value) {
        this.guestNameID = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the inactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInactive() {
        return inactive;
    }

    /**
     * Sets the value of the inactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInactive(Boolean value) {
        this.inactive = value;
    }

}
