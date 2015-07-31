
package com.microsoft.bingads.campaignmanagement;

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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Campaigns" type="{https://bingads.microsoft.com/CampaignManagement/v9}ArrayOfCampaign" minOccurs="0"/>
 *         &lt;element name="UpdateNativeBidAdjustment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "campaigns",
    "updateNativeBidAdjustment"
})
@XmlRootElement(name = "UpdateCampaignsRequest")
public class UpdateCampaignsRequest {

    @XmlElement(name = "AccountId")
    protected Long accountId;
    @XmlElement(name = "Campaigns", nillable = true)
    protected ArrayOfCampaign campaigns;
    @XmlElement(name = "UpdateNativeBidAdjustment")
    protected Boolean updateNativeBidAdjustment;

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
     * Gets the value of the campaigns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaign }
     *     
     */
    public ArrayOfCampaign getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the value of the campaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaign }
     *     
     */
    public void setCampaigns(ArrayOfCampaign value) {
        this.campaigns = value;
    }

    /**
     * Gets the value of the updateNativeBidAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUpdateNativeBidAdjustment() {
        return updateNativeBidAdjustment;
    }

    /**
     * Sets the value of the updateNativeBidAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdateNativeBidAdjustment(Boolean value) {
        this.updateNativeBidAdjustment = value;
    }

}
