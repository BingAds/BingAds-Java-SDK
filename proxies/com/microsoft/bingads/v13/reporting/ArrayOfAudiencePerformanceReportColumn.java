
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAudiencePerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAudiencePerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AudiencePerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AudiencePerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudiencePerformanceReportColumn", propOrder = {
    "audiencePerformanceReportColumns"
})
public class ArrayOfAudiencePerformanceReportColumn {

    @XmlElement(name = "AudiencePerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AudiencePerformanceReportColumn> audiencePerformanceReportColumns;

    /**
     * Gets the value of the audiencePerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the audiencePerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudiencePerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudiencePerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the audiencePerformanceReportColumns property.
     */
    public List<AudiencePerformanceReportColumn> getAudiencePerformanceReportColumns() {
        if (audiencePerformanceReportColumns == null) {
            audiencePerformanceReportColumns = new ArrayList<>();
        }
        return this.audiencePerformanceReportColumns;
    }

}
