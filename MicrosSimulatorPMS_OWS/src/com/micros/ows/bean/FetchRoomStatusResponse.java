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
 *         &lt;element name="RoomStatus" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://webservices.micros.com/og/4.3/Common/}ResultStatus"/>
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
    "roomStatus",
    "result"
})
@XmlRootElement(name = "FetchRoomStatusResponse", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
public class FetchRoomStatusResponse {

    @XmlElement(name = "RoomStatus", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/")
    protected List<RoomStatus> roomStatus;
    @XmlElement(name = "Result", namespace = "http://webservices.micros.com/og/4.3/ResvAdvanced/", required = true)
    protected ResultStatus result;

    /**
     * Gets the value of the roomStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomStatus }
     * 
     * 
     */
    public List<RoomStatus> getRoomStatus() {
        if (roomStatus == null) {
            roomStatus = new ArrayList<RoomStatus>();
        }
        return this.roomStatus;
    }

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

}
