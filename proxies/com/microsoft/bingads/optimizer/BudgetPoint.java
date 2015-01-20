
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BudgetLandscapePoints" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}ArrayOfBudgetLandscapePoint" minOccurs="0"/>
 *         &lt;element name="BudgetPointType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}BudgetPointType" minOccurs="0"/>
 *         &lt;element name="EstimatedAvgDailyClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedAvgDailyCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedAvgDailyImpressions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetPoint", propOrder = {
    "budgetAmount",
    "budgetLandscapePoints",
    "budgetPointType",
    "estimatedAvgDailyClicks",
    "estimatedAvgDailyCost",
    "estimatedAvgDailyImpressions"
})
public class BudgetPoint {

    @XmlElement(name = "BudgetAmount")
    protected Double budgetAmount;
    @XmlElement(name = "BudgetLandscapePoints", nillable = true)
    protected ArrayOfBudgetLandscapePoint budgetLandscapePoints;
    @XmlElement(name = "BudgetPointType")
    @XmlSchemaType(name = "string")
    protected BudgetPointType budgetPointType;
    @XmlElement(name = "EstimatedAvgDailyClicks")
    protected Double estimatedAvgDailyClicks;
    @XmlElement(name = "EstimatedAvgDailyCost")
    protected Double estimatedAvgDailyCost;
    @XmlElement(name = "EstimatedAvgDailyImpressions")
    protected Double estimatedAvgDailyImpressions;

    /**
     * Gets the value of the budgetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudgetAmount(Double value) {
        this.budgetAmount = value;
    }

    /**
     * Gets the value of the budgetLandscapePoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetLandscapePoint }
     *     
     */
    public ArrayOfBudgetLandscapePoint getBudgetLandscapePoints() {
        return budgetLandscapePoints;
    }

    /**
     * Sets the value of the budgetLandscapePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetLandscapePoint }
     *     
     */
    public void setBudgetLandscapePoints(ArrayOfBudgetLandscapePoint value) {
        this.budgetLandscapePoints = value;
    }

    /**
     * Gets the value of the budgetPointType property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetPointType }
     *     
     */
    public BudgetPointType getBudgetPointType() {
        return budgetPointType;
    }

    /**
     * Sets the value of the budgetPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetPointType }
     *     
     */
    public void setBudgetPointType(BudgetPointType value) {
        this.budgetPointType = value;
    }

    /**
     * Gets the value of the estimatedAvgDailyClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedAvgDailyClicks() {
        return estimatedAvgDailyClicks;
    }

    /**
     * Sets the value of the estimatedAvgDailyClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedAvgDailyClicks(Double value) {
        this.estimatedAvgDailyClicks = value;
    }

    /**
     * Gets the value of the estimatedAvgDailyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedAvgDailyCost() {
        return estimatedAvgDailyCost;
    }

    /**
     * Sets the value of the estimatedAvgDailyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedAvgDailyCost(Double value) {
        this.estimatedAvgDailyCost = value;
    }

    /**
     * Gets the value of the estimatedAvgDailyImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedAvgDailyImpressions() {
        return estimatedAvgDailyImpressions;
    }

    /**
     * Sets the value of the estimatedAvgDailyImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedAvgDailyImpressions(Double value) {
        this.estimatedAvgDailyImpressions = value;
    }

}
