
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
 *         <element name="TextSuggestions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfArrayOfAdRecommendationTextSuggestion" minOccurs="0"/>
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
    "textSuggestions"
})
@XmlRootElement(name = "RefineAssetGroupRecommendationResponse")
public class RefineAssetGroupRecommendationResponse {

    @XmlElement(name = "TextSuggestions", nillable = true)
    protected ArrayOfArrayOfAdRecommendationTextSuggestion textSuggestions;

    /**
     * Gets the value of the textSuggestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfAdRecommendationTextSuggestion }
     *     
     */
    public ArrayOfArrayOfAdRecommendationTextSuggestion getTextSuggestions() {
        return textSuggestions;
    }

    /**
     * Sets the value of the textSuggestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfAdRecommendationTextSuggestion }
     *     
     */
    public void setTextSuggestions(ArrayOfArrayOfAdRecommendationTextSuggestion value) {
        this.textSuggestions = value;
    }

}
