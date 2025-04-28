
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationImageSuggestionMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationImageSuggestionMetadata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomizedProperties" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationCustomizedProperty" minOccurs="0"/>
 *         <element name="ImageAssetProperties" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationImageAssetProperty" minOccurs="0"/>
 *         <element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TemplateVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextAssetProperties" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextAssetProperty" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationImageSuggestionMetadata", propOrder = {
    "customizedProperties",
    "imageAssetProperties",
    "templateId",
    "templateVersion",
    "textAssetProperties"
})
public class AdRecommendationImageSuggestionMetadata {

    @XmlElement(name = "CustomizedProperties", nillable = true)
    protected ArrayOfAdRecommendationCustomizedProperty customizedProperties;
    @XmlElement(name = "ImageAssetProperties", nillable = true)
    protected ArrayOfAdRecommendationImageAssetProperty imageAssetProperties;
    @XmlElement(name = "TemplateId", nillable = true)
    protected String templateId;
    @XmlElement(name = "TemplateVersion", nillable = true)
    protected String templateVersion;
    @XmlElement(name = "TextAssetProperties", nillable = true)
    protected ArrayOfAdRecommendationTextAssetProperty textAssetProperties;

    /**
     * Gets the value of the customizedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationCustomizedProperty }
     *     
     */
    public ArrayOfAdRecommendationCustomizedProperty getCustomizedProperties() {
        return customizedProperties;
    }

    /**
     * Sets the value of the customizedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationCustomizedProperty }
     *     
     */
    public void setCustomizedProperties(ArrayOfAdRecommendationCustomizedProperty value) {
        this.customizedProperties = value;
    }

    /**
     * Gets the value of the imageAssetProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationImageAssetProperty }
     *     
     */
    public ArrayOfAdRecommendationImageAssetProperty getImageAssetProperties() {
        return imageAssetProperties;
    }

    /**
     * Sets the value of the imageAssetProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationImageAssetProperty }
     *     
     */
    public void setImageAssetProperties(ArrayOfAdRecommendationImageAssetProperty value) {
        this.imageAssetProperties = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the templateVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * Sets the value of the templateVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateVersion(String value) {
        this.templateVersion = value;
    }

    /**
     * Gets the value of the textAssetProperties property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationTextAssetProperty }
     *     
     */
    public ArrayOfAdRecommendationTextAssetProperty getTextAssetProperties() {
        return textAssetProperties;
    }

    /**
     * Sets the value of the textAssetProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationTextAssetProperty }
     *     
     */
    public void setTextAssetProperties(ArrayOfAdRecommendationTextAssetProperty value) {
        this.textAssetProperties = value;
    }

}
