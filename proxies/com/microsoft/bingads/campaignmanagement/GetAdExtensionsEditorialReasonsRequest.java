
package com.microsoft.bingads.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="AdExtensionIdToEntityIdAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfAdExtensionIdToEntityIdAssociation" minOccurs="0"/>
 *         &lt;element name="AssociationType" type="{https://bingads.microsoft.com/CampaignManagement/v9}AssociationType" minOccurs="0"/>
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
    "adExtensionIdToEntityIdAssociations",
    "associationType"
})
@XmlRootElement(name = "GetAdExtensionsEditorialReasonsRequest")
public class GetAdExtensionsEditorialReasonsRequest {

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
