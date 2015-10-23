
package com.microsoft.bingads.v10.adinsight;

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
 *         &lt;element name="BudgetPointType" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}BudgetPointType" minOccurs="0"/>
 *         &lt;element name="EstimatedWeeklyClicks" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedWeeklyCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EstimatedWeeklyImpressions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
    "budgetPointType",
    "estimatedWeeklyClicks",
    "estimatedWeeklyCost",
    "estimatedWeeklyImpressions"
})
public class BudgetPoint {

    @XmlElement(name = "BudgetAmount")
    protected Double budgetAmount;
    @XmlElement(name = "BudgetPointType")
    @XmlSchemaType(name = "string")
    protected BudgetPointType budgetPointType;
    @XmlElement(name = "EstimatedWeeklyClicks")
    protected Double estimatedWeeklyClicks;
    @XmlElement(name = "EstimatedWeeklyCost")
    protected Double estimatedWeeklyCost;
    @XmlElement(name = "EstimatedWeeklyImpressions")
    protected Double estimatedWeeklyImpressions;

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
     * Gets the value of the estimatedWeeklyClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWeeklyClicks() {
        return estimatedWeeklyClicks;
    }

    /**
     * Sets the value of the estimatedWeeklyClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWeeklyClicks(Double value) {
        this.estimatedWeeklyClicks = value;
    }

    /**
     * Gets the value of the estimatedWeeklyCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWeeklyCost() {
        return estimatedWeeklyCost;
    }

    /**
     * Sets the value of the estimatedWeeklyCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWeeklyCost(Double value) {
        this.estimatedWeeklyCost = value;
    }

    /**
     * Gets the value of the estimatedWeeklyImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEstimatedWeeklyImpressions() {
        return estimatedWeeklyImpressions;
    }

    /**
     * Sets the value of the estimatedWeeklyImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEstimatedWeeklyImpressions(Double value) {
        this.estimatedWeeklyImpressions = value;
    }

}
