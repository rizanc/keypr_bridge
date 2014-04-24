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
 *         &lt;element name="Posting" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}Posting"/>
 *         &lt;element name="CreditCardInfo" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}CreditCardInfo"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignedDocument" type="{http://webservices.micros.com/og/4.3/Common/}FileData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "posting",
    "creditCardInfo",
    "reference",
    "signedDocument"
})
@XmlRootElement(name = "MakePaymentRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class MakePaymentRequest {

    @XmlElement(name = "Posting", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected Posting posting;
    @XmlElement(name = "CreditCardInfo", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected CreditCardInfo creditCardInfo;
    @XmlElement(name = "Reference", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected String reference;
    @XmlElement(name = "SignedDocument", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected FileData signedDocument;

    /**
     * Gets the value of the posting property.
     * 
     * @return
     *     possible object is
     *     {@link Posting }
     *     
     */
    public Posting getPosting() {
        return posting;
    }

    /**
     * Sets the value of the posting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Posting }
     *     
     */
    public void setPosting(Posting value) {
        this.posting = value;
    }

    /**
     * Gets the value of the creditCardInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfo }
     *     
     */
    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * Sets the value of the creditCardInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfo }
     *     
     */
    public void setCreditCardInfo(CreditCardInfo value) {
        this.creditCardInfo = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the signedDocument property.
     * 
     * @return
     *     possible object is
     *     {@link FileData }
     *     
     */
    public FileData getSignedDocument() {
        return signedDocument;
    }

    /**
     * Sets the value of the signedDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileData }
     *     
     */
    public void setSignedDocument(FileData value) {
        this.signedDocument = value;
    }

}