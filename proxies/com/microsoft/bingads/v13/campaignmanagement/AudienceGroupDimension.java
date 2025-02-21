
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceGroupDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AudienceGroupDimension">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimensionType" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceGroupDimension", propOrder = {
    "type"
})
@XmlSeeAlso({
    AgeDimension.class,
    GenderDimension.class,
    AudienceDimension.class,
    ProfileDimension.class
})
public class AudienceGroupDimension {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected AudienceGroupDimensionType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link AudienceGroupDimensionType }
     *     
     */
    public AudienceGroupDimensionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudienceGroupDimensionType }
     *     
     */
    public void setType(AudienceGroupDimensionType value) {

    }

}
