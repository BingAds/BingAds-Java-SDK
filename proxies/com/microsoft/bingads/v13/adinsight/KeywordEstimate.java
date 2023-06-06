
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordEstimate">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{https://bingads.microsoft.com/AdInsight/v13}Keyword" minOccurs="0"/>
 *         <element name="Maximum" type="{https://bingads.microsoft.com/AdInsight/v13}TrafficEstimate" minOccurs="0"/>
 *         <element name="Minimum" type="{https://bingads.microsoft.com/AdInsight/v13}TrafficEstimate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordEstimate", propOrder = {
    "keyword",
    "maximum",
    "minimum"
})
public class KeywordEstimate {

    @XmlElement(name = "Keyword", nillable = true)
    protected Keyword keyword;
    @XmlElement(name = "Maximum", nillable = true)
    protected TrafficEstimate maximum;
    @XmlElement(name = "Minimum", nillable = true)
    protected TrafficEstimate minimum;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link Keyword }
     *     
     */
    public Keyword getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Keyword }
     *     
     */
    public void setKeyword(Keyword value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficEstimate }
     *     
     */
    public TrafficEstimate getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficEstimate }
     *     
     */
    public void setMaximum(TrafficEstimate value) {
        this.maximum = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficEstimate }
     *     
     */
    public TrafficEstimate getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficEstimate }
     *     
     */
    public void setMinimum(TrafficEstimate value) {
        this.minimum = value;
    }

}
