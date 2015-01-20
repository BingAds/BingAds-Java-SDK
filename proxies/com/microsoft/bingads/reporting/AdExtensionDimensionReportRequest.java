
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionDimensionReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtensionDimensionReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v9}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v9}ArrayOfAdExtensionDimensionReportColumn"/>
 *         &lt;element name="Filter" type="{https://bingads.microsoft.com/Reporting/v9}AdExtensionDimensionReportFilter" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v9}AccountReportScope"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionDimensionReportRequest", propOrder = {
    "columns",
    "filter",
    "scope"
})
public class AdExtensionDimensionReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfAdExtensionDimensionReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected AdExtensionDimensionReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountReportScope scope;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtensionDimensionReportColumn }
     *     
     */
    public ArrayOfAdExtensionDimensionReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtensionDimensionReportColumn }
     *     
     */
    public void setColumns(ArrayOfAdExtensionDimensionReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionDimensionReportFilter }
     *     
     */
    public AdExtensionDimensionReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionDimensionReportFilter }
     *     
     */
    public void setFilter(AdExtensionDimensionReportFilter value) {
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

}
