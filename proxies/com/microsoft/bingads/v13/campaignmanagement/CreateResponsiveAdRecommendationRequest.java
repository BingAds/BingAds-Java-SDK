
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="AdSubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdSubType" minOccurs="0"/>
 *         <element name="FinalUrls" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TextTone" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationTextTone" minOccurs="0"/>
 *         <element name="VideoType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationVideoType" minOccurs="0"/>
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
    "adSubType",
    "finalUrls",
    "prompt",
    "textTone",
    "videoType"
})
@XmlRootElement(name = "CreateResponsiveAdRecommendationRequest")
public class CreateResponsiveAdRecommendationRequest {

    @XmlElement(name = "AdSubType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AdSubType> adSubType;
    @XmlElement(name = "FinalUrls", nillable = true)
    protected ArrayOfstring finalUrls;
    @XmlElement(name = "Prompt", nillable = true)
    protected String prompt;
    @XmlElement(name = "TextTone", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdRecommendationTextTone textTone;
    @XmlElement(name = "VideoType", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdRecommendationVideoType videoType;

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
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the textTone property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationTextTone }
     *     
     */
    public AdRecommendationTextTone getTextTone() {
        return textTone;
    }

    /**
     * Sets the value of the textTone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationTextTone }
     *     
     */
    public void setTextTone(AdRecommendationTextTone value) {
        this.textTone = value;
    }

    /**
     * Gets the value of the videoType property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationVideoType }
     *     
     */
    public AdRecommendationVideoType getVideoType() {
        return videoType;
    }

    /**
     * Sets the value of the videoType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationVideoType }
     *     
     */
    public void setVideoType(AdRecommendationVideoType value) {
        this.videoType = value;
    }

}
