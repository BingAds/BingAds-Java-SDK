
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity.Common}Keyword" minOccurs="0"/>
 *         &lt;element name="Maximum" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}TrafficEstimate" minOccurs="0"/>
 *         &lt;element name="Minimum" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}TrafficEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
