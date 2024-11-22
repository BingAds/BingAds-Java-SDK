
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfCombinationPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCombinationPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CombinationPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}CombinationPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCombinationPerformanceReportColumn", propOrder = {
    "combinationPerformanceReportColumns"
})
public class ArrayOfCombinationPerformanceReportColumn {

    @XmlElement(name = "CombinationPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<CombinationPerformanceReportColumn> combinationPerformanceReportColumns;
    public ArrayOfCombinationPerformanceReportColumn()
    {
      this.combinationPerformanceReportColumns = new ArrayList<CombinationPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfCombinationPerformanceReportColumn(List<CombinationPerformanceReportColumn> combinationperformancereportcolumns)
    {
      this.combinationPerformanceReportColumns = combinationperformancereportcolumns;
    }

    /**
     * Gets the value of the combinationPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the combinationPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CombinationPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the combinationPerformanceReportColumns property.
     */
    public List<CombinationPerformanceReportColumn> getCombinationPerformanceReportColumns() {
        if (combinationPerformanceReportColumns == null) {
            combinationPerformanceReportColumns = new ArrayList<>();
        }
        return this.combinationPerformanceReportColumns;
    }

}
