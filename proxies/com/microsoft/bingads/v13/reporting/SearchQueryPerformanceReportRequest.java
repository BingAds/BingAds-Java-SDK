
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQueryPerformanceReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchQueryPerformanceReportRequest">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/Reporting/v13}ReportRequest">
 *       <sequence>
 *         <element name="Aggregation" type="{https://bingads.microsoft.com/Reporting/v13}ReportAggregation"/>
 *         <element name="Columns" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfSearchQueryPerformanceReportColumn"/>
 *         <element name="Filter" type="{https://bingads.microsoft.com/Reporting/v13}SearchQueryPerformanceReportFilter" minOccurs="0"/>
 *         <element name="Scope" type="{https://bingads.microsoft.com/Reporting/v13}AccountThroughAdGroupReportScope"/>
 *         <element name="Time" type="{https://bingads.microsoft.com/Reporting/v13}ReportTime"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchQueryPerformanceReportRequest", propOrder = {
    "aggregation",
    "columns",
    "filter",
    "scope",
    "time"
})
public class SearchQueryPerformanceReportRequest
    extends ReportRequest
{
    public SearchQueryPerformanceReportRequest() {
      this.type = "SearchQueryPerformanceReportRequest";
    }

    @XmlElement(name = "Aggregation", required = true)
    @XmlSchemaType(name = "string")
    protected ReportAggregation aggregation;
    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfSearchQueryPerformanceReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected SearchQueryPerformanceReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountThroughAdGroupReportScope scope;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected ReportTime time;

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link ReportAggregation }
     *     
     */
    public ReportAggregation getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportAggregation }
     *     
     */
    public void setAggregation(ReportAggregation value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchQueryPerformanceReportColumn }
     *     
     */
    public ArrayOfSearchQueryPerformanceReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchQueryPerformanceReportColumn }
     *     
     */
    public void setColumns(ArrayOfSearchQueryPerformanceReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link SearchQueryPerformanceReportFilter }
     *     
     */
    public SearchQueryPerformanceReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchQueryPerformanceReportFilter }
     *     
     */
    public void setFilter(SearchQueryPerformanceReportFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AccountThroughAdGroupReportScope }
     *     
     */
    public AccountThroughAdGroupReportScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountThroughAdGroupReportScope }
     *     
     */
    public void setScope(AccountThroughAdGroupReportScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTime }
     *     
     */
    public ReportTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTime }
     *     
     */
    public void setTime(ReportTime value) {
        this.time = value;
    }

}
