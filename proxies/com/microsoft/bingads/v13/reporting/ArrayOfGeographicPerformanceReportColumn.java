
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGeographicPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeographicPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}GeographicPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the geographicPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicPerformanceReportColumns property.
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
     */
    public List<GeographicPerformanceReportColumn> getGeographicPerformanceReportColumns() {
        if (geographicPerformanceReportColumns == null) {
            geographicPerformanceReportColumns = new ArrayList<GeographicPerformanceReportColumn>();
        }
        return this.geographicPerformanceReportColumns;
    }

}
