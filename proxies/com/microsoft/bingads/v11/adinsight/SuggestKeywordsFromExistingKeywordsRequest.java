
package com.microsoft.bingads.v11.adinsight;

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
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublisherCountries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="MaxSuggestionsPerKeyword" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuggestionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RemoveDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExcludeBrand" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "language",
    "publisherCountries",
    "maxSuggestionsPerKeyword",
    "suggestionType",
    "removeDuplicates",
    "excludeBrand",
    "adGroupId",
    "campaignId"
})
@XmlRootElement(name = "SuggestKeywordsFromExistingKeywordsRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11")
public class SuggestKeywordsFromExistingKeywordsRequest {

    @XmlElement(name = "Keywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected String language;
    @XmlElement(name = "PublisherCountries", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected ArrayOfstring publisherCountries;
    @XmlElement(name = "MaxSuggestionsPerKeyword", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Integer maxSuggestionsPerKeyword;
    @XmlElement(name = "SuggestionType", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Integer suggestionType;
    @XmlElement(name = "RemoveDuplicates", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Boolean removeDuplicates;
    @XmlElement(name = "ExcludeBrand", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Boolean excludeBrand;
    @XmlElement(name = "AdGroupId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "CampaignId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V11", nillable = true)
    protected Long campaignId;

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setKeywords(ArrayOfstring value) {
        this.keywords = value;
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
     * Gets the value of the maxSuggestionsPerKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSuggestionsPerKeyword() {
        return maxSuggestionsPerKeyword;
    }

    /**
     * Sets the value of the maxSuggestionsPerKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSuggestionsPerKeyword(Integer value) {
        this.maxSuggestionsPerKeyword = value;
    }

    /**
     * Gets the value of the suggestionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuggestionType() {
        return suggestionType;
    }

    /**
     * Sets the value of the suggestionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuggestionType(Integer value) {
        this.suggestionType = value;
    }

    /**
     * Gets the value of the removeDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRemoveDuplicates() {
        return removeDuplicates;
    }

    /**
     * Sets the value of the removeDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveDuplicates(Boolean value) {
        this.removeDuplicates = value;
    }

    /**
     * Gets the value of the excludeBrand property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeBrand() {
        return excludeBrand;
    }

    /**
     * Sets the value of the excludeBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBrand(Boolean value) {
        this.excludeBrand = value;
    }

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

}
