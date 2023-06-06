
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGoalsAndFunnelsReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGoalsAndFunnelsReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GoalsAndFunnelsReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}GoalsAndFunnelsReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    /**
     * Gets the value of the goalsAndFunnelsReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goalsAndFunnelsReportColumns property.
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
     */
    public List<GoalsAndFunnelsReportColumn> getGoalsAndFunnelsReportColumns() {
        if (goalsAndFunnelsReportColumns == null) {
            goalsAndFunnelsReportColumns = new ArrayList<GoalsAndFunnelsReportColumn>();
        }
        return this.goalsAndFunnelsReportColumns;
    }

}
