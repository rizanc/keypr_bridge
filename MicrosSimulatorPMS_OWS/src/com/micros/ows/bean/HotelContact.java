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
 * Basic contact information for Hotel Property.
 * 
 * <p>Java class for HotelContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AddressList" minOccurs="0"/>
 *         &lt;element name="ContactEmails" type="{http://webservices.micros.com/og/4.3/HotelCommon/}ContactEmailList" minOccurs="0"/>
 *         &lt;element name="ContactPhones" type="{http://webservices.micros.com/og/4.3/HotelCommon/}PhoneList" minOccurs="0"/>
 *         &lt;element name="HotelInformation" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelInfoList" minOccurs="0"/>
 *         &lt;element name="URIs" type="{http://webservices.micros.com/og/4.3/HotelCommon/}URIList" minOccurs="0"/>
 *         &lt;element name="Vector" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Vector" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelContact", propOrder = {
    "addresses",
    "contactEmails",
    "contactPhones",
    "hotelInformation",
    "urIs",
    "vector"
})
public class HotelContact {

    @XmlElement(name = "Addresses")
    protected AddressList addresses;
    @XmlElement(name = "ContactEmails")
    protected ContactEmailList contactEmails;
    @XmlElement(name = "ContactPhones")
    protected PhoneList contactPhones;
    @XmlElement(name = "HotelInformation")
    protected HotelInfoList hotelInformation;
    @XmlElement(name = "URIs")
    protected URIList urIs;
    @XmlElement(name = "Vector")
    protected Vector vector;

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressList }
     *     
     */
    public AddressList getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressList }
     *     
     */
    public void setAddresses(AddressList value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the contactEmails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactEmailList }
     *     
     */
    public ContactEmailList getContactEmails() {
        return contactEmails;
    }

    /**
     * Sets the value of the contactEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactEmailList }
     *     
     */
    public void setContactEmails(ContactEmailList value) {
        this.contactEmails = value;
    }

    /**
     * Gets the value of the contactPhones property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneList }
     *     
     */
    public PhoneList getContactPhones() {
        return contactPhones;
    }

    /**
     * Sets the value of the contactPhones property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneList }
     *     
     */
    public void setContactPhones(PhoneList value) {
        this.contactPhones = value;
    }

    /**
     * Gets the value of the hotelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfoList }
     *     
     */
    public HotelInfoList getHotelInformation() {
        return hotelInformation;
    }

    /**
     * Sets the value of the hotelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfoList }
     *     
     */
    public void setHotelInformation(HotelInfoList value) {
        this.hotelInformation = value;
    }

    /**
     * Gets the value of the urIs property.
     * 
     * @return
     *     possible object is
     *     {@link URIList }
     *     
     */
    public URIList getURIs() {
        return urIs;
    }

    /**
     * Sets the value of the urIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link URIList }
     *     
     */
    public void setURIs(URIList value) {
        this.urIs = value;
    }

    /**
     * Gets the value of the vector property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getVector() {
        return vector;
    }

    /**
     * Sets the value of the vector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setVector(Vector value) {
        this.vector = value;
    }

}
