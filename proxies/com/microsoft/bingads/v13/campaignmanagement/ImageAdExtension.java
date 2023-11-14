
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImageAdExtension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension">
 *       <sequence>
 *         <element name="AlternativeText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DestinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DisplayText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalAppUrls" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAppUrl" minOccurs="0"/>
 *         <element name="FinalMobileUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="FinalUrlSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="ImageMediaIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="Images" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetLink" minOccurs="0"/>
 *         <element name="Layouts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="TrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UrlCustomParameters" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomParameters" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAdExtension", propOrder = {
    "alternativeText",
    "description",
    "destinationUrl",
    "displayText",
    "finalAppUrls",
    "finalMobileUrls",
    "finalUrlSuffix",
    "finalUrls",
    "imageMediaIds",
    "images",
    "layouts",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class ImageAdExtension
    extends AdExtension
{
    public ImageAdExtension() {
      this.type = "ImageAdExtension";
    }

    @XmlElement(name = "AlternativeText", nillable = true)
    protected String alternativeText;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DestinationUrl", nillable = true)
    protected String destinationUrl;
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
    @XmlElement(name = "ImageMediaIds", nillable = true)
    protected ArrayOflong imageMediaIds;
    @XmlElement(name = "Images", nillable = true)
    protected ArrayOfAssetLink images;
    @XmlElement(name = "Layouts", nillable = true)
    protected ArrayOfstring layouts;
    @XmlElement(name = "TrackingUrlTemplate", nillable = true)
    protected String trackingUrlTemplate;
    @XmlElement(name = "UrlCustomParameters", nillable = true)
    protected CustomParameters urlCustomParameters;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
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
     * Gets the value of the imageMediaIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getImageMediaIds() {
        return imageMediaIds;
    }

    /**
     * Sets the value of the imageMediaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setImageMediaIds(ArrayOflong value) {
        this.imageMediaIds = value;
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
     * Gets the value of the layouts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLayouts() {
        return layouts;
    }

    /**
     * Sets the value of the layouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLayouts(ArrayOfstring value) {
        this.layouts = value;
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
