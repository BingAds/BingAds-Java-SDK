
package com.microsoft.bingads.v13.adinsight;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPerformanceInsightsMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPerformanceInsightsMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PerformanceInsightsMessage" type="{https://bingads.microsoft.com/AdInsight/v13}PerformanceInsightsMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerformanceInsightsMessage", propOrder = {
    "performanceInsightsMessages"
})
public class ArrayOfPerformanceInsightsMessage {

    @XmlElement(name = "PerformanceInsightsMessage", nillable = true)
    protected List<PerformanceInsightsMessage> performanceInsightsMessages;

    /**
     * Gets the value of the performanceInsightsMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceInsightsMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceInsightsMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceInsightsMessage }
     * 
     * 
     */
    public List<PerformanceInsightsMessage> getPerformanceInsightsMessages() {
        if (performanceInsightsMessages == null) {
            performanceInsightsMessages = new ArrayList<PerformanceInsightsMessage>();
        }
        return this.performanceInsightsMessages;
    }

}
