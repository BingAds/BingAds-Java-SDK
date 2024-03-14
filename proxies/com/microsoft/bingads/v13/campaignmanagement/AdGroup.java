
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdRotation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRotation" minOccurs="0"/>
 *         <element name="AudienceAdsBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BiddingScheme" type="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme" minOccurs="0"/>
 *         <element name="CommissionRate" type="{https://bingads.microsoft.com/CampaignManagement/v13}RateBid" minOccurs="0"/>
 *         <element name="CpcBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *         <element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         <element name="FrequencyCapSettings" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfFrequencyCapSettings" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MultimediaAdsBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Network" type="{https://bingads.microsoft.com/CampaignManagement/v13}Network" minOccurs="0"/>
 *         <element name="PercentCpcBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}RateBid" minOccurs="0"/>
 *         <element name="PrivacyStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupPrivacyStatus" minOccurs="0"/>
 *         <element name="Settings" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSetting" minOccurs="0"/>
 *         <element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupStatus" minOccurs="0"/>
 *         <element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *         <element name="UseOptimizedTargeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="UsePredictiveTargeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AdScheduleUseSearcherTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AdGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CpvBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *         <element name="CpmBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *         <element name="McpaBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroup", propOrder = {
    "adRotation",
    "audienceAdsBidAdjustment",
    "biddingScheme",
    "commissionRate",
    "cpcBid",
    "endDate",
    "finalUrlSuffix",
    "forwardCompatibilityMap",
    "frequencyCapSettings",
    "id",
    "language",
    "multimediaAdsBidAdjustment",
    "name",
    "network",
    "percentCpcBid",
    "privacyStatus",
    "settings",
    "startDate",
    "status",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "useOptimizedTargeting",
    "usePredictiveTargeting",
    "adScheduleUseSearcherTimeZone",
    "adGroupType",
    "cpvBid",
    "cpmBid",
    "mcpaBid"
})
public class AdGroup {

    @XmlElement(name = "AdRotation", nillable = true)
    protected AdRotation adRotation;
    @XmlElement(name = "AudienceAdsBidAdjustment", nillable = true)
    protected Integer audienceAdsBidAdjustment;
    @XmlElement(name = "BiddingScheme", nillable = true)
    protected BiddingScheme biddingScheme;
    @XmlElement(name = "CommissionRate", nillable = true)
    protected RateBid commissionRate;
    @XmlElement(name = "CpcBid", nillable = true)
    protected Bid cpcBid;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "FrequencyCapSettings", nillable = true)
    protected ArrayOfFrequencyCapSettings frequencyCapSettings;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "MultimediaAdsBidAdjustment", nillable = true)
    protected Integer multimediaAdsBidAdjustment;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Network", nillable = true)
    @XmlSchemaType(name = "string")
    protected Network network;
    @XmlElement(name = "PercentCpcBid", nillable = true)
    protected RateBid percentCpcBid;
    @XmlElement(name = "PrivacyStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdGroupPrivacyStatus privacyStatus;
    @XmlElement(name = "Settings", nillable = true)
    protected ArrayOfSetting settings;
    @XmlElement(name = "StartDate", nillable = true)
    protected Date startDate;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdGroupStatus status;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;
    @XmlElement(name = "UseOptimizedTargeting", nillable = true)
    protected Boolean useOptimizedTargeting;
    @XmlElement(name = "UsePredictiveTargeting", nillable = true)
    protected Boolean usePredictiveTargeting;
    @XmlElement(name = "AdScheduleUseSearcherTimeZone", nillable = true)
    protected Boolean adScheduleUseSearcherTimeZone;
    @XmlElement(name = "AdGroupType", nillable = true)
    protected String adGroupType;
    @XmlElement(name = "CpvBid", nillable = true)
    protected Bid cpvBid;
    @XmlElement(name = "CpmBid", nillable = true)
    protected Bid cpmBid;
    @XmlElement(name = "McpaBid", nillable = true)
    protected Bid mcpaBid;

    /**
     * Gets the value of the adRotation property.
     * 
     * @return
     *     possible object is
     *     {@link AdRotation }
     *     
     */
    public AdRotation getAdRotation() {
        return adRotation;
    }

    /**
     * Sets the value of the adRotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRotation }
     *     
     */
    public void setAdRotation(AdRotation value) {
        this.adRotation = value;
    }

    /**
     * Gets the value of the audienceAdsBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAudienceAdsBidAdjustment() {
        return audienceAdsBidAdjustment;
    }

    /**
     * Sets the value of the audienceAdsBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAudienceAdsBidAdjustment(Integer value) {
        this.audienceAdsBidAdjustment = value;
    }

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the commissionRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateBid }
     *     
     */
    public RateBid getCommissionRate() {
        return commissionRate;
    }

    /**
     * Sets the value of the commissionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateBid }
     *     
     */
    public void setCommissionRate(RateBid value) {
        this.commissionRate = value;
    }

    /**
     * Gets the value of the cpcBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getCpcBid() {
        return cpcBid;
    }

    /**
     * Sets the value of the cpcBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setCpcBid(Bid value) {
        this.cpcBid = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the finalUrlSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalUrlSuffix() {
        return finalUrlSuffix;
    }

    /**
     * Sets the value of the finalUrlSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalUrlSuffix(String value) {
        this.finalUrlSuffix = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the frequencyCapSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFrequencyCapSettings }
     *     
     */
    public ArrayOfFrequencyCapSettings getFrequencyCapSettings() {
        return frequencyCapSettings;
    }

    /**
     * Sets the value of the frequencyCapSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFrequencyCapSettings }
     *     
     */
    public void setFrequencyCapSettings(ArrayOfFrequencyCapSettings value) {
        this.frequencyCapSettings = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the multimediaAdsBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultimediaAdsBidAdjustment() {
        return multimediaAdsBidAdjustment;
    }

    /**
     * Sets the value of the multimediaAdsBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultimediaAdsBidAdjustment(Integer value) {
        this.multimediaAdsBidAdjustment = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link Network }
     *     
     */
    public Network getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link Network }
     *     
     */
    public void setNetwork(Network value) {
        this.network = value;
    }

    /**
     * Gets the value of the percentCpcBid property.
     * 
     * @return
     *     possible object is
     *     {@link RateBid }
     *     
     */
    public RateBid getPercentCpcBid() {
        return percentCpcBid;
    }

    /**
     * Sets the value of the percentCpcBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateBid }
     *     
     */
    public void setPercentCpcBid(RateBid value) {
        this.percentCpcBid = value;
    }

    /**
     * Gets the value of the privacyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupPrivacyStatus }
     *     
     */
    public AdGroupPrivacyStatus getPrivacyStatus() {
        return privacyStatus;
    }

    /**
     * Sets the value of the privacyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupPrivacyStatus }
     *     
     */
    public void setPrivacyStatus(AdGroupPrivacyStatus value) {
        this.privacyStatus = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSetting }
     *     
     */
    public ArrayOfSetting getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSetting }
     *     
     */
    public void setSettings(ArrayOfSetting value) {
        this.settings = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupStatus }
     *     
     */
    public AdGroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupStatus }
     *     
     */
    public void setStatus(AdGroupStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

    /**
     * Gets the value of the useOptimizedTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseOptimizedTargeting() {
        return useOptimizedTargeting;
    }

    /**
     * Sets the value of the useOptimizedTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOptimizedTargeting(Boolean value) {
        this.useOptimizedTargeting = value;
    }

    /**
     * Gets the value of the usePredictiveTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUsePredictiveTargeting() {
        return usePredictiveTargeting;
    }

    /**
     * Sets the value of the usePredictiveTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsePredictiveTargeting(Boolean value) {
        this.usePredictiveTargeting = value;
    }

    /**
     * Gets the value of the adScheduleUseSearcherTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAdScheduleUseSearcherTimeZone() {
        return adScheduleUseSearcherTimeZone;
    }

    /**
     * Sets the value of the adScheduleUseSearcherTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdScheduleUseSearcherTimeZone(Boolean value) {
        this.adScheduleUseSearcherTimeZone = value;
    }

    /**
     * Gets the value of the adGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupType() {
        return adGroupType;
    }

    /**
     * Sets the value of the adGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupType(String value) {
        this.adGroupType = value;
    }

    /**
     * Gets the value of the cpvBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getCpvBid() {
        return cpvBid;
    }

    /**
     * Sets the value of the cpvBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setCpvBid(Bid value) {
        this.cpvBid = value;
    }

    /**
     * Gets the value of the cpmBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getCpmBid() {
        return cpmBid;
    }

    /**
     * Sets the value of the cpmBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setCpmBid(Bid value) {
        this.cpmBid = value;
    }

    /**
     * Gets the value of the mcpaBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getMcpaBid() {
        return mcpaBid;
    }

    /**
     * Sets the value of the mcpaBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setMcpaBid(Bid value) {
        this.mcpaBid = value;
    }

}
