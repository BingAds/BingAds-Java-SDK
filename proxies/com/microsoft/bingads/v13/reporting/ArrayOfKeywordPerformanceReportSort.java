
package com.microsoft.bingads.v13.reporting;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKeywordPerformanceReportSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfKeywordPerformanceReportSort">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordPerformanceReportSort" type="{https://bingads.microsoft.com/Reporting/v13}KeywordPerformanceReportSort" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keywordPerformanceReportSorts property.
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
     * @return
     *     The value of the keywordPerformanceReportSorts property.
     */
    public List<KeywordPerformanceReportSort> getKeywordPerformanceReportSorts() {
        if (keywordPerformanceReportSorts == null) {
            keywordPerformanceReportSorts = new ArrayList<>();
        }
        return this.keywordPerformanceReportSorts;
    }

}
