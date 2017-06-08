
package com.microsoft.bingads.v11.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DestinationUrlPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestinationUrlPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v11}AccountStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdDistribution" type="{https://bingads.microsoft.com/Reporting/v11}AdDistributionReportFilter" minOccurs="0"/>
 *         &lt;element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v11}AdGroupStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdStatus" type="{https://bingads.microsoft.com/Reporting/v11}AdStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v11}CampaignStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="DeviceType" type="{https://bingads.microsoft.com/Reporting/v11}DeviceTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationUrlPerformanceReportFilter", propOrder = {
    "accountStatus",
    "adDistribution",
    "adGroupStatus",
    "adStatus",
    "campaignStatus",
    "deviceType",
    "languageCode"
})
public class DestinationUrlPerformanceReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdDistribution", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    protected Collection<AdDistributionReportFilter> adDistribution;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "AdStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter8 .class)
    protected Collection<AdStatusReportFilter> adStatus;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "DeviceType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter11 .class)
    protected Collection<DeviceTypeReportFilter> deviceType;
    @XmlElement(name = "LanguageCode", nillable = true)
    protected ArrayOfstring languageCode;

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
     * Gets the value of the adDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdDistributionReportFilter> getAdDistribution() {
        return adDistribution;
    }

    /**
     * Sets the value of the adDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdDistribution(Collection<AdDistributionReportFilter> value) {
        this.adDistribution = value;
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
     * Gets the value of the adStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdStatusReportFilter> getAdStatus() {
        return adStatus;
    }

    /**
     * Sets the value of the adStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdStatus(Collection<AdStatusReportFilter> value) {
        this.adStatus = value;
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
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeviceTypeReportFilter> getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(Collection<DeviceTypeReportFilter> value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setLanguageCode(ArrayOfstring value) {
        this.languageCode = value;
    }

}
