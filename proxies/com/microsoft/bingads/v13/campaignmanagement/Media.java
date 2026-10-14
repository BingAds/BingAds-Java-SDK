
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Media complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Media">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdvertiserAILabel" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdvertiserAILabel" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", propOrder = {
    "advertiserAILabel",
    "id",
    "mediaType",
    "text",
    "type"
})
@XmlSeeAlso({
    Image.class
})
public class Media {

    @XmlElement(name = "AdvertiserAILabel", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdvertiserAILabel advertiserAILabel;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "MediaType", nillable = true)
    protected String mediaType;
    @XmlElement(name = "Text", nillable = true)
    protected String text;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    public Media() {
        this.type = "Media";
    }

    /**
     * Gets the value of the advertiserAILabel property.
     *
     * @return
     *     possible object is
     *     {@link AdvertiserAILabel }
     *
     */
    public AdvertiserAILabel getAdvertiserAILabel() {
        return advertiserAILabel;
    }

    /**
     * Sets the value of the advertiserAILabel property.
     *
     * @param value
     *     allowed object is
     *     {@link AdvertiserAILabel }
     *
     */
    public void setAdvertiserAILabel(AdvertiserAILabel value) {
        this.advertiserAILabel = value;
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
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {

    }

}
