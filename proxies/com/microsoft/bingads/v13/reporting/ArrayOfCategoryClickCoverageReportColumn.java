
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfCategoryClickCoverageReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCategoryClickCoverageReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryClickCoverageReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}CategoryClickCoverageReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCategoryClickCoverageReportColumn", propOrder = {
    "categoryClickCoverageReportColumns"
})
public class ArrayOfCategoryClickCoverageReportColumn {

    @XmlElement(name = "CategoryClickCoverageReportColumn")
    @XmlSchemaType(name = "string")
    protected List<CategoryClickCoverageReportColumn> categoryClickCoverageReportColumns;
    public ArrayOfCategoryClickCoverageReportColumn()
    {
      this.categoryClickCoverageReportColumns = new ArrayList<CategoryClickCoverageReportColumn>();
    }
    @JsonCreator
    public ArrayOfCategoryClickCoverageReportColumn(List<CategoryClickCoverageReportColumn> categoryclickcoveragereportcolumns)
    {
      this.categoryClickCoverageReportColumns = categoryclickcoveragereportcolumns;
    }

    /**
     * Gets the value of the categoryClickCoverageReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categoryClickCoverageReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryClickCoverageReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryClickCoverageReportColumn }
     * 
     * 
     * @return
     *     The value of the categoryClickCoverageReportColumns property.
     */
    public List<CategoryClickCoverageReportColumn> getCategoryClickCoverageReportColumns() {
        if (categoryClickCoverageReportColumns == null) {
            categoryClickCoverageReportColumns = new ArrayList<>();
        }
        return this.categoryClickCoverageReportColumns;
    }

}
