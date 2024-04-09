
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountThroughAssetGroupReportScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountThroughAssetGroupReportScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         <element name="AssetGroups" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfAssetGroupReportScope" minOccurs="0"/>
 *         <element name="Campaigns" type="{https://bingads.microsoft.com/Reporting/v13}ArrayOfCampaignReportScope" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountThroughAssetGroupReportScope", propOrder = {
    "accountIds",
    "assetGroups",
    "campaigns"
})
public class AccountThroughAssetGroupReportScope {

    @XmlElement(name = "AccountIds", nillable = true)
    protected ArrayOflong accountIds;
    @XmlElement(name = "AssetGroups", nillable = true)
    protected ArrayOfAssetGroupReportScope assetGroups;
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
     * Gets the value of the assetGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupReportScope }
     *     
     */
    public ArrayOfAssetGroupReportScope getAssetGroups() {
        return assetGroups;
    }

    /**
     * Sets the value of the assetGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupReportScope }
     *     
     */
    public void setAssetGroups(ArrayOfAssetGroupReportScope value) {
        this.assetGroups = value;
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
