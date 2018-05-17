
package com.microsoft.bingads.v11.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v11}AdGroupAdditionalField" minOccurs="0"/>
 *         &lt;element name="ReturnCoOpAdGroups" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "campaignId",
    "returnAdditionalFields",
    "returnCoOpAdGroups"
})
@XmlRootElement(name = "GetAdGroupsByCampaignIdRequest")
public class GetAdGroupsByCampaignIdRequest {

    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AdGroupAdditionalField> returnAdditionalFields;
    @XmlElement(name = "ReturnCoOpAdGroups", nillable = true)
    protected Boolean returnCoOpAdGroups;

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
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdGroupAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<AdGroupAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

    /**
     * Gets the value of the returnCoOpAdGroups property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnCoOpAdGroups() {
        return returnCoOpAdGroups;
    }

    /**
     * Sets the value of the returnCoOpAdGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnCoOpAdGroups(Boolean value) {
        this.returnCoOpAdGroups = value;
    }

}
