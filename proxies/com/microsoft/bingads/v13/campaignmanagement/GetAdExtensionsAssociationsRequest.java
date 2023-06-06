
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdExtensionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionsTypeFilter" minOccurs="0"/>
 *         &lt;element name="AssociationType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssociationType" minOccurs="0"/>
 *         &lt;element name="EntityIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionAdditionalField" minOccurs="0"/>
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
    "accountId",
    "adExtensionType",
    "associationType",
    "entityIds",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetAdExtensionsAssociationsRequest")
public class GetAdExtensionsAssociationsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AdExtensionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter9 .class)
    protected Collection<AdExtensionsTypeFilter> adExtensionType;
    @XmlElement(name = "AssociationType")
    @XmlSchemaType(name = "string")
    protected AssociationType associationType;
    @XmlElement(name = "EntityIds", nillable = true)
    protected ArrayOflong entityIds;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Collection<AdExtensionAdditionalField> returnAdditionalFields;

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the adExtensionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdExtensionsTypeFilter> getAdExtensionType() {
        return adExtensionType;
    }

    /**
     * Sets the value of the adExtensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdExtensionType(Collection<AdExtensionsTypeFilter> value) {
        this.adExtensionType = value;
    }

    /**
     * Gets the value of the associationType property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationType }
     *     
     */
    public AssociationType getAssociationType() {
        return associationType;
    }

    /**
     * Sets the value of the associationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationType }
     *     
     */
    public void setAssociationType(AssociationType value) {
        this.associationType = value;
    }

    /**
     * Gets the value of the entityIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getEntityIds() {
        return entityIds;
    }

    /**
     * Sets the value of the entityIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setEntityIds(ArrayOflong value) {
        this.entityIds = value;
    }

    /**
     * Gets the value of the returnAdditionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdExtensionAdditionalField> getReturnAdditionalFields() {
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
    public void setReturnAdditionalFields(Collection<AdExtensionAdditionalField> value) {
        this.returnAdditionalFields = value;
    }

}
