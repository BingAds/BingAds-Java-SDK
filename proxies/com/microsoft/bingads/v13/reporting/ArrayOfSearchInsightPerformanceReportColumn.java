
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfSearchInsightPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSearchInsightPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchInsightPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}SearchInsightPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchInsightPerformanceReportColumn", propOrder = {
    "searchInsightPerformanceReportColumns"
})
public class ArrayOfSearchInsightPerformanceReportColumn {

    @XmlElement(name = "SearchInsightPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<SearchInsightPerformanceReportColumn> searchInsightPerformanceReportColumns;
    public ArrayOfSearchInsightPerformanceReportColumn()
    {
      this.searchInsightPerformanceReportColumns = new ArrayList<SearchInsightPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfSearchInsightPerformanceReportColumn(List<SearchInsightPerformanceReportColumn> searchinsightperformancereportcolumns)
    {
      this.searchInsightPerformanceReportColumns = searchinsightperformancereportcolumns;
    }

    /**
     * Gets the value of the searchInsightPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchInsightPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchInsightPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchInsightPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the searchInsightPerformanceReportColumns property.
     */
    public List<SearchInsightPerformanceReportColumn> getSearchInsightPerformanceReportColumns() {
        if (searchInsightPerformanceReportColumns == null) {
            searchInsightPerformanceReportColumns = new ArrayList<>();
        }
        return this.searchInsightPerformanceReportColumns;
    }

}
