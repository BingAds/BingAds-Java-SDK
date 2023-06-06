
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AudienceCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Criterion">
 *       &lt;sequence>
 *         &lt;element name="AudienceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AudienceType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

    @XmlElement(name = "AudienceId", nillable = true)
    protected Long audienceId;
    @XmlElement(name = "AudienceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter12 .class)
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
