
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Recommendation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CurrentClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CurrentConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CurrentCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="CurrentImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="EstimatedIncreaseInImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="RecommendationHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecommendationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecommendationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recommendation", propOrder = {
    "type",
    "accountId",
    "adGroupId",
    "campaignId",
    "currentClicks",
    "currentConversions",
    "currentCost",
    "currentImpressions",
    "estimatedIncreaseInClicks",
    "estimatedIncreaseInConversions",
    "estimatedIncreaseInCost",
    "estimatedIncreaseInImpressions",
    "recommendationHash",
    "recommendationId",
    "recommendationType"
})
@XmlSeeAlso({
    ResponsiveSearchAdsRecommendation.class
})
public class Recommendation {
    protected String type;

    public String getType() {
        return type;
    }
    public void setType(String value) {

    }

    public Recommendation() {
        this.type = "Recommendation";
    }

    protected Long accountId;
    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "CampaignId", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "CurrentClicks")
    protected Long currentClicks;
    @XmlElement(name = "CurrentConversions")
    protected Long currentConversions;
    @XmlElement(name = "CurrentCost")
    protected Double currentCost;
    @XmlElement(name = "CurrentImpressions")
    protected Long currentImpressions;
    @XmlElement(name = "EstimatedIncreaseInClicks")
    protected Long estimatedIncreaseInClicks;
    @XmlElement(name = "EstimatedIncreaseInConversions")
    protected Long estimatedIncreaseInConversions;
    @XmlElement(name = "EstimatedIncreaseInCost")
    protected Double estimatedIncreaseInCost;
    @XmlElement(name = "EstimatedIncreaseInImpressions")
    protected Long estimatedIncreaseInImpressions;
    @XmlElement(name = "RecommendationHash", nillable = true)
    protected String recommendationHash;
    @XmlElement(name = "RecommendationId", nillable = true)
    protected String recommendationId;
    @XmlElement(name = "RecommendationType", nillable = true)
    protected String recommendationType;

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
     * Gets the value of the currentClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentClicks() {
        return currentClicks;
    }

    /**
     * Sets the value of the currentClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentClicks(Long value) {
        this.currentClicks = value;
    }

    /**
     * Gets the value of the currentConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentConversions() {
        return currentConversions;
    }

    /**
     * Sets the value of the currentConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentConversions(Long value) {
        this.currentConversions = value;
    }

    /**
     * Gets the value of the currentCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentCost() {
        return currentCost;
    }

    /**
     * Sets the value of the currentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentCost(Double value) {
        this.currentCost = value;
    }

    /**
     * Gets the value of the currentImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCurrentImpressions() {
        return currentImpressions;
    }

    /**
     * Sets the value of the currentImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCurrentImpressions(Long value) {
        this.currentImpressions = value;
    }

    /**
     * Gets the value of the estimatedIncreaseInClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedIncreaseInClicks() {
        return estimatedIncreaseInClicks;
    }

    /**
     * Sets the value of the estimatedIncreaseInClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedIncreaseInClicks(Long value) {
        this.estimatedIncreaseInClicks = value;
    }

    /**
     * Gets the value of the estimatedIncreaseInConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedIncreaseInConversions() {
        return estimatedIncreaseInConversions;
    }

    /**
     * Sets the value of the estimatedIncreaseInConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedIncreaseInConversions(Long value) {
        this.estimatedIncreaseInConversions = value;
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
     * Gets the value of the recommendationHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationHash() {
        return recommendationHash;
    }

    /**
     * Sets the value of the recommendationHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationHash(String value) {
        this.recommendationHash = value;
    }

    /**
     * Gets the value of the recommendationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * Sets the value of the recommendationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationId(String value) {
        this.recommendationId = value;
    }

    /**
     * Gets the value of the recommendationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationType() {
        return recommendationType;
    }

    /**
     * Sets the value of the recommendationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationType(String value) {
        this.recommendationType = value;
    }

}
