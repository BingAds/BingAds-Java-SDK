
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignEstimator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEstimator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupEstimators" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfAdGroupEstimator" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Criteria" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Criterions}ArrayOfCriterion" minOccurs="0"/>
 *         &lt;element name="DailyBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NegativeKeywords" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common}ArrayOfNegativeKeyword" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEstimator", propOrder = {
    "adGroupEstimators",
    "campaignId",
    "criteria",
    "dailyBudget",
    "negativeKeywords"
})
public class CampaignEstimator {

    @XmlElement(name = "AdGroupEstimators", nillable = true)
    protected ArrayOfAdGroupEstimator adGroupEstimators;
    @XmlElement(name = "CampaignId", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "Criteria", nillable = true)
    protected ArrayOfCriterion criteria;
    @XmlElement(name = "DailyBudget", nillable = true)
    protected Double dailyBudget;
    @XmlElement(name = "NegativeKeywords", nillable = true)
    protected ArrayOfNegativeKeyword negativeKeywords;

    /**
     * Gets the value of the adGroupEstimators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupEstimator }
     *     
     */
    public ArrayOfAdGroupEstimator getAdGroupEstimators() {
        return adGroupEstimators;
    }

    /**
     * Sets the value of the adGroupEstimators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupEstimator }
     *     
     */
    public void setAdGroupEstimators(ArrayOfAdGroupEstimator value) {
        this.adGroupEstimators = value;
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
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public ArrayOfCriterion getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCriterion }
     *     
     */
    public void setCriteria(ArrayOfCriterion value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the dailyBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDailyBudget() {
        return dailyBudget;
    }

    /**
     * Sets the value of the dailyBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDailyBudget(Double value) {
        this.dailyBudget = value;
    }

    /**
     * Gets the value of the negativeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNegativeKeyword }
     *     
     */
    public ArrayOfNegativeKeyword getNegativeKeywords() {
        return negativeKeywords;
    }

    /**
     * Sets the value of the negativeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNegativeKeyword }
     *     
     */
    public void setNegativeKeywords(ArrayOfNegativeKeyword value) {
        this.negativeKeywords = value;
    }

}
