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
 *         &lt;element name="HotelReference" type="{http://webservices.micros.com/og/4.3/HotelCommon/}HotelReference"/>
 *         &lt;element name="ResvNameId" type="{http://webservices.micros.com/og/4.3/Common/}UniqueID"/>
 *         &lt;element name="StationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "hotelReference",
    "resvNameId",
    "stationID"
})
@XmlRootElement(name = "ReleaseRoomAdvRequest", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class ReleaseRoomAdvRequest {

    @XmlElement(name = "HotelReference", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected HotelReference hotelReference;
    @XmlElement(name = "ResvNameId", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected UniqueID resvNameId;
    @XmlElement(name = "StationID", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected String stationID;

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
     * Gets the value of the resvNameId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueID }
     *     
     */
    public UniqueID getResvNameId() {
        return resvNameId;
    }

    /**
     * Sets the value of the resvNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueID }
     *     
     */
    public void setResvNameId(UniqueID value) {
        this.resvNameId = value;
    }

    /**
     * Gets the value of the stationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationID() {
        return stationID;
    }

    /**
     * Sets the value of the stationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationID(String value) {
        this.stationID = value;
    }

}
