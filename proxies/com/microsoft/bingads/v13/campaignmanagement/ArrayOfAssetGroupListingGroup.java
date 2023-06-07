
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssetGroupListingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupListingGroup">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupListingGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupListingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupListingGroup", propOrder = {
    "assetGroupListingGroups"
})
public class ArrayOfAssetGroupListingGroup {

    @XmlElement(name = "AssetGroupListingGroup", nillable = true)
    protected List<AssetGroupListingGroup> assetGroupListingGroups;

    /**
     * Gets the value of the assetGroupListingGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupListingGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupListingGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupListingGroup }
     * 
     * 
     * @return
     *     The value of the assetGroupListingGroups property.
     */
    public List<AssetGroupListingGroup> getAssetGroupListingGroups() {
        if (assetGroupListingGroups == null) {
            assetGroupListingGroups = new ArrayList<>();
        }
        return this.assetGroupListingGroups;
    }

}
