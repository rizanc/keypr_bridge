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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InventoryItemElements" type="{http://webservices.micros.com/og/4.3/HotelCommon/}InventoryItemElementList" minOccurs="0"/>
 *         &lt;element name="PackageDetails" type="{http://webservices.micros.com/og/4.3/HotelCommon/}PackageDetailList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetail", propOrder = {
    "inventoryItemElements",
    "packageDetails"
})
public class ItemDetail {

    @XmlElement(name = "InventoryItemElements")
    protected InventoryItemElementList inventoryItemElements;
    @XmlElement(name = "PackageDetails", required = true)
    protected PackageDetailList packageDetails;

    /**
     * Gets the value of the inventoryItemElements property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryItemElementList }
     *     
     */
    public InventoryItemElementList getInventoryItemElements() {
        return inventoryItemElements;
    }

    /**
     * Sets the value of the inventoryItemElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryItemElementList }
     *     
     */
    public void setInventoryItemElements(InventoryItemElementList value) {
        this.inventoryItemElements = value;
    }

    /**
     * Gets the value of the packageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PackageDetailList }
     *     
     */
    public PackageDetailList getPackageDetails() {
        return packageDetails;
    }

    /**
     * Sets the value of the packageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageDetailList }
     *     
     */
    public void setPackageDetails(PackageDetailList value) {
        this.packageDetails = value;
    }

}
