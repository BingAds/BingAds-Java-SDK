
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductDimensionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductDimensionPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductDimensionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductDimensionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductDimensionPerformanceReportColumn", propOrder = {
    "productDimensionPerformanceReportColumns"
})
public class ArrayOfProductDimensionPerformanceReportColumn {

    @XmlElement(name = "ProductDimensionPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductDimensionPerformanceReportColumn> productDimensionPerformanceReportColumns;

    /**
     * Gets the value of the productDimensionPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productDimensionPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDimensionPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDimensionPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the productDimensionPerformanceReportColumns property.
     */
    public List<ProductDimensionPerformanceReportColumn> getProductDimensionPerformanceReportColumns() {
        if (productDimensionPerformanceReportColumns == null) {
            productDimensionPerformanceReportColumns = new ArrayList<>();
        }
        return this.productDimensionPerformanceReportColumns;
    }

}
