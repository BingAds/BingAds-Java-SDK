
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TacticChannelReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TacticChannelReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v9}AccountStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v9}AdGroupStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v9}CampaignStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="ChannelIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="KeywordStatus" type="{https://bingads.microsoft.com/Reporting/v9}KeywordStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="TacticIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAdGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="ThirdPartyCampaignIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TacticChannelReportFilter", propOrder = {
    "accountStatus",
    "adGroupStatus",
    "campaignStatus",
    "channelIds",
    "keywordStatus",
    "tacticIds",
    "thirdPartyAdGroupIds",
    "thirdPartyCampaignIds"
})
public class TacticChannelReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter16 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "ChannelIds", nillable = true)
    protected ArrayOflong channelIds;
    @XmlElement(name = "KeywordStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter18 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<KeywordStatusReportFilter> keywordStatus;
    @XmlElement(name = "TacticIds", nillable = true)
    protected ArrayOflong tacticIds;
    @XmlElement(name = "ThirdPartyAdGroupIds", nillable = true)
    protected ArrayOflong thirdPartyAdGroupIds;
    @XmlElement(name = "ThirdPartyCampaignIds", nillable = true)
    protected ArrayOflong thirdPartyCampaignIds;

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AccountStatusReportFilter> getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(Collection<AccountStatusReportFilter> value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the adGroupStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdGroupStatusReportFilter> getAdGroupStatus() {
        return adGroupStatus;
    }

    /**
     * Sets the value of the adGroupStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupStatus(Collection<AdGroupStatusReportFilter> value) {
        this.adGroupStatus = value;
    }

    /**
     * Gets the value of the campaignStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<CampaignStatusReportFilter> getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * Sets the value of the campaignStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignStatus(Collection<CampaignStatusReportFilter> value) {
        this.campaignStatus = value;
    }

    /**
     * Gets the value of the channelIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getChannelIds() {
        return channelIds;
    }

    /**
     * Sets the value of the channelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setChannelIds(ArrayOflong value) {
        this.channelIds = value;
    }

    /**
     * Gets the value of the keywordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<KeywordStatusReportFilter> getKeywordStatus() {
        return keywordStatus;
    }

    /**
     * Sets the value of the keywordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordStatus(Collection<KeywordStatusReportFilter> value) {
        this.keywordStatus = value;
    }

    /**
     * Gets the value of the tacticIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getTacticIds() {
        return tacticIds;
    }

    /**
     * Sets the value of the tacticIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setTacticIds(ArrayOflong value) {
        this.tacticIds = value;
    }

    /**
     * Gets the value of the thirdPartyAdGroupIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getThirdPartyAdGroupIds() {
        return thirdPartyAdGroupIds;
    }

    /**
     * Sets the value of the thirdPartyAdGroupIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setThirdPartyAdGroupIds(ArrayOflong value) {
        this.thirdPartyAdGroupIds = value;
    }

    /**
     * Gets the value of the thirdPartyCampaignIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOflong }
     *     
     */
    public ArrayOflong getThirdPartyCampaignIds() {
        return thirdPartyCampaignIds;
    }

    /**
     * Sets the value of the thirdPartyCampaignIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOflong }
     *     
     */
    public void setThirdPartyCampaignIds(ArrayOflong value) {
        this.thirdPartyCampaignIds = value;
    }

}
