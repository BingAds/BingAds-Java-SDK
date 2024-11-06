
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="AssetGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroup" minOccurs="0"/>
 *         <element name="ImageSuggestions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationImageSuggestion" minOccurs="0"/>
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
    "assetGroup",
    "imageSuggestions"
})
@XmlRootElement(name = "CreateAssetGroupRecommendationResponse")
public class CreateAssetGroupRecommendationResponse {

    @XmlElement(name = "AssetGroup", nillable = true)
    protected AssetGroup assetGroup;
    @XmlElement(name = "ImageSuggestions", nillable = true)
    protected ArrayOfAdRecommendationImageSuggestion imageSuggestions;

    /**
     * Gets the value of the assetGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AssetGroup }
     *     
     */
    public AssetGroup getAssetGroup() {
        return assetGroup;
    }

    /**
     * Sets the value of the assetGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroup }
     *     
     */
    public void setAssetGroup(AssetGroup value) {
        this.assetGroup = value;
    }

    /**
     * Gets the value of the imageSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationImageSuggestion }
     *     
     */
    public ArrayOfAdRecommendationImageSuggestion getImageSuggestions() {
        return imageSuggestions;
    }

    /**
     * Sets the value of the imageSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationImageSuggestion }
     *     
     */
    public void setImageSuggestions(ArrayOfAdRecommendationImageSuggestion value) {
        this.imageSuggestions = value;
    }

}
