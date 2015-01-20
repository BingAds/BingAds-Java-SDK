
package com.microsoft.bingads.campaignmanagement;

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
 *         &lt;element name="CampaignNegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfCampaignNegativeKeywords" minOccurs="0"/>
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
    "campaignNegativeKeywords"
})
@XmlRootElement(name = "GetNegativeKeywordsByCampaignIdsResponse")
public class GetNegativeKeywordsByCampaignIdsResponse {

    @XmlElement(name = "CampaignNegativeKeywords", nillable = true)
    protected ArrayOfCampaignNegativeKeywords campaignNegativeKeywords;

    /**
     * Gets the value of the campaignNegativeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignNegativeKeywords }
     *     
     */
    public ArrayOfCampaignNegativeKeywords getCampaignNegativeKeywords() {
        return campaignNegativeKeywords;
    }

    /**
     * Sets the value of the campaignNegativeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignNegativeKeywords }
     *     
     */
    public void setCampaignNegativeKeywords(ArrayOfCampaignNegativeKeywords value) {
        this.campaignNegativeKeywords = value;
    }

}
