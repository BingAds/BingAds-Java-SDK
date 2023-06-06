
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
 *         <element name="AudienceGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAudienceGroup" minOccurs="0"/>
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
    "audienceGroups"
})
@XmlRootElement(name = "UpdateAudienceGroupsRequest")
public class UpdateAudienceGroupsRequest {

    @XmlElement(name = "AudienceGroups", nillable = true)
    protected ArrayOfAudienceGroup audienceGroups;

    /**
     * Gets the value of the audienceGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAudienceGroup }
     *     
     */
    public ArrayOfAudienceGroup getAudienceGroups() {
        return audienceGroups;
    }

    /**
     * Sets the value of the audienceGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAudienceGroup }
     *     
     */
    public void setAudienceGroups(ArrayOfAudienceGroup value) {
        this.audienceGroups = value;
    }

}
