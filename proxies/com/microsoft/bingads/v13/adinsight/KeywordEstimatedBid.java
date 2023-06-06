
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordEstimatedBid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EstimatedBids" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfEstimatedBidAndTraffic" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
