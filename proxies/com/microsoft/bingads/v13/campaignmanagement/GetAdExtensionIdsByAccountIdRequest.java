
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         <element name="AdExtensionType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AdExtensionsTypeFilter" minOccurs="0"/>
 *         <element name="AssociationType" type="{https://bingads.microsoft.com/CampaignManagement/v13}AssociationType" minOccurs="0"/>
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
    "adExtensionType",
    "associationType"
})
@XmlRootElement(name = "GetAdExtensionIdsByAccountIdRequest")
public class GetAdExtensionIdsByAccountIdRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AdExtensionType", type = String.class)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Collection<AdExtensionsTypeFilter> adExtensionType;
    @XmlElement(name = "AssociationType", nillable = true)
    @XmlSchemaType(name = "string")
    protected AssociationType associationType;

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

}
