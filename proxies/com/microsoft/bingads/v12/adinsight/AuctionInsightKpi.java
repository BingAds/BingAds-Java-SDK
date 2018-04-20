
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightKpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightKpi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Segment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OverlapRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AveragePosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AboveRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TopOfPageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="OutrankingShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightKpi", propOrder = {
    "segment",
    "impressionShare",
    "overlapRate",
    "averagePosition",
    "aboveRate",
    "topOfPageRate",
    "outrankingShare"
})
public class AuctionInsightKpi {

    @XmlElement(name = "Segment", nillable = true)
    protected String segment;
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
    @XmlElement(name = "OutrankingShare")
    protected Double outrankingShare;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegment(String value) {
        this.segment = value;
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

    /**
     * Gets the value of the outrankingShare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOutrankingShare() {
        return outrankingShare;
    }

    /**
     * Sets the value of the outrankingShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOutrankingShare(Double value) {
        this.outrankingShare = value;
    }

}
