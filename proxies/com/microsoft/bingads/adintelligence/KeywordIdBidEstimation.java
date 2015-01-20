
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdBidEstimation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordIdBidEstimation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BidLandscape" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordBidLandscape" minOccurs="0"/>
 *         &lt;element name="BidSuggestion" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordIdBidSuggestion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdBidEstimation", propOrder = {
    "bidLandscape",
    "bidSuggestion"
})
public class KeywordIdBidEstimation {

    @XmlElement(name = "BidLandscape", nillable = true)
    protected KeywordBidLandscape bidLandscape;
    @XmlElement(name = "BidSuggestion", nillable = true)
    protected KeywordIdBidSuggestion bidSuggestion;

    /**
     * Gets the value of the bidLandscape property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordBidLandscape }
     *     
     */
    public KeywordBidLandscape getBidLandscape() {
        return bidLandscape;
    }

    /**
     * Sets the value of the bidLandscape property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordBidLandscape }
     *     
     */
    public void setBidLandscape(KeywordBidLandscape value) {
        this.bidLandscape = value;
    }

    /**
     * Gets the value of the bidSuggestion property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordIdBidSuggestion }
     *     
     */
    public KeywordIdBidSuggestion getBidSuggestion() {
        return bidSuggestion;
    }

    /**
     * Sets the value of the bidSuggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordIdBidSuggestion }
     *     
     */
    public void setBidSuggestion(KeywordIdBidSuggestion value) {
        this.bidSuggestion = value;
    }

}
