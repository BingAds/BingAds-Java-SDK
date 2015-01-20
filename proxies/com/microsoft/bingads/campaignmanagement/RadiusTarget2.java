
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusTarget2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadiusTarget2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bids" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfRadiusTargetBid2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusTarget2", propOrder = {
    "bids"
})
public class RadiusTarget2 {

    @XmlElement(name = "Bids", required = true, nillable = true)
    protected ArrayOfRadiusTargetBid2 bids;

    /**
     * Gets the value of the bids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRadiusTargetBid2 }
     *     
     */
    public ArrayOfRadiusTargetBid2 getBids() {
        return bids;
    }

    /**
     * Sets the value of the bids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRadiusTargetBid2 }
     *     
     */
    public void setBids(ArrayOfRadiusTargetBid2 value) {
        this.bids = value;
    }

}
