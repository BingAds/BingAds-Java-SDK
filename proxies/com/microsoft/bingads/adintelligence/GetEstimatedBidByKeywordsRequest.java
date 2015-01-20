
package com.microsoft.bingads.adintelligence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Keywords" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}ArrayOfKeywordAndMatchType" minOccurs="0"/>
 *         &lt;element name="TargetPositionForAds" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}TargetAdPosition" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublisherCountries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.CampaignManagement.Api.DataContracts}Currency" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdgroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="GetBidsAtLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "keywords",
    "targetPositionForAds",
    "language",
    "publisherCountries",
    "currency",
    "campaignId",
    "adgroupId",
    "getBidsAtLevel"
})
@XmlRootElement(name = "GetEstimatedBidByKeywordsRequest", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
public class GetEstimatedBidByKeywordsRequest {

    @XmlElement(name = "Keywords", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfKeywordAndMatchType keywords;
    @XmlElement(name = "TargetPositionForAds", namespace = "https://bingads.microsoft.com/AdIntelligence/v9")
    @XmlSchemaType(name = "string")
    protected TargetAdPosition targetPositionForAds;
    @XmlElement(name = "Language", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected String language;
    @XmlElement(name = "PublisherCountries", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected ArrayOfstring publisherCountries;
    @XmlElement(name = "Currency", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    @XmlSchemaType(name = "string")
    protected Currency currency;
    @XmlElement(name = "CampaignId", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "AdgroupId", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected Long adgroupId;
    @XmlElement(name = "GetBidsAtLevel", namespace = "https://bingads.microsoft.com/AdIntelligence/v9", nillable = true)
    protected Integer getBidsAtLevel;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordAndMatchType }
     *     
     */
    public ArrayOfKeywordAndMatchType getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordAndMatchType }
     *     
     */
    public void setKeywords(ArrayOfKeywordAndMatchType value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the targetPositionForAds property.
     * 
     * @return
     *     possible object is
     *     {@link TargetAdPosition }
     *     
     */
    public TargetAdPosition getTargetPositionForAds() {
        return targetPositionForAds;
    }

    /**
     * Sets the value of the targetPositionForAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetAdPosition }
     *     
     */
    public void setTargetPositionForAds(TargetAdPosition value) {
        this.targetPositionForAds = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the publisherCountries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getPublisherCountries() {
        return publisherCountries;
    }

    /**
     * Sets the value of the publisherCountries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setPublisherCountries(ArrayOfstring value) {
        this.publisherCountries = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adgroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdgroupId() {
        return adgroupId;
    }

    /**
     * Sets the value of the adgroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdgroupId(Long value) {
        this.adgroupId = value;
    }

    /**
     * Gets the value of the getBidsAtLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGetBidsAtLevel() {
        return getBidsAtLevel;
    }

    /**
     * Sets the value of the getBidsAtLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGetBidsAtLevel(Integer value) {
        this.getBidsAtLevel = value;
    }

}
