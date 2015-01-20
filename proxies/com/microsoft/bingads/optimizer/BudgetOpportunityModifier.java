
package com.microsoft.bingads.optimizer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetOpportunityModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOpportunityModifier">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.Optimizer.Api.DataContracts.Entities}OpportunityModifier">
 *       &lt;sequence>
 *         &lt;element name="Budget" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOpportunityModifier", propOrder = {
    "budget"
})
public class BudgetOpportunityModifier
    extends OpportunityModifier
{

    @XmlElement(name = "Budget", nillable = true)
    protected Double budget;

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBudget(Double value) {
        this.budget = value;
    }

}
