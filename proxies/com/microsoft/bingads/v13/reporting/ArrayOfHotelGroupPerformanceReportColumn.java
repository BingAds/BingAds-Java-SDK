
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfHotelGroupPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfHotelGroupPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HotelGroupPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}HotelGroupPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelGroupPerformanceReportColumn", propOrder = {
    "hotelGroupPerformanceReportColumns"
})
public class ArrayOfHotelGroupPerformanceReportColumn {

    @XmlElement(name = "HotelGroupPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<HotelGroupPerformanceReportColumn> hotelGroupPerformanceReportColumns;
    public ArrayOfHotelGroupPerformanceReportColumn()
    {
      this.hotelGroupPerformanceReportColumns = new ArrayList<HotelGroupPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfHotelGroupPerformanceReportColumn(List<HotelGroupPerformanceReportColumn> hotelgroupperformancereportcolumns)
    {
      this.hotelGroupPerformanceReportColumns = hotelgroupperformancereportcolumns;
    }

    /**
     * Gets the value of the hotelGroupPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hotelGroupPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelGroupPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelGroupPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the hotelGroupPerformanceReportColumns property.
     */
    public List<HotelGroupPerformanceReportColumn> getHotelGroupPerformanceReportColumns() {
        if (hotelGroupPerformanceReportColumns == null) {
            hotelGroupPerformanceReportColumns = new ArrayList<>();
        }
        return this.hotelGroupPerformanceReportColumns;
    }

}
