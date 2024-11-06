
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
 *         <element name="ResponsiveSearchAd" type="{https://bingads.microsoft.com/CampaignManagement/v13}ResponsiveSearchAd" minOccurs="0"/>
 *         <element name="TextRefineOperations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationTextRefineOperation" minOccurs="0"/>
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
    "responsiveSearchAd",
    "textRefineOperations"
})
@XmlRootElement(name = "RefineResponsiveSearchAdRecommendationRequest")
public class RefineResponsiveSearchAdRecommendationRequest {

    @XmlElement(name = "ResponsiveSearchAd", nillable = true)
    protected ResponsiveSearchAd responsiveSearchAd;
    @XmlElement(name = "TextRefineOperations", nillable = true)
    protected ArrayOfAdRecommendationTextRefineOperation textRefineOperations;

    /**
     * Gets the value of the responsiveSearchAd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsiveSearchAd }
     *     
     */
    public ResponsiveSearchAd getResponsiveSearchAd() {
        return responsiveSearchAd;
    }

    /**
     * Sets the value of the responsiveSearchAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsiveSearchAd }
     *     
     */
    public void setResponsiveSearchAd(ResponsiveSearchAd value) {
        this.responsiveSearchAd = value;
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

}
