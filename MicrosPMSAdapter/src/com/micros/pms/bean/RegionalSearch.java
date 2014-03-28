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
 * Defines the geographic boundaries within which to search for available hotels.
 * 
 * <p>Java class for RegionalSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GeoSearch" type="{http://webservices.micros.com/og/4.3/HotelCommon/}GeoPosition"/>
 *         &lt;element name="CitySearch" type="{http://webservices.micros.com/og/4.3/Availability/}CityCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalSearch", namespace = "http://webservices.micros.com/og/4.3/Availability/", propOrder = {
    "geoSearch",
    "citySearch"
})
public class RegionalSearch {

    @XmlElement(name = "GeoSearch", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected GeoPosition geoSearch;
    @XmlElement(name = "CitySearch", namespace = "http://webservices.micros.com/og/4.3/Availability/")
    protected CityCode citySearch;

    /**
     * Gets the value of the geoSearch property.
     * 
     * @return
     *     possible object is
     *     {@link GeoPosition }
     *     
     */
    public GeoPosition getGeoSearch() {
        return geoSearch;
    }

    /**
     * Sets the value of the geoSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoPosition }
     *     
     */
    public void setGeoSearch(GeoPosition value) {
        this.geoSearch = value;
    }

    /**
     * Gets the value of the citySearch property.
     * 
     * @return
     *     possible object is
     *     {@link CityCode }
     *     
     */
    public CityCode getCitySearch() {
        return citySearch;
    }

    /**
     * Sets the value of the citySearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityCode }
     *     
     */
    public void setCitySearch(CityCode value) {
        this.citySearch = value;
    }

}
