
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoTemplateFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VideoTemplateFilter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AspectRatios" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Durations" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         <element name="MaxMediaAssetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MaxTextAssetCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TemplateIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Themes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoTemplateFilter", propOrder = {
    "aspectRatios",
    "durations",
    "maxMediaAssetCount",
    "maxTextAssetCount",
    "templateIds",
    "themes"
})
public class VideoTemplateFilter {

    @XmlElement(name = "AspectRatios", nillable = true)
    protected ArrayOfstring aspectRatios;
    @XmlElement(name = "Durations", nillable = true)
    protected ArrayOfint durations;
    @XmlElement(name = "MaxMediaAssetCount")
    protected Integer maxMediaAssetCount;
    @XmlElement(name = "MaxTextAssetCount")
    protected Integer maxTextAssetCount;
    @XmlElement(name = "TemplateIds", nillable = true)
    protected ArrayOfstring templateIds;
    @XmlElement(name = "Themes", nillable = true)
    protected ArrayOfstring themes;

    /**
     * Gets the value of the aspectRatios property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getAspectRatios() {
        return aspectRatios;
    }

    /**
     * Sets the value of the aspectRatios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setAspectRatios(ArrayOfstring value) {
        this.aspectRatios = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getDurations() {
        return durations;
    }

    /**
     * Sets the value of the durations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setDurations(ArrayOfint value) {
        this.durations = value;
    }

    /**
     * Gets the value of the maxMediaAssetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMediaAssetCount() {
        return maxMediaAssetCount;
    }

    /**
     * Sets the value of the maxMediaAssetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMediaAssetCount(Integer value) {
        this.maxMediaAssetCount = value;
    }

    /**
     * Gets the value of the maxTextAssetCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxTextAssetCount() {
        return maxTextAssetCount;
    }

    /**
     * Sets the value of the maxTextAssetCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxTextAssetCount(Integer value) {
        this.maxTextAssetCount = value;
    }

    /**
     * Gets the value of the templateIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getTemplateIds() {
        return templateIds;
    }

    /**
     * Sets the value of the templateIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setTemplateIds(ArrayOfstring value) {
        this.templateIds = value;
    }

    /**
     * Gets the value of the themes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getThemes() {
        return themes;
    }

    /**
     * Sets the value of the themes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setThemes(ArrayOfstring value) {
        this.themes = value;
    }

}
