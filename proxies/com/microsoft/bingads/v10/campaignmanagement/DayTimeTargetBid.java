
package com.microsoft.bingads.v10.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTimeTargetBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayTimeTargetBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Day" type="{https://bingads.microsoft.com/CampaignManagement/v10}Day"/>
 *         &lt;element name="FromHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FromMinute" type="{https://bingads.microsoft.com/CampaignManagement/v10}Minute"/>
 *         &lt;element name="ToHour" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ToMinute" type="{https://bingads.microsoft.com/CampaignManagement/v10}Minute"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTimeTargetBid", propOrder = {
    "bidAdjustment",
    "day",
    "fromHour",
    "fromMinute",
    "toHour",
    "toMinute"
})
public class DayTimeTargetBid {

    @XmlElement(name = "BidAdjustment")
    protected int bidAdjustment;
    @XmlElement(name = "Day", required = true)
    @XmlSchemaType(name = "string")
    protected Day day;
    @XmlElement(name = "FromHour")
    protected int fromHour;
    @XmlElement(name = "FromMinute", required = true)
    @XmlSchemaType(name = "string")
    protected Minute fromMinute;
    @XmlElement(name = "ToHour")
    protected int toHour;
    @XmlElement(name = "ToMinute", required = true)
    @XmlSchemaType(name = "string")
    protected Minute toMinute;

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
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link Day }
     *     
     */
    public Day getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link Day }
     *     
     */
    public void setDay(Day value) {
        this.day = value;
    }

    /**
     * Gets the value of the fromHour property.
     * 
     */
    public int getFromHour() {
        return fromHour;
    }

    /**
     * Sets the value of the fromHour property.
     * 
     */
    public void setFromHour(int value) {
        this.fromHour = value;
    }

    /**
     * Gets the value of the fromMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getFromMinute() {
        return fromMinute;
    }

    /**
     * Sets the value of the fromMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setFromMinute(Minute value) {
        this.fromMinute = value;
    }

    /**
     * Gets the value of the toHour property.
     * 
     */
    public int getToHour() {
        return toHour;
    }

    /**
     * Sets the value of the toHour property.
     * 
     */
    public void setToHour(int value) {
        this.toHour = value;
    }

    /**
     * Gets the value of the toMinute property.
     * 
     * @return
     *     possible object is
     *     {@link Minute }
     *     
     */
    public Minute getToMinute() {
        return toMinute;
    }

    /**
     * Sets the value of the toMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minute }
     *     
     */
    public void setToMinute(Minute value) {
        this.toMinute = value;
    }

}
