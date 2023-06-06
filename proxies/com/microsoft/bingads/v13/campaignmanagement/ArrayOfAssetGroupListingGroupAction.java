
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAssetGroupListingGroupAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfAssetGroupListingGroupAction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssetGroupListingGroupAction" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupListingGroupAction" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAssetGroupListingGroupAction", propOrder = {
    "assetGroupListingGroupActions"
})
public class ArrayOfAssetGroupListingGroupAction {

    @XmlElement(name = "AssetGroupListingGroupAction", nillable = true)
    protected List<AssetGroupListingGroupAction> assetGroupListingGroupActions;

    /**
     * Gets the value of the assetGroupListingGroupActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assetGroupListingGroupActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetGroupListingGroupActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetGroupListingGroupAction }
     * 
     * 
     * @return
     *     The value of the assetGroupListingGroupActions property.
     */
    public List<AssetGroupListingGroupAction> getAssetGroupListingGroupActions() {
        if (assetGroupListingGroupActions == null) {
            assetGroupListingGroupActions = new ArrayList<>();
        }
        return this.assetGroupListingGroupActions;
    }

}
