
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfProductSearchQueryPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductSearchQueryPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductSearchQueryPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductSearchQueryPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductSearchQueryPerformanceReportColumn", propOrder = {
    "productSearchQueryPerformanceReportColumns"
})
public class ArrayOfProductSearchQueryPerformanceReportColumn {

    @XmlElement(name = "ProductSearchQueryPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductSearchQueryPerformanceReportColumn> productSearchQueryPerformanceReportColumns;
    public ArrayOfProductSearchQueryPerformanceReportColumn()
    {
      this.productSearchQueryPerformanceReportColumns = new ArrayList<ProductSearchQueryPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfProductSearchQueryPerformanceReportColumn(List<ProductSearchQueryPerformanceReportColumn> productsearchqueryperformancereportcolumns)
    {
      this.productSearchQueryPerformanceReportColumns = productsearchqueryperformancereportcolumns;
    }

    /**
     * Gets the value of the productSearchQueryPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productSearchQueryPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSearchQueryPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSearchQueryPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the productSearchQueryPerformanceReportColumns property.
     */
    public List<ProductSearchQueryPerformanceReportColumn> getProductSearchQueryPerformanceReportColumns() {
        if (productSearchQueryPerformanceReportColumns == null) {
            productSearchQueryPerformanceReportColumns = new ArrayList<>();
        }
        return this.productSearchQueryPerformanceReportColumns;
    }

}
