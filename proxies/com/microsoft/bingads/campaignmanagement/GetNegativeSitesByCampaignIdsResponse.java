
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
 *         &lt;element name="CampaignNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfCampaignNegativeSites" minOccurs="0"/>
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
    "campaignNegativeSites"
})
@XmlRootElement(name = "GetNegativeSitesByCampaignIdsResponse")
public class GetNegativeSitesByCampaignIdsResponse {

    @XmlElement(name = "CampaignNegativeSites", nillable = true)
    protected ArrayOfCampaignNegativeSites campaignNegativeSites;

    /**
     * Gets the value of the campaignNegativeSites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignNegativeSites }
     *     
     */
    public ArrayOfCampaignNegativeSites getCampaignNegativeSites() {
        return campaignNegativeSites;
    }

    /**
     * Sets the value of the campaignNegativeSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignNegativeSites }
     *     
     */
    public void setCampaignNegativeSites(ArrayOfCampaignNegativeSites value) {
        this.campaignNegativeSites = value;
    }

}
