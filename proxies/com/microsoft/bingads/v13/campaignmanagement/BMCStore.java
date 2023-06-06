
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMCStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BMCStore">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HasCatalog" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsProductAdsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StoreUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SubType" type="{https://bingads.microsoft.com/CampaignManagement/v13}BMCStoreSubType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMCStore", propOrder = {
    "hasCatalog",
    "id",
    "isActive",
    "isProductAdsEnabled",
    "name",
    "storeUrl",
    "subType"
})
public class BMCStore {

    @XmlElement(name = "HasCatalog")
    protected Boolean hasCatalog;
    @XmlElement(name = "Id")
    protected Long id;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "IsProductAdsEnabled")
    protected Boolean isProductAdsEnabled;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "StoreUrl", nillable = true)
    protected String storeUrl;
    @XmlElement(name = "SubType", nillable = true)
    @XmlSchemaType(name = "string")
    protected BMCStoreSubType subType;

    /**
     * Gets the value of the hasCatalog property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getHasCatalog() {
        return hasCatalog;
    }

    /**
     * Sets the value of the hasCatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCatalog(Boolean value) {
        this.hasCatalog = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isProductAdsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsProductAdsEnabled() {
        return isProductAdsEnabled;
    }

    /**
     * Sets the value of the isProductAdsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProductAdsEnabled(Boolean value) {
        this.isProductAdsEnabled = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the storeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreUrl() {
        return storeUrl;
    }

    /**
     * Sets the value of the storeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreUrl(String value) {
        this.storeUrl = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link BMCStoreSubType }
     *     
     */
    public BMCStoreSubType getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMCStoreSubType }
     *     
     */
    public void setSubType(BMCStoreSubType value) {
        this.subType = value;
    }

}
