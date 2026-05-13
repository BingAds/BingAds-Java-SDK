
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfMSClickIdPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfMSClickIdPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MSClickIdPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}MSClickIdPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMSClickIdPerformanceReportColumn", propOrder = {
    "msClickIdPerformanceReportColumns"
})
public class ArrayOfMSClickIdPerformanceReportColumn {

    @XmlElement(name = "MSClickIdPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<MSClickIdPerformanceReportColumn> msClickIdPerformanceReportColumns;
    public ArrayOfMSClickIdPerformanceReportColumn()
    {
      this.msClickIdPerformanceReportColumns = new ArrayList<MSClickIdPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfMSClickIdPerformanceReportColumn(List<MSClickIdPerformanceReportColumn> msclickidperformancereportcolumns)
    {
      this.msClickIdPerformanceReportColumns = msclickidperformancereportcolumns;
    }

    /**
     * Gets the value of the msClickIdPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msClickIdPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMSClickIdPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MSClickIdPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the msClickIdPerformanceReportColumns property.
     */
    public List<MSClickIdPerformanceReportColumn> getMSClickIdPerformanceReportColumns() {
        if (msClickIdPerformanceReportColumns == null) {
            msClickIdPerformanceReportColumns = new ArrayList<>();
        }
        return this.msClickIdPerformanceReportColumns;
    }

}
