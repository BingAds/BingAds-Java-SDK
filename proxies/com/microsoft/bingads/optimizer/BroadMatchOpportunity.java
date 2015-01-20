
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BroadMatchOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BroadMatchOpportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}Opportunity">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageCTR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CPCAdvantage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClickShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Clicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MainLineImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MainLineImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReferenceKeywordMatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BroadMatchOpportunity", propOrder = {
    "accountId",
    "accountName",
    "adGroupId",
    "adGroupName",
    "averageCPC",
    "averageCTR",
    "cpcAdvantage",
    "campaignId",
    "campaignName",
    "clickShare",
    "clicks",
    "impressionShare",
    "impressions",
    "keyword",
    "mainLineImpressionShare",
    "mainLineImpressions",
    "referenceKeywordBid",
    "referenceKeywordId",
    "referenceKeywordMatchType",
    "suggestedBid"
})
public class BroadMatchOpportunity
    extends Opportunity
{

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AccountName", nillable = true)
    protected String accountName;
    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "AdGroupName", nillable = true)
    protected String adGroupName;
    @XmlElement(name = "AverageCPC")
    protected Double averageCPC;
    @XmlElement(name = "AverageCTR")
    protected Double averageCTR;
    @XmlElement(name = "CPCAdvantage")
    protected Double cpcAdvantage;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "CampaignName", nillable = true)
    protected String campaignName;
    @XmlElement(name = "ClickShare")
    protected Double clickShare;
    @XmlElement(name = "Clicks")
    protected Double clicks;
    @XmlElement(name = "ImpressionShare")
    protected Double impressionShare;
    @XmlElement(name = "Impressions")
    protected Long impressions;
    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "MainLineImpressionShare")
    protected Double mainLineImpressionShare;
    @XmlElement(name = "MainLineImpressions")
    protected Long mainLineImpressions;
    @XmlElement(name = "ReferenceKeywordBid")
    protected Double referenceKeywordBid;
    @XmlElement(name = "ReferenceKeywordId")
    protected Long referenceKeywordId;
    @XmlElement(name = "ReferenceKeywordMatchType")
    protected Integer referenceKeywordMatchType;
    @XmlElement(name = "SuggestedBid")
    protected Double suggestedBid;

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
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
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
     * Gets the value of the adGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupName() {
        return adGroupName;
    }

    /**
     * Sets the value of the adGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupName(String value) {
        this.adGroupName = value;
    }

    /**
     * Gets the value of the averageCPC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCPC() {
        return averageCPC;
    }

    /**
     * Sets the value of the averageCPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCPC(Double value) {
        this.averageCPC = value;
    }

    /**
     * Gets the value of the averageCTR property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageCTR() {
        return averageCTR;
    }

    /**
     * Sets the value of the averageCTR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageCTR(Double value) {
        this.averageCTR = value;
    }

    /**
     * Gets the value of the cpcAdvantage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCPCAdvantage() {
        return cpcAdvantage;
    }

    /**
     * Sets the value of the cpcAdvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCPCAdvantage(Double value) {
        this.cpcAdvantage = value;
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
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the clickShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickShare() {
        return clickShare;
    }

    /**
     * Sets the value of the clickShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickShare(Double value) {
        this.clickShare = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClicks(Double value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the impressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImpressionShare() {
        return impressionShare;
    }

    /**
     * Sets the value of the impressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImpressionShare(Double value) {
        this.impressionShare = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the mainLineImpressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMainLineImpressionShare() {
        return mainLineImpressionShare;
    }

    /**
     * Sets the value of the mainLineImpressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMainLineImpressionShare(Double value) {
        this.mainLineImpressionShare = value;
    }

    /**
     * Gets the value of the mainLineImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMainLineImpressions() {
        return mainLineImpressions;
    }

    /**
     * Sets the value of the mainLineImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMainLineImpressions(Long value) {
        this.mainLineImpressions = value;
    }

    /**
     * Gets the value of the referenceKeywordBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReferenceKeywordBid() {
        return referenceKeywordBid;
    }

    /**
     * Sets the value of the referenceKeywordBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReferenceKeywordBid(Double value) {
        this.referenceKeywordBid = value;
    }

    /**
     * Gets the value of the referenceKeywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReferenceKeywordId() {
        return referenceKeywordId;
    }

    /**
     * Sets the value of the referenceKeywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReferenceKeywordId(Long value) {
        this.referenceKeywordId = value;
    }

    /**
     * Gets the value of the referenceKeywordMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceKeywordMatchType() {
        return referenceKeywordMatchType;
    }

    /**
     * Sets the value of the referenceKeywordMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceKeywordMatchType(Integer value) {
        this.referenceKeywordMatchType = value;
    }

    /**
     * Gets the value of the suggestedBid property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuggestedBid() {
        return suggestedBid;
    }

    /**
     * Sets the value of the suggestedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuggestedBid(Double value) {
        this.suggestedBid = value;
    }

}
