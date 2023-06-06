
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroups" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAdGroup" minOccurs="0"/>
 *         &lt;element name="ReturnInheritedBidStrategyTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "adGroups",
    "returnInheritedBidStrategyTypes"
})
@XmlRootElement(name = "AddAdGroupsRequest")
public class AddAdGroupsRequest {

    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "AdGroups", nillable = true)
    protected ArrayOfAdGroup adGroups;
    @XmlElement(name = "ReturnInheritedBidStrategyTypes", nillable = true)
    protected Boolean returnInheritedBidStrategyTypes;

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
     * Gets the value of the adGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroup }
     *     
     */
    public ArrayOfAdGroup getAdGroups() {
        return adGroups;
    }

    /**
     * Sets the value of the adGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroup }
     *     
     */
    public void setAdGroups(ArrayOfAdGroup value) {
        this.adGroups = value;
    }

    /**
     * Gets the value of the returnInheritedBidStrategyTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnInheritedBidStrategyTypes() {
        return returnInheritedBidStrategyTypes;
    }

    /**
     * Sets the value of the returnInheritedBidStrategyTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnInheritedBidStrategyTypes(Boolean value) {
        this.returnInheritedBidStrategyTypes = value;
    }

}
