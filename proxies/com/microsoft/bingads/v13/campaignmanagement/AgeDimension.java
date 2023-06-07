
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgeDimension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimension">
 *       <sequence>
 *         <element name="AgeRanges" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAgeRange" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeDimension", propOrder = {
    "ageRanges"
})
public class AgeDimension
    extends AudienceGroupDimension
{

    @XmlElement(name = "AgeRanges", nillable = true)
    protected ArrayOfAgeRange ageRanges;

    /**
     * Gets the value of the ageRanges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAgeRange }
     *     
     */
    public ArrayOfAgeRange getAgeRanges() {
        return ageRanges;
    }

    /**
     * Sets the value of the ageRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAgeRange }
     *     
     */
    public void setAgeRanges(ArrayOfAgeRange value) {
        this.ageRanges = value;
    }

}
