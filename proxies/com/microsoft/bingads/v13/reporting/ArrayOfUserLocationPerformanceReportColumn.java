
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfUserLocationPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfUserLocationPerformanceReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UserLocationPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}UserLocationPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUserLocationPerformanceReportColumn", propOrder = {
    "userLocationPerformanceReportColumns"
})
public class ArrayOfUserLocationPerformanceReportColumn {

    @XmlElement(name = "UserLocationPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<UserLocationPerformanceReportColumn> userLocationPerformanceReportColumns;
    public ArrayOfUserLocationPerformanceReportColumn()
    {
      this.userLocationPerformanceReportColumns = new ArrayList<UserLocationPerformanceReportColumn>();
    }
    @JsonCreator
    public ArrayOfUserLocationPerformanceReportColumn(List<UserLocationPerformanceReportColumn> userlocationperformancereportcolumns)
    {
      this.userLocationPerformanceReportColumns = userlocationperformancereportcolumns;
    }

    /**
     * Gets the value of the userLocationPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the userLocationPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserLocationPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserLocationPerformanceReportColumn }
     * 
     * 
     * @return
     *     The value of the userLocationPerformanceReportColumns property.
     */
    public List<UserLocationPerformanceReportColumn> getUserLocationPerformanceReportColumns() {
        if (userLocationPerformanceReportColumns == null) {
            userLocationPerformanceReportColumns = new ArrayList<>();
        }
        return this.userLocationPerformanceReportColumns;
    }

}
