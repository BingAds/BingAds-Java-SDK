
package com.microsoft.bingads.v12.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAudiencePerformanceReportColumn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAudiencePerformanceReportColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AudiencePerformanceReportColumn" type="{https://bingads.microsoft.com/Reporting/v12}AudiencePerformanceReportColumn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAudiencePerformanceReportColumn", propOrder = {
    "audiencePerformanceReportColumns"
})
public class ArrayOfAudiencePerformanceReportColumn {

    @XmlElement(name = "AudiencePerformanceReportColumn")
    @XmlSchemaType(name = "string")
    protected List<AudiencePerformanceReportColumn> audiencePerformanceReportColumns;

    /**
     * Gets the value of the audiencePerformanceReportColumns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audiencePerformanceReportColumns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudiencePerformanceReportColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudiencePerformanceReportColumn }
     * 
     * 
     */
    public List<AudiencePerformanceReportColumn> getAudiencePerformanceReportColumns() {
        if (audiencePerformanceReportColumns == null) {
            audiencePerformanceReportColumns = new ArrayList<AudiencePerformanceReportColumn>();
        }
        return this.audiencePerformanceReportColumns;
    }

}
