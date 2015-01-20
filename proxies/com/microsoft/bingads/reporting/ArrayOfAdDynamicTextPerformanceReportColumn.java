
package com.microsoft.bingads.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAdDynamicTextPerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdDynamicTextPerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdDynamicTextPerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v9}AdDynamicTextPerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdDynamicTextPerformanceReportColumn", propOrder = {
    "adDynamicTextPerformanceReportColumns"
})
public class ArrayOfAdDynamicTextPerformanceReportColumn {

    @XmlElement(name = "AdDynamicTextPerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AdDynamicTextPerformanceReportColumn> adDynamicTextPerformanceReportColumns;

    /**
     * Gets the value of the adDynamicTextPerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adDynamicTextPerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdDynamicTextPerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdDynamicTextPerformanceReportColumn }
     * 
     * 
     */
    public List<AdDynamicTextPerformanceReportColumn> getAdDynamicTextPerformanceReportColumns() {
        if (adDynamicTextPerformanceReportColumns == null) {
            adDynamicTextPerformanceReportColumns = new ArrayList<AdDynamicTextPerformanceReportColumn>();
        }
        return this.adDynamicTextPerformanceReportColumns;
    }

}
