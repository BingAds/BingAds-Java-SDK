
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfProductPartitionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductPartitionPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductPartitionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductPartitionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfProductPartitionPerformanceReportColumn()
    {
      this.productPartitionPerformanceReportColumns = new ArrayList<ProductPartitionPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfProductPartitionPerformanceReportColumn(List<ProductPartitionPerformanceReportColumn> productpartitionperformancereportcolumns)
    {
      this.productPartitionPerformanceReportColumns = productpartitionperformancereportcolumns;
    }

    /**
     * Gets the value of the productPartitionPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productPartitionPerformanceReportColumns property.
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
     * @return
     *     The value of the productPartitionPerformanceReportColumns property.
     */
    public List<ProductPartitionPerformanceReportColumn> getProductPartitionPerformanceReportColumns() {
        if (productPartitionPerformanceReportColumns == null) {
            productPartitionPerformanceReportColumns = new ArrayList<>();
        }
        return this.productPartitionPerformanceReportColumns;
    }

}
