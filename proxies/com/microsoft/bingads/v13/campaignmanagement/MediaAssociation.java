
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MediaAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="MediaEnabledEntity" type="{https://bingads.microsoft.com/CampaignManagement/v13}MediaEnabledEntityFilter" minOccurs="0"/>
 *         <element name="MediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAssociation", propOrder = {
    "entityId",
    "mediaEnabledEntity",
    "mediaId"
})
public class MediaAssociation {

    @XmlElement(name = "EntityId")
    protected Long entityId;
    @XmlElement(name = "MediaEnabledEntity", type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Collection<MediaEnabledEntityFilter> mediaEnabledEntity;
    @XmlElement(name = "MediaId")
    protected Long mediaId;

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityId(Long value) {
        this.entityId = value;
    }

    /**
     * Gets the value of the mediaEnabledEntity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<MediaEnabledEntityFilter> getMediaEnabledEntity() {
        return mediaEnabledEntity;
    }

    /**
     * Sets the value of the mediaEnabledEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaEnabledEntity(Collection<MediaEnabledEntityFilter> value) {
        this.mediaEnabledEntity = value;
    }

    /**
     * Gets the value of the mediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMediaId() {
        return mediaId;
    }

    /**
     * Sets the value of the mediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMediaId(Long value) {
        this.mediaId = value;
    }

}
