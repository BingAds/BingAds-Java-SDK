
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageAdExtension">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v9}AdExtension">
 *       &lt;sequence>
 *         &lt;element name="AlternativeText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImageMediaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImageMediaIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAdExtension", propOrder = {
    "alternativeText",
    "description",
    "destinationUrl",
    "imageMediaId",
    "imageMediaIds"
})
public class ImageAdExtension
    extends AdExtension
{

    @XmlElement(name = "AlternativeText", required = true, nillable = true)
    protected String alternativeText;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "DestinationUrl", nillable = true)
    protected String destinationUrl;
    @XmlElement(name = "ImageMediaId")
    protected long imageMediaId;
    @XmlElement(name = "ImageMediaIds", nillable = true)
    protected ArrayOflong imageMediaIds;

    /**
     * Gets the value of the alternativeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeText() {
        return alternativeText;
    }

    /**
     * Sets the value of the alternativeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeText(String value) {
        this.alternativeText = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the imageMediaId property.
     * 
     */
    public long getImageMediaId() {
        return imageMediaId;
    }

    /**
     * Sets the value of the imageMediaId property.
     * 
     */
    public void setImageMediaId(long value) {
        this.imageMediaId = value;
    }

    /**
     * Gets the value of the imageMediaIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getImageMediaIds() {
        return imageMediaIds;
    }

    /**
     * Sets the value of the imageMediaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setImageMediaIds(ArrayOflong value) {
        this.imageMediaIds = value;
    }

}
