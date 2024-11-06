
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfBudgetPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfBudgetPoint">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BudgetPoint" type="{https://bingads.microsoft.com/AdInsight/v13}BudgetPoint" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBudgetPoint", propOrder = {
    "budgetPoints"
})
public class ArrayOfBudgetPoint {

    @XmlElement(name = "BudgetPoint", nillable = true)
    protected List<BudgetPoint> budgetPoints;
    public ArrayOfBudgetPoint()
    {
      this.budgetPoints = new ArrayList<BudgetPoint>();
    }
    @JsonCreator
    public ArrayOfBudgetPoint(List<BudgetPoint> budgetpoints)
    {
      this.budgetPoints = budgetpoints;
    }

    /**
     * Gets the value of the budgetPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the budgetPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetPoint }
     * 
     * 
     * @return
     *     The value of the budgetPoints property.
     */
    public List<BudgetPoint> getBudgetPoints() {
        if (budgetPoints == null) {
            budgetPoints = new ArrayList<>();
        }
        return this.budgetPoints;
    }

}
