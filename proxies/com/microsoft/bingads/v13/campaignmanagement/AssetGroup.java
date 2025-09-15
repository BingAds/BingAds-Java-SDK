
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupSearchThemes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetGroupSearchTheme" minOccurs="0"/>
 *         <element name="AssetGroupUrlTargets" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetGroupUrlTarget" minOccurs="0"/>
 *         <element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CallToAction" type="{https://bingads.microsoft.com/CampaignManagement/v13}CallToAction" minOccurs="0"/>
 *         <element name="Descriptions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupEditorialStatus" minOccurs="0"/>
 *         <element name="EndDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="FinalMobileUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         <element name="Headlines" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Images" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="LongHeadlines" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Path1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Path2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StartDate" type="{https://bingads.microsoft.com/CampaignManagement/v13}Date" minOccurs="0"/>
 *         <element name="Status" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupStatus" minOccurs="0"/>
 *         <element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *         <element name="Videos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroup", propOrder = {
    "assetGroupSearchThemes",
    "assetGroupUrlTargets",
    "businessName",
    "callToAction",
    "descriptions",
    "editorialStatus",
    "endDate",
    "finalMobileUrls",
    "finalUrlSuffix",
    "finalUrls",
    "forwardCompatibilityMap",
    "headlines",
    "id",
    "images",
    "longHeadlines",
    "name",
    "path1",
    "path2",
    "startDate",
    "status",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "videos"
})
public class AssetGroup {

    @XmlElement(name = "AssetGroupSearchThemes", nillable = true)
    protected ArrayOfAssetGroupSearchTheme assetGroupSearchThemes;
    @XmlElement(name = "AssetGroupUrlTargets", nillable = true)
    protected ArrayOfAssetGroupUrlTarget assetGroupUrlTargets;
    @XmlElement(name = "BusinessName", nillable = true)
    protected String businessName;
    @XmlElement(name = "CallToAction", nillable = true)
    @XmlSchemaType(name = "string")
    protected CallToAction callToAction;
    @XmlElement(name = "Descriptions", nillable = true)
    protected ArrayOfAssetLink descriptions;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssetGroupEditorialStatus editorialStatus;
    @XmlElement(name = "EndDate", nillable = true)
    protected Date endDate;
    @XmlElement(name = "FinalMobileUrls", nillable = true)
    protected ArrayOfstring finalMobileUrls;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "FinalUrls", nillable = true)
    protected ArrayOfstring finalUrls;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Headlines", nillable = true)
    protected ArrayOfAssetLink headlines;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Images", nillable = true)
    protected ArrayOfAssetLink images;
    @XmlElement(name = "LongHeadlines", nillable = true)
    protected ArrayOfAssetLink longHeadlines;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Path1", nillable = true)
    protected String path1;
    @XmlElement(name = "Path2", nillable = true)
    protected String path2;
    @XmlElement(name = "StartDate", nillable = true)
    protected Date startDate;
    @XmlElement(name = "Status", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssetGroupStatus status;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;
    @XmlElement(name = "Videos", nillable = true)
    protected ArrayOfAssetLink videos;

    /**
     * Gets the value of the assetGroupSearchThemes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupSearchTheme }
     *     
     */
    public ArrayOfAssetGroupSearchTheme getAssetGroupSearchThemes() {
        return assetGroupSearchThemes;
    }

    /**
     * Sets the value of the assetGroupSearchThemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupSearchTheme }
     *     
     */
    public void setAssetGroupSearchThemes(ArrayOfAssetGroupSearchTheme value) {
        this.assetGroupSearchThemes = value;
    }

    /**
     * Gets the value of the assetGroupUrlTargets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupUrlTarget }
     *     
     */
    public ArrayOfAssetGroupUrlTarget getAssetGroupUrlTargets() {
        return assetGroupUrlTargets;
    }

    /**
     * Sets the value of the assetGroupUrlTargets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupUrlTarget }
     *     
     */
    public void setAssetGroupUrlTargets(ArrayOfAssetGroupUrlTarget value) {
        this.assetGroupUrlTargets = value;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link CallToAction }
     *     
     */
    public CallToAction getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToAction }
     *     
     */
    public void setCallToAction(CallToAction value) {
        this.callToAction = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setDescriptions(ArrayOfAssetLink value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssetGroupEditorialStatus }
     *     
     */
    public AssetGroupEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroupEditorialStatus }
     *     
     */
    public void setEditorialStatus(AssetGroupEditorialStatus value) {
        this.editorialStatus = value;
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
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalMobileUrls(ArrayOfstring value) {
        this.finalMobileUrls = value;
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
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setFinalUrls(ArrayOfstring value) {
        this.finalUrls = value;
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
     * Gets the value of the headlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getHeadlines() {
        return headlines;
    }

    /**
     * Sets the value of the headlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setHeadlines(ArrayOfAssetLink value) {
        this.headlines = value;
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
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setImages(ArrayOfAssetLink value) {
        this.images = value;
    }

    /**
     * Gets the value of the longHeadlines property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getLongHeadlines() {
        return longHeadlines;
    }

    /**
     * Sets the value of the longHeadlines property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setLongHeadlines(ArrayOfAssetLink value) {
        this.longHeadlines = value;
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
     * Gets the value of the path1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath1() {
        return path1;
    }

    /**
     * Sets the value of the path1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath1(String value) {
        this.path1 = value;
    }

    /**
     * Gets the value of the path2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath2() {
        return path2;
    }

    /**
     * Sets the value of the path2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath2(String value) {
        this.path2 = value;
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
     *     {@link AssetGroupStatus }
     *     
     */
    public AssetGroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroupStatus }
     *     
     */
    public void setStatus(AssetGroupStatus value) {
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
     * Gets the value of the videos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public ArrayOfAssetLink getVideos() {
        return videos;
    }

    /**
     * Sets the value of the videos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetLink }
     *     
     */
    public void setVideos(ArrayOfAssetLink value) {
        this.videos = value;
    }

}
