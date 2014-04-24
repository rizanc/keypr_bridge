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
 *         &lt;element name="ReservationRequest" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}ReservationRequestBase"/>
 *         &lt;element name="Printer" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}Printer" minOccurs="0"/>
 *         &lt;element name="CreditCardInfo" type="{http://webservices.micros.com/og/4.3/ResvAdvanced/}CreditCardInfo" minOccurs="0"/>
 *         &lt;element name="SignedDocuments" type="{http://webservices.micros.com/og/4.3/Common/}FileData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DoNotMoveRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EmailFolio" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NoPost" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="canHandleVaultedCreditCard" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="overrideEmailPrivacy" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationRequest",
    "printer",
    "creditCardInfo",
    "signedDocuments"
})
@XmlRootElement(name = "CheckOutRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class CheckOutRequest {

    @XmlElement(name = "ReservationRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected ReservationRequestBase reservationRequest;
    @XmlElement(name = "Printer", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected Printer printer;
    @XmlElement(name = "CreditCardInfo", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected CreditCardInfo creditCardInfo;
    @XmlElement(name = "SignedDocuments", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected List<FileData> signedDocuments;
    @XmlAttribute(name = "DoNotMoveRoom")
    protected Boolean doNotMoveRoom;
    @XmlAttribute(name = "EmailFolio")
    protected Boolean emailFolio;
    @XmlAttribute(name = "NoPost")
    protected Boolean noPost;
    @XmlAttribute
    protected Boolean canHandleVaultedCreditCard;
    @XmlAttribute
    protected Boolean overrideEmailPrivacy;

    /**
     * Gets the value of the reservationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationRequestBase }
     *     
     */
    public ReservationRequestBase getReservationRequest() {
        return reservationRequest;
    }

    /**
     * Sets the value of the reservationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationRequestBase }
     *     
     */
    public void setReservationRequest(ReservationRequestBase value) {
        this.reservationRequest = value;
    }

    /**
     * Gets the value of the printer property.
     * 
     * @return
     *     possible object is
     *     {@link Printer }
     *     
     */
    public Printer getPrinter() {
        return printer;
    }

    /**
     * Sets the value of the printer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Printer }
     *     
     */
    public void setPrinter(Printer value) {
        this.printer = value;
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
     * Gets the value of the signedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileData }
     * 
     * 
     */
    public List<FileData> getSignedDocuments() {
        if (signedDocuments == null) {
            signedDocuments = new ArrayList<FileData>();
        }
        return this.signedDocuments;
    }

    /**
     * Gets the value of the doNotMoveRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotMoveRoom() {
        return doNotMoveRoom;
    }

    /**
     * Sets the value of the doNotMoveRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotMoveRoom(Boolean value) {
        this.doNotMoveRoom = value;
    }

    /**
     * Gets the value of the emailFolio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailFolio() {
        return emailFolio;
    }

    /**
     * Sets the value of the emailFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailFolio(Boolean value) {
        this.emailFolio = value;
    }

    /**
     * Gets the value of the noPost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPost() {
        return noPost;
    }

    /**
     * Sets the value of the noPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPost(Boolean value) {
        this.noPost = value;
    }

    /**
     * Gets the value of the canHandleVaultedCreditCard property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanHandleVaultedCreditCard() {
        return canHandleVaultedCreditCard;
    }

    /**
     * Sets the value of the canHandleVaultedCreditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanHandleVaultedCreditCard(Boolean value) {
        this.canHandleVaultedCreditCard = value;
    }

    /**
     * Gets the value of the overrideEmailPrivacy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideEmailPrivacy() {
        return overrideEmailPrivacy;
    }

    /**
     * Sets the value of the overrideEmailPrivacy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideEmailPrivacy(Boolean value) {
        this.overrideEmailPrivacy = value;
    }

}