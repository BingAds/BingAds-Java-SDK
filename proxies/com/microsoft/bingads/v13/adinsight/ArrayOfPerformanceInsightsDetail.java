
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfPerformanceInsightsDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPerformanceInsightsDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PerformanceInsightsDetail" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
    public ArrayOfPerformanceInsightsDetail()
    {
      this.performanceInsightsDetails = new ArrayList<PerformanceInsightsDetail>();
    }
    @JsonCreator
    public ArrayOfPerformanceInsightsDetail(List<PerformanceInsightsDetail> performanceinsightsdetails)
    {
      this.performanceInsightsDetails = performanceinsightsdetails;
    }

    /**
     * Gets the value of the performanceInsightsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the performanceInsightsDetails property.
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
     * @return
     *     The value of the performanceInsightsDetails property.
     */
    public List<PerformanceInsightsDetail> getPerformanceInsightsDetails() {
        if (performanceInsightsDetails == null) {
            performanceInsightsDetails = new ArrayList<>();
        }
        return this.performanceInsightsDetails;
    }

}
