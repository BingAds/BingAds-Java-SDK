
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="EntityIdToParentIdAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEntityIdToParentIdAssociation" minOccurs="0"/>
 *         <element name="EntityType" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityType" minOccurs="0"/>
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
    "accountId",
    "entityIdToParentIdAssociations",
    "entityType"
})
@XmlRootElement(name = "GetEditorialReasonsByIdsRequest")
public class GetEditorialReasonsByIdsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "EntityIdToParentIdAssociations", nillable = true)
    protected ArrayOfEntityIdToParentIdAssociation entityIdToParentIdAssociations;
    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected EntityType entityType;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the entityIdToParentIdAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityIdToParentIdAssociation }
     *     
     */
    public ArrayOfEntityIdToParentIdAssociation getEntityIdToParentIdAssociations() {
        return entityIdToParentIdAssociations;
    }

    /**
     * Sets the value of the entityIdToParentIdAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityIdToParentIdAssociation }
     *     
     */
    public void setEntityIdToParentIdAssociations(ArrayOfEntityIdToParentIdAssociation value) {
        this.entityIdToParentIdAssociations = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

}
