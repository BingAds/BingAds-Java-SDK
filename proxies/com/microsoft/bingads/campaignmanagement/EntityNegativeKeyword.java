
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityNegativeKeyword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityNegativeKeyword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EntityType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NegativeKeywords" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfNegativeKeyword"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityNegativeKeyword", propOrder = {
    "entityId",
    "entityType",
    "negativeKeywords"
})
public class EntityNegativeKeyword {

    @XmlElement(name = "EntityId")
    protected long entityId;
    @XmlElement(name = "EntityType", required = true, nillable = true)
    protected String entityType;
    @XmlElement(name = "NegativeKeywords", required = true, nillable = true)
    protected ArrayOfNegativeKeyword negativeKeywords;

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
     * Gets the value of the negativeKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNegativeKeyword }
     *     
     */
    public ArrayOfNegativeKeyword getNegativeKeywords() {
        return negativeKeywords;
    }

    /**
     * Sets the value of the negativeKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNegativeKeyword }
     *     
     */
    public void setNegativeKeywords(ArrayOfNegativeKeyword value) {
        this.negativeKeywords = value;
    }

}
