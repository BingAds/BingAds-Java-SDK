
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
    "textRefineResults"
})
@XmlRootElement(name = "RefineResponsiveSearchAdRecommendationResponse")
public class RefineResponsiveSearchAdRecommendationResponse {

    @XmlElement(name = "TextRefineResults", nillable = true)
    protected ArrayOfAdRecommendationTextRefineResult textRefineResults;

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

}
