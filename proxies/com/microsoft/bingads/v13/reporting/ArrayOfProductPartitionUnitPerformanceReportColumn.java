
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfProductPartitionUnitPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductPartitionUnitPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductPartitionUnitPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductPartitionUnitPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfProductPartitionUnitPerformanceReportColumn()
    {
      this.productPartitionUnitPerformanceReportColumns = new ArrayList<ProductPartitionUnitPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfProductPartitionUnitPerformanceReportColumn(List<ProductPartitionUnitPerformanceReportColumn> productpartitionunitperformancereportcolumns)
    {
      this.productPartitionUnitPerformanceReportColumns = productpartitionunitperformancereportcolumns;
    }

    /**
     * Gets the value of the productPartitionUnitPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productPartitionUnitPerformanceReportColumns property.
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
     * @return
     *     The value of the productPartitionUnitPerformanceReportColumns property.
     */
    public List<ProductPartitionUnitPerformanceReportColumn> getProductPartitionUnitPerformanceReportColumns() {
        if (productPartitionUnitPerformanceReportColumns == null) {
            productPartitionUnitPerformanceReportColumns = new ArrayList<>();
        }
        return this.productPartitionUnitPerformanceReportColumns;
    }

}
