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
 * <p>Java class for GuestCountList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestCountList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCount" type="{http://webservices.micros.com/og/4.3/HotelCommon/}GuestCount" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isPerRoom" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestCountList", propOrder = {
    "guestCount"
})
public class GuestCountList {

    @XmlElement(name = "GuestCount", required = true)
    protected List<GuestCount> guestCount;
    @XmlAttribute
    protected Boolean isPerRoom;

    /**
     * Gets the value of the guestCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guestCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuestCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestCount }
     * 
     * 
     */
    public List<GuestCount> getGuestCount() {
        if (guestCount == null) {
            guestCount = new ArrayList<GuestCount>();
        }
        return this.guestCount;
    }

    /**
     * Gets the value of the isPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPerRoom() {
        return isPerRoom;
    }

    /**
     * Sets the value of the isPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPerRoom(Boolean value) {
        this.isPerRoom = value;
    }

}
