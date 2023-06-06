
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPublisherUsagePerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPublisherUsagePerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PublisherUsagePerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}PublisherUsagePerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPublisherUsagePerformanceReportColumn", propOrder = {
    "publisherUsagePerformanceReportColumns"
})
public class ArrayOfPublisherUsagePerformanceReportColumn {

    @XmlElement(name = "PublisherUsagePerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<PublisherUsagePerformanceReportColumn> publisherUsagePerformanceReportColumns;

    /**
     * Gets the value of the publisherUsagePerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the publisherUsagePerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublisherUsagePerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublisherUsagePerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the publisherUsagePerformanceReportColumns property.
     */
    public List<PublisherUsagePerformanceReportColumn> getPublisherUsagePerformanceReportColumns() {
        if (publisherUsagePerformanceReportColumns == null) {
            publisherUsagePerformanceReportColumns = new ArrayList<>();
        }
        return this.publisherUsagePerformanceReportColumns;
    }

}
