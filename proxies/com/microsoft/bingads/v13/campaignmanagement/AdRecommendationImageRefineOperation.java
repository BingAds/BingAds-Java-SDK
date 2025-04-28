
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdRecommendationImageRefineOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdRecommendationImageRefineOperation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ImageRefineType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdRecommendationImageRefineType" minOccurs="0"/>
 *         <element name="ImageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRecommendationImageRefineOperation", propOrder = {
    "imageRefineType",
    "imageIndex",
    "prompt"
})
public class AdRecommendationImageRefineOperation {

    @XmlElement(name = "ImageRefineType")
    @XmlSchemaType(name = "string")
    protected AdRecommendationImageRefineType imageRefineType;
    @XmlElement(name = "ImageIndex")
    protected Integer imageIndex;
    @XmlElement(name = "Prompt", nillable = true)
    protected String prompt;

    /**
     * Gets the value of the imageRefineType property.
     * 
     * @return
     *     possible object is
     *     {@link AdRecommendationImageRefineType }
     *     
     */
    public AdRecommendationImageRefineType getImageRefineType() {
        return imageRefineType;
    }

    /**
     * Sets the value of the imageRefineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRecommendationImageRefineType }
     *     
     */
    public void setImageRefineType(AdRecommendationImageRefineType value) {
        this.imageRefineType = value;
    }

    /**
     * Gets the value of the imageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageIndex() {
        return imageIndex;
    }

    /**
     * Sets the value of the imageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageIndex(Integer value) {
        this.imageIndex = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

}
