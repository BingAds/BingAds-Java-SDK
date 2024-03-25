
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfAdGroupPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdGroupPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdGroupPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AdGroupPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupPerformanceReportColumn", propOrder = {
    "adGroupPerformanceReportColumns"
})
public class ArrayOfAdGroupPerformanceReportColumn {

    @XmlElement(name = "AdGroupPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdGroupPerformanceReportColumn> adGroupPerformanceReportColumns;
    public ArrayOfAdGroupPerformanceReportColumn()
    {
      this.adGroupPerformanceReportColumns = new ArrayList<AdGroupPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfAdGroupPerformanceReportColumn(List<AdGroupPerformanceReportColumn> adgroupperformancereportcolumns)
    {
      this.adGroupPerformanceReportColumns = adgroupperformancereportcolumns;
    }

    /**
     * Gets the value of the adGroupPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adGroupPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the adGroupPerformanceReportColumns property.
     */
    public List<AdGroupPerformanceReportColumn> getAdGroupPerformanceReportColumns() {
        if (adGroupPerformanceReportColumns == null) {
            adGroupPerformanceReportColumns = new ArrayList<>();
        }
        return this.adGroupPerformanceReportColumns;
    }

}
