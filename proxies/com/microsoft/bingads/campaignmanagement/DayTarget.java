
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bids" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfDayTargetBid"/>
 *         &lt;element name="TargetAllDays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayTarget", propOrder = {
    "bids",
    "targetAllDays"
})
public class DayTarget {

    @XmlElement(name = "Bids", required = true, nillable = true)
    protected ArrayOfDayTargetBid bids;
    @XmlElement(name = "TargetAllDays")
    protected Boolean targetAllDays;

    /**
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDayTargetBid }
     *     
     */
    public ArrayOfDayTargetBid getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDayTargetBid }
     *     
     */
    public void setBids(ArrayOfDayTargetBid value) {
        this.bids = value;
    }

    /**
     * Gets the value of the targetAllDays property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTargetAllDays() {
        return targetAllDays;
    }

    /**
     * Sets the value of the targetAllDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetAllDays(Boolean value) {
        this.targetAllDays = value;
    }

}
