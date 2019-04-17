
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v13}AdPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdPerformanceReportColumn", propOrder = {
    "adPerformanceReportColumns"
})
public class ArrayOfAdPerformanceReportColumn {

    @XmlElement(name = "AdPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdPerformanceReportColumn> adPerformanceReportColumns;

    /**
     * Gets the value of the adPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdPerformanceReportColumn }
     * 
     * 
     */
    public List<AdPerformanceReportColumn> getAdPerformanceReportColumns() {
        if (adPerformanceReportColumns == null) {
            adPerformanceReportColumns = new ArrayList<AdPerformanceReportColumn>();
        }
        return this.adPerformanceReportColumns;
    }

}
