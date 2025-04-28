
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAppsPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAppsPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppsPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AppsPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAppsPerformanceReportColumn", propOrder = {
    "appsPerformanceReportColumns"
})
public class ArrayOfAppsPerformanceReportColumn {

    @XmlElement(name = "AppsPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AppsPerformanceReportColumn> appsPerformanceReportColumns;
    public ArrayOfAppsPerformanceReportColumn()
    {
      this.appsPerformanceReportColumns = new ArrayList<AppsPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAppsPerformanceReportColumn(List<AppsPerformanceReportColumn> appsperformancereportcolumns)
    {
      this.appsPerformanceReportColumns = appsperformancereportcolumns;
    }

    /**
     * Gets the value of the appsPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the appsPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppsPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppsPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the appsPerformanceReportColumns property.
     */
    public List<AppsPerformanceReportColumn> getAppsPerformanceReportColumns() {
        if (appsPerformanceReportColumns == null) {
            appsPerformanceReportColumns = new ArrayList<>();
        }
        return this.appsPerformanceReportColumns;
    }

}
