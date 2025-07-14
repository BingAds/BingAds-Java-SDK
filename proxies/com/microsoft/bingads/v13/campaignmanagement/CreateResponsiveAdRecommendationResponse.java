
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
 *         <element name="ResponsiveAd" type="{https://bingads.microsoft.com/CampaignManagement/v13}ResponsiveAd" minOccurs="0"/>
 *         <element name="ImageSuggestions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationImageSuggestion" minOccurs="0"/>
 *         <element name="VideoSuggestions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationVideoSuggestion" minOccurs="0"/>
 *         <element name="PromptBrandWarning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="JobInfo" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationJobInfo" minOccurs="0"/>
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
    "responsiveAd",
    "imageSuggestions",
    "videoSuggestions",
    "promptBrandWarning",
    "jobInfo"
})
@XmlRootElement(name = "CreateResponsiveAdRecommendationResponse")
public class CreateResponsiveAdRecommendationResponse {

    @XmlElement(name = "ResponsiveAd", nillable = true)
    protected ResponsiveAd responsiveAd;
    @XmlElement(name = "ImageSuggestions", nillable = true)
    protected ArrayOfAdRecommendationImageSuggestion imageSuggestions;
    @XmlElement(name = "VideoSuggestions", nillable = true)
    protected ArrayOfAdRecommendationVideoSuggestion videoSuggestions;
    @XmlElement(name = "PromptBrandWarning", nillable = true)
    protected String promptBrandWarning;
    @XmlElement(name = "JobInfo", nillable = true)
    protected AdRecommendationJobInfo jobInfo;

    /**
     * Gets the value of the responsiveAd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsiveAd }
     *     
     */
    public ResponsiveAd getResponsiveAd() {
        return responsiveAd;
    }

    /**
     * Sets the value of the responsiveAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiveAd }
     *     
     */
    public void setResponsiveAd(ResponsiveAd value) {
        this.responsiveAd = value;
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
     * Gets the value of the videoSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationVideoSuggestion }
     *     
     */
    public ArrayOfAdRecommendationVideoSuggestion getVideoSuggestions() {
        return videoSuggestions;
    }

    /**
     * Sets the value of the videoSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationVideoSuggestion }
     *     
     */
    public void setVideoSuggestions(ArrayOfAdRecommendationVideoSuggestion value) {
        this.videoSuggestions = value;
    }

    /**
     * Gets the value of the promptBrandWarning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromptBrandWarning() {
        return promptBrandWarning;
    }

    /**
     * Sets the value of the promptBrandWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromptBrandWarning(String value) {
        this.promptBrandWarning = value;
    }

    /**
     * Gets the value of the jobInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationJobInfo }
     *     
     */
    public AdRecommendationJobInfo getJobInfo() {
        return jobInfo;
    }

    /**
     * Sets the value of the jobInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationJobInfo }
     *     
     */
    public void setJobInfo(AdRecommendationJobInfo value) {
        this.jobInfo = value;
    }

}
