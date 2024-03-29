
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetricData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MetricData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MetricDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetricData", propOrder = {
    "metricDetail",
    "metricType"
})
public class MetricData {

    @XmlElement(name = "MetricDetail", nillable = true)
    protected String metricDetail;
    @XmlElement(name = "MetricType", nillable = true)
    protected String metricType;

    /**
     * Gets the value of the metricDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetricDetail() {
        return metricDetail;
    }

    /**
     * Sets the value of the metricDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetricDetail(String value) {
        this.metricDetail = value;
    }

    /**
     * Gets the value of the metricType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetricType() {
        return metricType;
    }

    /**
     * Sets the value of the metricType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetricType(String value) {
        this.metricType = value;
    }

}
