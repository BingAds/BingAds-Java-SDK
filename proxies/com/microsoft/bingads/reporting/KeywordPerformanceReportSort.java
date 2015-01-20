
package com.microsoft.bingads.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordPerformanceReportSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordPerformanceReportSort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortColumn" type="{https://bingads.microsoft.com/Reporting/v9}KeywordPerformanceReportColumn"/>
 *         &lt;element name="SortOrder" type="{https://bingads.microsoft.com/Reporting/v9}SortOrder"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
