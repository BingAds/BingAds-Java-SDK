
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for KeywordPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeywordPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v9}AccountStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v9}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v9}AdGroupStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdType" type="{https://bingads.microsoft.com/Reporting/v9}AdTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="BidMatchType" type="{https://bingads.microsoft.com/Reporting/v9}BidMatchTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="BidStrategyType" type="{https://bingads.microsoft.com/Reporting/v9}BidStrategyTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v9}CampaignStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="DeliveredMatchType" type="{https://bingads.microsoft.com/Reporting/v9}DeliveredMatchTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{https://bingads.microsoft.com/Reporting/v9}DeviceTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="KeywordRelevance" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="KeywordStatus" type="{https://bingads.microsoft.com/Reporting/v9}KeywordStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="LandingPageRelevance" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="LandingPageUserExperience" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="QualityScore" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeywordPerformanceReportFilter", propOrder = {
    "accountStatus",
    "adDistribution",
    "adGroupStatus",
    "adType",
    "bidMatchType",
    "bidStrategyType",
    "campaignStatus",
    "deliveredMatchType",
    "deviceType",
    "keywordRelevance",
    "keywordStatus",
    "keywords",
    "landingPageRelevance",
    "landingPageUserExperience",
    "languageCode",
    "qualityScore"
})
public class KeywordPerformanceReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Collection<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "AdType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<AdTypeReportFilter> adType;
    @XmlElement(name = "BidMatchType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Collection<BidMatchTypeReportFilter> bidMatchType;
    @XmlElement(name = "BidStrategyType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Collection<BidStrategyTypeReportFilter> bidStrategyType;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter13 .class)
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "DeliveredMatchType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    protected Collection<DeliveredMatchTypeReportFilter> deliveredMatchType;
    @XmlElement(name = "DeviceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Collection<DeviceTypeReportFilter> deviceType;
    @XmlElement(name = "KeywordRelevance", nillable = true)
    protected ArrayOfint keywordRelevance;
    @XmlElement(name = "KeywordStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter18 .class)
    protected Collection<KeywordStatusReportFilter> keywordStatus;
    @XmlElement(name = "Keywords", nillable = true)
    protected ArrayOfstring keywords;
    @XmlElement(name = "LandingPageRelevance", nillable = true)
    protected ArrayOfint landingPageRelevance;
    @XmlElement(name = "LandingPageUserExperience", nillable = true)
    protected ArrayOfint landingPageUserExperience;
    @XmlElement(name = "LanguageCode", nillable = true)
    protected ArrayOfstring languageCode;
    @XmlElement(name = "QualityScore", nillable = true)
    protected ArrayOfint qualityScore;

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AccountStatusReportFilter> getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(Collection<AccountStatusReportFilter> value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdDistributionReportFilter> getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the value of the adDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDistribution(Collection<AdDistributionReportFilter> value) {
        this.adDistribution = value;
    }

    /**
     * Gets the value of the adGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdGroupStatusReportFilter> getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the value of the adGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupStatus(Collection<AdGroupStatusReportFilter> value) {
        this.adGroupStatus = value;
    }

    /**
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdTypeReportFilter> getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdType(Collection<AdTypeReportFilter> value) {
        this.adType = value;
    }

    /**
     * Gets the value of the bidMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<BidMatchTypeReportFilter> getBidMatchType() {
        return bidMatchType;
    }

    /**
     * Sets the value of the bidMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidMatchType(Collection<BidMatchTypeReportFilter> value) {
        this.bidMatchType = value;
    }

    /**
     * Gets the value of the bidStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<BidStrategyTypeReportFilter> getBidStrategyType() {
        return bidStrategyType;
    }

    /**
     * Sets the value of the bidStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidStrategyType(Collection<BidStrategyTypeReportFilter> value) {
        this.bidStrategyType = value;
    }

    /**
     * Gets the value of the campaignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignStatusReportFilter> getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the value of the campaignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignStatus(Collection<CampaignStatusReportFilter> value) {
        this.campaignStatus = value;
    }

    /**
     * Gets the value of the deliveredMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeliveredMatchTypeReportFilter> getDeliveredMatchType() {
        return deliveredMatchType;
    }

    /**
     * Sets the value of the deliveredMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredMatchType(Collection<DeliveredMatchTypeReportFilter> value) {
        this.deliveredMatchType = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeviceTypeReportFilter> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(Collection<DeviceTypeReportFilter> value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the keywordRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getKeywordRelevance() {
        return keywordRelevance;
    }

    /**
     * Sets the value of the keywordRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setKeywordRelevance(ArrayOfint value) {
        this.keywordRelevance = value;
    }

    /**
     * Gets the value of the keywordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<KeywordStatusReportFilter> getKeywordStatus() {
        return keywordStatus;
    }

    /**
     * Sets the value of the keywordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordStatus(Collection<KeywordStatusReportFilter> value) {
        this.keywordStatus = value;
    }

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
     * Gets the value of the landingPageRelevance property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getLandingPageRelevance() {
        return landingPageRelevance;
    }

    /**
     * Sets the value of the landingPageRelevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setLandingPageRelevance(ArrayOfint value) {
        this.landingPageRelevance = value;
    }

    /**
     * Gets the value of the landingPageUserExperience property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getLandingPageUserExperience() {
        return landingPageUserExperience;
    }

    /**
     * Sets the value of the landingPageUserExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setLandingPageUserExperience(ArrayOfint value) {
        this.landingPageUserExperience = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLanguageCode(ArrayOfstring value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the qualityScore property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getQualityScore() {
        return qualityScore;
    }

    /**
     * Sets the value of the qualityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setQualityScore(ArrayOfint value) {
        this.qualityScore = value;
    }

}
