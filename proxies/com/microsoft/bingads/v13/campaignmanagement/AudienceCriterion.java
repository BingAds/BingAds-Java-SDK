
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AudienceCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AudienceCriterion">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       <sequence>
 *         <element name="AudienceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AudienceType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceCriterion", propOrder = {
    "audienceId",
    "audienceType"
})
public class AudienceCriterion
    extends Criterion
{
    public AudienceCriterion() {
      this.type = "AudienceCriterion";
    }

    @XmlElement(name = "AudienceId", nillable = true)
    protected Long audienceId;
    @XmlElement(name = "AudienceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected Collection<AudienceType> audienceType;

    /**
     * Gets the value of the audienceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAudienceId() {
        return audienceId;
    }

    /**
     * Sets the value of the audienceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAudienceId(Long value) {
        this.audienceId = value;
    }

    /**
     * Gets the value of the audienceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AudienceType> getAudienceType() {
        return audienceType;
    }

    /**
     * Sets the value of the audienceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceType(Collection<AudienceType> value) {
        this.audienceType = value;
    }

}
