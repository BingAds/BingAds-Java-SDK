
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdRotation" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRotation" minOccurs="0"/>
 *         &lt;element name="AudienceAdsBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BiddingScheme" type="{https://bingads.microsoft.com/CampaignManagement/v13}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="CpcBid" type="{https://bingads.microsoft.com/CampaignManagement/v13}Bid" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         &lt;element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Network" type="{https://bingads.microsoft.com/CampaignManagement/v13}Network" minOccurs="0"/>
 *         &lt;element name="PrivacyStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupPrivacyStatus" minOccurs="0"/>
 *         &lt;element name="Settings" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfSetting" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdGroupStatus" minOccurs="0"/>
 *         &lt;element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *         &lt;element name="AdScheduleUseSearcherTimeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroup", propOrder = {
    "adRotation",
    "audienceAdsBidAdjustment",
    "biddingScheme",
    "cpcBid",
    "endDate",
    "finalUrlSuffix",
    "forwardCompatibilityMap",
    "id",
    "language",
    "name",
    "network",
    "privacyStatus",
    "settings",
    "startDate",
    "status",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "adScheduleUseSearcherTimeZone",
    "adGroupType"
})
public class AdGroup {

    @XmlElement(name = "AdRotation", nillable = true)
    protected AdRotation adRotation;
    @XmlElement(name = "AudienceAdsBidAdjustment", nillable = true)
    protected Integer audienceAdsBidAdjustment;
    @XmlElement(name = "BiddingScheme", nillable = true)
    protected BiddingScheme biddingScheme;
    @XmlElement(name = "CpcBid", nillable = true)
    protected Bid cpcBid;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Network", nillable = true)
    @XmlSchemaType(name = "string")
    protected Network network;
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
    @XmlElement(name = "AdScheduleUseSearcherTimeZone", nillable = true)
    protected Boolean adScheduleUseSearcherTimeZone;
    @XmlElement(name = "AdGroupType", nillable = true)
    protected String adGroupType;

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

}
