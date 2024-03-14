
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelGroup">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="Listing" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelListing" minOccurs="0"/>
 *         <element name="ListingType" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelListingType"/>
 *         <element name="ParentCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelGroup", propOrder = {
    "listing",
    "listingType",
    "parentCriterionId"
})
public class HotelGroup
    extends Criterion
{
    public HotelGroup() {
      this.type = "HotelGroup";
    }

    @XmlElement(name = "Listing", nillable = true)
    protected HotelListing listing;
    @XmlElement(name = "ListingType", required = true)
    @XmlSchemaType(name = "string")
    protected HotelListingType listingType;
    @XmlElement(name = "ParentCriterionId", nillable = true)
    protected Long parentCriterionId;

    /**
     * Gets the value of the listing property.
     * 
     * @return
     *     possible object is
     *     {@link HotelListing }
     *     
     */
    public HotelListing getListing() {
        return listing;
    }

    /**
     * Sets the value of the listing property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelListing }
     *     
     */
    public void setListing(HotelListing value) {
        this.listing = value;
    }

    /**
     * Gets the value of the listingType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelListingType }
     *     
     */
    public HotelListingType getListingType() {
        return listingType;
    }

    /**
     * Sets the value of the listingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelListingType }
     *     
     */
    public void setListingType(HotelListingType value) {
        this.listingType = value;
    }

    /**
     * Gets the value of the parentCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentCriterionId() {
        return parentCriterionId;
    }

    /**
     * Sets the value of the parentCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentCriterionId(Long value) {
        this.parentCriterionId = value;
    }

}
