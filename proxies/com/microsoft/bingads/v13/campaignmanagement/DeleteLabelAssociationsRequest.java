
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
 *         <element name="EntityType" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityType" minOccurs="0"/>
 *         <element name="LabelAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfLabelAssociation" minOccurs="0"/>
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
    "entityType",
    "labelAssociations"
})
@XmlRootElement(name = "DeleteLabelAssociationsRequest")
public class DeleteLabelAssociationsRequest {

    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected EntityType entityType;
    @XmlElement(name = "LabelAssociations", nillable = true)
    protected ArrayOfLabelAssociation labelAssociations;

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

    /**
     * Gets the value of the labelAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLabelAssociation }
     *     
     */
    public ArrayOfLabelAssociation getLabelAssociations() {
        return labelAssociations;
    }

    /**
     * Sets the value of the labelAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLabelAssociation }
     *     
     */
    public void setLabelAssociations(ArrayOfLabelAssociation value) {
        this.labelAssociations = value;
    }

}
