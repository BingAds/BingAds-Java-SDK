
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelDimensionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelDimensionPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelDimensionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}HotelDimensionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelDimensionPerformanceReportColumn", propOrder = {
    "hotelDimensionPerformanceReportColumns"
})
public class ArrayOfHotelDimensionPerformanceReportColumn {

    @XmlElement(name = "HotelDimensionPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<HotelDimensionPerformanceReportColumn> hotelDimensionPerformanceReportColumns;

    /**
     * Gets the value of the hotelDimensionPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelDimensionPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelDimensionPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelDimensionPerformanceReportColumn }
     * 
     * 
     */
    public List<HotelDimensionPerformanceReportColumn> getHotelDimensionPerformanceReportColumns() {
        if (hotelDimensionPerformanceReportColumns == null) {
            hotelDimensionPerformanceReportColumns = new ArrayList<HotelDimensionPerformanceReportColumn>();
        }
        return this.hotelDimensionPerformanceReportColumns;
    }

}
