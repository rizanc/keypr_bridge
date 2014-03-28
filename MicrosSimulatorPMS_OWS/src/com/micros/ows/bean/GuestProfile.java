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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * represents the information regarding the profile
 * 
 * <p>Java class for GuestProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://webservices.micros.com/og/4.3/Common/}PersonName"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://webservices.micros.com/og/4.3/Common/}Gender" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://webservices.micros.com/og/4.3/Common/}Address" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://webservices.micros.com/og/4.3/Common/}Phone" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="MembershipNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestProfile", namespace = "http://webservices.micros.com/og/4.3/Common/", propOrder = {
    "nameID",
    "personName",
    "birthDate",
    "gender",
    "address",
    "phone",
    "emailAddress",
    "membershipID",
    "membershipNumber",
    "membershipType"
})
public class GuestProfile {

    @XmlElement(name = "NameID", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected UniqueID nameID;
    @XmlElement(name = "PersonName", namespace = "http://webservices.micros.com/og/4.3/Common/", required = true)
    protected PersonName personName;
    @XmlElement(name = "BirthDate", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "Gender", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected Gender gender;
    @XmlElement(name = "Address", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected Address address;
    @XmlElement(name = "Phone", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected Phone phone;
    @XmlElement(name = "EmailAddress", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected String emailAddress;
    @XmlElement(name = "MembershipID", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected UniqueID membershipID;
    @XmlElement(name = "MembershipNumber", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected String membershipNumber;
    @XmlElement(name = "MembershipType", namespace = "http://webservices.micros.com/og/4.3/Common/")
    protected String membershipType;

    /**
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getNameID() {
        return nameID;
    }

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setNameID(UniqueID value) {
        this.nameID = value;
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
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Phone }
     *     
     */
    public Phone getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phone }
     *     
     */
    public void setPhone(Phone value) {
        this.phone = value;
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
     * Gets the value of the membershipID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMembershipID() {
        return membershipID;
    }

    /**
     * Sets the value of the membershipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMembershipID(UniqueID value) {
        this.membershipID = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

}
