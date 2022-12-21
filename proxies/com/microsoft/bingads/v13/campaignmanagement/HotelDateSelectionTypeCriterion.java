
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelDateSelectionTypeCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelDateSelectionTypeCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       &lt;sequence>
 *         &lt;element name="HotelDateSelectionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}HotelDateSelectionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelDateSelectionTypeCriterion", propOrder = {
    "hotelDateSelectionType"
})
public class HotelDateSelectionTypeCriterion
    extends Criterion
{

    @XmlElement(name = "HotelDateSelectionType", nillable = true)
    @XmlSchemaType(name = "string")
    protected HotelDateSelectionType hotelDateSelectionType;

    /**
     * Gets the value of the hotelDateSelectionType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDateSelectionType }
     *     
     */
    public HotelDateSelectionType getHotelDateSelectionType() {
        return hotelDateSelectionType;
    }

    /**
     * Sets the value of the hotelDateSelectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDateSelectionType }
     *     
     */
    public void setHotelDateSelectionType(HotelDateSelectionType value) {
        this.hotelDateSelectionType = value;
    }

}
