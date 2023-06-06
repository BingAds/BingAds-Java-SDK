
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AudienceDimension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimension">
 *       <sequence>
 *         <element name="Audiences" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudienceInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceDimension", propOrder = {
    "audiences"
})
public class AudienceDimension
    extends AudienceGroupDimension
{

    @XmlElement(name = "Audiences", nillable = true)
    protected ArrayOfAudienceInfo audiences;

    /**
     * Gets the value of the audiences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudienceInfo }
     *     
     */
    public ArrayOfAudienceInfo getAudiences() {
        return audiences;
    }

    /**
     * Sets the value of the audiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudienceInfo }
     *     
     */
    public void setAudiences(ArrayOfAudienceInfo value) {
        this.audiences = value;
    }

}
