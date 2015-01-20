
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountPerformanceReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountPerformanceReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v9}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Aggregation" type="{https://bingads.microsoft.com/Reporting/v9}ReportAggregation"/>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v9}ArrayOfAccountPerformanceReportColumn"/>
 *         &lt;element name="Filter" type="{https://bingads.microsoft.com/Reporting/v9}AccountPerformanceReportFilter" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v9}AccountReportScope"/>
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
@XmlType(name = "AccountPerformanceReportRequest", propOrder = {
    "aggregation",
    "columns",
    "filter",
    "scope",
    "time"
})
public class AccountPerformanceReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Aggregation", required = true)
    @XmlSchemaType(name = "string")
    protected ReportAggregation aggregation;
    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfAccountPerformanceReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected AccountPerformanceReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountReportScope scope;
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
     *     {@link ArrayOfAccountPerformanceReportColumn }
     *     
     */
    public ArrayOfAccountPerformanceReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccountPerformanceReportColumn }
     *     
     */
    public void setColumns(ArrayOfAccountPerformanceReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link AccountPerformanceReportFilter }
     *     
     */
    public AccountPerformanceReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountPerformanceReportFilter }
     *     
     */
    public void setFilter(AccountPerformanceReportFilter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link AccountReportScope }
     *     
     */
    public AccountReportScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountReportScope }
     *     
     */
    public void setScope(AccountReportScope value) {
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
