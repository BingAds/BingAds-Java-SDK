
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignBudgetLandscapes" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfCampaignBudgetLandscape" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignBudgetLandscapes"
})
@XmlRootElement(name = "GetBudgetLandscapeResponse", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class GetBudgetLandscapeResponse {

    @XmlElement(name = "CampaignBudgetLandscapes", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected ArrayOfCampaignBudgetLandscape campaignBudgetLandscapes;

    /**
     * Gets the value of the campaignBudgetLandscapes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignBudgetLandscape }
     *     
     */
    public ArrayOfCampaignBudgetLandscape getCampaignBudgetLandscapes() {
        return campaignBudgetLandscapes;
    }

    /**
     * Sets the value of the campaignBudgetLandscapes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignBudgetLandscape }
     *     
     */
    public void setCampaignBudgetLandscapes(ArrayOfCampaignBudgetLandscape value) {
        this.campaignBudgetLandscapes = value;
    }

}
