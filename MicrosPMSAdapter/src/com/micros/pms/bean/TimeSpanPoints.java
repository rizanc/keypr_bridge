//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 06:33:28 PM IST 
//


package com.micros.pms.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSpanPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSpanPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Dates" type="{http://webservices.micros.com/og/4.3/HotelCommon/}TimeSpan"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSpanPoints", propOrder = {

})
public class TimeSpanPoints {

    @XmlElement(name = "Dates", required = true)
    protected TimeSpan dates;
    @XmlElement(name = "Points")
    protected int points;

    /**
     * Gets the value of the dates property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSpan }
     *     
     */
    public TimeSpan getDates() {
        return dates;
    }

    /**
     * Sets the value of the dates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSpan }
     *     
     */
    public void setDates(TimeSpan value) {
        this.dates = value;
    }

    /**
     * Gets the value of the points property.
     * 
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     */
    public void setPoints(int value) {
        this.points = value;
    }

}
