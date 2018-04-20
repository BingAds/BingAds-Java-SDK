
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSAAutoTargetPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSAAutoTargetPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DSAAutoTargetPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}DSAAutoTargetPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSAAutoTargetPerformanceReportColumn", propOrder = {
    "dsaAutoTargetPerformanceReportColumns"
})
public class ArrayOfDSAAutoTargetPerformanceReportColumn {

    @XmlElement(name = "DSAAutoTargetPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<DSAAutoTargetPerformanceReportColumn> dsaAutoTargetPerformanceReportColumns;

    /**
     * Gets the value of the dsaAutoTargetPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dsaAutoTargetPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSAAutoTargetPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSAAutoTargetPerformanceReportColumn }
     * 
     * 
     */
    public List<DSAAutoTargetPerformanceReportColumn> getDSAAutoTargetPerformanceReportColumns() {
        if (dsaAutoTargetPerformanceReportColumns == null) {
            dsaAutoTargetPerformanceReportColumns = new ArrayList<DSAAutoTargetPerformanceReportColumn>();
        }
        return this.dsaAutoTargetPerformanceReportColumns;
    }

}
