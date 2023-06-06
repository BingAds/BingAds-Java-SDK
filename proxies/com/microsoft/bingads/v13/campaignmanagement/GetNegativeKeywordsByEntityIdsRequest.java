
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EntityIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ParentEntityId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "entityIds",
    "entityType",
    "parentEntityId"
})
@XmlRootElement(name = "GetNegativeKeywordsByEntityIdsRequest")
public class GetNegativeKeywordsByEntityIdsRequest {

    @XmlElement(name = "EntityIds", nillable = true)
    protected ArrayOflong entityIds;
    @XmlElement(name = "EntityType", nillable = true)
    protected String entityType;
    @XmlElement(name = "ParentEntityId", nillable = true)
    protected Long parentEntityId;

    /**
     * Gets the value of the entityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the value of the entityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setEntityIds(ArrayOflong value) {
        this.entityIds = value;
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
     * Gets the value of the parentEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentEntityId() {
        return parentEntityId;
    }

    /**
     * Sets the value of the parentEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentEntityId(Long value) {
        this.parentEntityId = value;
    }

}
