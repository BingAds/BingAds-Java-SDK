
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VideoAsset">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Asset">
 *       <sequence>
 *         <element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ThumbnailImage" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImageAsset" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAsset", propOrder = {
    "subType",
    "thumbnailImage"
})
public class VideoAsset
    extends Asset
{

    @XmlElement(name = "SubType", nillable = true)
    protected String subType;
    @XmlElement(name = "ThumbnailImage", nillable = true)
    protected ImageAsset thumbnailImage;

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

    /**
     * Gets the value of the thumbnailImage property.
     * 
     * @return
     *     possible object is
     *     {@link ImageAsset }
     *     
     */
    public ImageAsset getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Sets the value of the thumbnailImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageAsset }
     *     
     */
    public void setThumbnailImage(ImageAsset value) {
        this.thumbnailImage = value;
    }

}
