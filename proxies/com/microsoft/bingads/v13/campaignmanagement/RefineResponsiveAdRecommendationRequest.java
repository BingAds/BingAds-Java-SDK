
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
    "responsiveAd",
    "textRefineOperations"
})
@XmlRootElement(name = "RefineResponsiveAdRecommendationRequest")
public class RefineResponsiveAdRecommendationRequest {

    @XmlElement(name = "ResponsiveAd", nillable = true)
    protected ResponsiveAd responsiveAd;
    @XmlElement(name = "TextRefineOperations", nillable = true)
    protected ArrayOfAdRecommendationTextRefineOperation textRefineOperations;

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
