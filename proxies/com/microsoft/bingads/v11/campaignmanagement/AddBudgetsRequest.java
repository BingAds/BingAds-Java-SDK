
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Budgets" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfBudget" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "budgets"
})
@XmlRootElement(name = "AddBudgetsRequest")
public class AddBudgetsRequest {

    @XmlElement(name = "Budgets", nillable = true)
    protected ArrayOfBudget budgets;

    /**
     * Gets the value of the budgets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBudget }
     *     
     */
    public ArrayOfBudget getBudgets() {
        return budgets;
    }

    /**
     * Sets the value of the budgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBudget }
     *     
     */
    public void setBudgets(ArrayOfBudget value) {
        this.budgets = value;
    }

}
