
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOpportunity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}Opportunity">
 *       &lt;sequence>
 *         &lt;element name="BudgetType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts}BudgetLimitType" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CurrentBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IncreaseInClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IncreaseInImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PercentageIncreaseInClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PercentageIncreaseInImpressions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecommendedBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOpportunity", propOrder = {
    "budgetType",
    "campaignId",
    "currentBudget",
    "increaseInClicks",
    "increaseInImpressions",
    "percentageIncreaseInClicks",
    "percentageIncreaseInImpressions",
    "recommendedBudget"
})
public class BudgetOpportunity
    extends Opportunity
{

    @XmlElement(name = "BudgetType")
    @XmlSchemaType(name = "string")
    protected BudgetLimitType budgetType;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "CurrentBudget")
    protected Double currentBudget;
    @XmlElement(name = "IncreaseInClicks")
    protected Double increaseInClicks;
    @XmlElement(name = "IncreaseInImpressions")
    protected Long increaseInImpressions;
    @XmlElement(name = "PercentageIncreaseInClicks")
    protected Integer percentageIncreaseInClicks;
    @XmlElement(name = "PercentageIncreaseInImpressions")
    protected Integer percentageIncreaseInImpressions;
    @XmlElement(name = "RecommendedBudget")
    protected Double recommendedBudget;

    /**
     * Gets the value of the budgetType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetLimitType }
     *     
     */
    public BudgetLimitType getBudgetType() {
        return budgetType;
    }

    /**
     * Sets the value of the budgetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetLimitType }
     *     
     */
    public void setBudgetType(BudgetLimitType value) {
        this.budgetType = value;
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
     * Gets the value of the currentBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentBudget() {
        return currentBudget;
    }

    /**
     * Sets the value of the currentBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentBudget(Double value) {
        this.currentBudget = value;
    }

    /**
     * Gets the value of the increaseInClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIncreaseInClicks() {
        return increaseInClicks;
    }

    /**
     * Sets the value of the increaseInClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIncreaseInClicks(Double value) {
        this.increaseInClicks = value;
    }

    /**
     * Gets the value of the increaseInImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIncreaseInImpressions() {
        return increaseInImpressions;
    }

    /**
     * Sets the value of the increaseInImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIncreaseInImpressions(Long value) {
        this.increaseInImpressions = value;
    }

    /**
     * Gets the value of the percentageIncreaseInClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentageIncreaseInClicks() {
        return percentageIncreaseInClicks;
    }

    /**
     * Sets the value of the percentageIncreaseInClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentageIncreaseInClicks(Integer value) {
        this.percentageIncreaseInClicks = value;
    }

    /**
     * Gets the value of the percentageIncreaseInImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPercentageIncreaseInImpressions() {
        return percentageIncreaseInImpressions;
    }

    /**
     * Sets the value of the percentageIncreaseInImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPercentageIncreaseInImpressions(Integer value) {
        this.percentageIncreaseInImpressions = value;
    }

    /**
     * Gets the value of the recommendedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecommendedBudget() {
        return recommendedBudget;
    }

    /**
     * Sets the value of the recommendedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecommendedBudget(Double value) {
        this.recommendedBudget = value;
    }

}
