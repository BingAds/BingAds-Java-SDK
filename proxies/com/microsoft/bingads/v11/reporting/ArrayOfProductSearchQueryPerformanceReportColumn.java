
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductSearchQueryPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductSearchQueryPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductSearchQueryPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}ProductSearchQueryPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the productSearchQueryPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSearchQueryPerformanceReportColumns property.
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
     */
    public List<ProductSearchQueryPerformanceReportColumn> getProductSearchQueryPerformanceReportColumns() {
        if (productSearchQueryPerformanceReportColumns == null) {
            productSearchQueryPerformanceReportColumns = new ArrayList<ProductSearchQueryPerformanceReportColumn>();
        }
        return this.productSearchQueryPerformanceReportColumns;
    }

}
