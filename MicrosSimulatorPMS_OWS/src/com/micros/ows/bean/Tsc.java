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
import javax.xml.bind.annotation.XmlType;


/**
 * represents the breakdown of TSC numbers
 * 
 * <p>Java class for Tsc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tsc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="baseNights" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="baseRevenue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="baseStay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bonusNights" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bonusRevenue" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="bonusStay" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tsc", namespace = "http://webservices.micros.com/og/4.3/Membership/")
public class Tsc {

    @XmlAttribute
    protected Integer baseNights;
    @XmlAttribute
    protected Double baseRevenue;
    @XmlAttribute
    protected Integer baseStay;
    @XmlAttribute
    protected Integer bonusNights;
    @XmlAttribute
    protected Double bonusRevenue;
    @XmlAttribute
    protected Integer bonusStay;

    /**
     * Gets the value of the baseNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseNights() {
        return baseNights;
    }

    /**
     * Sets the value of the baseNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseNights(Integer value) {
        this.baseNights = value;
    }

    /**
     * Gets the value of the baseRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseRevenue() {
        return baseRevenue;
    }

    /**
     * Sets the value of the baseRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseRevenue(Double value) {
        this.baseRevenue = value;
    }

    /**
     * Gets the value of the baseStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseStay() {
        return baseStay;
    }

    /**
     * Sets the value of the baseStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseStay(Integer value) {
        this.baseStay = value;
    }

    /**
     * Gets the value of the bonusNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBonusNights() {
        return bonusNights;
    }

    /**
     * Sets the value of the bonusNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBonusNights(Integer value) {
        this.bonusNights = value;
    }

    /**
     * Gets the value of the bonusRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBonusRevenue() {
        return bonusRevenue;
    }

    /**
     * Sets the value of the bonusRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBonusRevenue(Double value) {
        this.bonusRevenue = value;
    }

    /**
     * Gets the value of the bonusStay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBonusStay() {
        return bonusStay;
    }

    /**
     * Sets the value of the bonusStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBonusStay(Integer value) {
        this.bonusStay = value;
    }

}