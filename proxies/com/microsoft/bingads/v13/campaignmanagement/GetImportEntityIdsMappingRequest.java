
package com.microsoft.bingads.v13.campaignmanagement;

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
 *         &lt;element name="ImportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceEntityIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ImportEntityType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImportEntityType" minOccurs="0"/>
 *         &lt;element name="SourceParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "importType",
    "sourceEntityIds",
    "importEntityType",
    "sourceParentId"
})
@XmlRootElement(name = "GetImportEntityIdsMappingRequest")
public class GetImportEntityIdsMappingRequest {

    @XmlElement(name = "ImportType", nillable = true)
    protected String importType;
    @XmlElement(name = "SourceEntityIds", nillable = true)
    protected ArrayOflong sourceEntityIds;
    @XmlElement(name = "ImportEntityType")
    @XmlSchemaType(name = "string")
    protected ImportEntityType importEntityType;
    @XmlElement(name = "SourceParentId", nillable = true)
    protected Long sourceParentId;

    /**
     * Gets the value of the importType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportType() {
        return importType;
    }

    /**
     * Sets the value of the importType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportType(String value) {
        this.importType = value;
    }

    /**
     * Gets the value of the sourceEntityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getSourceEntityIds() {
        return sourceEntityIds;
    }

    /**
     * Sets the value of the sourceEntityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setSourceEntityIds(ArrayOflong value) {
        this.sourceEntityIds = value;
    }

    /**
     * Gets the value of the importEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link ImportEntityType }
     *     
     */
    public ImportEntityType getImportEntityType() {
        return importEntityType;
    }

    /**
     * Sets the value of the importEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportEntityType }
     *     
     */
    public void setImportEntityType(ImportEntityType value) {
        this.importEntityType = value;
    }

    /**
     * Gets the value of the sourceParentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSourceParentId() {
        return sourceParentId;
    }

    /**
     * Sets the value of the sourceParentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSourceParentId(Long value) {
        this.sourceParentId = value;
    }

}
