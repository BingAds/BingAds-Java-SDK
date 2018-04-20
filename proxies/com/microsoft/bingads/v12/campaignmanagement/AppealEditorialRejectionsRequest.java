
package com.microsoft.bingads.v12.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="EntityIdToParentIdAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v12}ArrayOfEntityIdToParentIdAssociation" minOccurs="0"/>
 *         &lt;element name="EntityType" type="{https://bingads.microsoft.com/CampaignManagement/v12}EntityType" minOccurs="0"/>
 *         &lt;element name="JustificationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "entityIdToParentIdAssociations",
    "entityType",
    "justificationText"
})
@XmlRootElement(name = "AppealEditorialRejectionsRequest")
public class AppealEditorialRejectionsRequest {

    @XmlElement(name = "EntityIdToParentIdAssociations", nillable = true)
    protected ArrayOfEntityIdToParentIdAssociation entityIdToParentIdAssociations;
    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected EntityType entityType;
    @XmlElement(name = "JustificationText", nillable = true)
    protected String justificationText;

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

    /**
     * Gets the value of the justificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificationText() {
        return justificationText;
    }

    /**
     * Sets the value of the justificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificationText(String value) {
        this.justificationText = value;
    }

}
