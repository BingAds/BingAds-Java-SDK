
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GenderDimension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimension">
 *       <sequence>
 *         <element name="GenderTypes" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfGenderType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenderDimension", propOrder = {
    "genderTypes"
})
public class GenderDimension
    extends AudienceGroupDimension
{

    @XmlElement(name = "GenderTypes", nillable = true)
    protected ArrayOfGenderType genderTypes;

    /**
     * Gets the value of the genderTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGenderType }
     *     
     */
    public ArrayOfGenderType getGenderTypes() {
        return genderTypes;
    }

    /**
     * Sets the value of the genderTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGenderType }
     *     
     */
    public void setGenderTypes(ArrayOfGenderType value) {
        this.genderTypes = value;
    }

}
