
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CustomLinkedInCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomLinkedInCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="Profile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "CustomLinkedInCriterion", propOrder = {
    "profile",
    "profileId",
    "profileType"
})
public class CustomLinkedInCriterion
    extends Criterion
{
    public CustomLinkedInCriterion() {
      this.type = "CustomLinkedInCriterion";
    }

    @XmlElement(name = "Profile", nillable = true)
    protected String profile;
    @XmlElement(name = "ProfileId")
    protected Long profileId;
    @XmlElement(name = "ProfileType", type = String.class)
    @XmlJavaTypeAdapter(Adapter17 .class)
    protected Collection<ProfileType> profileType;

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
    }

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
