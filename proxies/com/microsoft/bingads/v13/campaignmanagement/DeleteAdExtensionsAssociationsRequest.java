
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="AdExtensionIdToEntityIdAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdExtensionIdToEntityIdAssociation" minOccurs="0"/>
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
    "adExtensionIdToEntityIdAssociations",
    "associationType"
})
@XmlRootElement(name = "DeleteAdExtensionsAssociationsRequest")
public class DeleteAdExtensionsAssociationsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AdExtensionIdToEntityIdAssociations", nillable = true)
    protected ArrayOfAdExtensionIdToEntityIdAssociation adExtensionIdToEntityIdAssociations;
    @XmlElement(name = "AssociationType")
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
     * Gets the value of the adExtensionIdToEntityIdAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdExtensionIdToEntityIdAssociation }
     *     
     */
    public ArrayOfAdExtensionIdToEntityIdAssociation getAdExtensionIdToEntityIdAssociations() {
        return adExtensionIdToEntityIdAssociations;
    }

    /**
     * Sets the value of the adExtensionIdToEntityIdAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdExtensionIdToEntityIdAssociation }
     *     
     */
    public void setAdExtensionIdToEntityIdAssociations(ArrayOfAdExtensionIdToEntityIdAssociation value) {
        this.adExtensionIdToEntityIdAssociations = value;
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
