
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelCheckInDayCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelCheckInDayCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       &lt;sequence>
 *         &lt;element name="CheckInDay" type="{https://bingads.microsoft.com/CampaignManagement/v13}Day" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
