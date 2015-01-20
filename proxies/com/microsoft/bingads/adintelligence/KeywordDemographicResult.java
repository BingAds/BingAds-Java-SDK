
package com.microsoft.bingads.adintelligence;

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
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeywordDemographics" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}KeywordDemographic" minOccurs="0"/>
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
    "device",
    "keywordDemographics"
})
public class KeywordDemographicResult {

    @XmlElement(name = "Keyword", nillable = true)
    protected String keyword;
    @XmlElement(name = "Device", nillable = true)
    protected String device;
    @XmlElement(name = "KeywordDemographics", nillable = true)
    protected KeywordDemographic keywordDemographics;

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
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the keywordDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link KeywordDemographic }
     *     
     */
    public KeywordDemographic getKeywordDemographics() {
        return keywordDemographics;
    }

    /**
     * Sets the value of the keywordDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeywordDemographic }
     *     
     */
    public void setKeywordDemographics(KeywordDemographic value) {
        this.keywordDemographics = value;
    }

}
