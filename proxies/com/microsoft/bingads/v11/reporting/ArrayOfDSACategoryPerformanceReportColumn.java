
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSACategoryPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSACategoryPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DSACategoryPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}DSACategoryPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSACategoryPerformanceReportColumn", propOrder = {
    "dsaCategoryPerformanceReportColumns"
})
public class ArrayOfDSACategoryPerformanceReportColumn {

    @XmlElement(name = "DSACategoryPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<DSACategoryPerformanceReportColumn> dsaCategoryPerformanceReportColumns;

    /**
     * Gets the value of the dsaCategoryPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsaCategoryPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSACategoryPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSACategoryPerformanceReportColumn }
     * 
     * 
     */
    public List<DSACategoryPerformanceReportColumn> getDSACategoryPerformanceReportColumns() {
        if (dsaCategoryPerformanceReportColumns == null) {
            dsaCategoryPerformanceReportColumns = new ArrayList<DSACategoryPerformanceReportColumn>();
        }
        return this.dsaCategoryPerformanceReportColumns;
    }

}
