
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfMMMPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfMMMPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MMMPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}MMMPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMMMPerformanceReportColumn", propOrder = {
    "mmmPerformanceReportColumns"
})
public class ArrayOfMMMPerformanceReportColumn {

    @XmlElement(name = "MMMPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<MMMPerformanceReportColumn> mmmPerformanceReportColumns;
    public ArrayOfMMMPerformanceReportColumn()
    {
      this.mmmPerformanceReportColumns = new ArrayList<MMMPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfMMMPerformanceReportColumn(List<MMMPerformanceReportColumn> mmmperformancereportcolumns)
    {
      this.mmmPerformanceReportColumns = mmmperformancereportcolumns;
    }

    /**
     * Gets the value of the mmmPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmmPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMMMPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MMMPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the mmmPerformanceReportColumns property.
     */
    public List<MMMPerformanceReportColumn> getMMMPerformanceReportColumns() {
        if (mmmPerformanceReportColumns == null) {
            mmmPerformanceReportColumns = new ArrayList<>();
        }
        return this.mmmPerformanceReportColumns;
    }

}
