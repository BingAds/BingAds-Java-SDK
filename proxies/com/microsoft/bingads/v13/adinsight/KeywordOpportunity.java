
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordOpportunity">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}Opportunity">
 *       <sequence>
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Competition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MonthlySearches" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SuggestedBid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="SuggestedKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordOpportunity", propOrder = {
    "adGroupId",
    "adGroupName",
    "campaignId",
    "campaignName",
    "competition",
    "estimatedIncreaseInClicks",
    "estimatedIncreaseInCost",
    "estimatedIncreaseInImpressions",
    "matchType",
    "monthlySearches",
    "suggestedBid",
    "suggestedKeyword"
})
@XmlSeeAlso({
    BroadMatchKeywordOpportunity.class
})
public class KeywordOpportunity
    extends Opportunity
{

    @XmlElement(name = "AdGroupId")
    protected Long adGroupId;
    @XmlElement(name = "AdGroupName", nillable = true)
    protected String adGroupName;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "CampaignName", nillable = true)
    protected String campaignName;
    @XmlElement(name = "Competition")
    protected Double competition;
    @XmlElement(name = "EstimatedIncreaseInClicks")
    protected Double estimatedIncreaseInClicks;
    @XmlElement(name = "EstimatedIncreaseInCost")
    protected Double estimatedIncreaseInCost;
    @XmlElement(name = "EstimatedIncreaseInImpressions")
    protected Long estimatedIncreaseInImpressions;
    @XmlElement(name = "MatchType")
    protected Integer matchType;
    @XmlElement(name = "MonthlySearches")
    protected Long monthlySearches;
    @XmlElement(name = "SuggestedBid")
    protected Double suggestedBid;
    @XmlElement(name = "SuggestedKeyword", nillable = true)
    protected String suggestedKeyword;

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

}
