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
 * <p>Java class for PromotionSubscription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionSubscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="MembershipId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Promotion" type="{http://webservices.micros.com/og/4.3/Membership/}Promotion"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionSubscription", namespace = "http://webservices.micros.com/og/4.3/Membership/", propOrder = {

})
public class PromotionSubscription {

    @XmlElement(name = "MembershipId", namespace = "http://webservices.micros.com/og/4.3/Membership/")
    protected int membershipId;
    @XmlElement(name = "Promotion", namespace = "http://webservices.micros.com/og/4.3/Membership/", required = true)
    protected Promotion promotion;

    /**
     * Gets the value of the membershipId property.
     * 
     */
    public int getMembershipId() {
        return membershipId;
    }

    /**
     * Sets the value of the membershipId property.
     * 
     */
    public void setMembershipId(int value) {
        this.membershipId = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Promotion }
     *     
     */
    public Promotion getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promotion }
     *     
     */
    public void setPromotion(Promotion value) {
        this.promotion = value;
    }

}
