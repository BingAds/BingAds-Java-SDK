
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAdPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AdPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdPerformanceReportColumn", propOrder = {
    "adPerformanceReportColumns"
})
public class ArrayOfAdPerformanceReportColumn {

    @XmlElement(name = "AdPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdPerformanceReportColumn> adPerformanceReportColumns;
    public ArrayOfAdPerformanceReportColumn()
    {
      this.adPerformanceReportColumns = new ArrayList<AdPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAdPerformanceReportColumn(List<AdPerformanceReportColumn> adperformancereportcolumns)
    {
      this.adPerformanceReportColumns = adperformancereportcolumns;
    }

    /**
     * Gets the value of the adPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the adPerformanceReportColumns property.
     */
    public List<AdPerformanceReportColumn> getAdPerformanceReportColumns() {
        if (adPerformanceReportColumns == null) {
            adPerformanceReportColumns = new ArrayList<>();
        }
        return this.adPerformanceReportColumns;
    }

}
