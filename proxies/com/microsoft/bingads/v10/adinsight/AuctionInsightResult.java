
package com.microsoft.bingads.v10.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuctionInsightResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuctionInsightResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalNumEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Entries" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.Entity}ArrayOfAuctionInsightV2Entity" minOccurs="0"/>
 *         &lt;element name="UsedImpressions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="UsedKeywords" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionInsightResult", propOrder = {
    "totalNumEntries",
    "entries",
    "usedImpressions",
    "usedKeywords"
})
public class AuctionInsightResult {

    @XmlElement(name = "TotalNumEntries")
    protected Integer totalNumEntries;
    @XmlElement(name = "Entries", nillable = true)
    protected ArrayOfAuctionInsightV2Entity entries;
    @XmlElement(name = "UsedImpressions")
    protected Double usedImpressions;
    @XmlElement(name = "UsedKeywords")
    protected Double usedKeywords;

    /**
     * Gets the value of the totalNumEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNumEntries() {
        return totalNumEntries;
    }

    /**
     * Sets the value of the totalNumEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNumEntries(Integer value) {
        this.totalNumEntries = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAuctionInsightV2Entity }
     *     
     */
    public ArrayOfAuctionInsightV2Entity getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAuctionInsightV2Entity }
     *     
     */
    public void setEntries(ArrayOfAuctionInsightV2Entity value) {
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
