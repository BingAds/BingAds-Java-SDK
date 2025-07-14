
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
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="AdExtensionIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="AdExtensionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionsTypeFilter" minOccurs="0"/>
 *         <element name="ReturnAdditionalFields" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionAdditionalField" minOccurs="0"/>
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
    "accountId",
    "adExtensionIds",
    "adExtensionType",
    "returnAdditionalFields"
})
@XmlRootElement(name = "GetAdExtensionsByIdsRequest")
public class GetAdExtensionsByIdsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AdExtensionIds", nillable = true)
    protected ArrayOflong adExtensionIds;
    @XmlElement(name = "AdExtensionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Collection<AdExtensionsTypeFilter> adExtensionType;
    @XmlElement(name = "ReturnAdditionalFields", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
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
     * Gets the value of the adExtensionIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAdExtensionIds() {
        return adExtensionIds;
    }

    /**
     * Sets the value of the adExtensionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAdExtensionIds(ArrayOflong value) {
        this.adExtensionIds = value;
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
