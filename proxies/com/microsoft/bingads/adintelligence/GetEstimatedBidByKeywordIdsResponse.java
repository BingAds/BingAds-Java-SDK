
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
 *         &lt;element name="KeywordEstimatedBids" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordIdEstimatedBid" minOccurs="0"/>
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
    "keywordEstimatedBids"
})
@XmlRootElement(name = "GetEstimatedBidByKeywordIdsResponse", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetEstimatedBidByKeywordIdsResponse {

    @XmlElement(name = "KeywordEstimatedBids", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordIdEstimatedBid keywordEstimatedBids;

    /**
     * Gets the value of the keywordEstimatedBids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordIdEstimatedBid }
     *     
     */
    public ArrayOfKeywordIdEstimatedBid getKeywordEstimatedBids() {
        return keywordEstimatedBids;
    }

    /**
     * Sets the value of the keywordEstimatedBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordIdEstimatedBid }
     *     
     */
    public void setKeywordEstimatedBids(ArrayOfKeywordIdEstimatedBid value) {
        this.keywordEstimatedBids = value;
    }

}
