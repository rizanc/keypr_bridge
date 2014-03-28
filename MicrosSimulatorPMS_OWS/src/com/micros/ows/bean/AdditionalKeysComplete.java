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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalKeysComplete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalKeysComplete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://webservices.micros.com/og/4.3/Common/}UniqueIDList"/>
 *         &lt;element name="KeyTrack" type="{http://webservices.micros.com/og/4.3/Common/}KeyTrack" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="GuestMessages" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalKeysComplete", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", propOrder = {
    "reservationID",
    "keyTrack"
})
public class AdditionalKeysComplete {

    @XmlElement(name = "ReservationID", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected UniqueIDList reservationID;
    @XmlElement(name = "KeyTrack", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected List<KeyTrack> keyTrack;
    @XmlAttribute(name = "GuestMessages")
    protected Integer guestMessages;

    /**
     * Gets the value of the reservationID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDList }
     *     
     */
    public UniqueIDList getReservationID() {
        return reservationID;
    }

    /**
     * Sets the value of the reservationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDList }
     *     
     */
    public void setReservationID(UniqueIDList value) {
        this.reservationID = value;
    }

    /**
     * Gets the value of the keyTrack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyTrack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyTrack }
     * 
     * 
     */
    public List<KeyTrack> getKeyTrack() {
        if (keyTrack == null) {
            keyTrack = new ArrayList<KeyTrack>();
        }
        return this.keyTrack;
    }

    /**
     * Gets the value of the guestMessages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestMessages() {
        return guestMessages;
    }

    /**
     * Sets the value of the guestMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestMessages(Integer value) {
        this.guestMessages = value;
    }

}
