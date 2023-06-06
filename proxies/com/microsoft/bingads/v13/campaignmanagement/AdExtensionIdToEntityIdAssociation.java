
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionIdToEntityIdAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdExtensionIdToEntityIdAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtensionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
