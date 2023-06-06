
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCountsByAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchCountsByAttributes">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HistoricalSearchCounts" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfHistoricalSearchCountPeriodic" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCountsByAttributes", propOrder = {
    "device",
    "historicalSearchCounts"
})
public class SearchCountsByAttributes {

    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "HistoricalSearchCounts", nillable = true)
    protected ArrayOfHistoricalSearchCountPeriodic historicalSearchCounts;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the historicalSearchCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHistoricalSearchCountPeriodic }
     *     
     */
    public ArrayOfHistoricalSearchCountPeriodic getHistoricalSearchCounts() {
        return historicalSearchCounts;
    }

    /**
     * Sets the value of the historicalSearchCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHistoricalSearchCountPeriodic }
     *     
     */
    public void setHistoricalSearchCounts(ArrayOfHistoricalSearchCountPeriodic value) {
        this.historicalSearchCounts = value;
    }

}
