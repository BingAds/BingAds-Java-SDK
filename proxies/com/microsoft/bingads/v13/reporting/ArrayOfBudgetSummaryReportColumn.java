
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBudgetSummaryReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBudgetSummaryReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetSummaryReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}BudgetSummaryReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBudgetSummaryReportColumn", propOrder = {
    "budgetSummaryReportColumns"
})
public class ArrayOfBudgetSummaryReportColumn {

    @XmlElement(name = "BudgetSummaryReportColumn")
    @XmlSchemaType(name = "string")
    protected List<BudgetSummaryReportColumn> budgetSummaryReportColumns;

    /**
     * Gets the value of the budgetSummaryReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the budgetSummaryReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBudgetSummaryReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BudgetSummaryReportColumn }
     * 
     * 
     */
    public List<BudgetSummaryReportColumn> getBudgetSummaryReportColumns() {
        if (budgetSummaryReportColumns == null) {
            budgetSummaryReportColumns = new ArrayList<BudgetSummaryReportColumn>();
        }
        return this.budgetSummaryReportColumns;
    }

}
