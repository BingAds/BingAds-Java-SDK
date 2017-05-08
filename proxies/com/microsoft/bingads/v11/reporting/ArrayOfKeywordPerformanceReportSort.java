
package com.microsoft.bingads.v11.reporting;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordPerformanceReportSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeywordPerformanceReportSort">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordPerformanceReportSort" type="{https://bingads.microsoft.com/Reporting/v11}KeywordPerformanceReportSort" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeywordPerformanceReportSort", propOrder = {
    "keywordPerformanceReportSorts"
})
public class ArrayOfKeywordPerformanceReportSort {

    @XmlElement(name = "KeywordPerformanceReportSort", nillable = true)
    protected List<KeywordPerformanceReportSort> keywordPerformanceReportSorts;

    /**
     * Gets the value of the keywordPerformanceReportSorts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPerformanceReportSorts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPerformanceReportSorts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordPerformanceReportSort }
     * 
     * 
     */
    public List<KeywordPerformanceReportSort> getKeywordPerformanceReportSorts() {
        if (keywordPerformanceReportSorts == null) {
            keywordPerformanceReportSorts = new ArrayList<KeywordPerformanceReportSort>();
        }
        return this.keywordPerformanceReportSorts;
    }

}
