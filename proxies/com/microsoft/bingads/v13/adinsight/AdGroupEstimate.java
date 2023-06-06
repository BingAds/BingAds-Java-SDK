
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeywordEstimates" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupEstimate", propOrder = {
    "adGroupId",
    "keywordEstimates"
})
public class AdGroupEstimate {

    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "KeywordEstimates", nillable = true)
    protected ArrayOfKeywordEstimate keywordEstimates;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the keywordEstimates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordEstimate }
     *     
     */
    public ArrayOfKeywordEstimate getKeywordEstimates() {
        return keywordEstimates;
    }

    /**
     * Sets the value of the keywordEstimates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordEstimate }
     *     
     */
    public void setKeywordEstimates(ArrayOfKeywordEstimate value) {
        this.keywordEstimates = value;
    }

}
