
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdDynamicTextPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAdDynamicTextPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdDynamicTextPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AdDynamicTextPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdDynamicTextPerformanceReportColumn", propOrder = {
    "adDynamicTextPerformanceReportColumns"
})
public class ArrayOfAdDynamicTextPerformanceReportColumn {

    @XmlElement(name = "AdDynamicTextPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdDynamicTextPerformanceReportColumn> adDynamicTextPerformanceReportColumns;

    /**
     * Gets the value of the adDynamicTextPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adDynamicTextPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdDynamicTextPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdDynamicTextPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the adDynamicTextPerformanceReportColumns property.
     */
    public List<AdDynamicTextPerformanceReportColumn> getAdDynamicTextPerformanceReportColumns() {
        if (adDynamicTextPerformanceReportColumns == null) {
            adDynamicTextPerformanceReportColumns = new ArrayList<>();
        }
        return this.adDynamicTextPerformanceReportColumns;
    }

}
