
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AggregatedKpi" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}AuctionInsightKpi" minOccurs="0"/>
 *         &lt;element name="SegmentedKpis" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}ArrayOfAuctionInsightKpi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
