
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ResponsiveAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponsiveAd">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Ad">
 *       <sequence>
 *         <element name="AdSubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdSubType" minOccurs="0"/>
 *         <element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CallToAction" type="{https://bingads.microsoft.com/CampaignManagement/v13}CallToAction" minOccurs="0"/>
 *         <element name="CallToActionLanguage" type="{https://bingads.microsoft.com/CampaignManagement/v13}LanguageName" minOccurs="0"/>
 *         <element name="Descriptions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Headlines" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Images" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="ImpressionTrackingUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="LongHeadline" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetLink" minOccurs="0"/>
 *         <element name="LongHeadlineString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LongHeadlines" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="VerifiedTrackingSettings" type="{https://bingads.microsoft.com/CampaignManagement/v13}VerifiedTrackingSetting" minOccurs="0"/>
 *         <element name="Videos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveAd", propOrder = {
    "adSubType",
    "businessName",
    "callToAction",
    "callToActionLanguage",
    "descriptions",
    "headline",
    "headlines",
    "images",
    "impressionTrackingUrls",
    "longHeadline",
    "longHeadlineString",
    "longHeadlines",
    "text",
    "verifiedTrackingSettings",
    "videos"
})
public class ResponsiveAd
    extends Ad
{
    public ResponsiveAd() {
      this.type = AdType.fromValue("ResponsiveAd");
    }

    @XmlElement(name = "AdSubType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AdSubType> adSubType;
    @XmlElement(name = "BusinessName", nillable = true)
    protected String businessName;
    @XmlElement(name = "CallToAction", nillable = true)
    @XmlSchemaType(name = "string")
    protected CallToAction callToAction;
    @XmlElement(name = "CallToActionLanguage", nillable = true)
    @XmlSchemaType(name = "string")
    protected LanguageName callToActionLanguage;
    @XmlElement(name = "Descriptions", nillable = true)
    protected ArrayOfAssetLink descriptions;
    @XmlElement(name = "Headline", nillable = true)
    protected String headline;
    @XmlElement(name = "Headlines", nillable = true)
    protected ArrayOfAssetLink headlines;
    @XmlElement(name = "Images", nillable = true)
    protected ArrayOfAssetLink images;
    @XmlElement(name = "ImpressionTrackingUrls", nillable = true)
    protected ArrayOfstring impressionTrackingUrls;
    @XmlElement(name = "LongHeadline", nillable = true)
    protected AssetLink longHeadline;
    @XmlElement(name = "LongHeadlineString", nillable = true)
    protected String longHeadlineString;
    @XmlElement(name = "LongHeadlines", nillable = true)
    protected ArrayOfAssetLink longHeadlines;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "VerifiedTrackingSettings", nillable = true)
    protected VerifiedTrackingSetting verifiedTrackingSettings;
    @XmlElement(name = "Videos", nillable = true)
    protected ArrayOfAssetLink videos;

    /**
     * Gets the value of the adSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdSubType> getAdSubType() {
        return adSubType;
    }

    /**
     * Sets the value of the adSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSubType(Collection<AdSubType> value) {
        this.adSubType = value;
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
     * Gets the value of the callToActionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageName }
     *     
     */
    public LanguageName getCallToActionLanguage() {
        return callToActionLanguage;
    }

    /**
     * Sets the value of the callToActionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageName }
     *     
     */
    public void setCallToActionLanguage(LanguageName value) {
        this.callToActionLanguage = value;
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
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
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
     * Gets the value of the impressionTrackingUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getImpressionTrackingUrls() {
        return impressionTrackingUrls;
    }

    /**
     * Sets the value of the impressionTrackingUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setImpressionTrackingUrls(ArrayOfstring value) {
        this.impressionTrackingUrls = value;
    }

    /**
     * Gets the value of the longHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLink }
     *     
     */
    public AssetLink getLongHeadline() {
        return longHeadline;
    }

    /**
     * Sets the value of the longHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLink }
     *     
     */
    public void setLongHeadline(AssetLink value) {
        this.longHeadline = value;
    }

    /**
     * Gets the value of the longHeadlineString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongHeadlineString() {
        return longHeadlineString;
    }

    /**
     * Sets the value of the longHeadlineString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongHeadlineString(String value) {
        this.longHeadlineString = value;
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
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the verifiedTrackingSettings property.
     * 
     * @return
     *     possible object is
     *     {@link VerifiedTrackingSetting }
     *     
     */
    public VerifiedTrackingSetting getVerifiedTrackingSettings() {
        return verifiedTrackingSettings;
    }

    /**
     * Sets the value of the verifiedTrackingSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerifiedTrackingSetting }
     *     
     */
    public void setVerifiedTrackingSettings(VerifiedTrackingSetting value) {
        this.verifiedTrackingSettings = value;
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
