
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfileDimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProfileDimension">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceGroupDimension">
 *       <sequence>
 *         <element name="Profiles" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfProfileInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileDimension", propOrder = {
    "profiles"
})
public class ProfileDimension
    extends AudienceGroupDimension
{
    public ProfileDimension() {
      this.type = AudienceGroupDimensionType.fromValue("Profile");
    }

    @XmlElement(name = "Profiles", nillable = true)
    protected ArrayOfProfileInfo profiles;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public ArrayOfProfileInfo getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProfileInfo }
     *     
     */
    public void setProfiles(ArrayOfProfileInfo value) {
        this.profiles = value;
    }

}
