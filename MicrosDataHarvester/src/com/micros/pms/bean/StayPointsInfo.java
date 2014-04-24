//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 06:33:28 PM IST 
//


package com.micros.pms.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StayPointsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StayPointsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MembershipTotalNights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MembershipTotalStays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuestTotalNights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuestTotalStays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MembershipTotalNightsRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MembershipTotalStaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuestTotalNightsRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GuestTotalStaysRange" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayPointsInfo", namespace = "http://webservices.micros.com/og/4.3/Membership/", propOrder = {
    "membershipTotalNights",
    "membershipTotalStays",
    "guestTotalNights",
    "guestTotalStays",
    "membershipTotalNightsRange",
    "membershipTotalStaysRange",
    "guestTotalNightsRange",
    "guestTotalStaysRange"
})
public class StayPointsInfo {

    @XmlElement(name = "MembershipTotalNights", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer membershipTotalNights;
    @XmlElement(name = "MembershipTotalStays", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer membershipTotalStays;
    @XmlElement(name = "GuestTotalNights", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer guestTotalNights;
    @XmlElement(name = "GuestTotalStays", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer guestTotalStays;
    @XmlElement(name = "MembershipTotalNightsRange", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer membershipTotalNightsRange;
    @XmlElement(name = "MembershipTotalStaysRange", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer membershipTotalStaysRange;
    @XmlElement(name = "GuestTotalNightsRange", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer guestTotalNightsRange;
    @XmlElement(name = "GuestTotalStaysRange", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer guestTotalStaysRange;

    /**
     * Gets the value of the membershipTotalNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipTotalNights() {
        return membershipTotalNights;
    }

    /**
     * Sets the value of the membershipTotalNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipTotalNights(Integer value) {
        this.membershipTotalNights = value;
    }

    /**
     * Gets the value of the membershipTotalStays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipTotalStays() {
        return membershipTotalStays;
    }

    /**
     * Sets the value of the membershipTotalStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipTotalStays(Integer value) {
        this.membershipTotalStays = value;
    }

    /**
     * Gets the value of the guestTotalNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestTotalNights() {
        return guestTotalNights;
    }

    /**
     * Sets the value of the guestTotalNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestTotalNights(Integer value) {
        this.guestTotalNights = value;
    }

    /**
     * Gets the value of the guestTotalStays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestTotalStays() {
        return guestTotalStays;
    }

    /**
     * Sets the value of the guestTotalStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestTotalStays(Integer value) {
        this.guestTotalStays = value;
    }

    /**
     * Gets the value of the membershipTotalNightsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipTotalNightsRange() {
        return membershipTotalNightsRange;
    }

    /**
     * Sets the value of the membershipTotalNightsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipTotalNightsRange(Integer value) {
        this.membershipTotalNightsRange = value;
    }

    /**
     * Gets the value of the membershipTotalStaysRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipTotalStaysRange() {
        return membershipTotalStaysRange;
    }

    /**
     * Sets the value of the membershipTotalStaysRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipTotalStaysRange(Integer value) {
        this.membershipTotalStaysRange = value;
    }

    /**
     * Gets the value of the guestTotalNightsRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestTotalNightsRange() {
        return guestTotalNightsRange;
    }

    /**
     * Sets the value of the guestTotalNightsRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestTotalNightsRange(Integer value) {
        this.guestTotalNightsRange = value;
    }

    /**
     * Gets the value of the guestTotalStaysRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestTotalStaysRange() {
        return guestTotalStaysRange;
    }

    /**
     * Sets the value of the guestTotalStaysRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestTotalStaysRange(Integer value) {
        this.guestTotalStaysRange = value;
    }

}