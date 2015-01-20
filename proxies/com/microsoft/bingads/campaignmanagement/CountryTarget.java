
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CountryTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bids" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfCountryTargetBid"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryTarget", propOrder = {
    "bids"
})
public class CountryTarget {

    @XmlElement(name = "Bids", required = true, nillable = true)
    protected ArrayOfCountryTargetBid bids;

    /**
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryTargetBid }
     *     
     */
    public ArrayOfCountryTargetBid getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryTargetBid }
     *     
     */
    public void setBids(ArrayOfCountryTargetBid value) {
        this.bids = value;
    }

}
