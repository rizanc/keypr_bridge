//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 06:33:28 PM IST 
//


package com.micros.pms.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RoomStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoomStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Features" type="{http://webservices.micros.com/og/4.3/HotelCommon/}RoomFeatureList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FrontOfficeStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HouseKeepingInspectionFlag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HouseKeepingStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NextReservationDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="OccupancyCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RoomStatusFromDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RoomStatusToDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RoomType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TurnDownYn" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomStatus", propOrder = {
    "features"
})
public class RoomStatus {

    @XmlElement(name = "Features")
    protected RoomFeatureList features;
    @XmlAttribute(name = "FrontOfficeStatus", required = true)
    protected String frontOfficeStatus;
    @XmlAttribute(name = "HouseKeepingInspectionFlag")
    protected String houseKeepingInspectionFlag;
    @XmlAttribute(name = "HouseKeepingStatus", required = true)
    protected String houseKeepingStatus;
    @XmlAttribute(name = "NextReservationDate")
    protected XMLGregorianCalendar nextReservationDate;
    @XmlAttribute(name = "OccupancyCondition")
    protected String occupancyCondition;
    @XmlAttribute(name = "ReservationStatus")
    protected String reservationStatus;
    @XmlAttribute(name = "RoomClass")
    protected String roomClass;
    @XmlAttribute(name = "RoomNumber", required = true)
    protected String roomNumber;
    @XmlAttribute(name = "RoomStatus", required = true)
    protected String roomStatus;
    @XmlAttribute(name = "RoomStatusFromDate")
    protected XMLGregorianCalendar roomStatusFromDate;
    @XmlAttribute(name = "RoomStatusToDate")
    protected XMLGregorianCalendar roomStatusToDate;
    @XmlAttribute(name = "RoomType", required = true)
    protected String roomType;
    @XmlAttribute(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlAttribute(name = "TurnDownYn")
    protected String turnDownYn;

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link RoomFeatureList }
     *     
     */
    public RoomFeatureList getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomFeatureList }
     *     
     */
    public void setFeatures(RoomFeatureList value) {
        this.features = value;
    }

    /**
     * Gets the value of the frontOfficeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrontOfficeStatus() {
        return frontOfficeStatus;
    }

    /**
     * Sets the value of the frontOfficeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrontOfficeStatus(String value) {
        this.frontOfficeStatus = value;
    }

    /**
     * Gets the value of the houseKeepingInspectionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseKeepingInspectionFlag() {
        return houseKeepingInspectionFlag;
    }

    /**
     * Sets the value of the houseKeepingInspectionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseKeepingInspectionFlag(String value) {
        this.houseKeepingInspectionFlag = value;
    }

    /**
     * Gets the value of the houseKeepingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseKeepingStatus() {
        return houseKeepingStatus;
    }

    /**
     * Sets the value of the houseKeepingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseKeepingStatus(String value) {
        this.houseKeepingStatus = value;
    }

    /**
     * Gets the value of the nextReservationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextReservationDate() {
        return nextReservationDate;
    }

    /**
     * Sets the value of the nextReservationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextReservationDate(XMLGregorianCalendar value) {
        this.nextReservationDate = value;
    }

    /**
     * Gets the value of the occupancyCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupancyCondition() {
        return occupancyCondition;
    }

    /**
     * Sets the value of the occupancyCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupancyCondition(String value) {
        this.occupancyCondition = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationStatus(String value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the roomClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomClass() {
        return roomClass;
    }

    /**
     * Sets the value of the roomClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomClass(String value) {
        this.roomClass = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the roomStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomStatus() {
        return roomStatus;
    }

    /**
     * Sets the value of the roomStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomStatus(String value) {
        this.roomStatus = value;
    }

    /**
     * Gets the value of the roomStatusFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRoomStatusFromDate() {
        return roomStatusFromDate;
    }

    /**
     * Sets the value of the roomStatusFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRoomStatusFromDate(XMLGregorianCalendar value) {
        this.roomStatusFromDate = value;
    }

    /**
     * Gets the value of the roomStatusToDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRoomStatusToDate() {
        return roomStatusToDate;
    }

    /**
     * Sets the value of the roomStatusToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRoomStatusToDate(XMLGregorianCalendar value) {
        this.roomStatusToDate = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the turnDownYn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnDownYn() {
        return turnDownYn;
    }

    /**
     * Sets the value of the turnDownYn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnDownYn(String value) {
        this.turnDownYn = value;
    }

}