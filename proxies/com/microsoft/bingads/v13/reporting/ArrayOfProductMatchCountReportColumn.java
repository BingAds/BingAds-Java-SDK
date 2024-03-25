
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfProductMatchCountReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductMatchCountReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductMatchCountReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductMatchCountReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductMatchCountReportColumn", propOrder = {
    "productMatchCountReportColumns"
})
public class ArrayOfProductMatchCountReportColumn {

    @XmlElement(name = "ProductMatchCountReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductMatchCountReportColumn> productMatchCountReportColumns;
    public ArrayOfProductMatchCountReportColumn()
    {
      this.productMatchCountReportColumns = new ArrayList<ProductMatchCountReportColumn>();
    }
    @JsonCreator
    public ArrayOfProductMatchCountReportColumn(List<ProductMatchCountReportColumn> productmatchcountreportcolumns)
    {
      this.productMatchCountReportColumns = productmatchcountreportcolumns;
    }

    /**
     * Gets the value of the productMatchCountReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productMatchCountReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMatchCountReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMatchCountReportColumn }
     * 
     * 
     * @return
     *     The value of the productMatchCountReportColumns property.
     */
    public List<ProductMatchCountReportColumn> getProductMatchCountReportColumns() {
        if (productMatchCountReportColumns == null) {
            productMatchCountReportColumns = new ArrayList<>();
        }
        return this.productMatchCountReportColumns;
    }

}
