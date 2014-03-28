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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeetingSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FunctionSpaceArea" type="{http://webservices.micros.com/og/4.3/HotelCommon/}Area" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="meetingFeature" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numberOfAttendees" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="numberOfFunctionSpace" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="numberOfSleepingRooms" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="setupStyle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingSearch", propOrder = {
    "functionSpaceArea"
})
public class MeetingSearch {

    @XmlElement(name = "FunctionSpaceArea")
    protected Area functionSpaceArea;
    @XmlAttribute(required = true)
    protected String meetingFeature;
    @XmlAttribute(required = true)
    protected int numberOfAttendees;
    @XmlAttribute
    protected Integer numberOfFunctionSpace;
    @XmlAttribute
    protected Integer numberOfSleepingRooms;
    @XmlAttribute
    protected String setupStyle;

    /**
     * Gets the value of the functionSpaceArea property.
     * 
     * @return
     *     possible object is
     *     {@link Area }
     *     
     */
    public Area getFunctionSpaceArea() {
        return functionSpaceArea;
    }

    /**
     * Sets the value of the functionSpaceArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Area }
     *     
     */
    public void setFunctionSpaceArea(Area value) {
        this.functionSpaceArea = value;
    }

    /**
     * Gets the value of the meetingFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingFeature() {
        return meetingFeature;
    }

    /**
     * Sets the value of the meetingFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingFeature(String value) {
        this.meetingFeature = value;
    }

    /**
     * Gets the value of the numberOfAttendees property.
     * 
     */
    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    /**
     * Sets the value of the numberOfAttendees property.
     * 
     */
    public void setNumberOfAttendees(int value) {
        this.numberOfAttendees = value;
    }

    /**
     * Gets the value of the numberOfFunctionSpace property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfFunctionSpace() {
        return numberOfFunctionSpace;
    }

    /**
     * Sets the value of the numberOfFunctionSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfFunctionSpace(Integer value) {
        this.numberOfFunctionSpace = value;
    }

    /**
     * Gets the value of the numberOfSleepingRooms property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfSleepingRooms() {
        return numberOfSleepingRooms;
    }

    /**
     * Sets the value of the numberOfSleepingRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfSleepingRooms(Integer value) {
        this.numberOfSleepingRooms = value;
    }

    /**
     * Gets the value of the setupStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupStyle() {
        return setupStyle;
    }

    /**
     * Sets the value of the setupStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupStyle(String value) {
        this.setupStyle = value;
    }

}
