
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandKitPalette complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandKitPalette">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ColorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Colors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBrandKitColor" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandKitPalette", propOrder = {
    "colorType",
    "colors",
    "name"
})
public class BrandKitPalette {

    @XmlElement(name = "ColorType", nillable = true)
    protected String colorType;
    @XmlElement(name = "Colors", nillable = true)
    protected ArrayOfBrandKitColor colors;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the colorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorType() {
        return colorType;
    }

    /**
     * Sets the value of the colorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorType(String value) {
        this.colorType = value;
    }

    /**
     * Gets the value of the colors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBrandKitColor }
     *     
     */
    public ArrayOfBrandKitColor getColors() {
        return colors;
    }

    /**
     * Sets the value of the colors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBrandKitColor }
     *     
     */
    public void setColors(ArrayOfBrandKitColor value) {
        this.colors = value;
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

}
