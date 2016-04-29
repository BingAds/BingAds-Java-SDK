
package com.microsoft.bingads.reporting;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SearchQueryPerformanceReportFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchQueryPerformanceReportFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountStatus" type="{https://bingads.microsoft.com/Reporting/v9}AccountStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdGroupStatus" type="{https://bingads.microsoft.com/Reporting/v9}AdGroupStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdStatus" type="{https://bingads.microsoft.com/Reporting/v9}AdStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="AdType" type="{https://bingads.microsoft.com/Reporting/v9}AdTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="CampaignStatus" type="{https://bingads.microsoft.com/Reporting/v9}CampaignStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="DeliveredMatchType" type="{https://bingads.microsoft.com/Reporting/v9}DeliveredMatchTypeReportFilter" minOccurs="0"/>
 *         &lt;element name="ExcludeZeroClicks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="KeywordStatus" type="{https://bingads.microsoft.com/Reporting/v9}KeywordStatusReportFilter" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="SearchQueries" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchQueryPerformanceReportFilter", propOrder = {
    "accountStatus",
    "adGroupStatus",
    "adStatus",
    "adType",
    "campaignStatus",
    "deliveredMatchType",
    "excludeZeroClicks",
    "keywordStatus",
    "languageCode",
    "searchQueries"
})
public class SearchQueryPerformanceReportFilter {

    @XmlElement(name = "AccountStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AccountStatusReportFilter> accountStatus;
    @XmlElement(name = "AdGroupStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter15 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdGroupStatusReportFilter> adGroupStatus;
    @XmlElement(name = "AdStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter10 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdStatusReportFilter> adStatus;
    @XmlElement(name = "AdType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter6 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<AdTypeReportFilter> adType;
    @XmlElement(name = "CampaignStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter9 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<CampaignStatusReportFilter> campaignStatus;
    @XmlElement(name = "DeliveredMatchType", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter14 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<DeliveredMatchTypeReportFilter> deliveredMatchType;
    @XmlElement(name = "ExcludeZeroClicks")
    protected Boolean excludeZeroClicks;
    @XmlElement(name = "KeywordStatus", type = String.class, nillable = true)
    @XmlJavaTypeAdapter(Adapter17 .class)
    @XmlSchemaType(name = "anySimpleType")
    protected Collection<KeywordStatusReportFilter> keywordStatus;
    @XmlElement(name = "LanguageCode", nillable = true)
    protected ArrayOfstring languageCode;
    @XmlElement(name = "SearchQueries", nillable = true)
    protected ArrayOfstring searchQueries;

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
     * Gets the value of the adType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<AdTypeReportFilter> getAdType() {
        return adType;
    }

    /**
     * Sets the value of the adType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdType(Collection<AdTypeReportFilter> value) {
        this.adType = value;
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
     * Gets the value of the deliveredMatchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Collection<DeliveredMatchTypeReportFilter> getDeliveredMatchType() {
        return deliveredMatchType;
    }

    /**
     * Sets the value of the deliveredMatchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveredMatchType(Collection<DeliveredMatchTypeReportFilter> value) {
        this.deliveredMatchType = value;
    }

    /**
     * Gets the value of the excludeZeroClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getExcludeZeroClicks() {
        return excludeZeroClicks;
    }

    /**
     * Sets the value of the excludeZeroClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeZeroClicks(Boolean value) {
        this.excludeZeroClicks = value;
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

    /**
     * Gets the value of the searchQueries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfstring }
     *     
     */
    public ArrayOfstring getSearchQueries() {
        return searchQueries;
    }

    /**
     * Sets the value of the searchQueries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfstring }
     *     
     */
    public void setSearchQueries(ArrayOfstring value) {
        this.searchQueries = value;
    }

}
