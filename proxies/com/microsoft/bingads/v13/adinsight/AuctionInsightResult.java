
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuctionInsightResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Segments" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAuctionSegment" minOccurs="0"/>
 *         <element name="Entries" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAuctionInsightEntry" minOccurs="0"/>
 *         <element name="UsedImpressions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="UsedKeywords" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightResult", propOrder = {
    "segments",
    "entries",
    "usedImpressions",
    "usedKeywords"
})
public class AuctionInsightResult {

    @XmlElement(name = "Segments", nillable = true)
    protected ArrayOfAuctionSegment segments;
    @XmlElement(name = "Entries", nillable = true)
    protected ArrayOfAuctionInsightEntry entries;
    @XmlElement(name = "UsedImpressions")
    protected Double usedImpressions;
    @XmlElement(name = "UsedKeywords")
    protected Double usedKeywords;

    /**
     * Gets the value of the segments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionSegment }
     *     
     */
    public ArrayOfAuctionSegment getSegments() {
        return segments;
    }

    /**
     * Sets the value of the segments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionSegment }
     *     
     */
    public void setSegments(ArrayOfAuctionSegment value) {
        this.segments = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightEntry }
     *     
     */
    public ArrayOfAuctionInsightEntry getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightEntry }
     *     
     */
    public void setEntries(ArrayOfAuctionInsightEntry value) {
        this.entries = value;
    }

    /**
     * Gets the value of the usedImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsedImpressions() {
        return usedImpressions;
    }

    /**
     * Sets the value of the usedImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsedImpressions(Double value) {
        this.usedImpressions = value;
    }

    /**
     * Gets the value of the usedKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUsedKeywords() {
        return usedKeywords;
    }

    /**
     * Sets the value of the usedKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUsedKeywords(Double value) {
        this.usedKeywords = value;
    }

}
