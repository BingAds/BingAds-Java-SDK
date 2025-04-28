
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
 *         <element name="TextRefineResults" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextRefineResult" minOccurs="0"/>
 *         <element name="MediaRefineResults" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationMediaRefineResult" minOccurs="0"/>
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
    "textRefineResults",
    "mediaRefineResults"
})
@XmlRootElement(name = "RefineAssetGroupRecommendationResponse")
public class RefineAssetGroupRecommendationResponse {

    @XmlElement(name = "TextRefineResults", nillable = true)
    protected ArrayOfAdRecommendationTextRefineResult textRefineResults;
    @XmlElement(name = "MediaRefineResults", nillable = true)
    protected ArrayOfAdRecommendationMediaRefineResult mediaRefineResults;

    /**
     * Gets the value of the textRefineResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationTextRefineResult }
     *     
     */
    public ArrayOfAdRecommendationTextRefineResult getTextRefineResults() {
        return textRefineResults;
    }

    /**
     * Sets the value of the textRefineResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationTextRefineResult }
     *     
     */
    public void setTextRefineResults(ArrayOfAdRecommendationTextRefineResult value) {
        this.textRefineResults = value;
    }

    /**
     * Gets the value of the mediaRefineResults property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationMediaRefineResult }
     *     
     */
    public ArrayOfAdRecommendationMediaRefineResult getMediaRefineResults() {
        return mediaRefineResults;
    }

    /**
     * Sets the value of the mediaRefineResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationMediaRefineResult }
     *     
     */
    public void setMediaRefineResults(ArrayOfAdRecommendationMediaRefineResult value) {
        this.mediaRefineResults = value;
    }

}
