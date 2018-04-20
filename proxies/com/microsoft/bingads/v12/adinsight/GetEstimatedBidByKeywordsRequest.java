
package com.microsoft.bingads.v12.adinsight;

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
 *         &lt;element name="Keywords" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Message}ArrayOfKeywordAndMatchType" minOccurs="0"/>
 *         &lt;element name="TargetPositionForAds" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}TargetAdPosition" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://schemas.datacontract.org/2004/07/Microsoft.BingAds.Advertiser.AdInsight.Api.DataContract.V12.Entity}CurrencyCode" minOccurs="0"/>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EntityLevelBid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "locationIds",
    "currencyCode",
    "campaignId",
    "adGroupId",
    "entityLevelBid"
})
@XmlRootElement(name = "GetEstimatedBidByKeywordsRequest", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
public class GetEstimatedBidByKeywordsRequest {

    @XmlElement(name = "Keywords", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOfKeywordAndMatchType keywords;
    @XmlElement(name = "TargetPositionForAds", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12")
    @XmlSchemaType(name = "string")
    protected TargetAdPosition targetPositionForAds;
    @XmlElement(name = "Language", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String language;
    @XmlElement(name = "LocationIds", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected ArrayOflong locationIds;
    @XmlElement(name = "CurrencyCode", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "CampaignId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "AdGroupId", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "EntityLevelBid", namespace = "Microsoft.Advertiser.AdInsight.Api.Service.V12", nillable = true)
    protected String entityLevelBid;

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
     * Gets the value of the locationIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getLocationIds() {
        return locationIds;
    }

    /**
     * Sets the value of the locationIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setLocationIds(ArrayOflong value) {
        this.locationIds = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
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
     * Gets the value of the entityLevelBid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLevelBid() {
        return entityLevelBid;
    }

    /**
     * Sets the value of the entityLevelBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLevelBid(String value) {
        this.entityLevelBid = value;
    }

}
