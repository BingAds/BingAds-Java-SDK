
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdExtensionAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdExtensionAssociation">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdExtension" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtension" minOccurs="0"/>
 *         <element name="AssociationType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssociationType"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionEditorialStatus" minOccurs="0"/>
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
@XmlType(name = "AdExtensionAssociation", propOrder = {
    "adExtension",
    "associationType",
    "editorialStatus",
    "entityId"
})
public class AdExtensionAssociation {

    @XmlElement(name = "AdExtension", nillable = true)
    protected AdExtension adExtension;
    @XmlElement(name = "AssociationType", required = true)
    @XmlSchemaType(name = "string")
    protected AssociationType associationType;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AdExtensionEditorialStatus editorialStatus;
    @XmlElement(name = "EntityId")
    protected long entityId;

    /**
     * Gets the value of the adExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtension }
     *     
     */
    public AdExtension getAdExtension() {
        return adExtension;
    }

    /**
     * Sets the value of the adExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtension }
     *     
     */
    public void setAdExtension(AdExtension value) {
        this.adExtension = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationType }
     *     
     */
    public AssociationType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationType }
     *     
     */
    public void setAssociationType(AssociationType value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionEditorialStatus }
     *     
     */
    public AdExtensionEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionEditorialStatus }
     *     
     */
    public void setEditorialStatus(AdExtensionEditorialStatus value) {
        this.editorialStatus = value;
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
