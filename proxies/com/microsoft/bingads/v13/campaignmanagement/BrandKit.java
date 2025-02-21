
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandKit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandKit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Fonts" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitFont" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Images" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitImage" minOccurs="0"/>
 *         <element name="LandscapeLogos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitImage" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Palettes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitPalette" minOccurs="0"/>
 *         <element name="SquareLogos" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitImage" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandKit", propOrder = {
    "fonts",
    "id",
    "images",
    "landscapeLogos",
    "name",
    "palettes",
    "squareLogos"
})
public class BrandKit {

    @XmlElement(name = "Fonts", nillable = true)
    protected ArrayOfBrandKitFont fonts;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "Images", nillable = true)
    protected ArrayOfBrandKitImage images;
    @XmlElement(name = "LandscapeLogos", nillable = true)
    protected ArrayOfBrandKitImage landscapeLogos;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Palettes", nillable = true)
    protected ArrayOfBrandKitPalette palettes;
    @XmlElement(name = "SquareLogos", nillable = true)
    protected ArrayOfBrandKitImage squareLogos;

    /**
     * Gets the value of the fonts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitFont }
     *     
     */
    public ArrayOfBrandKitFont getFonts() {
        return fonts;
    }

    /**
     * Sets the value of the fonts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitFont }
     *     
     */
    public void setFonts(ArrayOfBrandKitFont value) {
        this.fonts = value;
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
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public ArrayOfBrandKitImage getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public void setImages(ArrayOfBrandKitImage value) {
        this.images = value;
    }

    /**
     * Gets the value of the landscapeLogos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public ArrayOfBrandKitImage getLandscapeLogos() {
        return landscapeLogos;
    }

    /**
     * Sets the value of the landscapeLogos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public void setLandscapeLogos(ArrayOfBrandKitImage value) {
        this.landscapeLogos = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the palettes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitPalette }
     *     
     */
    public ArrayOfBrandKitPalette getPalettes() {
        return palettes;
    }

    /**
     * Sets the value of the palettes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitPalette }
     *     
     */
    public void setPalettes(ArrayOfBrandKitPalette value) {
        this.palettes = value;
    }

    /**
     * Gets the value of the squareLogos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public ArrayOfBrandKitImage getSquareLogos() {
        return squareLogos;
    }

    /**
     * Sets the value of the squareLogos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitImage }
     *     
     */
    public void setSquareLogos(ArrayOfBrandKitImage value) {
        this.squareLogos = value;
    }

}
