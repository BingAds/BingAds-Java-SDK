
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignBudgetRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CampaignBudgetRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="BudgetPoints" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfBudgetPoint" minOccurs="0"/>
 *         <element name="BudgetType" type="{https://bingads.microsoft.com/AdInsight/v13}BudgetLimitType" minOccurs="0"/>
 *         <element name="CurrentBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="RecommendedBudget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignBudgetRecommendation", propOrder = {
    "budgetPoints",
    "budgetType",
    "currentBudget",
    "recommendedBudget"
})
public class CampaignBudgetRecommendation
    extends RecommendationBase
{
    public CampaignBudgetRecommendation() {
      this.type = RecommendationType.fromValue("CampaignBudgetRecommendation");
    }

    @XmlElement(name = "BudgetPoints", nillable = true)
    protected ArrayOfBudgetPoint budgetPoints;
    @XmlElement(name = "BudgetType")
    @XmlSchemaType(name = "string")
    protected BudgetLimitType budgetType;
    @XmlElement(name = "CurrentBudget")
    protected Double currentBudget;
    @XmlElement(name = "RecommendedBudget")
    protected Double recommendedBudget;

    /**
     * Gets the value of the budgetPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudgetPoint }
     *     
     */
    public ArrayOfBudgetPoint getBudgetPoints() {
        return budgetPoints;
    }

    /**
     * Sets the value of the budgetPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudgetPoint }
     *     
     */
    public void setBudgetPoints(ArrayOfBudgetPoint value) {
        this.budgetPoints = value;
    }

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
