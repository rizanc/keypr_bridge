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
 * <p>Java class for PromotionCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PromotionCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionInformation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionInstructions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionCode", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class PromotionCode {

    @XmlAttribute(name = "PromotionCode", required = true)
    protected String promotionCode;
    @XmlAttribute(name = "PromotionInformation")
    protected String promotionInformation;
    @XmlAttribute(name = "PromotionInstructions")
    protected String promotionInstructions;
    @XmlAttribute(name = "PromotionName")
    protected String promotionName;

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
     * Gets the value of the promotionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionInformation() {
        return promotionInformation;
    }

    /**
     * Sets the value of the promotionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionInformation(String value) {
        this.promotionInformation = value;
    }

    /**
     * Gets the value of the promotionInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionInstructions() {
        return promotionInstructions;
    }

    /**
     * Sets the value of the promotionInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionInstructions(String value) {
        this.promotionInstructions = value;
    }

    /**
     * Gets the value of the promotionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Sets the value of the promotionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionName(String value) {
        this.promotionName = value;
    }

}
