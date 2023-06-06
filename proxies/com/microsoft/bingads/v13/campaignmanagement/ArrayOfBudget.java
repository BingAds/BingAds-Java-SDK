
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBudget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBudget">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Budget" type="{https://bingads.microsoft.com/CampaignManagement/v13}Budget" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBudget", propOrder = {
    "budgets"
})
public class ArrayOfBudget {

    @XmlElement(name = "Budget", nillable = true)
    protected List<Budget> budgets;

    /**
     * Gets the value of the budgets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the budgets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Budget }
     * 
     * 
     * @return
     *     The value of the budgets property.
     */
    public List<Budget> getBudgets() {
        if (budgets == null) {
            budgets = new ArrayList<>();
        }
        return this.budgets;
    }

}
