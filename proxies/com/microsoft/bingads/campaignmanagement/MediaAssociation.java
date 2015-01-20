
package com.microsoft.bingads.campaignmanagement;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MediaEnabledEntity" type="{https://bingads.microsoft.com/CampaignManagement/v9}MediaEnabledEntityFilter" minOccurs="0"/>
 *         &lt;element name="MediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected List<MediaEnabledEntityFilter> mediaEnabledEntity;
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
    public List<MediaEnabledEntityFilter> getMediaEnabledEntity() {
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
    public void setMediaEnabledEntity(List<MediaEnabledEntityFilter> value) {
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
