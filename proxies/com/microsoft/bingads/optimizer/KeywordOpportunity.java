
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordOpportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}Opportunity">
 *       &lt;sequence>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Competition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MonthlySearches" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SuggestedKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageCPC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AverageCTR" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ClickShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedIncreaseInClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedIncreaseInCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedIncreaseInImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordOpportunity", propOrder = {
    "adGroupId",
    "campaignId",
    "competition",
    "matchType",
    "monthlySearches",
    "suggestedBid",
    "suggestedKeyword",
    "averageCPC",
    "averageCTR",
    "clickShare",
    "estimatedIncreaseInClicks",
    "estimatedIncreaseInCost",
    "estimatedIncreaseInImpressions"
})
@XmlSeeAlso({
    BroadMatchKeywordOpportunity.class
})
public class KeywordOpportunity
    extends Opportunity
{

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "Competition")
    protected Double competition;
    @XmlElement(name = "MatchType")
    protected Integer matchType;
    @XmlElement(name = "MonthlySearches")
    protected Long monthlySearches;
    @XmlElement(name = "SuggestedBid")
    protected Double suggestedBid;
    @XmlElement(name = "SuggestedKeyword", nillable = true)
    protected String suggestedKeyword;
    @XmlElement(name = "AverageCPC", nillable = true)
    protected Double averageCPC;
    @XmlElement(name = "AverageCTR", nillable = true)
    protected Double averageCTR;
    @XmlElement(name = "ClickShare", nillable = true)
    protected Double clickShare;
    @XmlElement(name = "EstimatedIncreaseInClicks", nillable = true)
    protected Double estimatedIncreaseInClicks;
    @XmlElement(name = "EstimatedIncreaseInCost", nillable = true)
    protected Double estimatedIncreaseInCost;
    @XmlElement(name = "EstimatedIncreaseInImpressions", nillable = true)
    protected Long estimatedIncreaseInImpressions;

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
     * Gets the value of the competition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCompetition() {
        return competition;
    }

    /**
     * Sets the value of the competition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCompetition(Double value) {
        this.competition = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMatchType(Integer value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the monthlySearches property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMonthlySearches() {
        return monthlySearches;
    }

    /**
     * Sets the value of the monthlySearches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMonthlySearches(Long value) {
        this.monthlySearches = value;
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

    /**
     * Gets the value of the suggestedKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedKeyword() {
        return suggestedKeyword;
    }

    /**
     * Sets the value of the suggestedKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedKeyword(String value) {
        this.suggestedKeyword = value;
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
     * Gets the value of the estimatedIncreaseInClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedIncreaseInClicks() {
        return estimatedIncreaseInClicks;
    }

    /**
     * Sets the value of the estimatedIncreaseInClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedIncreaseInClicks(Double value) {
        this.estimatedIncreaseInClicks = value;
    }

    /**
     * Gets the value of the estimatedIncreaseInCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedIncreaseInCost() {
        return estimatedIncreaseInCost;
    }

    /**
     * Sets the value of the estimatedIncreaseInCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedIncreaseInCost(Double value) {
        this.estimatedIncreaseInCost = value;
    }

    /**
     * Gets the value of the estimatedIncreaseInImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedIncreaseInImpressions() {
        return estimatedIncreaseInImpressions;
    }

    /**
     * Sets the value of the estimatedIncreaseInImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedIncreaseInImpressions(Long value) {
        this.estimatedIncreaseInImpressions = value;
    }

}
