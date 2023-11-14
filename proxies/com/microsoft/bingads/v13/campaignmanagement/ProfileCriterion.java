
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProfileCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProfileCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="ProfileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="ProfileType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ProfileType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCriterion", propOrder = {
    "profileId",
    "profileType"
})
public class ProfileCriterion
    extends Criterion
{
    public ProfileCriterion() {
      this.type = "ProfileCriterion";
    }

    @XmlElement(name = "ProfileId")
    protected Long profileId;
    @XmlElement(name = "ProfileType", type = String.class)
    @XmlJavaTypeAdapter(Adapter13 .class)
    protected Collection<ProfileType> profileType;

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProfileId(Long value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the profileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<ProfileType> getProfileType() {
        return profileType;
    }

    /**
     * Sets the value of the profileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(Collection<ProfileType> value) {
        this.profileType = value;
    }

}
