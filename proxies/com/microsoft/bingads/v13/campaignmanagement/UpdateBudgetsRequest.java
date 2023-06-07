
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Budgets" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBudget" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "budgets"
})
@XmlRootElement(name = "UpdateBudgetsRequest")
public class UpdateBudgetsRequest {

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
