
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignNegativeSites" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountId",
    "campaignNegativeSites"
})
@XmlRootElement(name = "SetNegativeSitesToCampaignsRequest")
public class SetNegativeSitesToCampaignsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "CampaignNegativeSites", nillable = true)
    protected ArrayOfCampaignNegativeSites campaignNegativeSites;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

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
