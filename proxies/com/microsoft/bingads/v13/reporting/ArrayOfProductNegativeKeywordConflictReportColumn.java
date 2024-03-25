
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfProductNegativeKeywordConflictReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfProductNegativeKeywordConflictReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ProductNegativeKeywordConflictReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ProductNegativeKeywordConflictReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductNegativeKeywordConflictReportColumn", propOrder = {
    "productNegativeKeywordConflictReportColumns"
})
public class ArrayOfProductNegativeKeywordConflictReportColumn {

    @XmlElement(name = "ProductNegativeKeywordConflictReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ProductNegativeKeywordConflictReportColumn> productNegativeKeywordConflictReportColumns;
    public ArrayOfProductNegativeKeywordConflictReportColumn()
    {
      this.productNegativeKeywordConflictReportColumns = new ArrayList<ProductNegativeKeywordConflictReportColumn>();
    }
    @JsonCreator
    public ArrayOfProductNegativeKeywordConflictReportColumn(List<ProductNegativeKeywordConflictReportColumn> productnegativekeywordconflictreportcolumns)
    {
      this.productNegativeKeywordConflictReportColumns = productnegativekeywordconflictreportcolumns;
    }

    /**
     * Gets the value of the productNegativeKeywordConflictReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the productNegativeKeywordConflictReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductNegativeKeywordConflictReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductNegativeKeywordConflictReportColumn }
     * 
     * 
     * @return
     *     The value of the productNegativeKeywordConflictReportColumns property.
     */
    public List<ProductNegativeKeywordConflictReportColumn> getProductNegativeKeywordConflictReportColumns() {
        if (productNegativeKeywordConflictReportColumns == null) {
            productNegativeKeywordConflictReportColumns = new ArrayList<>();
        }
        return this.productNegativeKeywordConflictReportColumns;
    }

}
