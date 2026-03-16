
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomSegmentCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomSegmentCatalog">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CatalogId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CatalogName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EffectiveEditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}EffectiveEditorialStatus" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomSegmentCatalog", propOrder = {
    "catalogId",
    "catalogName",
    "effectiveEditorialStatus"
})
public class CustomSegmentCatalog {

    @XmlElement(name = "CatalogId", nillable = true)
    protected Long catalogId;
    @XmlElement(name = "CatalogName", nillable = true)
    protected String catalogName;
    @XmlElement(name = "EffectiveEditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected EffectiveEditorialStatus effectiveEditorialStatus;

    /**
     * Gets the value of the catalogId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCatalogId() {
        return catalogId;
    }

    /**
     * Sets the value of the catalogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCatalogId(Long value) {
        this.catalogId = value;
    }

    /**
     * Gets the value of the catalogName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogName() {
        return catalogName;
    }

    /**
     * Sets the value of the catalogName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogName(String value) {
        this.catalogName = value;
    }

    /**
     * Gets the value of the effectiveEditorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EffectiveEditorialStatus }
     *     
     */
    public EffectiveEditorialStatus getEffectiveEditorialStatus() {
        return effectiveEditorialStatus;
    }

    /**
     * Sets the value of the effectiveEditorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EffectiveEditorialStatus }
     *     
     */
    public void setEffectiveEditorialStatus(EffectiveEditorialStatus value) {
        this.effectiveEditorialStatus = value;
    }

}
