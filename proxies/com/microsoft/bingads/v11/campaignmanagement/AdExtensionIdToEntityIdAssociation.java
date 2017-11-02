
package com.microsoft.bingads.v11.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionIdToEntityIdAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExtensionIdToEntityIdAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExtensionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExtensionIdToEntityIdAssociation", propOrder = {
    "adExtensionId",
    "entityId"
})
public class AdExtensionIdToEntityIdAssociation {

    @XmlElement(name = "AdExtensionId")
    protected long adExtensionId;
    @XmlElement(name = "EntityId")
    protected long entityId;

    /**
     * Gets the value of the adExtensionId property.
     * 
     */
    public long getAdExtensionId() {
        return adExtensionId;
    }

    /**
     * Sets the value of the adExtensionId property.
     * 
     */
    public void setAdExtensionId(long value) {
        this.adExtensionId = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     */
    public long getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     */
    public void setEntityId(long value) {
        this.entityId = value;
    }

}
