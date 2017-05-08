
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSearchQueryPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchQueryPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchQueryPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}SearchQueryPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchQueryPerformanceReportColumn", propOrder = {
    "searchQueryPerformanceReportColumns"
})
public class ArrayOfSearchQueryPerformanceReportColumn {

    @XmlElement(name = "SearchQueryPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<SearchQueryPerformanceReportColumn> searchQueryPerformanceReportColumns;

    /**
     * Gets the value of the searchQueryPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchQueryPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchQueryPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchQueryPerformanceReportColumn }
     * 
     * 
     */
    public List<SearchQueryPerformanceReportColumn> getSearchQueryPerformanceReportColumns() {
        if (searchQueryPerformanceReportColumns == null) {
            searchQueryPerformanceReportColumns = new ArrayList<SearchQueryPerformanceReportColumn>();
        }
        return this.searchQueryPerformanceReportColumns;
    }

}
