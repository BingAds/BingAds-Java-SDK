
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfConversionPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfConversionPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConversionPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}ConversionPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfConversionPerformanceReportColumn", propOrder = {
    "conversionPerformanceReportColumns"
})
public class ArrayOfConversionPerformanceReportColumn {

    @XmlElement(name = "ConversionPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<ConversionPerformanceReportColumn> conversionPerformanceReportColumns;
    public ArrayOfConversionPerformanceReportColumn()
    {
      this.conversionPerformanceReportColumns = new ArrayList<ConversionPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfConversionPerformanceReportColumn(List<ConversionPerformanceReportColumn> conversionperformancereportcolumns)
    {
      this.conversionPerformanceReportColumns = conversionperformancereportcolumns;
    }

    /**
     * Gets the value of the conversionPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the conversionPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the conversionPerformanceReportColumns property.
     */
    public List<ConversionPerformanceReportColumn> getConversionPerformanceReportColumns() {
        if (conversionPerformanceReportColumns == null) {
            conversionPerformanceReportColumns = new ArrayList<>();
        }
        return this.conversionPerformanceReportColumns;
    }

}
