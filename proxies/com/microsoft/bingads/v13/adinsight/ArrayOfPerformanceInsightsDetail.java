
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPerformanceInsightsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPerformanceInsightsDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformanceInsightsDetail" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerformanceInsightsDetail", propOrder = {
    "performanceInsightsDetails"
})
public class ArrayOfPerformanceInsightsDetail {

    @XmlElement(name = "PerformanceInsightsDetail", nillable = true)
    protected List<PerformanceInsightsDetail> performanceInsightsDetails;

    /**
     * Gets the value of the performanceInsightsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceInsightsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceInsightsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceInsightsDetail }
     * 
     * 
     */
    public List<PerformanceInsightsDetail> getPerformanceInsightsDetails() {
        if (performanceInsightsDetails == null) {
            performanceInsightsDetails = new ArrayList<PerformanceInsightsDetail>();
        }
        return this.performanceInsightsDetails;
    }

}
