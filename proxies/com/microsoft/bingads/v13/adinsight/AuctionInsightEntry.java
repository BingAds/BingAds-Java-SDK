
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuctionInsightEntry">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DisplayDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AggregatedKpi" type="{https://bingads.microsoft.com/AdInsight/v13}AuctionInsightKpi" minOccurs="0"/>
 *         <element name="SegmentedKpis" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfAuctionInsightKpi" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightEntry", propOrder = {
    "displayDomain",
    "aggregatedKpi",
    "segmentedKpis"
})
public class AuctionInsightEntry {

    @XmlElement(name = "DisplayDomain", nillable = true)
    protected String displayDomain;
    @XmlElement(name = "AggregatedKpi", nillable = true)
    protected AuctionInsightKpi aggregatedKpi;
    @XmlElement(name = "SegmentedKpis", nillable = true)
    protected ArrayOfAuctionInsightKpi segmentedKpis;

    /**
     * Gets the value of the displayDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayDomain() {
        return displayDomain;
    }

    /**
     * Sets the value of the displayDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayDomain(String value) {
        this.displayDomain = value;
    }

    /**
     * Gets the value of the aggregatedKpi property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionInsightKpi }
     *     
     */
    public AuctionInsightKpi getAggregatedKpi() {
        return aggregatedKpi;
    }

    /**
     * Sets the value of the aggregatedKpi property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionInsightKpi }
     *     
     */
    public void setAggregatedKpi(AuctionInsightKpi value) {
        this.aggregatedKpi = value;
    }

    /**
     * Gets the value of the segmentedKpis property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightKpi }
     *     
     */
    public ArrayOfAuctionInsightKpi getSegmentedKpis() {
        return segmentedKpis;
    }

    /**
     * Sets the value of the segmentedKpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightKpi }
     *     
     */
    public void setSegmentedKpis(ArrayOfAuctionInsightKpi value) {
        this.segmentedKpis = value;
    }

}
