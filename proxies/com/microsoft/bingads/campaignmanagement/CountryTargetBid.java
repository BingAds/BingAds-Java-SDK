
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CountryAndRegion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "CountryTargetBid", propOrder = {
    "bidAdjustment",
    "countryAndRegion",
    "isExcluded"
})
public class CountryTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "CountryAndRegion", required = true, nillable = true)
    protected String countryAndRegion;
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
     * Gets the value of the countryAndRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAndRegion() {
        return countryAndRegion;
    }

    /**
     * Sets the value of the countryAndRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAndRegion(String value) {
        this.countryAndRegion = value;
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
