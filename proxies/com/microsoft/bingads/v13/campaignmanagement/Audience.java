
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Audience complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Audience">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AudienceNetworkSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerShare" type="{https://bingads.microsoft.com/CampaignManagement/v13}CustomerShare" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForwardCompatibilityMap" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MembershipDuration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Scope" type="{https://bingads.microsoft.com/CampaignManagement/v13}EntityScope" minOccurs="0"/>
 *         &lt;element name="SearchSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SupportedCampaignTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Type" type="{https://bingads.microsoft.com/CampaignManagement/v13}AudienceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Audience", propOrder = {
    "audienceNetworkSize",
    "customerShare",
    "description",
    "forwardCompatibilityMap",
    "id",
    "membershipDuration",
    "name",
    "parentId",
    "scope",
    "searchSize",
    "supportedCampaignTypes",
    "type"
})
@XmlSeeAlso({
    ProductAudience.class,
    CombinedList.class,
    SimilarRemarketingList.class,
    RemarketingList.class,
    CustomAudience.class,
    InMarketAudience.class
})
public class Audience {

    @XmlElement(name = "AudienceNetworkSize", nillable = true)
    protected Long audienceNetworkSize;
    @XmlElement(name = "CustomerShare", nillable = true)
    protected CustomerShare customerShare;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "ForwardCompatibilityMap", nillable = true)
    protected ArrayOfKeyValuePairOfstringstring forwardCompatibilityMap;
    @XmlElement(name = "Id", nillable = true)
    protected Long id;
    @XmlElement(name = "MembershipDuration", nillable = true)
    protected Integer membershipDuration;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "ParentId", nillable = true)
    protected Long parentId;
    @XmlElement(name = "Scope", nillable = true)
    @XmlSchemaType(name = "string")
    protected EntityScope scope;
    @XmlElement(name = "SearchSize", nillable = true)
    protected Long searchSize;
    @XmlElement(name = "SupportedCampaignTypes", nillable = true)
    protected ArrayOfstring supportedCampaignTypes;
    @XmlElement(name = "Type", type = String.class)
    @XmlJavaTypeAdapter(Adapter12 .class)
    protected Collection<AudienceType> type;

    /**
     * Gets the value of the audienceNetworkSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAudienceNetworkSize() {
        return audienceNetworkSize;
    }

    /**
     * Sets the value of the audienceNetworkSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAudienceNetworkSize(Long value) {
        this.audienceNetworkSize = value;
    }

    /**
     * Gets the value of the customerShare property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerShare }
     *     
     */
    public CustomerShare getCustomerShare() {
        return customerShare;
    }

    /**
     * Sets the value of the customerShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerShare }
     *     
     */
    public void setCustomerShare(CustomerShare value) {
        this.customerShare = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public ArrayOfKeyValuePairOfstringstring getForwardCompatibilityMap() {
        return forwardCompatibilityMap;
    }

    /**
     * Sets the value of the forwardCompatibilityMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeyValuePairOfstringstring }
     *     
     */
    public void setForwardCompatibilityMap(ArrayOfKeyValuePairOfstringstring value) {
        this.forwardCompatibilityMap = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the membershipDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipDuration() {
        return membershipDuration;
    }

    /**
     * Sets the value of the membershipDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipDuration(Integer value) {
        this.membershipDuration = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link EntityScope }
     *     
     */
    public EntityScope getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityScope }
     *     
     */
    public void setScope(EntityScope value) {
        this.scope = value;
    }

    /**
     * Gets the value of the searchSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchSize() {
        return searchSize;
    }

    /**
     * Sets the value of the searchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchSize(Long value) {
        this.searchSize = value;
    }

    /**
     * Gets the value of the supportedCampaignTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSupportedCampaignTypes() {
        return supportedCampaignTypes;
    }

    /**
     * Sets the value of the supportedCampaignTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSupportedCampaignTypes(ArrayOfstring value) {
        this.supportedCampaignTypes = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AudienceType> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(Collection<AudienceType> value) {
        this.type = value;
    }

}
