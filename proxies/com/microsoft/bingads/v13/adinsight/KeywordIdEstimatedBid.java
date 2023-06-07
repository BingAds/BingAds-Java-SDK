
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdEstimatedBid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeywordIdEstimatedBid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="KeywordEstimatedBid" type="{https://bingads.microsoft.com/AdInsight/v13}KeywordEstimatedBid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdEstimatedBid", propOrder = {
    "keywordId",
    "keywordEstimatedBid"
})
public class KeywordIdEstimatedBid {

    @XmlElement(name = "KeywordId")
    protected Long keywordId;
    @XmlElement(name = "KeywordEstimatedBid", nillable = true)
    protected KeywordEstimatedBid keywordEstimatedBid;

    /**
     * Gets the value of the keywordId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKeywordId() {
        return keywordId;
    }

    /**
     * Sets the value of the keywordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKeywordId(Long value) {
        this.keywordId = value;
    }

    /**
     * Gets the value of the keywordEstimatedBid property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordEstimatedBid }
     *     
     */
    public KeywordEstimatedBid getKeywordEstimatedBid() {
        return keywordEstimatedBid;
    }

    /**
     * Sets the value of the keywordEstimatedBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordEstimatedBid }
     *     
     */
    public void setKeywordEstimatedBid(KeywordEstimatedBid value) {
        this.keywordEstimatedBid = value;
    }

}
