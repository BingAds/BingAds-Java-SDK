
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfSearchQueryPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfSearchQueryPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SearchQueryPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}SearchQueryPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfSearchQueryPerformanceReportColumn()
    {
      this.searchQueryPerformanceReportColumns = new ArrayList<SearchQueryPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfSearchQueryPerformanceReportColumn(List<SearchQueryPerformanceReportColumn> searchqueryperformancereportcolumns)
    {
      this.searchQueryPerformanceReportColumns = searchqueryperformancereportcolumns;
    }

    /**
     * Gets the value of the searchQueryPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the searchQueryPerformanceReportColumns property.
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
     * @return
     *     The value of the searchQueryPerformanceReportColumns property.
     */
    public List<SearchQueryPerformanceReportColumn> getSearchQueryPerformanceReportColumns() {
        if (searchQueryPerformanceReportColumns == null) {
            searchQueryPerformanceReportColumns = new ArrayList<>();
        }
        return this.searchQueryPerformanceReportColumns;
    }

}
