
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelLengthOfStayCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HotelLengthOfStayCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="MaxNights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MinNights" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelLengthOfStayCriterion", propOrder = {
    "maxNights",
    "minNights"
})
public class HotelLengthOfStayCriterion
    extends Criterion
{
    public HotelLengthOfStayCriterion() {
      this.type = "HotelLengthOfStayCriterion";
    }

    @XmlElement(name = "MaxNights", nillable = true)
    protected Integer maxNights;
    @XmlElement(name = "MinNights", nillable = true)
    protected Integer minNights;

    /**
     * Gets the value of the maxNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNights() {
        return maxNights;
    }

    /**
     * Sets the value of the maxNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNights(Integer value) {
        this.maxNights = value;
    }

    /**
     * Gets the value of the minNights property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinNights() {
        return minNights;
    }

    /**
     * Sets the value of the minNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinNights(Integer value) {
        this.minNights = value;
    }

}
