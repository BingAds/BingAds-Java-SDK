
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         <element name="CampaignCriterionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CriterionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}CampaignCriterionType" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}CriterionAdditionalField" minOccurs="0"/>
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
    "campaignCriterionIds",
    "campaignId",
    "criterionType",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetCampaignCriterionsByIdsRequest")
public class GetCampaignCriterionsByIdsRequest {

    @XmlElement(name = "CampaignCriterionIds", nillable = true)
    protected ArrayOflong campaignCriterionIds;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "CriterionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter20 .class)
    protected Collection<CampaignCriterionType> criterionType;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Collection<CriterionAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the campaignCriterionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getCampaignCriterionIds() {
        return campaignCriterionIds;
    }

    /**
     * Sets the value of the campaignCriterionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setCampaignCriterionIds(ArrayOflong value) {
        this.campaignCriterionIds = value;
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
     * Gets the value of the criterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignCriterionType> getCriterionType() {
        return criterionType;
    }

    /**
     * Sets the value of the criterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterionType(Collection<CampaignCriterionType> value) {
        this.criterionType = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CriterionAdditionalField> getReturnAdditionalFields() {
        return returnAdditionalFields;
    }

    /**
     * Sets the value of the returnAdditionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAdditionalFields(Collection<CriterionAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
