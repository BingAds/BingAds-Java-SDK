
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductNegativeKeywordConflictReportRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductNegativeKeywordConflictReportRequest">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/Reporting/v13}ReportRequest">
 *       <sequence>
 *         <element name="Columns" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfProductNegativeKeywordConflictReportColumn"/>
 *         <element name="Filter" type="{https://bingads.microsoft.com/Reporting/v13}ProductNegativeKeywordConflictReportFilter" minOccurs="0"/>
 *         <element name="Scope" type="{https://bingads.microsoft.com/Reporting/v13}AccountThroughAdGroupReportScope"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ProductNegativeKeywordConflictReportRequest() {
      this.type = "ProductNegativeKeywordConflictReportRequest";
    }

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
