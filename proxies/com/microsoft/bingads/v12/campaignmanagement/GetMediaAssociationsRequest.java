
package com.microsoft.bingads.v12.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaEnabledEntities" type="{https://bingads.microsoft.com/CampaignManagement/v12}MediaEnabledEntityFilter" minOccurs="0"/>
 *         &lt;element name="MediaIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mediaEnabledEntities",
    "mediaIds"
})
@XmlRootElement(name = "GetMediaAssociationsRequest")
public class GetMediaAssociationsRequest {

    @XmlElement(name = "MediaEnabledEntities", type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Collection<MediaEnabledEntityFilter> mediaEnabledEntities;
    @XmlElement(name = "MediaIds", nillable = true)
    protected ArrayOflong mediaIds;

    /**
     * Gets the value of the mediaEnabledEntities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<MediaEnabledEntityFilter> getMediaEnabledEntities() {
        return mediaEnabledEntities;
    }

    /**
     * Sets the value of the mediaEnabledEntities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEnabledEntities(Collection<MediaEnabledEntityFilter> value) {
        this.mediaEnabledEntities = value;
    }

    /**
     * Gets the value of the mediaIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getMediaIds() {
        return mediaIds;
    }

    /**
     * Sets the value of the mediaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setMediaIds(ArrayOflong value) {
        this.mediaIds = value;
    }

}
