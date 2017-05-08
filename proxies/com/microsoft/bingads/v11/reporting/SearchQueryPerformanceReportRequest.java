
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchQueryPerformanceReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchQueryPerformanceReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v11}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Aggregation" type="{https://bingads.microsoft.com/Reporting/v11}SearchQueryReportAggregation"/>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v11}ArrayOfSearchQueryPerformanceReportColumn"/>
 *         &lt;element name="Filter" type="{https://bingads.microsoft.com/Reporting/v11}SearchQueryPerformanceReportFilter" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v11}AccountThroughAdGroupReportScope"/>
 *         &lt;element name="Time" type="{https://bingads.microsoft.com/Reporting/v11}ReportTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    @XmlElement(name = "Aggregation", required = true)
    @XmlSchemaType(name = "string")
    protected SearchQueryReportAggregation aggregation;
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
     *     {@link SearchQueryReportAggregation }
     *     
     */
    public SearchQueryReportAggregation getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchQueryReportAggregation }
     *     
     */
    public void setAggregation(SearchQueryReportAggregation value) {
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
