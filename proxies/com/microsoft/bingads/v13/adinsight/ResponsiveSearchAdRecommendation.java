
package com.microsoft.bingads.v13.adinsight;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveSearchAdRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponsiveSearchAdRecommendation">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/AdInsight/v13}RecommendationBase">
 *       <sequence>
 *         <element name="SuggestedAd" type="{https://bingads.microsoft.com/AdInsight/v13}SuggestedResponsiveSearchAd" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAdRecommendation", propOrder = {
    "suggestedAd"
})
public class ResponsiveSearchAdRecommendation
    extends RecommendationBase
{
    public ResponsiveSearchAdRecommendation() {
      this.type = RecommendationType.fromValue("ResponsiveSearchAdRecommendation");
    }

    @XmlElement(name = "SuggestedAd", nillable = true)
    protected SuggestedResponsiveSearchAd suggestedAd;

    /**
     * Gets the value of the suggestedAd property.
     * 
     * @return
     *     possible object is
     *     {@link SuggestedResponsiveSearchAd }
     *     
     */
    public SuggestedResponsiveSearchAd getSuggestedAd() {
        return suggestedAd;
    }

    /**
     * Sets the value of the suggestedAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestedResponsiveSearchAd }
     *     
     */
    public void setSuggestedAd(SuggestedResponsiveSearchAd value) {
        this.suggestedAd = value;
    }

}
