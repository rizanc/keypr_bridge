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
 * <p>Java class for NameLookupCriteriaName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameLookupCriteriaName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameType" type="{http://webservices.micros.com/og/4.3/Common/}ProfileType" minOccurs="0"/>
 *         &lt;element name="NativeName" type="{http://webservices.micros.com/og/4.3/Name/}NativeName" minOccurs="0"/>
 *         &lt;element name="ActiveYn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameLookupCriteriaName", namespace = "http://webservices.micros.com/og/4.3/Name/", propOrder = {
    "name",
    "nameType",
    "nativeName",
    "activeYn"
})
public class NameLookupCriteriaName {

    @XmlElement(name = "Name", namespace = "http://webservices.micros.com/og/4.3/Name/")
    protected String name;
    @XmlElement(name = "NameType", namespace = "http://webservices.micros.com/og/4.3/Name/")
    protected ProfileType nameType;
    @XmlElement(name = "NativeName", namespace = "http://webservices.micros.com/og/4.3/Name/")
    protected NativeName nativeName;
    @XmlElement(name = "ActiveYn", namespace = "http://webservices.micros.com/og/4.3/Name/")
    protected String activeYn;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link ProfileType }
     *     
     */
    public ProfileType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType }
     *     
     */
    public void setNameType(ProfileType value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the nativeName property.
     * 
     * @return
     *     possible object is
     *     {@link NativeName }
     *     
     */
    public NativeName getNativeName() {
        return nativeName;
    }

    /**
     * Sets the value of the nativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NativeName }
     *     
     */
    public void setNativeName(NativeName value) {
        this.nativeName = value;
    }

    /**
     * Gets the value of the activeYn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveYn() {
        return activeYn;
    }

    /**
     * Sets the value of the activeYn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveYn(String value) {
        this.activeYn = value;
    }

}
