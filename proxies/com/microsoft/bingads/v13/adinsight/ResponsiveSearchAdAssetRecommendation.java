
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveSearchAdAssetRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponsiveSearchAdAssetRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="RecommendedResponsiveSearchAd" type="{https://bingads.microsoft.com/AdInsight/v13}SuggestedResponsiveSearchAd" minOccurs="0"/>
 *         <element name="ResponsiveSearchAdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAdAssetRecommendation", propOrder = {
    "recommendedResponsiveSearchAd",
    "responsiveSearchAdId"
})
public class ResponsiveSearchAdAssetRecommendation
    extends RecommendationBase
{
    public ResponsiveSearchAdAssetRecommendation() {
      this.type = RecommendationType.fromValue("ResponsiveSearchAdAssetRecommendation");
    }

    @XmlElement(name = "RecommendedResponsiveSearchAd", nillable = true)
    protected SuggestedResponsiveSearchAd recommendedResponsiveSearchAd;
    @XmlElement(name = "ResponsiveSearchAdId")
    protected Long responsiveSearchAdId;

    /**
     * Gets the value of the recommendedResponsiveSearchAd property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedResponsiveSearchAd }
     *     
     */
    public SuggestedResponsiveSearchAd getRecommendedResponsiveSearchAd() {
        return recommendedResponsiveSearchAd;
    }

    /**
     * Sets the value of the recommendedResponsiveSearchAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedResponsiveSearchAd }
     *     
     */
    public void setRecommendedResponsiveSearchAd(SuggestedResponsiveSearchAd value) {
        this.recommendedResponsiveSearchAd = value;
    }

    /**
     * Gets the value of the responsiveSearchAdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponsiveSearchAdId() {
        return responsiveSearchAdId;
    }

    /**
     * Sets the value of the responsiveSearchAdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponsiveSearchAdId(Long value) {
        this.responsiveSearchAdId = value;
    }

}
