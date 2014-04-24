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
 * <p>Java class for AreaAvailableProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaAvailableProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="PropertyStatus" type="{http://webservices.micros.com/og/4.3/Availability/}PropertyStatusCode"/>
 *         &lt;element name="PropertyErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinMaxRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://webservices.micros.com/og/4.3/HotelCommon/}MinMaxRate">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RateCodes" type="{http://webservices.micros.com/og/4.3/Availability/}RateCodeInformationList" minOccurs="0"/>
 *         &lt;element name="RateCalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaAvailableProperty", namespace = "http://webservices.micros.com/og/4.3/Availability/", propOrder = {
    "hotelReference",
    "propertyStatus",
    "propertyErrorCode",
    "minMaxRate",
    "rateCodes",
    "rateCalculationMethod"
})
public class AreaAvailableProperty {

    @XmlElement(name = "HotelReference", namespace = "http://webservices.micros.com/og/4.3/Availability/", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "PropertyStatus", namespace = "http://webservices.micros.com/og/4.3/Availability/", required = true)
    protected PropertyStatusCode propertyStatus;
    @XmlElement(name = "PropertyErrorCode", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected String propertyErrorCode;
    @XmlElement(name = "MinMaxRate", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected AreaAvailableProperty.MinMaxRate minMaxRate;
    @XmlElement(name = "RateCodes", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected RateCodeInformationList rateCodes;
    @XmlElement(name = "RateCalculationMethod", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected String rateCalculationMethod;

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
     * Gets the value of the propertyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStatusCode }
     *     
     */
    public PropertyStatusCode getPropertyStatus() {
        return propertyStatus;
    }

    /**
     * Sets the value of the propertyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStatusCode }
     *     
     */
    public void setPropertyStatus(PropertyStatusCode value) {
        this.propertyStatus = value;
    }

    /**
     * Gets the value of the propertyErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyErrorCode() {
        return propertyErrorCode;
    }

    /**
     * Sets the value of the propertyErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyErrorCode(String value) {
        this.propertyErrorCode = value;
    }

    /**
     * Gets the value of the minMaxRate property.
     * 
     * @return
     *     possible object is
     *     {@link AreaAvailableProperty.MinMaxRate }
     *     
     */
    public AreaAvailableProperty.MinMaxRate getMinMaxRate() {
        return minMaxRate;
    }

    /**
     * Sets the value of the minMaxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaAvailableProperty.MinMaxRate }
     *     
     */
    public void setMinMaxRate(AreaAvailableProperty.MinMaxRate value) {
        this.minMaxRate = value;
    }

    /**
     * Gets the value of the rateCodes property.
     * 
     * @return
     *     possible object is
     *     {@link RateCodeInformationList }
     *     
     */
    public RateCodeInformationList getRateCodes() {
        return rateCodes;
    }

    /**
     * Sets the value of the rateCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCodeInformationList }
     *     
     */
    public void setRateCodes(RateCodeInformationList value) {
        this.rateCodes = value;
    }

    /**
     * Gets the value of the rateCalculationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCalculationMethod() {
        return rateCalculationMethod;
    }

    /**
     * Sets the value of the rateCalculationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCalculationMethod(String value) {
        this.rateCalculationMethod = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://webservices.micros.com/og/4.3/HotelCommon/}MinMaxRate">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinMaxRate
        extends com.micros.pms.bean.MinMaxRate
    {


    }

}