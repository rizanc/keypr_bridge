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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base" type="{http://webservices.micros.com/og/4.3/Common/}Amount" minOccurs="0"/>
 *         &lt;element name="AdditionalGuestAmounts" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AdditionalGuestAmountList" minOccurs="0"/>
 *         &lt;element name="AdditionalBedAmounts" type="{http://webservices.micros.com/og/4.3/HotelCommon/}AdditionalBedAmountList" minOccurs="0"/>
 *         &lt;element name="GdsTotalPricingTaxes" type="{http://webservices.micros.com/og/4.3/HotelCommon/}GdsTotalPricingTaxList" minOccurs="0"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="otherRateOccurrence" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rateChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="rateOccurrence" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RateOccurrenceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "base",
    "additionalGuestAmounts",
    "additionalBedAmounts",
    "gdsTotalPricingTaxes",
    "points"
})
public class Rate {

    @XmlElement(name = "Base")
    protected Amount base;
    @XmlElement(name = "AdditionalGuestAmounts")
    protected AdditionalGuestAmountList additionalGuestAmounts;
    @XmlElement(name = "AdditionalBedAmounts")
    protected AdditionalBedAmountList additionalBedAmounts;
    @XmlElement(name = "GdsTotalPricingTaxes")
    protected GdsTotalPricingTaxList gdsTotalPricingTaxes;
    @XmlElement(name = "Points")
    protected Double points;
    @XmlAttribute
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute
    protected String otherRateOccurrence;
    @XmlAttribute
    protected Boolean rateChangeIndicator;
    @XmlAttribute
    protected RateOccurrenceType rateOccurrence;

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBase(Amount value) {
        this.base = value;
    }

    /**
     * Gets the value of the additionalGuestAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalGuestAmountList }
     *     
     */
    public AdditionalGuestAmountList getAdditionalGuestAmounts() {
        return additionalGuestAmounts;
    }

    /**
     * Sets the value of the additionalGuestAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalGuestAmountList }
     *     
     */
    public void setAdditionalGuestAmounts(AdditionalGuestAmountList value) {
        this.additionalGuestAmounts = value;
    }

    /**
     * Gets the value of the additionalBedAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalBedAmountList }
     *     
     */
    public AdditionalBedAmountList getAdditionalBedAmounts() {
        return additionalBedAmounts;
    }

    /**
     * Sets the value of the additionalBedAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalBedAmountList }
     *     
     */
    public void setAdditionalBedAmounts(AdditionalBedAmountList value) {
        this.additionalBedAmounts = value;
    }

    /**
     * Gets the value of the gdsTotalPricingTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link GdsTotalPricingTaxList }
     *     
     */
    public GdsTotalPricingTaxList getGdsTotalPricingTaxes() {
        return gdsTotalPricingTaxes;
    }

    /**
     * Sets the value of the gdsTotalPricingTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdsTotalPricingTaxList }
     *     
     */
    public void setGdsTotalPricingTaxes(GdsTotalPricingTaxList value) {
        this.gdsTotalPricingTaxes = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPoints(Double value) {
        this.points = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
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
     * Gets the value of the otherRateOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateOccurrence() {
        return otherRateOccurrence;
    }

    /**
     * Sets the value of the otherRateOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateOccurrence(String value) {
        this.otherRateOccurrence = value;
    }

    /**
     * Gets the value of the rateChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRateChangeIndicator() {
        return rateChangeIndicator;
    }

    /**
     * Sets the value of the rateChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRateChangeIndicator(Boolean value) {
        this.rateChangeIndicator = value;
    }

    /**
     * Gets the value of the rateOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link RateOccurrenceType }
     *     
     */
    public RateOccurrenceType getRateOccurrence() {
        return rateOccurrence;
    }

    /**
     * Sets the value of the rateOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOccurrenceType }
     *     
     */
    public void setRateOccurrence(RateOccurrenceType value) {
        this.rateOccurrence = value;
    }

}
