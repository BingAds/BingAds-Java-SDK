
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GenderCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="GenderType" type="{https://bingads.microsoft.com/CampaignManagement/v13}GenderType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenderCriterion", propOrder = {
    "genderType"
})
public class GenderCriterion
    extends Criterion
{
    public GenderCriterion() {
      this.type = "GenderCriterion";
    }

    @XmlElement(name = "GenderType", nillable = true)
    @XmlSchemaType(name = "string")
    protected GenderType genderType;

    /**
     * Gets the value of the genderType property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGenderType() {
        return genderType;
    }

    /**
     * Sets the value of the genderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGenderType(GenderType value) {
        this.genderType = value;
    }

}
