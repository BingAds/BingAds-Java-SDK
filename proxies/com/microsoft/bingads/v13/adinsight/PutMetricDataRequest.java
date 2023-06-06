
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Metrics" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfMetricData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metrics"
})
@XmlRootElement(name = "PutMetricDataRequest")
public class PutMetricDataRequest {

    @XmlElement(name = "Metrics", nillable = true)
    protected ArrayOfMetricData metrics;

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMetricData }
     *     
     */
    public ArrayOfMetricData getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMetricData }
     *     
     */
    public void setMetrics(ArrayOfMetricData value) {
        this.metrics = value;
    }

}
