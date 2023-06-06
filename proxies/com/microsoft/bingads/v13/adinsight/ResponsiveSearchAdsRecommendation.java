
package com.microsoft.bingads.v13.adinsight;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsiveSearchAdsRecommendation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveSearchAdsRecommendation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/AdInsight/v13}Recommendation">
 *       &lt;sequence>
 *         &lt;element name="SuggestedAd" type="{https://bingads.microsoft.com/AdInsight/v13}SuggestedResponsiveSearchAd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveSearchAdsRecommendation", propOrder = {
    "suggestedAd"
})
public class ResponsiveSearchAdsRecommendation
    extends Recommendation
{

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
