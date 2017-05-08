
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductPartitionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductPartitionPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductPartitionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}ProductPartitionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductPartitionPerformanceReportColumn", propOrder = {
    "productPartitionPerformanceReportColumns"
})
public class ArrayOfProductPartitionPerformanceReportColumn {

    @XmlElement(name = "ProductPartitionPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductPartitionPerformanceReportColumn> productPartitionPerformanceReportColumns;

    /**
     * Gets the value of the productPartitionPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPartitionPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPartitionPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPartitionPerformanceReportColumn }
     * 
     * 
     */
    public List<ProductPartitionPerformanceReportColumn> getProductPartitionPerformanceReportColumns() {
        if (productPartitionPerformanceReportColumns == null) {
            productPartitionPerformanceReportColumns = new ArrayList<ProductPartitionPerformanceReportColumn>();
        }
        return this.productPartitionPerformanceReportColumns;
    }

}
