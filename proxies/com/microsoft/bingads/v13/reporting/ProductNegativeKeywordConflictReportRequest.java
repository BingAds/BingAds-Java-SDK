
package com.microsoft.bingads.v13.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductNegativeKeywordConflictReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductNegativeKeywordConflictReportRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/Reporting/v13}ReportRequest">
 *       &lt;sequence>
 *         &lt;element name="Columns" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfProductNegativeKeywordConflictReportColumn"/>
 *         &lt;element name="Filter" type="{https://bingads.microsoft.com/Reporting/v13}ProductNegativeKeywordConflictReportFilter" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/Reporting/v13}AccountThroughAdGroupReportScope"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductNegativeKeywordConflictReportRequest", propOrder = {
    "columns",
    "filter",
    "scope"
})
public class ProductNegativeKeywordConflictReportRequest
    extends ReportRequest
{

    @XmlElement(name = "Columns", required = true, nillable = true)
    protected ArrayOfProductNegativeKeywordConflictReportColumn columns;
    @XmlElement(name = "Filter", nillable = true)
    protected ProductNegativeKeywordConflictReportFilter filter;
    @XmlElement(name = "Scope", required = true, nillable = true)
    protected AccountThroughAdGroupReportScope scope;

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductNegativeKeywordConflictReportColumn }
     *     
     */
    public ArrayOfProductNegativeKeywordConflictReportColumn getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductNegativeKeywordConflictReportColumn }
     *     
     */
    public void setColumns(ArrayOfProductNegativeKeywordConflictReportColumn value) {
        this.columns = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link ProductNegativeKeywordConflictReportFilter }
     *     
     */
    public ProductNegativeKeywordConflictReportFilter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductNegativeKeywordConflictReportFilter }
     *     
     */
    public void setFilter(ProductNegativeKeywordConflictReportFilter value) {
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

}
