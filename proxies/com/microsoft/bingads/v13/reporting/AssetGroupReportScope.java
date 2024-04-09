
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupReportScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroupReportScope">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroupReportScope", propOrder = {
    "accountId",
    "campaignId",
    "assetGroupId"
})
public class AssetGroupReportScope {

    @XmlElement(name = "AccountId")
    protected long accountId;
    @XmlElement(name = "CampaignId")
    protected long campaignId;
    @XmlElement(name = "AssetGroupId")
    protected long assetGroupId;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the campaignId property.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the assetGroupId property.
     * 
     */
    public long getAssetGroupId() {
        return assetGroupId;
    }

    /**
     * Sets the value of the assetGroupId property.
     * 
     */
    public void setAssetGroupId(long value) {
        this.assetGroupId = value;
    }

}
