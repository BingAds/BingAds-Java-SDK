
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetGroupEditorialReasonCollection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetGroupEditorialReasonCollection">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AppealStatus" type="{https://bingads.microsoft.com/CampaignManagement/v13}AppealStatus" minOccurs="0"/>
 *         <element name="AssetGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="Reasons" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfAssetGroupEditorialReason" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetGroupEditorialReasonCollection", propOrder = {
    "appealStatus",
    "assetGroupId",
    "campaignId",
    "reasons"
})
public class AssetGroupEditorialReasonCollection {

    @XmlElement(name = "AppealStatus")
    @XmlSchemaType(name = "string")
    protected AppealStatus appealStatus;
    @XmlElement(name = "AssetGroupId")
    protected Long assetGroupId;
    @XmlElement(name = "CampaignId")
    protected Long campaignId;
    @XmlElement(name = "Reasons", nillable = true)
    protected ArrayOfAssetGroupEditorialReason reasons;

    /**
     * Gets the value of the appealStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AppealStatus }
     *     
     */
    public AppealStatus getAppealStatus() {
        return appealStatus;
    }

    /**
     * Sets the value of the appealStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealStatus }
     *     
     */
    public void setAppealStatus(AppealStatus value) {
        this.appealStatus = value;
    }

    /**
     * Gets the value of the assetGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetGroupId() {
        return assetGroupId;
    }

    /**
     * Sets the value of the assetGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetGroupId(Long value) {
        this.assetGroupId = value;
    }

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
     * Gets the value of the reasons property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAssetGroupEditorialReason }
     *     
     */
    public ArrayOfAssetGroupEditorialReason getReasons() {
        return reasons;
    }

    /**
     * Sets the value of the reasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAssetGroupEditorialReason }
     *     
     */
    public void setReasons(ArrayOfAssetGroupEditorialReason value) {
        this.reasons = value;
    }

}
