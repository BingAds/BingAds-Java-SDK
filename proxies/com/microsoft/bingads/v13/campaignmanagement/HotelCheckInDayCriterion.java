
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelCheckInDayCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelCheckInDayCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="CheckInDay" type="{https://bingads.microsoft.com/CampaignManagement/v13}Day" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelCheckInDayCriterion", propOrder = {
    "checkInDay"
})
public class HotelCheckInDayCriterion
    extends Criterion
{

    @XmlElement(name = "CheckInDay", nillable = true)
    @XmlSchemaType(name = "string")
    protected Day checkInDay;

    /**
     * Gets the value of the checkInDay property.
     * 
     * @return
     *     possible object is
     *     {@link Day }
     *     
     */
    public Day getCheckInDay() {
        return checkInDay;
    }

    /**
     * Sets the value of the checkInDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Day }
     *     
     */
    public void setCheckInDay(Day value) {
        this.checkInDay = value;
    }

}
