
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationImageSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationImageSuggestion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetLink" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetLink" minOccurs="0"/>
 *         <element name="Image" type="{https://bingads.microsoft.com/CampaignManagement/v13}Image" minOccurs="0"/>
 *         <element name="ImageMetadata" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationImageSuggestionMetadata" minOccurs="0"/>
 *         <element name="ImageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationImageSuggestion", propOrder = {
    "assetLink",
    "image",
    "imageMetadata",
    "imageUrl"
})
public class AdRecommendationImageSuggestion {

    @XmlElement(name = "AssetLink", nillable = true)
    protected AssetLink assetLink;
    @XmlElement(name = "Image", nillable = true)
    protected Image image;
    @XmlElement(name = "ImageMetadata", nillable = true)
    protected AdRecommendationImageSuggestionMetadata imageMetadata;
    @XmlElement(name = "ImageUrl", nillable = true)
    protected String imageUrl;

    /**
     * Gets the value of the assetLink property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLink }
     *     
     */
    public AssetLink getAssetLink() {
        return assetLink;
    }

    /**
     * Sets the value of the assetLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLink }
     *     
     */
    public void setAssetLink(AssetLink value) {
        this.assetLink = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the imageMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationImageSuggestionMetadata }
     *     
     */
    public AdRecommendationImageSuggestionMetadata getImageMetadata() {
        return imageMetadata;
    }

    /**
     * Sets the value of the imageMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationImageSuggestionMetadata }
     *     
     */
    public void setImageMetadata(AdRecommendationImageSuggestionMetadata value) {
        this.imageMetadata = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
