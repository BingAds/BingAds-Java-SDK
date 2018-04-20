
package com.microsoft.bingads.v12.adinsight;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OpportunityType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}BidOpportunityType" minOccurs="0"/>
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
    "adGroupId",
    "campaignId",
    "opportunityType"
})
@XmlRootElement(name = "GetBidOpportunitiesRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
public class GetBidOpportunitiesRequest {

    @XmlElement(name = "AdGroupId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "CampaignId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "OpportunityType", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<BidOpportunityType> opportunityType;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
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

    /**
     * Gets the value of the opportunityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<BidOpportunityType> getOpportunityType() {
        return opportunityType;
    }

    /**
     * Sets the value of the opportunityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityType(Collection<BidOpportunityType> value) {
        this.opportunityType = value;
    }

}
