
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfTravelQueryInsightReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTravelQueryInsightReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TravelQueryInsightReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}TravelQueryInsightReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTravelQueryInsightReportColumn", propOrder = {
    "travelQueryInsightReportColumns"
})
public class ArrayOfTravelQueryInsightReportColumn {

    @XmlElement(name = "TravelQueryInsightReportColumn")
    @XmlSchemaType(name = "string")
    protected List<TravelQueryInsightReportColumn> travelQueryInsightReportColumns;
    public ArrayOfTravelQueryInsightReportColumn()
    {
      this.travelQueryInsightReportColumns = new ArrayList<TravelQueryInsightReportColumn>();
    }
    @JsonCreator
    public ArrayOfTravelQueryInsightReportColumn(List<TravelQueryInsightReportColumn> travelqueryinsightreportcolumns)
    {
      this.travelQueryInsightReportColumns = travelqueryinsightreportcolumns;
    }

    /**
     * Gets the value of the travelQueryInsightReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the travelQueryInsightReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelQueryInsightReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelQueryInsightReportColumn }
     * 
     * 
     * @return
     *     The value of the travelQueryInsightReportColumns property.
     */
    public List<TravelQueryInsightReportColumn> getTravelQueryInsightReportColumns() {
        if (travelQueryInsightReportColumns == null) {
            travelQueryInsightReportColumns = new ArrayList<>();
        }
        return this.travelQueryInsightReportColumns;
    }

}
