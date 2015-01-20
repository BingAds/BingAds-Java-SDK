
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CityTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CityTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityTargetBid", propOrder = {
    "bidAdjustment",
    "city",
    "isExcluded"
})
public class CityTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "City", required = true, nillable = true)
    protected String city;
    @XmlElement(name = "IsExcluded")
    protected boolean isExcluded;

    /**
     * Gets the value of the bidAdjustment property.
     * 
     */
    public int getBidAdjustment() {
        return bidAdjustment;
    }

    /**
     * Sets the value of the bidAdjustment property.
     * 
     */
    public void setBidAdjustment(int value) {
        this.bidAdjustment = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the isExcluded property.
     * 
     */
    public boolean isIsExcluded() {
        return isExcluded;
    }

    /**
     * Sets the value of the isExcluded property.
     * 
     */
    public void setIsExcluded(boolean value) {
        this.isExcluded = value;
    }

}
