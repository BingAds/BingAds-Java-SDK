
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfDestinationUrlPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDestinationUrlPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DestinationUrlPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}DestinationUrlPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDestinationUrlPerformanceReportColumn", propOrder = {
    "destinationUrlPerformanceReportColumns"
})
public class ArrayOfDestinationUrlPerformanceReportColumn {

    @XmlElement(name = "DestinationUrlPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<DestinationUrlPerformanceReportColumn> destinationUrlPerformanceReportColumns;
    public ArrayOfDestinationUrlPerformanceReportColumn()
    {
      this.destinationUrlPerformanceReportColumns = new ArrayList<DestinationUrlPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfDestinationUrlPerformanceReportColumn(List<DestinationUrlPerformanceReportColumn> destinationurlperformancereportcolumns)
    {
      this.destinationUrlPerformanceReportColumns = destinationurlperformancereportcolumns;
    }

    /**
     * Gets the value of the destinationUrlPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the destinationUrlPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationUrlPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationUrlPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the destinationUrlPerformanceReportColumns property.
     */
    public List<DestinationUrlPerformanceReportColumn> getDestinationUrlPerformanceReportColumns() {
        if (destinationUrlPerformanceReportColumns == null) {
            destinationUrlPerformanceReportColumns = new ArrayList<>();
        }
        return this.destinationUrlPerformanceReportColumns;
    }

}
