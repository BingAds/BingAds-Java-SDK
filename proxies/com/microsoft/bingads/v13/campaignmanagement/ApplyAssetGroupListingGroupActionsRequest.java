
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
 *         <element name="ListingGroupActions" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetGroupListingGroupAction" minOccurs="0"/>
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
    "listingGroupActions"
})
@XmlRootElement(name = "ApplyAssetGroupListingGroupActionsRequest")
public class ApplyAssetGroupListingGroupActionsRequest {

    @XmlElement(name = "ListingGroupActions", nillable = true)
    protected ArrayOfAssetGroupListingGroupAction listingGroupActions;

    /**
     * Gets the value of the listingGroupActions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupListingGroupAction }
     *     
     */
    public ArrayOfAssetGroupListingGroupAction getListingGroupActions() {
        return listingGroupActions;
    }

    /**
     * Sets the value of the listingGroupActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupListingGroupAction }
     *     
     */
    public void setListingGroupActions(ArrayOfAssetGroupListingGroupAction value) {
        this.listingGroupActions = value;
    }

}
