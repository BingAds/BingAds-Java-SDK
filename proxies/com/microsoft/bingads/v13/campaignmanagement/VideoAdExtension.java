
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="ActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternativeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalAppUrls" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAppUrl" minOccurs="0"/>
 *         &lt;element name="FinalMobileUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbnailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *         &lt;element name="VideoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdExtension", propOrder = {
    "actionText",
    "alternativeText",
    "displayText",
    "finalAppUrls",
    "finalMobileUrls",
    "finalUrlSuffix",
    "finalUrls",
    "name",
    "thumbnailId",
    "thumbnailUrl",
    "trackingUrlTemplate",
    "urlCustomParameters",
    "videoId"
})
public class VideoAdExtension
    extends AdExtension
{

    @XmlElement(name = "ActionText", nillable = true)
    protected String actionText;
    @XmlElement(name = "AlternativeText", nillable = true)
    protected String alternativeText;
    @XmlElement(name = "DisplayText", nillable = true)
    protected String displayText;
    @XmlElement(name = "FinalAppUrls", nillable = true)
    protected ArrayOfAppUrl finalAppUrls;
    @XmlElement(name = "FinalMobileUrls", nillable = true)
    protected ArrayOfstring finalMobileUrls;
    @XmlElement(name = "FinalUrlSuffix", nillable = true)
    protected String finalUrlSuffix;
    @XmlElement(name = "FinalUrls", nillable = true)
    protected ArrayOfstring finalUrls;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ThumbnailId", nillable = true)
    protected Long thumbnailId;
    @XmlElement(name = "ThumbnailUrl", nillable = true)
    protected String thumbnailUrl;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;
    @XmlElement(name = "VideoId", nillable = true)
    protected Long videoId;

    /**
     * Gets the value of the actionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionText() {
        return actionText;
    }

    /**
     * Sets the value of the actionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionText(String value) {
        this.actionText = value;
    }

    /**
     * Gets the value of the alternativeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeText() {
        return alternativeText;
    }

    /**
     * Sets the value of the alternativeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeText(String value) {
        this.alternativeText = value;
    }

    /**
     * Gets the value of the displayText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayText() {
        return displayText;
    }

    /**
     * Sets the value of the displayText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayText(String value) {
        this.displayText = value;
    }

    /**
     * Gets the value of the finalAppUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public ArrayOfAppUrl getFinalAppUrls() {
        return finalAppUrls;
    }

    /**
     * Sets the value of the finalAppUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppUrl }
     *     
     */
    public void setFinalAppUrls(ArrayOfAppUrl value) {
        this.finalAppUrls = value;
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
     * Gets the value of the thumbnailId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThumbnailId() {
        return thumbnailId;
    }

    /**
     * Sets the value of the thumbnailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThumbnailId(Long value) {
        this.thumbnailId = value;
    }

    /**
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets the value of the thumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailUrl(String value) {
        this.thumbnailUrl = value;
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
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoId(Long value) {
        this.videoId = value;
    }

}
