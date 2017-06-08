
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupEstimator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupEstimator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeywordEstimators" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfKeywordEstimator" minOccurs="0"/>
 *         &lt;element name="MaxCpc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupEstimator", propOrder = {
    "adGroupId",
    "keywordEstimators",
    "maxCpc"
})
public class AdGroupEstimator {

    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "KeywordEstimators", nillable = true)
    protected ArrayOfKeywordEstimator keywordEstimators;
    @XmlElement(name = "MaxCpc")
    protected Double maxCpc;

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
     * Gets the value of the keywordEstimators property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordEstimator }
     *     
     */
    public ArrayOfKeywordEstimator getKeywordEstimators() {
        return keywordEstimators;
    }

    /**
     * Sets the value of the keywordEstimators property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordEstimator }
     *     
     */
    public void setKeywordEstimators(ArrayOfKeywordEstimator value) {
        this.keywordEstimators = value;
    }

    /**
     * Gets the value of the maxCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxCpc() {
        return maxCpc;
    }

    /**
     * Sets the value of the maxCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxCpc(Double value) {
        this.maxCpc = value;
    }

}
