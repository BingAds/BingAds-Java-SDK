
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightKpi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuctionInsightKpi">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Segments" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="ImpressionShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="OverlapRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="AveragePosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="AboveRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="TopOfPageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="OutrankingShare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="AbsoluteTopOfPageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightKpi", propOrder = {
    "segments",
    "impressionShare",
    "overlapRate",
    "averagePosition",
    "aboveRate",
    "topOfPageRate",
    "outrankingShare",
    "absoluteTopOfPageRate"
})
public class AuctionInsightKpi {

    @XmlElement(name = "Segments", nillable = true)
    protected ArrayOfstring segments;
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
    @XmlElement(name = "AbsoluteTopOfPageRate")
    protected Double absoluteTopOfPageRate;

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSegments(ArrayOfstring value) {
        this.segments = value;
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

    /**
     * Gets the value of the absoluteTopOfPageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAbsoluteTopOfPageRate() {
        return absoluteTopOfPageRate;
    }

    /**
     * Sets the value of the absoluteTopOfPageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAbsoluteTopOfPageRate(Double value) {
        this.absoluteTopOfPageRate = value;
    }

}
