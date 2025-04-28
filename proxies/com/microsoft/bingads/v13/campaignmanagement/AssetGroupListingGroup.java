
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupListingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroupListingGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AssetGroupListingType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupListingType" minOccurs="0"/>
 *         <element name="Dimension" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProductCondition" minOccurs="0"/>
 *         <element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="IsExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ListingGroupPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ParentListingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroupListingGroup", propOrder = {
    "assetGroupId",
    "assetGroupListingType",
    "dimension",
    "id",
    "isExcluded",
    "listingGroupPath",
    "parentListingGroupId"
})
public class AssetGroupListingGroup {

    @XmlElement(name = "AssetGroupId")
    protected Long assetGroupId;
    @XmlElement(name = "AssetGroupListingType")
    @XmlSchemaType(name = "string")
    protected AssetGroupListingType assetGroupListingType;
    @XmlElement(name = "Dimension", nillable = true)
    protected ProductCondition dimension;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "IsExcluded")
    protected Boolean isExcluded;
    @XmlElement(name = "ListingGroupPath", nillable = true)
    protected String listingGroupPath;
    @XmlElement(name = "ParentListingGroupId", nillable = true)
    protected Long parentListingGroupId;

    /**
     * Gets the value of the assetGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetGroupId() {
        return assetGroupId;
    }

    /**
     * Sets the value of the assetGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetGroupId(Long value) {
        this.assetGroupId = value;
    }

    /**
     * Gets the value of the assetGroupListingType property.
     * 
     * @return
     *     possible object is
     *     {@link AssetGroupListingType }
     *     
     */
    public AssetGroupListingType getAssetGroupListingType() {
        return assetGroupListingType;
    }

    /**
     * Sets the value of the assetGroupListingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroupListingType }
     *     
     */
    public void setAssetGroupListingType(AssetGroupListingType value) {
        this.assetGroupListingType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCondition }
     *     
     */
    public ProductCondition getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCondition }
     *     
     */
    public void setDimension(ProductCondition value) {
        this.dimension = value;
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
     * Gets the value of the isExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsExcluded() {
        return isExcluded;
    }

    /**
     * Sets the value of the isExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExcluded(Boolean value) {
        this.isExcluded = value;
    }

    /**
     * Gets the value of the listingGroupPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingGroupPath() {
        return listingGroupPath;
    }

    /**
     * Sets the value of the listingGroupPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingGroupPath(String value) {
        this.listingGroupPath = value;
    }

    /**
     * Gets the value of the parentListingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentListingGroupId() {
        return parentListingGroupId;
    }

    /**
     * Sets the value of the parentListingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentListingGroupId(Long value) {
        this.parentListingGroupId = value;
    }

}
