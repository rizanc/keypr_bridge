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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result" type="{http://webservices.micros.com/og/4.3/Common/}ResultStatus"/>
 *         &lt;element name="DocumentToSign" type="{http://webservices.micros.com/og/4.3/Common/}FileData" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GuestRegistration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result",
    "documentToSign"
})
@XmlRootElement(name = "GenerateRegistrationCardResponse", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class GenerateRegistrationCardResponse {

    @XmlElement(name = "Result", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected ResultStatus result;
    @XmlElement(name = "DocumentToSign", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected FileData documentToSign;
    @XmlAttribute(name = "GuestRegistration")
    protected String guestRegistration;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultStatus }
     *     
     */
    public ResultStatus getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultStatus }
     *     
     */
    public void setResult(ResultStatus value) {
        this.result = value;
    }

    /**
     * Gets the value of the documentToSign property.
     * 
     * @return
     *     possible object is
     *     {@link FileData }
     *     
     */
    public FileData getDocumentToSign() {
        return documentToSign;
    }

    /**
     * Sets the value of the documentToSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileData }
     *     
     */
    public void setDocumentToSign(FileData value) {
        this.documentToSign = value;
    }

    /**
     * Gets the value of the guestRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestRegistration() {
        return guestRegistration;
    }

    /**
     * Sets the value of the guestRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestRegistration(String value) {
        this.guestRegistration = value;
    }

}
