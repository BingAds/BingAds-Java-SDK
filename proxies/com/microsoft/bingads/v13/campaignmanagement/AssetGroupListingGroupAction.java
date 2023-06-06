
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupListingGroupAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroupListingGroupAction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Action" type="{https://bingads.microsoft.com/CampaignManagement/v13}ItemAction"/>
 *         <element name="ListingGroup" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssetGroupListingGroup" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroupListingGroupAction", propOrder = {
    "action",
    "listingGroup"
})
public class AssetGroupListingGroupAction {

    @XmlElement(name = "Action", required = true)
    @XmlSchemaType(name = "string")
    protected ItemAction action;
    @XmlElement(name = "ListingGroup", nillable = true)
    protected AssetGroupListingGroup listingGroup;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAction }
     *     
     */
    public ItemAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAction }
     *     
     */
    public void setAction(ItemAction value) {
        this.action = value;
    }

    /**
     * Gets the value of the listingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AssetGroupListingGroup }
     *     
     */
    public AssetGroupListingGroup getListingGroup() {
        return listingGroup;
    }

    /**
     * Sets the value of the listingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetGroupListingGroup }
     *     
     */
    public void setListingGroup(AssetGroupListingGroup value) {
        this.listingGroup = value;
    }

}
