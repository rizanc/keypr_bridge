//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.21 at 06:33:28 PM IST 
//


package com.micros.pms.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpgradeAwardList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpgradeAwardList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpgradeAwardInfo" type="{http://webservices.micros.com/og/4.3/Membership/}UpgradeAward" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpgradeAwardList", namespace = "http://webservices.micros.com/og/4.3/Membership/", propOrder = {
    "upgradeAwardInfo"
})
public class UpgradeAwardList {

    @XmlElement(name = "UpgradeAwardInfo", namespace = "http://webservices.micros.com/og/4.3/Membership/", required = true)
    protected List<UpgradeAward> upgradeAwardInfo;

    /**
     * Gets the value of the upgradeAwardInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upgradeAwardInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpgradeAwardInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpgradeAward }
     * 
     * 
     */
    public List<UpgradeAward> getUpgradeAwardInfo() {
        if (upgradeAwardInfo == null) {
            upgradeAwardInfo = new ArrayList<UpgradeAward>();
        }
        return this.upgradeAwardInfo;
    }

}