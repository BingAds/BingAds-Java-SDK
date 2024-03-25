
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;import com.fasterxml.jackson.annotation.JsonCreator;


/**
 * <p>Java class for ArrayOfGoalsAndFunnelsReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGoalsAndFunnelsReportColumn">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GoalsAndFunnelsReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}GoalsAndFunnelsReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGoalsAndFunnelsReportColumn", propOrder = {
    "goalsAndFunnelsReportColumns"
})
public class ArrayOfGoalsAndFunnelsReportColumn {

    @XmlElement(name = "GoalsAndFunnelsReportColumn")
    @XmlSchemaType(name = "string")
    protected List<GoalsAndFunnelsReportColumn> goalsAndFunnelsReportColumns;
    public ArrayOfGoalsAndFunnelsReportColumn()
    {
      this.goalsAndFunnelsReportColumns = new ArrayList<GoalsAndFunnelsReportColumn>();
    }
    @JsonCreator
    public ArrayOfGoalsAndFunnelsReportColumn(List<GoalsAndFunnelsReportColumn> goalsandfunnelsreportcolumns)
    {
      this.goalsAndFunnelsReportColumns = goalsandfunnelsreportcolumns;
    }

    /**
     * Gets the value of the goalsAndFunnelsReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the goalsAndFunnelsReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoalsAndFunnelsReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoalsAndFunnelsReportColumn }
     * 
     * 
     * @return
     *     The value of the goalsAndFunnelsReportColumns property.
     */
    public List<GoalsAndFunnelsReportColumn> getGoalsAndFunnelsReportColumns() {
        if (goalsAndFunnelsReportColumns == null) {
            goalsAndFunnelsReportColumns = new ArrayList<>();
        }
        return this.goalsAndFunnelsReportColumns;
    }

}
