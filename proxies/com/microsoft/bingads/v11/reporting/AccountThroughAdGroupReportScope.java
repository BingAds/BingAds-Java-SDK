
package com.microsoft.bingads.v11.reporting;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountThroughAdGroupReportScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountThroughAdGroupReportScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="AdGroups" type="{https://bingads.microsoft.com/Reporting/v11}ArrayOfAdGroupReportScope" minOccurs="0"/>
 *         &lt;element name="Campaigns" type="{https://bingads.microsoft.com/Reporting/v11}ArrayOfCampaignReportScope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountThroughAdGroupReportScope", propOrder = {
    "accountIds",
    "adGroups",
    "campaigns"
})
public class AccountThroughAdGroupReportScope {

    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "AdGroups", nillable = true)
    protected ArrayOfAdGroupReportScope adGroups;
    @XmlElement(name = "Campaigns", nillable = true)
    protected ArrayOfCampaignReportScope campaigns;

    /**
     * Gets the value of the accountIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getAccountIds() {
        return accountIds;
    }

    /**
     * Sets the value of the accountIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setAccountIds(ArrayOflong value) {
        this.accountIds = value;
    }

    /**
     * Gets the value of the adGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdGroupReportScope }
     *     
     */
    public ArrayOfAdGroupReportScope getAdGroups() {
        return adGroups;
    }

    /**
     * Sets the value of the adGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdGroupReportScope }
     *     
     */
    public void setAdGroups(ArrayOfAdGroupReportScope value) {
        this.adGroups = value;
    }

    /**
     * Gets the value of the campaigns property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignReportScope }
     *     
     */
    public ArrayOfCampaignReportScope getCampaigns() {
        return campaigns;
    }

    /**
     * Sets the value of the campaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignReportScope }
     *     
     */
    public void setCampaigns(ArrayOfCampaignReportScope value) {
        this.campaigns = value;
    }

}
