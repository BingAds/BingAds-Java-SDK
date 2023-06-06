
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
 *         <element name="AssetGroupListingGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetGroupListingGroup" minOccurs="0"/>
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
    "assetGroupListingGroups"
})
@XmlRootElement(name = "GetAssetGroupListingGroupsByIdsResponse")
public class GetAssetGroupListingGroupsByIdsResponse {

    @XmlElement(name = "AssetGroupListingGroups", nillable = true)
    protected ArrayOfAssetGroupListingGroup assetGroupListingGroups;

    /**
     * Gets the value of the assetGroupListingGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupListingGroup }
     *     
     */
    public ArrayOfAssetGroupListingGroup getAssetGroupListingGroups() {
        return assetGroupListingGroups;
    }

    /**
     * Sets the value of the assetGroupListingGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupListingGroup }
     *     
     */
    public void setAssetGroupListingGroups(ArrayOfAssetGroupListingGroup value) {
        this.assetGroupListingGroups = value;
    }

}
