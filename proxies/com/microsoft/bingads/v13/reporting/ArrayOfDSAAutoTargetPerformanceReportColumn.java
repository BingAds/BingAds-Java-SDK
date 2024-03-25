
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfDSAAutoTargetPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDSAAutoTargetPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DSAAutoTargetPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}DSAAutoTargetPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSAAutoTargetPerformanceReportColumn", propOrder = {
    "dsaAutoTargetPerformanceReportColumns"
})
public class ArrayOfDSAAutoTargetPerformanceReportColumn {

    @XmlElement(name = "DSAAutoTargetPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<DSAAutoTargetPerformanceReportColumn> dsaAutoTargetPerformanceReportColumns;
    public ArrayOfDSAAutoTargetPerformanceReportColumn()
    {
      this.dsaAutoTargetPerformanceReportColumns = new ArrayList<DSAAutoTargetPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfDSAAutoTargetPerformanceReportColumn(List<DSAAutoTargetPerformanceReportColumn> dsaautotargetperformancereportcolumns)
    {
      this.dsaAutoTargetPerformanceReportColumns = dsaautotargetperformancereportcolumns;
    }

    /**
     * Gets the value of the dsaAutoTargetPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dsaAutoTargetPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSAAutoTargetPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAAutoTargetPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the dsaAutoTargetPerformanceReportColumns property.
     */
    public List<DSAAutoTargetPerformanceReportColumn> getDSAAutoTargetPerformanceReportColumns() {
        if (dsaAutoTargetPerformanceReportColumns == null) {
            dsaAutoTargetPerformanceReportColumns = new ArrayList<>();
        }
        return this.dsaAutoTargetPerformanceReportColumns;
    }

}
