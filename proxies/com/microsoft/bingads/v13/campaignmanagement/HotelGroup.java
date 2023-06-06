
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       &lt;sequence>
 *         &lt;element name="Listing" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelListing" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelListingType"/>
 *         &lt;element name="ParentCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
