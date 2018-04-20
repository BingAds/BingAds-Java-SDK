
package com.microsoft.bingads.v12.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordIdEstimatedPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordIdEstimatedPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeywordId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeywordEstimatedPosition" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}KeywordEstimatedPosition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordIdEstimatedPosition", propOrder = {
    "keywordId",
    "keywordEstimatedPosition"
})
public class KeywordIdEstimatedPosition {

    @XmlElement(name = "KeywordId")
    protected Long keywordId;
    @XmlElement(name = "KeywordEstimatedPosition", nillable = true)
    protected KeywordEstimatedPosition keywordEstimatedPosition;

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
     * Gets the value of the keywordEstimatedPosition property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordEstimatedPosition }
     *     
     */
    public KeywordEstimatedPosition getKeywordEstimatedPosition() {
        return keywordEstimatedPosition;
    }

    /**
     * Sets the value of the keywordEstimatedPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordEstimatedPosition }
     *     
     */
    public void setKeywordEstimatedPosition(KeywordEstimatedPosition value) {
        this.keywordEstimatedPosition = value;
    }

}
