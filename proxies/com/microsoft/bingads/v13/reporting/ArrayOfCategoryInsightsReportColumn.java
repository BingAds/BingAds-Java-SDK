
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfCategoryInsightsReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCategoryInsightsReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CategoryInsightsReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}CategoryInsightsReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCategoryInsightsReportColumn", propOrder = {
    "categoryInsightsReportColumns"
})
public class ArrayOfCategoryInsightsReportColumn {

    @XmlElement(name = "CategoryInsightsReportColumn")
    @XmlSchemaType(name = "string")
    protected List<CategoryInsightsReportColumn> categoryInsightsReportColumns;
    public ArrayOfCategoryInsightsReportColumn()
    {
      this.categoryInsightsReportColumns = new ArrayList<CategoryInsightsReportColumn>();
    }
    @JsonCreator
    public ArrayOfCategoryInsightsReportColumn(List<CategoryInsightsReportColumn> categoryinsightsreportcolumns)
    {
      this.categoryInsightsReportColumns = categoryinsightsreportcolumns;
    }

    /**
     * Gets the value of the categoryInsightsReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the categoryInsightsReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryInsightsReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryInsightsReportColumn }
     * 
     * 
     * @return
     *     The value of the categoryInsightsReportColumns property.
     */
    public List<CategoryInsightsReportColumn> getCategoryInsightsReportColumns() {
        if (categoryInsightsReportColumns == null) {
            categoryInsightsReportColumns = new ArrayList<>();
        }
        return this.categoryInsightsReportColumns;
    }

}
