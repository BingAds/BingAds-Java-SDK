
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImageAsset">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Asset">
 *       <sequence>
 *         <element name="CropHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropX" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CropY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAsset", propOrder = {
    "cropHeight",
    "cropWidth",
    "cropX",
    "cropY",
    "subType"
})
public class ImageAsset
    extends Asset
{

    @XmlElement(name = "CropHeight", nillable = true)
    protected Integer cropHeight;
    @XmlElement(name = "CropWidth", nillable = true)
    protected Integer cropWidth;
    @XmlElement(name = "CropX", nillable = true)
    protected Integer cropX;
    @XmlElement(name = "CropY", nillable = true)
    protected Integer cropY;
    @XmlElement(name = "SubType", nillable = true)
    protected String subType;

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
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

}
