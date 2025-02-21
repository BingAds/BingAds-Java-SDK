
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandKitImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandKitImage">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CropHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandKitImage", propOrder = {
    "cropHeight",
    "cropWidth",
    "cropX",
    "cropY",
    "id",
    "thumbnailUrl",
    "url"
})
public class BrandKitImage {

    @XmlElement(name = "CropHeight", nillable = true)
    protected Integer cropHeight;
    @XmlElement(name = "CropWidth", nillable = true)
    protected Integer cropWidth;
    @XmlElement(name = "CropX", nillable = true)
    protected Integer cropX;
    @XmlElement(name = "CropY", nillable = true)
    protected Integer cropY;
    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "ThumbnailUrl", nillable = true)
    protected String thumbnailUrl;
    @XmlElement(name = "Url", nillable = true)
    protected String url;

    /**
     * Gets the value of the cropHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCropHeight() {
        return cropHeight;
    }

    /**
     * Sets the value of the cropHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCropHeight(Integer value) {
        this.cropHeight = value;
    }

    /**
     * Gets the value of the cropWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCropWidth() {
        return cropWidth;
    }

    /**
     * Sets the value of the cropWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCropWidth(Integer value) {
        this.cropWidth = value;
    }

    /**
     * Gets the value of the cropX property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCropX() {
        return cropX;
    }

    /**
     * Sets the value of the cropX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCropX(Integer value) {
        this.cropX = value;
    }

    /**
     * Gets the value of the cropY property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCropY() {
        return cropY;
    }

    /**
     * Sets the value of the cropY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCropY(Integer value) {
        this.cropY = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the thumbnailUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Sets the value of the thumbnailUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbnailUrl(String value) {
        this.thumbnailUrl = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
