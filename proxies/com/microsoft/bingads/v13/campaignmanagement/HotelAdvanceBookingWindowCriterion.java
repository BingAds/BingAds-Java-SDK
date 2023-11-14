
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelAdvanceBookingWindowCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelAdvanceBookingWindowCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="MaxDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MinDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelAdvanceBookingWindowCriterion", propOrder = {
    "maxDays",
    "minDays"
})
public class HotelAdvanceBookingWindowCriterion
    extends Criterion
{
    public HotelAdvanceBookingWindowCriterion() {
      this.type = "HotelAdvanceBookingWindowCriterion";
    }

    @XmlElement(name = "MaxDays", nillable = true)
    protected Integer maxDays;
    @XmlElement(name = "MinDays", nillable = true)
    protected Integer minDays;

    /**
     * Gets the value of the maxDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDays() {
        return maxDays;
    }

    /**
     * Sets the value of the maxDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDays(Integer value) {
        this.maxDays = value;
    }

    /**
     * Gets the value of the minDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinDays() {
        return minDays;
    }

    /**
     * Sets the value of the minDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinDays(Integer value) {
        this.minDays = value;
    }

}
