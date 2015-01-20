
package com.microsoft.bingads.optimizer;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IncludeEstimations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpportunityType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}KeywordOpportunityType" minOccurs="0"/>
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
    "accountId",
    "adGroupId",
    "campaignId",
    "includeEstimations",
    "opportunityType"
})
@XmlRootElement(name = "GetKeywordOpportunitiesRequest", namespace = "https://bingads.microsoft.com/Optimizer/v9")
public class GetKeywordOpportunitiesRequest {

    @XmlElement(name = "AccountId", namespace = "https://bingads.microsoft.com/Optimizer/v9")
    protected Long accountId;
    @XmlElement(name = "AdGroupId", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "CampaignId", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "IncludeEstimations", namespace = "https://bingads.microsoft.com/Optimizer/v9", nillable = true)
    protected Boolean includeEstimations;
    @XmlElement(name = "OpportunityType", namespace = "https://bingads.microsoft.com/Optimizer/v9", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<KeywordOpportunityType> opportunityType;

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
     * Gets the value of the includeEstimations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeEstimations() {
        return includeEstimations;
    }

    /**
     * Sets the value of the includeEstimations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEstimations(Boolean value) {
        this.includeEstimations = value;
    }

    /**
     * Gets the value of the opportunityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public List<KeywordOpportunityType> getOpportunityType() {
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
    public void setOpportunityType(List<KeywordOpportunityType> value) {
        this.opportunityType = value;
    }

}
