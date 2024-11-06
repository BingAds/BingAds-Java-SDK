
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBudgetOpportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBudgetOpportunity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BudgetOpportunity" type="{https://bingads.microsoft.com/AdInsight/v13}BudgetOpportunity" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBudgetOpportunity", propOrder = {
    "budgetOpportunities"
})
public class ArrayOfBudgetOpportunity {

    @XmlElement(name = "BudgetOpportunity", nillable = true)
    protected List<BudgetOpportunity> budgetOpportunities;
    public ArrayOfBudgetOpportunity()
    {
      this.budgetOpportunities = new ArrayList<BudgetOpportunity>();
    }
    @JsonCreator
    public ArrayOfBudgetOpportunity(List<BudgetOpportunity> budgetopportunitys)
    {
      this.budgetOpportunities = budgetopportunitys;
    }

    /**
     * Gets the value of the budgetOpportunities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the budgetOpportunities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetOpportunities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetOpportunity }
     * 
     * 
     * @return
     *     The value of the budgetOpportunities property.
     */
    public List<BudgetOpportunity> getBudgetOpportunities() {
        if (budgetOpportunities == null) {
            budgetOpportunities = new ArrayList<>();
        }
        return this.budgetOpportunities;
    }

}
