
package com.microsoft.bingads.v13.adinsight;

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
 *         &lt;element name="KeywordEstimatedBids" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordEstimatedBid" minOccurs="0"/>
 *         &lt;element name="AdGroupEstimatedBid" type="{https://bingads.microsoft.com/AdInsight/v13}EstimatedBidAndTraffic" minOccurs="0"/>
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
@XmlRootElement(name = "GetEstimatedBidByKeywordsResponse")
public class GetEstimatedBidByKeywordsResponse {

    @XmlElement(name = "KeywordEstimatedBids", nillable = true)
    protected ArrayOfKeywordEstimatedBid keywordEstimatedBids;
    @XmlElement(name = "AdGroupEstimatedBid", nillable = true)
    protected EstimatedBidAndTraffic adGroupEstimatedBid;

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
     *     {@link EstimatedBidAndTraffic }
     *     
     */
    public EstimatedBidAndTraffic getAdGroupEstimatedBid() {
        return adGroupEstimatedBid;
    }

    /**
     * Sets the value of the adGroupEstimatedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedBidAndTraffic }
     *     
     */
    public void setAdGroupEstimatedBid(EstimatedBidAndTraffic value) {
        this.adGroupEstimatedBid = value;
    }

}
