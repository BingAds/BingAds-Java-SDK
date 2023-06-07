
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AssetGroupListingGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
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
    "assetGroupId",
    "assetGroupListingGroupIds"
})
@XmlRootElement(name = "GetAssetGroupListingGroupsByIdsRequest")
public class GetAssetGroupListingGroupsByIdsRequest {

    @XmlElement(name = "AssetGroupId")
    protected Long assetGroupId;
    @XmlElement(name = "AssetGroupListingGroupIds", nillable = true)
    protected ArrayOflong assetGroupListingGroupIds;

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
     * Gets the value of the assetGroupListingGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAssetGroupListingGroupIds() {
        return assetGroupListingGroupIds;
    }

    /**
     * Sets the value of the assetGroupListingGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAssetGroupListingGroupIds(ArrayOflong value) {
        this.assetGroupListingGroupIds = value;
    }

}
