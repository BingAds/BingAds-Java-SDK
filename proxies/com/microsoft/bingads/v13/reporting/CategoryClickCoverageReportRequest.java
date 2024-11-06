
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoryClickCoverageReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CategoryClickCoverageReportRequest">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/Reporting/v13}ReportRequest">
 *       <sequence>
 *         <element name="Columns" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfCategoryClickCoverageReportColumn"/>
 *         <element name="Filter" type="{https://bingads.microsoft.com/Reporting/v13}CategoryClickCoverageReportFilter" minOccurs="0"/>
 *         <element name="Scope" type="{https://bingads.microsoft.com/Reporting/v13}AccountReportScope"/>
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
@XmlType(name = "CategoryClickCoverageReportRequest", propOrder = {
    "columns",
    "filter",
    "scope",
    "time"
})
public class CategoryClickCoverageReportRequest
    extends ReportRequest
{
    public CategoryClickCoverageReportRequest() {
      this.type = "CategoryClickCoverageReportRequest";
    }

    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfCategoryClickCoverageReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected CategoryClickCoverageReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountReportScope scope;
    @XmlElement(name = "Time", required = true, nillable = true)
    protected ReportTime time;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoryClickCoverageReportColumn }
     *     
     */
    public ArrayOfCategoryClickCoverageReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoryClickCoverageReportColumn }
     *     
     */
    public void setColumns(ArrayOfCategoryClickCoverageReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryClickCoverageReportFilter }
     *     
     */
    public CategoryClickCoverageReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryClickCoverageReportFilter }
     *     
     */
    public void setFilter(CategoryClickCoverageReportFilter value) {
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
