
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HourTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Hour" type="{https://bingads.microsoft.com/CampaignManagement/v9}HourRange"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourTargetBid", propOrder = {
    "bidAdjustment",
    "hour"
})
public class HourTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "Hour", required = true)
    @XmlSchemaType(name = "string")
    protected HourRange hour;

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
     * Gets the value of the hour property.
     * 
     * @return
     *     possible object is
     *     {@link HourRange }
     *     
     */
    public HourRange getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     * 
     * @param value
     *     allowed object is
     *     {@link HourRange }
     *     
     */
    public void setHour(HourRange value) {
        this.hour = value;
    }

}
