
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
 *         &lt;element name="KeywordPerformance" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordPerformance" minOccurs="0"/>
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
    "keywordPerformance"
})
@XmlRootElement(name = "GetPublisherKeywordPerformanceResponse", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetPublisherKeywordPerformanceResponse {

    @XmlElement(name = "KeywordPerformance", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordPerformance keywordPerformance;

    /**
     * Gets the value of the keywordPerformance property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordPerformance }
     *     
     */
    public ArrayOfKeywordPerformance getKeywordPerformance() {
        return keywordPerformance;
    }

    /**
     * Sets the value of the keywordPerformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordPerformance }
     *     
     */
    public void setKeywordPerformance(ArrayOfKeywordPerformance value) {
        this.keywordPerformance = value;
    }

}
