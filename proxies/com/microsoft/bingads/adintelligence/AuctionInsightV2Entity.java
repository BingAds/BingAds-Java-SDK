
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightV2Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightV2Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AggregatedKPI" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AuctionInsightKPINode" minOccurs="0"/>
 *         &lt;element name="KPIs" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfAuctionInsightKPINode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightV2Entity", propOrder = {
    "displayDomain",
    "aggregatedKPI",
    "kpIs"
})
public class AuctionInsightV2Entity {

    @XmlElement(name = "DisplayDomain", nillable = true)
    protected String displayDomain;
    @XmlElement(name = "AggregatedKPI", nillable = true)
    protected AuctionInsightKPINode aggregatedKPI;
    @XmlElement(name = "KPIs", nillable = true)
    protected ArrayOfAuctionInsightKPINode kpIs;

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
     * Gets the value of the aggregatedKPI property.
     * 
     * @return
     *     possible object is
     *     {@link AuctionInsightKPINode }
     *     
     */
    public AuctionInsightKPINode getAggregatedKPI() {
        return aggregatedKPI;
    }

    /**
     * Sets the value of the aggregatedKPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionInsightKPINode }
     *     
     */
    public void setAggregatedKPI(AuctionInsightKPINode value) {
        this.aggregatedKPI = value;
    }

    /**
     * Gets the value of the kpIs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightKPINode }
     *     
     */
    public ArrayOfAuctionInsightKPINode getKPIs() {
        return kpIs;
    }

    /**
     * Sets the value of the kpIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightKPINode }
     *     
     */
    public void setKPIs(ArrayOfAuctionInsightKPINode value) {
        this.kpIs = value;
    }

}
