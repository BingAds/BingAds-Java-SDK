
package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductDimensionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductDimensionPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDimensionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v9}ProductDimensionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDimensionPerformanceReportColumns property.
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
     */
    public List<ProductDimensionPerformanceReportColumn> getProductDimensionPerformanceReportColumns() {
        if (productDimensionPerformanceReportColumns == null) {
            productDimensionPerformanceReportColumns = new ArrayList<ProductDimensionPerformanceReportColumn>();
        }
        return this.productDimensionPerformanceReportColumns;
    }

}
