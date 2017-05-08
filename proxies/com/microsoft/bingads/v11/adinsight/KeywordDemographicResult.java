
package com.microsoft.bingads.v11.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeywordDemographicResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordDemographicResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordDemographics" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V11.Entity}ArrayOfKeywordDemographic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordDemographicResult", propOrder = {
    "keyword",
    "keywordDemographics"
})
public class KeywordDemographicResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "KeywordDemographics", nillable = true)
    protected ArrayOfKeywordDemographic keywordDemographics;

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
     * Gets the value of the keywordDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordDemographic }
     *     
     */
    public ArrayOfKeywordDemographic getKeywordDemographics() {
        return keywordDemographics;
    }

    /**
     * Sets the value of the keywordDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordDemographic }
     *     
     */
    public void setKeywordDemographics(ArrayOfKeywordDemographic value) {
        this.keywordDemographics = value;
    }

}
