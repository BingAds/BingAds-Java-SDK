
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SharedEntityAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SharedEntityAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SharedEntityCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="SharedEntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="SharedEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedEntityAssociation", propOrder = {
    "entityId",
    "entityType",
    "sharedEntityCustomerId",
    "sharedEntityId",
    "sharedEntityType"
})
public class SharedEntityAssociation {

    @XmlElement(name = "EntityId")
    protected long entityId;
    @XmlElement(name = "EntityType", nillable = true)
    protected String entityType;
    @XmlElement(name = "SharedEntityCustomerId", nillable = true)
    protected Long sharedEntityCustomerId;
    @XmlElement(name = "SharedEntityId")
    protected long sharedEntityId;
    @XmlElement(name = "SharedEntityType", nillable = true)
    protected String sharedEntityType;

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

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityType(String value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the sharedEntityCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedEntityCustomerId() {
        return sharedEntityCustomerId;
    }

    /**
     * Sets the value of the sharedEntityCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedEntityCustomerId(Long value) {
        this.sharedEntityCustomerId = value;
    }

    /**
     * Gets the value of the sharedEntityId property.
     * 
     */
    public long getSharedEntityId() {
        return sharedEntityId;
    }

    /**
     * Sets the value of the sharedEntityId property.
     * 
     */
    public void setSharedEntityId(long value) {
        this.sharedEntityId = value;
    }

    /**
     * Gets the value of the sharedEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedEntityType() {
        return sharedEntityType;
    }

    /**
     * Sets the value of the sharedEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedEntityType(String value) {
        this.sharedEntityType = value;
    }

}
