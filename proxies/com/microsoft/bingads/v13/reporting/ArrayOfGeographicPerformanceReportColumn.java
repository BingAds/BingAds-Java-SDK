
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfGeographicPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGeographicPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GeographicPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}GeographicPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeographicPerformanceReportColumn", propOrder = {
    "geographicPerformanceReportColumns"
})
public class ArrayOfGeographicPerformanceReportColumn {

    @XmlElement(name = "GeographicPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<GeographicPerformanceReportColumn> geographicPerformanceReportColumns;
    public ArrayOfGeographicPerformanceReportColumn()
    {
      this.geographicPerformanceReportColumns = new ArrayList<GeographicPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfGeographicPerformanceReportColumn(List<GeographicPerformanceReportColumn> geographicperformancereportcolumns)
    {
      this.geographicPerformanceReportColumns = geographicperformancereportcolumns;
    }

    /**
     * Gets the value of the geographicPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the geographicPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the geographicPerformanceReportColumns property.
     */
    public List<GeographicPerformanceReportColumn> getGeographicPerformanceReportColumns() {
        if (geographicPerformanceReportColumns == null) {
            geographicPerformanceReportColumns = new ArrayList<>();
        }
        return this.geographicPerformanceReportColumns;
    }

}
