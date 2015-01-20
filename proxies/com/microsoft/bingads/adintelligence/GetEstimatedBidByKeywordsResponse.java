
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordEstimatedBids" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordEstimatedBid" minOccurs="0"/>
 *         &lt;element name="AdGroupEstimatedBid" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}AdGroupEstimatedBid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keywordEstimatedBids",
    "adGroupEstimatedBid"
})
@XmlRootElement(name = "GetEstimatedBidByKeywordsResponse", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetEstimatedBidByKeywordsResponse {

    @XmlElement(name = "KeywordEstimatedBids", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordEstimatedBid keywordEstimatedBids;
    @XmlElement(name = "AdGroupEstimatedBid", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected AdGroupEstimatedBid adGroupEstimatedBid;

    /**
     * Gets the value of the keywordEstimatedBids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordEstimatedBid }
     *     
     */
    public ArrayOfKeywordEstimatedBid getKeywordEstimatedBids() {
        return keywordEstimatedBids;
    }

    /**
     * Sets the value of the keywordEstimatedBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordEstimatedBid }
     *     
     */
    public void setKeywordEstimatedBids(ArrayOfKeywordEstimatedBid value) {
        this.keywordEstimatedBids = value;
    }

    /**
     * Gets the value of the adGroupEstimatedBid property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupEstimatedBid }
     *     
     */
    public AdGroupEstimatedBid getAdGroupEstimatedBid() {
        return adGroupEstimatedBid;
    }

    /**
     * Sets the value of the adGroupEstimatedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupEstimatedBid }
     *     
     */
    public void setAdGroupEstimatedBid(AdGroupEstimatedBid value) {
        this.adGroupEstimatedBid = value;
    }

}
