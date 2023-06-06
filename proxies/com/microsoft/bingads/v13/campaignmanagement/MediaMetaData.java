
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MediaMetaData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="MediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Representations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfMediaRepresentation" minOccurs="0"/>
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
@XmlType(name = "MediaMetaData", propOrder = {
    "id",
    "mediaType",
    "representations",
    "type"
})
public class MediaMetaData {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "MediaType", nillable = true)
    protected String mediaType;
    @XmlElement(name = "Representations", nillable = true)
    protected ArrayOfMediaRepresentation representations;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
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
     * Gets the value of the representations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaRepresentation }
     *     
     */
    public ArrayOfMediaRepresentation getRepresentations() {
        return representations;
    }

    /**
     * Sets the value of the representations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaRepresentation }
     *     
     */
    public void setRepresentations(ArrayOfMediaRepresentation value) {
        this.representations = value;
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
        this.type = value;
    }

}
