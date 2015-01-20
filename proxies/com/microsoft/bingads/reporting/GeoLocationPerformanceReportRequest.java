
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoLocationPerformanceReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocationPerformanceReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v9}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Aggregation" type="{https://bingads.microsoft.com/Reporting/v9}NonHourlyReportAggregation"/>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v9}ArrayOfGeoLocationPerformanceReportColumn"/>
 *         &lt;element name="Filter" type="{https://bingads.microsoft.com/Reporting/v9}GeoLocationPerformanceReportFilter" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v9}AccountThroughAdGroupReportScope"/>
 *         &lt;element name="Time" type="{https://bingads.microsoft.com/Reporting/v9}ReportTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocationPerformanceReportRequest", propOrder = {
    "aggregation",
    "columns",
    "filter",
    "scope",
    "time"
})
public class GeoLocationPerformanceReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Aggregation", required = true)
    @XmlSchemaType(name = "string")
    protected NonHourlyReportAggregation aggregation;
    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfGeoLocationPerformanceReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected GeoLocationPerformanceReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountThroughAdGroupReportScope scope;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected ReportTime time;

    /**
     * Gets the value of the aggregation property.
     * 
     * @return
     *     possible object is
     *     {@link NonHourlyReportAggregation }
     *     
     */
    public NonHourlyReportAggregation getAggregation() {
        return aggregation;
    }

    /**
     * Sets the value of the aggregation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonHourlyReportAggregation }
     *     
     */
    public void setAggregation(NonHourlyReportAggregation value) {
        this.aggregation = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGeoLocationPerformanceReportColumn }
     *     
     */
    public ArrayOfGeoLocationPerformanceReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGeoLocationPerformanceReportColumn }
     *     
     */
    public void setColumns(ArrayOfGeoLocationPerformanceReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationPerformanceReportFilter }
     *     
     */
    public GeoLocationPerformanceReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationPerformanceReportFilter }
     *     
     */
    public void setFilter(GeoLocationPerformanceReportFilter value) {
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
