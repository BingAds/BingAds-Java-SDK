
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         <element name="AssetGroupIdToCampaignIdAssociations" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfEntityIdToParentIdAssociation" minOccurs="0"/>
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
    "assetGroupIdToCampaignIdAssociations"
})
@XmlRootElement(name = "GetAssetGroupsEditorialReasonsRequest")
public class GetAssetGroupsEditorialReasonsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "AssetGroupIdToCampaignIdAssociations", nillable = true)
    protected ArrayOfEntityIdToParentIdAssociation assetGroupIdToCampaignIdAssociations;

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
     * Gets the value of the assetGroupIdToCampaignIdAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEntityIdToParentIdAssociation }
     *     
     */
    public ArrayOfEntityIdToParentIdAssociation getAssetGroupIdToCampaignIdAssociations() {
        return assetGroupIdToCampaignIdAssociations;
    }

    /**
     * Sets the value of the assetGroupIdToCampaignIdAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEntityIdToParentIdAssociation }
     *     
     */
    public void setAssetGroupIdToCampaignIdAssociations(ArrayOfEntityIdToParentIdAssociation value) {
        this.assetGroupIdToCampaignIdAssociations = value;
    }

}
