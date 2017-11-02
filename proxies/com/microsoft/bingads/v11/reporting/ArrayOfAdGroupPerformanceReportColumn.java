
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdGroupPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdGroupPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v11}AdGroupPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdGroupPerformanceReportColumn", propOrder = {
    "adGroupPerformanceReportColumns"
})
public class ArrayOfAdGroupPerformanceReportColumn {

    @XmlElement(name = "AdGroupPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdGroupPerformanceReportColumn> adGroupPerformanceReportColumns;

    /**
     * Gets the value of the adGroupPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupPerformanceReportColumn }
     * 
     * 
     */
    public List<AdGroupPerformanceReportColumn> getAdGroupPerformanceReportColumns() {
        if (adGroupPerformanceReportColumns == null) {
            adGroupPerformanceReportColumns = new ArrayList<AdGroupPerformanceReportColumn>();
        }
        return this.adGroupPerformanceReportColumns;
    }

}
