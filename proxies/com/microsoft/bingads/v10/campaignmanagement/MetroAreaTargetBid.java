
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetroAreaTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetroAreaTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MetroArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetroAreaTargetBid", propOrder = {
    "bidAdjustment",
    "isExcluded",
    "metroArea"
})
public class MetroAreaTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "IsExcluded")
    protected boolean isExcluded;
    @XmlElement(name = "MetroArea", required = true, nillable = true)
    protected String metroArea;

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

    /**
     * Gets the value of the metroArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetroArea() {
        return metroArea;
    }

    /**
     * Sets the value of the metroArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetroArea(String value) {
        this.metroArea = value;
    }

}
