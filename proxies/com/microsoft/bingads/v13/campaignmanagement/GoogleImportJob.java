
package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GoogleImportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoogleImportJob">
 *   &lt;complexContent>
 *     &lt;extension base="{https://bingads.microsoft.com/CampaignManagement/v13}ImportJob">
 *       &lt;sequence>
 *         &lt;element name="CampaignAdGroupIds" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfCampaignAdGroupIds" minOccurs="0"/>
 *         &lt;element name="CredentialId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GoogleAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="GoogleUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoogleImportJob", propOrder = {
    "campaignAdGroupIds",
    "credentialId",
    "googleAccountId",
    "googleUserName"
})
public class GoogleImportJob
    extends ImportJob
{

    @XmlElement(name = "CampaignAdGroupIds", nillable = true)
    protected ArrayOfCampaignAdGroupIds campaignAdGroupIds;
    @XmlElement(name = "CredentialId", required = true, nillable = true)
    protected String credentialId;
    @XmlElement(name = "GoogleAccountId", required = true, type = Long.class, nillable = true)
    protected Long googleAccountId;
    @XmlElement(name = "GoogleUserName", nillable = true)
    protected String googleUserName;

    /**
     * Gets the value of the campaignAdGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignAdGroupIds }
     *     
     */
    public ArrayOfCampaignAdGroupIds getCampaignAdGroupIds() {
        return campaignAdGroupIds;
    }

    /**
     * Sets the value of the campaignAdGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignAdGroupIds }
     *     
     */
    public void setCampaignAdGroupIds(ArrayOfCampaignAdGroupIds value) {
        this.campaignAdGroupIds = value;
    }

    /**
     * Gets the value of the credentialId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredentialId() {
        return credentialId;
    }

    /**
     * Sets the value of the credentialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredentialId(String value) {
        this.credentialId = value;
    }

    /**
     * Gets the value of the googleAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGoogleAccountId() {
        return googleAccountId;
    }

    /**
     * Sets the value of the googleAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGoogleAccountId(Long value) {
        this.googleAccountId = value;
    }

    /**
     * Gets the value of the googleUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleUserName() {
        return googleUserName;
    }

    /**
     * Sets the value of the googleUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleUserName(String value) {
        this.googleUserName = value;
    }

}
