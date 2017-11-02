
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductPartitionUnitPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductPartitionUnitPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductPartitionUnitPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}ProductPartitionUnitPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductPartitionUnitPerformanceReportColumn", propOrder = {
    "productPartitionUnitPerformanceReportColumns"
})
public class ArrayOfProductPartitionUnitPerformanceReportColumn {

    @XmlElement(name = "ProductPartitionUnitPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductPartitionUnitPerformanceReportColumn> productPartitionUnitPerformanceReportColumns;

    /**
     * Gets the value of the productPartitionUnitPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPartitionUnitPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPartitionUnitPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPartitionUnitPerformanceReportColumn }
     * 
     * 
     */
    public List<ProductPartitionUnitPerformanceReportColumn> getProductPartitionUnitPerformanceReportColumns() {
        if (productPartitionUnitPerformanceReportColumns == null) {
            productPartitionUnitPerformanceReportColumns = new ArrayList<ProductPartitionUnitPerformanceReportColumn>();
        }
        return this.productPartitionUnitPerformanceReportColumns;
    }

}
