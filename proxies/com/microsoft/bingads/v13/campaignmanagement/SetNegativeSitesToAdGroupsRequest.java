
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupNegativeSites" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroupNegativeSites" minOccurs="0"/>
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
    "campaignId",
    "adGroupNegativeSites"
})
@XmlRootElement(name = "SetNegativeSitesToAdGroupsRequest")
public class SetNegativeSitesToAdGroupsRequest {

    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "AdGroupNegativeSites", nillable = true)
    protected ArrayOfAdGroupNegativeSites adGroupNegativeSites;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adGroupNegativeSites property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupNegativeSites }
     *     
     */
    public ArrayOfAdGroupNegativeSites getAdGroupNegativeSites() {
        return adGroupNegativeSites;
    }

    /**
     * Sets the value of the adGroupNegativeSites property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupNegativeSites }
     *     
     */
    public void setAdGroupNegativeSites(ArrayOfAdGroupNegativeSites value) {
        this.adGroupNegativeSites = value;
    }

}
