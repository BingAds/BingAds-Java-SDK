
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Keywords" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordAndMatchType" minOccurs="0"/>
 *         <element name="TargetPositionForAds" type="{https://bingads.microsoft.com/AdInsight/v13}TargetAdPosition" minOccurs="0"/>
 *         <element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LocationIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{https://bingads.microsoft.com/AdInsight/v13}CurrencyCode" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EntityLevelBid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
@XmlRootElement(name = "GetEstimatedBidByKeywordsRequest")
public class GetEstimatedBidByKeywordsRequest {

    @XmlElement(name = "Keywords", nillable = true)
    protected ArrayOfKeywordAndMatchType keywords;
    @XmlElement(name = "TargetPositionForAds")
    @XmlSchemaType(name = "string")
    protected TargetAdPosition targetPositionForAds;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "LocationIds", nillable = true)
    protected ArrayOflong locationIds;
    @XmlElement(name = "CurrencyCode", nillable = true)
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;
    @XmlElement(name = "CampaignId", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "EntityLevelBid", nillable = true)
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
