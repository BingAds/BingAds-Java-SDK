
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="TextRefineOperations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextRefineOperation" minOccurs="0"/>
 *         <element name="ImageSuggestions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationImageSuggestion" minOccurs="0"/>
 *         <element name="ImageRefineOperations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationImageRefineOperation" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationAdditionalField" minOccurs="0"/>
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
    "textRefineOperations",
    "imageSuggestions",
    "imageRefineOperations",
    "returnAdditionalFields"
})
@XmlRootElement(name = "RefineAssetGroupRecommendationRequest")
public class RefineAssetGroupRecommendationRequest {

    @XmlElement(name = "AssetGroup", nillable = true)
    protected AssetGroup assetGroup;
    @XmlElement(name = "TextRefineOperations", nillable = true)
    protected ArrayOfAdRecommendationTextRefineOperation textRefineOperations;
    @XmlElement(name = "ImageSuggestions", nillable = true)
    protected ArrayOfAdRecommendationImageSuggestion imageSuggestions;
    @XmlElement(name = "ImageRefineOperations", nillable = true)
    protected ArrayOfAdRecommendationImageRefineOperation imageRefineOperations;
    @XmlElement(name = "ReturnAdditionalFields", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdRecommendationAdditionalField returnAdditionalFields;

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
     * Gets the value of the textRefineOperations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationTextRefineOperation }
     *     
     */
    public ArrayOfAdRecommendationTextRefineOperation getTextRefineOperations() {
        return textRefineOperations;
    }

    /**
     * Sets the value of the textRefineOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationTextRefineOperation }
     *     
     */
    public void setTextRefineOperations(ArrayOfAdRecommendationTextRefineOperation value) {
        this.textRefineOperations = value;
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

    /**
     * Gets the value of the imageRefineOperations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationImageRefineOperation }
     *     
     */
    public ArrayOfAdRecommendationImageRefineOperation getImageRefineOperations() {
        return imageRefineOperations;
    }

    /**
     * Sets the value of the imageRefineOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationImageRefineOperation }
     *     
     */
    public void setImageRefineOperations(ArrayOfAdRecommendationImageRefineOperation value) {
        this.imageRefineOperations = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationAdditionalField }
     *     
     */
    public AdRecommendationAdditionalField getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the value of the returnAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationAdditionalField }
     *     
     */
    public void setReturnAdditionalFields(AdRecommendationAdditionalField value) {
        this.returnAdditionalFields = value;
    }

}
