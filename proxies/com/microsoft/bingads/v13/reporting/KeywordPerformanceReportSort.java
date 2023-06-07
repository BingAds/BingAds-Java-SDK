
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordPerformanceReportSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordPerformanceReportSort">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SortColumn" type="{https://bingads.microsoft.com/Reporting/v13}KeywordPerformanceReportColumn"/>
 *         <element name="SortOrder" type="{https://bingads.microsoft.com/Reporting/v13}SortOrder"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordPerformanceReportSort", propOrder = {
    "sortColumn",
    "sortOrder"
})
public class KeywordPerformanceReportSort {

    @XmlElement(name = "SortColumn", required = true)
    @XmlSchemaType(name = "string")
    protected KeywordPerformanceReportColumn sortColumn;
    @XmlElement(name = "SortOrder", required = true)
    @XmlSchemaType(name = "string")
    protected SortOrder sortOrder;

    /**
     * Gets the value of the sortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordPerformanceReportColumn }
     *     
     */
    public KeywordPerformanceReportColumn getSortColumn() {
        return sortColumn;
    }

    /**
     * Sets the value of the sortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordPerformanceReportColumn }
     *     
     */
    public void setSortColumn(KeywordPerformanceReportColumn value) {
        this.sortColumn = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setSortOrder(SortOrder value) {
        this.sortOrder = value;
    }

}
