
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNegativeKeywordConflictReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNegativeKeywordConflictReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NegativeKeywordConflictReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}NegativeKeywordConflictReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNegativeKeywordConflictReportColumn", propOrder = {
    "negativeKeywordConflictReportColumns"
})
public class ArrayOfNegativeKeywordConflictReportColumn {

    @XmlElement(name = "NegativeKeywordConflictReportColumn")
    @XmlSchemaType(name = "string")
    protected List<NegativeKeywordConflictReportColumn> negativeKeywordConflictReportColumns;

    /**
     * Gets the value of the negativeKeywordConflictReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negativeKeywordConflictReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegativeKeywordConflictReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegativeKeywordConflictReportColumn }
     * 
     * 
     */
    public List<NegativeKeywordConflictReportColumn> getNegativeKeywordConflictReportColumns() {
        if (negativeKeywordConflictReportColumns == null) {
            negativeKeywordConflictReportColumns = new ArrayList<NegativeKeywordConflictReportColumn>();
        }
        return this.negativeKeywordConflictReportColumns;
    }

}
