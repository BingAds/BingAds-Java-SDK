
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationMediaRefineResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationMediaRefineResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Errors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfOperationError" minOccurs="0"/>
 *         <element name="MediaList" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdRecommendationRefinedMedia" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationMediaRefineResult", propOrder = {
    "errors",
    "mediaList"
})
public class AdRecommendationMediaRefineResult {

    @XmlElement(name = "Errors", nillable = true)
    protected ArrayOfOperationError errors;
    @XmlElement(name = "MediaList", nillable = true)
    protected ArrayOfAdRecommendationRefinedMedia mediaList;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public ArrayOfOperationError getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOperationError }
     *     
     */
    public void setErrors(ArrayOfOperationError value) {
        this.errors = value;
    }

    /**
     * Gets the value of the mediaList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdRecommendationRefinedMedia }
     *     
     */
    public ArrayOfAdRecommendationRefinedMedia getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdRecommendationRefinedMedia }
     *     
     */
    public void setMediaList(ArrayOfAdRecommendationRefinedMedia value) {
        this.mediaList = value;
    }

}
