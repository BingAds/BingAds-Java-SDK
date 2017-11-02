
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupEstimates" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfAdGroupEstimate" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEstimate", propOrder = {
    "adGroupEstimates",
    "campaignId"
})
public class CampaignEstimate {

    @XmlElement(name = "AdGroupEstimates", nillable = true)
    protected ArrayOfAdGroupEstimate adGroupEstimates;
    @XmlElement(name = "CampaignId", nillable = true)
    protected Long campaignId;

    /**
     * Gets the value of the adGroupEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupEstimate }
     *     
     */
    public ArrayOfAdGroupEstimate getAdGroupEstimates() {
        return adGroupEstimates;
    }

    /**
     * Sets the value of the adGroupEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupEstimate }
     *     
     */
    public void setAdGroupEstimates(ArrayOfAdGroupEstimate value) {
        this.adGroupEstimates = value;
    }

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

}
