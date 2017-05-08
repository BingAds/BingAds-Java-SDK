
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordEstimatedBid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedBids" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfEstimatedBidAndTraffic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordEstimatedBid", propOrder = {
    "keyword",
    "estimatedBids"
})
public class KeywordEstimatedBid {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "EstimatedBids", nillable = true)
    protected ArrayOfEstimatedBidAndTraffic estimatedBids;

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the estimatedBids property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEstimatedBidAndTraffic }
     *     
     */
    public ArrayOfEstimatedBidAndTraffic getEstimatedBids() {
        return estimatedBids;
    }

    /**
     * Sets the value of the estimatedBids property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEstimatedBidAndTraffic }
     *     
     */
    public void setEstimatedBids(ArrayOfEstimatedBidAndTraffic value) {
        this.estimatedBids = value;
    }

}
