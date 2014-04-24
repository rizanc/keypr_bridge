//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 06:49:58 PM IST 
//


package com.micros.ows.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ECertificate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECertificate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertificateID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReservationCertificateYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificateValue" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CertificateCost" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="CertificateLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="ConsumedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumptionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConsumedHotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference" minOccurs="0"/>
 *         &lt;element name="ConsumptionRefNo" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="ConsumptionRefType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumptionLegNo" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="UserNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrintStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MembershipAwardID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID" minOccurs="0"/>
 *         &lt;element name="IssueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssueSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardPoints" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="InActiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CertificateBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CertificateEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CertificateExpriyMonths" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WebConsumed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMSConsumed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Awards" type="{http://webservices.micros.com/og/4.3/Membership/}Award" minOccurs="0"/>
 *         &lt;element name="Promotions" type="{http://webservices.micros.com/og/4.3/Membership/}PromotionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECertificate", namespace = "http://webservices.micros.com/og/4.3/Membership/", propOrder = {
    "certificateID",
    "voucherNumber",
    "certificateNumber",
    "certificateCode",
    "hotelReference",
    "membershipType",
    "awardType",
    "promotionCode",
    "shortDescription",
    "longDescription",
    "expirationDate",
    "reservationCertificateYN",
    "certificateValue",
    "certificateCost",
    "certificateLabel",
    "nameID",
    "consumedAt",
    "consumerLastName",
    "consumerFirstName",
    "consumerMiddleName",
    "consumerEmail",
    "consumptionDate",
    "consumedHotelReference",
    "consumptionRefNo",
    "consumptionRefType",
    "consumptionLegNo",
    "userNotes",
    "status",
    "printStatus",
    "membershipAwardID",
    "issueType",
    "issueSource",
    "awardPoints",
    "inActiveDate",
    "certificateBeginDate",
    "certificateEndDate",
    "certificateExpriyMonths",
    "webConsumed",
    "webAllowed",
    "pmsConsumed",
    "awards",
    "promotions",
    "scope"
})
public class ECertificate {

    @XmlElement(name = "CertificateID", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID certificateID;
    @XmlElement(name = "VoucherNumber", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String voucherNumber;
    @XmlElement(name = "CertificateNumber", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String certificateNumber;
    @XmlElement(name = "CertificateCode", namespace = "http://webservices.micros.com/og/4.3/Membership/", required = true)
    protected String certificateCode;
    @XmlElement(name = "HotelReference", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected HotelReference hotelReference;
    @XmlElement(name = "MembershipType", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String membershipType;
    @XmlElement(name = "AwardType", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String awardType;
    @XmlElement(name = "PromotionCode", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String promotionCode;
    @XmlElement(name = "ShortDescription", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String shortDescription;
    @XmlElement(name = "LongDescription", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String longDescription;
    @XmlElement(name = "ExpirationDate", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "ReservationCertificateYN", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String reservationCertificateYN;
    @XmlElement(name = "CertificateValue", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Amount certificateValue;
    @XmlElement(name = "CertificateCost", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Amount certificateCost;
    @XmlElement(name = "CertificateLabel", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String certificateLabel;
    @XmlElement(name = "NameID", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID nameID;
    @XmlElement(name = "ConsumedAt", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumedAt;
    @XmlElement(name = "ConsumerLastName", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumerLastName;
    @XmlElement(name = "ConsumerFirstName", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumerFirstName;
    @XmlElement(name = "ConsumerMiddleName", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumerMiddleName;
    @XmlElement(name = "ConsumerEmail", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumerEmail;
    @XmlElement(name = "ConsumptionDate", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected XMLGregorianCalendar consumptionDate;
    @XmlElement(name = "ConsumedHotelReference", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected HotelReference consumedHotelReference;
    @XmlElement(name = "ConsumptionRefNo", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID consumptionRefNo;
    @XmlElement(name = "ConsumptionRefType", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String consumptionRefType;
    @XmlElement(name = "ConsumptionLegNo", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID consumptionLegNo;
    @XmlElement(name = "UserNotes", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String userNotes;
    @XmlElement(name = "Status", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String status;
    @XmlElement(name = "PrintStatus", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String printStatus;
    @XmlElement(name = "MembershipAwardID", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected UniqueID membershipAwardID;
    @XmlElement(name = "IssueType", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String issueType;
    @XmlElement(name = "IssueSource", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String issueSource;
    @XmlElement(name = "AwardPoints", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Double awardPoints;
    @XmlElement(name = "InActiveDate", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected XMLGregorianCalendar inActiveDate;
    @XmlElement(name = "CertificateBeginDate", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected XMLGregorianCalendar certificateBeginDate;
    @XmlElement(name = "CertificateEndDate", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected XMLGregorianCalendar certificateEndDate;
    @XmlElement(name = "CertificateExpriyMonths", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Integer certificateExpriyMonths;
    @XmlElement(name = "WebConsumed", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String webConsumed;
    @XmlElement(name = "WebAllowed", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String webAllowed;
    @XmlElement(name = "PMSConsumed", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String pmsConsumed;
    @XmlElement(name = "Awards", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected Award awards;
    @XmlElement(name = "Promotions", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected List<PromotionDetails> promotions;
    @XmlElement(name = "Scope", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected String scope;

    /**
     * Gets the value of the certificateID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getCertificateID() {
        return certificateID;
    }

    /**
     * Sets the value of the certificateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setCertificateID(UniqueID value) {
        this.certificateID = value;
    }

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherNumber(String value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the certificateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateCode() {
        return certificateCode;
    }

    /**
     * Sets the value of the certificateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateCode(String value) {
        this.certificateCode = value;
    }

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReference }
     *     
     */
    public HotelReference getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReference }
     *     
     */
    public void setHotelReference(HotelReference value) {
        this.hotelReference = value;
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

    /**
     * Gets the value of the awardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardType() {
        return awardType;
    }

    /**
     * Sets the value of the awardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardType(String value) {
        this.awardType = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the reservationCertificateYN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationCertificateYN() {
        return reservationCertificateYN;
    }

    /**
     * Sets the value of the reservationCertificateYN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationCertificateYN(String value) {
        this.reservationCertificateYN = value;
    }

    /**
     * Gets the value of the certificateValue property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCertificateValue() {
        return certificateValue;
    }

    /**
     * Sets the value of the certificateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCertificateValue(Amount value) {
        this.certificateValue = value;
    }

    /**
     * Gets the value of the certificateCost property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCertificateCost() {
        return certificateCost;
    }

    /**
     * Sets the value of the certificateCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCertificateCost(Amount value) {
        this.certificateCost = value;
    }

    /**
     * Gets the value of the certificateLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateLabel() {
        return certificateLabel;
    }

    /**
     * Sets the value of the certificateLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateLabel(String value) {
        this.certificateLabel = value;
    }

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
     * Gets the value of the consumedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumedAt() {
        return consumedAt;
    }

    /**
     * Sets the value of the consumedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumedAt(String value) {
        this.consumedAt = value;
    }

    /**
     * Gets the value of the consumerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerLastName() {
        return consumerLastName;
    }

    /**
     * Sets the value of the consumerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerLastName(String value) {
        this.consumerLastName = value;
    }

    /**
     * Gets the value of the consumerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerFirstName() {
        return consumerFirstName;
    }

    /**
     * Sets the value of the consumerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerFirstName(String value) {
        this.consumerFirstName = value;
    }

    /**
     * Gets the value of the consumerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerMiddleName() {
        return consumerMiddleName;
    }

    /**
     * Sets the value of the consumerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerMiddleName(String value) {
        this.consumerMiddleName = value;
    }

    /**
     * Gets the value of the consumerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerEmail() {
        return consumerEmail;
    }

    /**
     * Sets the value of the consumerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerEmail(String value) {
        this.consumerEmail = value;
    }

    /**
     * Gets the value of the consumptionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConsumptionDate() {
        return consumptionDate;
    }

    /**
     * Sets the value of the consumptionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConsumptionDate(XMLGregorianCalendar value) {
        this.consumptionDate = value;
    }

    /**
     * Gets the value of the consumedHotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReference }
     *     
     */
    public HotelReference getConsumedHotelReference() {
        return consumedHotelReference;
    }

    /**
     * Sets the value of the consumedHotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReference }
     *     
     */
    public void setConsumedHotelReference(HotelReference value) {
        this.consumedHotelReference = value;
    }

    /**
     * Gets the value of the consumptionRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getConsumptionRefNo() {
        return consumptionRefNo;
    }

    /**
     * Sets the value of the consumptionRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setConsumptionRefNo(UniqueID value) {
        this.consumptionRefNo = value;
    }

    /**
     * Gets the value of the consumptionRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumptionRefType() {
        return consumptionRefType;
    }

    /**
     * Sets the value of the consumptionRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumptionRefType(String value) {
        this.consumptionRefType = value;
    }

    /**
     * Gets the value of the consumptionLegNo property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getConsumptionLegNo() {
        return consumptionLegNo;
    }

    /**
     * Sets the value of the consumptionLegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setConsumptionLegNo(UniqueID value) {
        this.consumptionLegNo = value;
    }

    /**
     * Gets the value of the userNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNotes() {
        return userNotes;
    }

    /**
     * Sets the value of the userNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNotes(String value) {
        this.userNotes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the printStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatus() {
        return printStatus;
    }

    /**
     * Sets the value of the printStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatus(String value) {
        this.printStatus = value;
    }

    /**
     * Gets the value of the membershipAwardID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getMembershipAwardID() {
        return membershipAwardID;
    }

    /**
     * Sets the value of the membershipAwardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setMembershipAwardID(UniqueID value) {
        this.membershipAwardID = value;
    }

    /**
     * Gets the value of the issueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueType() {
        return issueType;
    }

    /**
     * Sets the value of the issueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueType(String value) {
        this.issueType = value;
    }

    /**
     * Gets the value of the issueSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueSource() {
        return issueSource;
    }

    /**
     * Sets the value of the issueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueSource(String value) {
        this.issueSource = value;
    }

    /**
     * Gets the value of the awardPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAwardPoints() {
        return awardPoints;
    }

    /**
     * Sets the value of the awardPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAwardPoints(Double value) {
        this.awardPoints = value;
    }

    /**
     * Gets the value of the inActiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInActiveDate() {
        return inActiveDate;
    }

    /**
     * Sets the value of the inActiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInActiveDate(XMLGregorianCalendar value) {
        this.inActiveDate = value;
    }

    /**
     * Gets the value of the certificateBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateBeginDate() {
        return certificateBeginDate;
    }

    /**
     * Sets the value of the certificateBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateBeginDate(XMLGregorianCalendar value) {
        this.certificateBeginDate = value;
    }

    /**
     * Gets the value of the certificateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCertificateEndDate() {
        return certificateEndDate;
    }

    /**
     * Sets the value of the certificateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCertificateEndDate(XMLGregorianCalendar value) {
        this.certificateEndDate = value;
    }

    /**
     * Gets the value of the certificateExpriyMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificateExpriyMonths() {
        return certificateExpriyMonths;
    }

    /**
     * Sets the value of the certificateExpriyMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificateExpriyMonths(Integer value) {
        this.certificateExpriyMonths = value;
    }

    /**
     * Gets the value of the webConsumed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebConsumed() {
        return webConsumed;
    }

    /**
     * Sets the value of the webConsumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebConsumed(String value) {
        this.webConsumed = value;
    }

    /**
     * Gets the value of the webAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAllowed() {
        return webAllowed;
    }

    /**
     * Sets the value of the webAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAllowed(String value) {
        this.webAllowed = value;
    }

    /**
     * Gets the value of the pmsConsumed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMSConsumed() {
        return pmsConsumed;
    }

    /**
     * Sets the value of the pmsConsumed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMSConsumed(String value) {
        this.pmsConsumed = value;
    }

    /**
     * Gets the value of the awards property.
     * 
     * @return
     *     possible object is
     *     {@link Award }
     *     
     */
    public Award getAwards() {
        return awards;
    }

    /**
     * Sets the value of the awards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Award }
     *     
     */
    public void setAwards(Award value) {
        this.awards = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionDetails }
     * 
     * 
     */
    public List<PromotionDetails> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<PromotionDetails>();
        }
        return this.promotions;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

}