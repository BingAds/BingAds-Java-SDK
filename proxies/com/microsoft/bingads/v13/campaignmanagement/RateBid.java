
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateBid">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionBid">
 *       <sequence>
 *         <element name="RateAmount" type="{https://bingads.microsoft.com/CampaignManagement/v13}RateAmount" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateBid", propOrder = {
    "rateAmount"
})
public class RateBid
    extends CriterionBid
{

    @XmlElement(name = "RateAmount", nillable = true)
    protected RateAmount rateAmount;

    /**
     * Gets the value of the rateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link RateAmount }
     *     
     */
    public RateAmount getRateAmount() {
        return rateAmount;
    }

    /**
     * Sets the value of the rateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAmount }
     *     
     */
    public void setRateAmount(RateAmount value) {
        this.rateAmount = value;
    }

}
