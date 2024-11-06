
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Criterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Criterion">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criterion", propOrder = {
    "type"
})
@XmlSeeAlso({
    ProductPartition.class,
    HotelGroup.class,
    HotelAdvanceBookingWindowCriterion.class,
    HotelCheckInDateCriterion.class,
    HotelCheckInDayCriterion.class,
    HotelDateSelectionTypeCriterion.class,
    HotelLengthOfStayCriterion.class,
    ProductScope.class,
    Webpage.class,
    AgeCriterion.class,
    DeviceCriterion.class,
    DayTimeCriterion.class,
    GenderCriterion.class,
    RadiusCriterion.class,
    LocationCriterion.class,
    LocationIntentCriterion.class,
    AudienceCriterion.class,
    ProfileCriterion.class,
    StoreCriterion.class,
    DealCriterion.class,
    GenreCriterion.class,
    PlacementCriterion.class
})
public class Criterion {

    @XmlElement(name = "Type", nillable = true)
    protected String type;

    public Criterion() {
        this.type = "Criterion";
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {

    }

}
