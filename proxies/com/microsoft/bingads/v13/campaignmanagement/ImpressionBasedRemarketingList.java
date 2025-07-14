
package com.microsoft.bingads.v13.campaignmanagement;
import java.util.Collections;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpressionBasedRemarketingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ImpressionBasedRemarketingList">
 *   <complexContent>
 *     <extension base="{https://bingads.microsoft.com/CampaignManagement/v13}Audience">
 *       <sequence>
 *         <element name="AdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="EntityType" type="{https://bingads.microsoft.com/CampaignManagement/v13}ImpressionBasedEntityType" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpressionBasedRemarketingList", propOrder = {
    "adGroupId",
    "adGroupIds",
    "campaignId",
    "campaignIds",
    "entityType"
})
public class ImpressionBasedRemarketingList
    extends Audience
{
    public ImpressionBasedRemarketingList() {
      this.type = Collections.singletonList(AudienceType.fromValue("ImpressionBasedRemarketingList"));
    }

    @XmlElement(name = "AdGroupId", nillable = true)
    protected Long adGroupId;
    @XmlElement(name = "AdGroupIds", nillable = true)
    protected ArrayOflong adGroupIds;
    @XmlElement(name = "CampaignId", nillable = true)
    protected Long campaignId;
    @XmlElement(name = "CampaignIds", nillable = true)
    protected ArrayOflong campaignIds;
    @XmlElement(name = "EntityType")
    @XmlSchemaType(name = "string")
    protected ImpressionBasedEntityType entityType;

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the adGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAdGroupIds() {
        return adGroupIds;
    }

    /**
     * Sets the value of the adGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAdGroupIds(ArrayOflong value) {
        this.adGroupIds = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the campaignIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getCampaignIds() {
        return campaignIds;
    }

    /**
     * Sets the value of the campaignIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setCampaignIds(ArrayOflong value) {
        this.campaignIds = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link ImpressionBasedEntityType }
     *     
     */
    public ImpressionBasedEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpressionBasedEntityType }
     *     
     */
    public void setEntityType(ImpressionBasedEntityType value) {
        this.entityType = value;
    }

}
