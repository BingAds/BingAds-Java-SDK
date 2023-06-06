
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetLink">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Asset" type="{https://bingads.microsoft.com/CampaignManagement/v13}Asset" minOccurs="0"/>
 *         <element name="AssetPerformanceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EditorialStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetLinkEditorialStatus" minOccurs="0"/>
 *         <element name="PinnedField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetLink", propOrder = {
    "asset",
    "assetPerformanceLabel",
    "editorialStatus",
    "pinnedField"
})
public class AssetLink {

    @XmlElement(name = "Asset", nillable = true)
    protected Asset asset;
    @XmlElement(name = "AssetPerformanceLabel", nillable = true)
    protected String assetPerformanceLabel;
    @XmlElement(name = "EditorialStatus", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssetLinkEditorialStatus editorialStatus;
    @XmlElement(name = "PinnedField", nillable = true)
    protected String pinnedField;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link Asset }
     *     
     */
    public Asset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Asset }
     *     
     */
    public void setAsset(Asset value) {
        this.asset = value;
    }

    /**
     * Gets the value of the assetPerformanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetPerformanceLabel() {
        return assetPerformanceLabel;
    }

    /**
     * Sets the value of the assetPerformanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetPerformanceLabel(String value) {
        this.assetPerformanceLabel = value;
    }

    /**
     * Gets the value of the editorialStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLinkEditorialStatus }
     *     
     */
    public AssetLinkEditorialStatus getEditorialStatus() {
        return editorialStatus;
    }

    /**
     * Sets the value of the editorialStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLinkEditorialStatus }
     *     
     */
    public void setEditorialStatus(AssetLinkEditorialStatus value) {
        this.editorialStatus = value;
    }

    /**
     * Gets the value of the pinnedField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinnedField() {
        return pinnedField;
    }

    /**
     * Sets the value of the pinnedField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinnedField(String value) {
        this.pinnedField = value;
    }

}
