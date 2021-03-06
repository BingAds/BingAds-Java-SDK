
package com.microsoft.bingads.v13.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DSAAutoTargetPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DSAAutoTargetPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v13}AccountStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v13}AdGroupStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="BidStrategyType" type="{https://bingads.microsoft.com/Reporting/v13}BidStrategyTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v13}CampaignStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="DynamicAdTargetStatus" type="{https://bingads.microsoft.com/Reporting/v13}DynamicAdTargetStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="Language" type="{https://bingads.microsoft.com/Reporting/v13}LanguageReportFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DSAAutoTargetPerformanceReportFilter", propOrder = {
    "accountStatus",
    "adGroupStatus",
    "bidStrategyType",
    "campaignStatus",
    "dynamicAdTargetStatus",
    "language"
})
public class DSAAutoTargetPerformanceReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "BidStrategyType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<BidStrategyTypeReportFilter> bidStrategyType;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "DynamicAdTargetStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    protected Collection<DynamicAdTargetStatusReportFilter> dynamicAdTargetStatus;
    @XmlElement(name = "Language", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected Collection<LanguageReportFilter> language;

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
     * Gets the value of the bidStrategyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<BidStrategyTypeReportFilter> getBidStrategyType() {
        return bidStrategyType;
    }

    /**
     * Sets the value of the bidStrategyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBidStrategyType(Collection<BidStrategyTypeReportFilter> value) {
        this.bidStrategyType = value;
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
     * Gets the value of the dynamicAdTargetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DynamicAdTargetStatusReportFilter> getDynamicAdTargetStatus() {
        return dynamicAdTargetStatus;
    }

    /**
     * Sets the value of the dynamicAdTargetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicAdTargetStatus(Collection<DynamicAdTargetStatusReportFilter> value) {
        this.dynamicAdTargetStatus = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<LanguageReportFilter> getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(Collection<LanguageReportFilter> value) {
        this.language = value;
    }

}
