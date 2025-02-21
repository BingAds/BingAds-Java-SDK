
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrandKitFont complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BrandKitFont">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TextAssetType" type="{https://bingads.microsoft.com/CampaignManagement/v13}FontTextAssetType" minOccurs="0"/>
 *         <element name="Typeface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandKitFont", propOrder = {
    "textAssetType",
    "typeface",
    "weight"
})
public class BrandKitFont {

    @XmlElement(name = "TextAssetType")
    @XmlSchemaType(name = "string")
    protected FontTextAssetType textAssetType;
    @XmlElement(name = "Typeface", nillable = true)
    protected String typeface;
    @XmlElement(name = "Weight", nillable = true)
    protected String weight;

    /**
     * Gets the value of the textAssetType property.
     * 
     * @return
     *     possible object is
     *     {@link FontTextAssetType }
     *     
     */
    public FontTextAssetType getTextAssetType() {
        return textAssetType;
    }

    /**
     * Sets the value of the textAssetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontTextAssetType }
     *     
     */
    public void setTextAssetType(FontTextAssetType value) {
        this.textAssetType = value;
    }

    /**
     * Gets the value of the typeface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeface() {
        return typeface;
    }

    /**
     * Sets the value of the typeface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeface(String value) {
        this.typeface = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

}
