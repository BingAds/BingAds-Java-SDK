
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightKPINode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightKPINode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DimensionNames" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="ImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OverlapRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AveragePosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AboveRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TopOfPageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightKPINode", propOrder = {
    "dimensionNames",
    "impressionShare",
    "overlapRate",
    "averagePosition",
    "aboveRate",
    "topOfPageRate"
})
public class AuctionInsightKPINode {

    @XmlElement(name = "DimensionNames", nillable = true)
    protected ArrayOfstring dimensionNames;
    @XmlElement(name = "ImpressionShare")
    protected Double impressionShare;
    @XmlElement(name = "OverlapRate")
    protected Double overlapRate;
    @XmlElement(name = "AveragePosition")
    protected Double averagePosition;
    @XmlElement(name = "AboveRate")
    protected Double aboveRate;
    @XmlElement(name = "TopOfPageRate")
    protected Double topOfPageRate;

    /**
     * Gets the value of the dimensionNames property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getDimensionNames() {
        return dimensionNames;
    }

    /**
     * Sets the value of the dimensionNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setDimensionNames(ArrayOfstring value) {
        this.dimensionNames = value;
    }

    /**
     * Gets the value of the impressionShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImpressionShare() {
        return impressionShare;
    }

    /**
     * Sets the value of the impressionShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImpressionShare(Double value) {
        this.impressionShare = value;
    }

    /**
     * Gets the value of the overlapRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOverlapRate() {
        return overlapRate;
    }

    /**
     * Sets the value of the overlapRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOverlapRate(Double value) {
        this.overlapRate = value;
    }

    /**
     * Gets the value of the averagePosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAveragePosition() {
        return averagePosition;
    }

    /**
     * Sets the value of the averagePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAveragePosition(Double value) {
        this.averagePosition = value;
    }

    /**
     * Gets the value of the aboveRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAboveRate() {
        return aboveRate;
    }

    /**
     * Sets the value of the aboveRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAboveRate(Double value) {
        this.aboveRate = value;
    }

    /**
     * Gets the value of the topOfPageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTopOfPageRate() {
        return topOfPageRate;
    }

    /**
     * Sets the value of the topOfPageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTopOfPageRate(Double value) {
        this.topOfPageRate = value;
    }

}
