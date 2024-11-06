
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Java class for ArrayOfPerformanceInsightsMessageParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPerformanceInsightsMessageParameter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PerformanceInsightsMessageParameter" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessageParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerformanceInsightsMessageParameter", propOrder = {
    "performanceInsightsMessageParameters"
})
public class ArrayOfPerformanceInsightsMessageParameter {

    @XmlElement(name = "PerformanceInsightsMessageParameter", nillable = true)
    protected List<PerformanceInsightsMessageParameter> performanceInsightsMessageParameters;
    public ArrayOfPerformanceInsightsMessageParameter()
    {
      this.performanceInsightsMessageParameters = new ArrayList<PerformanceInsightsMessageParameter>();
    }
    @JsonCreator
    public ArrayOfPerformanceInsightsMessageParameter(List<PerformanceInsightsMessageParameter> performanceinsightsmessageparameters)
    {
      this.performanceInsightsMessageParameters = performanceinsightsmessageparameters;
    }

    /**
     * Gets the value of the performanceInsightsMessageParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the performanceInsightsMessageParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceInsightsMessageParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceInsightsMessageParameter }
     * 
     * 
     * @return
     *     The value of the performanceInsightsMessageParameters property.
     */
    public List<PerformanceInsightsMessageParameter> getPerformanceInsightsMessageParameters() {
        if (performanceInsightsMessageParameters == null) {
            performanceInsightsMessageParameters = new ArrayList<>();
        }
        return this.performanceInsightsMessageParameters;
    }

}
