
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdDistribution" minOccurs="0"/>
 *         &lt;element name="AdRotation" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdRotation" minOccurs="0"/>
 *         &lt;element name="BiddingScheme" type="{https://bingads.microsoft.com/CampaignManagement/v11}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="ContentMatchBid" type="{https://bingads.microsoft.com/CampaignManagement/v11}Bid" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v11}Date" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NativeBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Network" type="{https://bingads.microsoft.com/CampaignManagement/v11}Network" minOccurs="0"/>
 *         &lt;element name="PricingModel" type="{https://bingads.microsoft.com/CampaignManagement/v11}PricingModel" minOccurs="0"/>
 *         &lt;element name="RemarketingTargetingSetting" type="{https://bingads.microsoft.com/CampaignManagement/v11}RemarketingTargetingSetting" minOccurs="0"/>
 *         &lt;element name="SearchBid" type="{https://bingads.microsoft.com/CampaignManagement/v11}Bid" minOccurs="0"/>
 *         &lt;element name="Settings" type="{https://bingads.microsoft.com/CampaignManagement/v11}ArrayOfSetting" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v11}Date" minOccurs="0"/>
 *         &lt;element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdGroupStatus" minOccurs="0"/>
 *         &lt;element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCustomParameters" type="{http://schemas.datacontract.org/2004/07/Microsoft.AdCenter.Advertiser.CampaignManagement.Api.DataContracts.V11}CustomParameters" minOccurs="0"/>
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
    "adDistribution",
    "adRotation",
    "biddingScheme",
    "contentMatchBid",
    "endDate",
    "forwardCompatibilityMap",
    "id",
    "language",
    "name",
    "nativeBidAdjustment",
    "network",
    "pricingModel",
    "remarketingTargetingSetting",
    "searchBid",
    "settings",
    "startDate",
    "status",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class AdGroup {

    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Collection<AdDistribution> adDistribution;
    @XmlElement(name = "AdRotation", nillable = true)
    protected AdRotation adRotation;
    @XmlElement(name = "BiddingScheme", nillable = true)
    protected BiddingScheme biddingScheme;
    @XmlElement(name = "ContentMatchBid", nillable = true)
    protected Bid contentMatchBid;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Language", nillable = true)
    protected String language;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NativeBidAdjustment", nillable = true)
    protected Integer nativeBidAdjustment;
    @XmlElement(name = "Network", nillable = true)
    @XmlSchemaType(name = "string")
    protected Network network;
    @XmlElement(name = "PricingModel", nillable = true)
    @XmlSchemaType(name = "string")
    protected PricingModel pricingModel;
    @XmlElement(name = "RemarketingTargetingSetting", nillable = true)
    @XmlSchemaType(name = "string")
    protected RemarketingTargetingSetting remarketingTargetingSetting;
    @XmlElement(name = "SearchBid", nillable = true)
    protected Bid searchBid;
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

    /**
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdDistribution> getAdDistribution() {
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
    public void setAdDistribution(Collection<AdDistribution> value) {
        this.adDistribution = value;
    }

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
     * Gets the value of the contentMatchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getContentMatchBid() {
        return contentMatchBid;
    }

    /**
     * Sets the value of the contentMatchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setContentMatchBid(Bid value) {
        this.contentMatchBid = value;
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
     * Gets the value of the nativeBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNativeBidAdjustment() {
        return nativeBidAdjustment;
    }

    /**
     * Sets the value of the nativeBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNativeBidAdjustment(Integer value) {
        this.nativeBidAdjustment = value;
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
     * Gets the value of the pricingModel property.
     * 
     * @return
     *     possible object is
     *     {@link PricingModel }
     *     
     */
    public PricingModel getPricingModel() {
        return pricingModel;
    }

    /**
     * Sets the value of the pricingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModel }
     *     
     */
    public void setPricingModel(PricingModel value) {
        this.pricingModel = value;
    }

    /**
     * Gets the value of the remarketingTargetingSetting property.
     * 
     * @return
     *     possible object is
     *     {@link RemarketingTargetingSetting }
     *     
     */
    public RemarketingTargetingSetting getRemarketingTargetingSetting() {
        return remarketingTargetingSetting;
    }

    /**
     * Sets the value of the remarketingTargetingSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarketingTargetingSetting }
     *     
     */
    public void setRemarketingTargetingSetting(RemarketingTargetingSetting value) {
        this.remarketingTargetingSetting = value;
    }

    /**
     * Gets the value of the searchBid property.
     * 
     * @return
     *     possible object is
     *     {@link Bid }
     *     
     */
    public Bid getSearchBid() {
        return searchBid;
    }

    /**
     * Sets the value of the searchBid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bid }
     *     
     */
    public void setSearchBid(Bid value) {
        this.searchBid = value;
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

}
