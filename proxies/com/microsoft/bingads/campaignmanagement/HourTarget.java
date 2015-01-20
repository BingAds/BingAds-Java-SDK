
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HourTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HourTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bids" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfHourTargetBid"/>
 *         &lt;element name="TargetAllHours" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourTarget", propOrder = {
    "bids",
    "targetAllHours"
})
public class HourTarget {

    @XmlElement(name = "Bids", required = true, nillable = true)
    protected ArrayOfHourTargetBid bids;
    @XmlElement(name = "TargetAllHours")
    protected Boolean targetAllHours;

    /**
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHourTargetBid }
     *     
     */
    public ArrayOfHourTargetBid getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHourTargetBid }
     *     
     */
    public void setBids(ArrayOfHourTargetBid value) {
        this.bids = value;
    }

    /**
     * Gets the value of the targetAllHours property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getTargetAllHours() {
        return targetAllHours;
    }

    /**
     * Sets the value of the targetAllHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTargetAllHours(Boolean value) {
        this.targetAllHours = value;
    }

}
