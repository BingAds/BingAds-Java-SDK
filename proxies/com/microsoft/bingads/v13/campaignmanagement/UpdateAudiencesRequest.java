
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Audiences" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudience" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "audiences"
})
@XmlRootElement(name = "UpdateAudiencesRequest")
public class UpdateAudiencesRequest {

    @XmlElement(name = "Audiences", nillable = true)
    protected ArrayOfAudience audiences;

    /**
     * Gets the value of the audiences property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudience }
     *     
     */
    public ArrayOfAudience getAudiences() {
        return audiences;
    }

    /**
     * Sets the value of the audiences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudience }
     *     
     */
    public void setAudiences(ArrayOfAudience value) {
        this.audiences = value;
    }

}
