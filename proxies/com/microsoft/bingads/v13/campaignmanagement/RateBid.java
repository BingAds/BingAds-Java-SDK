
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateBid">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionBid">
 *       &lt;sequence>
 *         &lt;element name="RateAmount" type="{https://bingads.microsoft.com/CampaignManagement/v13}RateAmount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
