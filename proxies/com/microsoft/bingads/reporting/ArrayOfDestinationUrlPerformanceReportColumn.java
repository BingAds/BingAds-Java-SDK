
package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDestinationUrlPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDestinationUrlPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DestinationUrlPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v9}DestinationUrlPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the destinationUrlPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationUrlPerformanceReportColumns property.
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
     */
    public List<DestinationUrlPerformanceReportColumn> getDestinationUrlPerformanceReportColumns() {
        if (destinationUrlPerformanceReportColumns == null) {
            destinationUrlPerformanceReportColumns = new ArrayList<DestinationUrlPerformanceReportColumn>();
        }
        return this.destinationUrlPerformanceReportColumns;
    }

}
