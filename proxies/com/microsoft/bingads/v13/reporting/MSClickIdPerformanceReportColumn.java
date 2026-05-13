
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MSClickIdPerformanceReportColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MSClickIdPerformanceReportColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TimePeriod"/>
 *     <enumeration value="AccountId"/>
 *     <enumeration value="CampaignId"/>
 *     <enumeration value="AdGroupId"/>
 *     <enumeration value="AssetGroupId"/>
 *     <enumeration value="AdId"/>
 *     <enumeration value="MSClickId"/>
 *     <enumeration value="SearchQuery"/>
 *     <enumeration value="Keyword"/>
 *     <enumeration value="PageNumber"/>
 *     <enumeration value="TopVsOther"/>
 *     <enumeration value="BidMatchType"/>
 *     <enumeration value="Network"/>
 *     <enumeration value="DeviceType"/>
 *     <enumeration value="Country"/>
 *     <enumeration value="State"/>
 *     <enumeration value="MetroArea"/>
 *     <enumeration value="City"/>
 *     <enumeration value="Clicks"/>
 *     <enumeration value="AverageCpc"/>
 *     <enumeration value="ConversionsQualified"/>
 *     <enumeration value="Revenue"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MSClickIdPerformanceReportColumn")
@XmlEnum
public enum MSClickIdPerformanceReportColumn {

    @XmlEnumValue("TimePeriod")
    TIME_PERIOD("TimePeriod"),
    @XmlEnumValue("AccountId")
    ACCOUNT_ID("AccountId"),
    @XmlEnumValue("CampaignId")
    CAMPAIGN_ID("CampaignId"),
    @XmlEnumValue("AdGroupId")
    AD_GROUP_ID("AdGroupId"),
    @XmlEnumValue("AssetGroupId")
    ASSET_GROUP_ID("AssetGroupId"),
    @XmlEnumValue("AdId")
    AD_ID("AdId"),
    @XmlEnumValue("MSClickId")
    MS_CLICK_ID("MSClickId"),
    @XmlEnumValue("SearchQuery")
    SEARCH_QUERY("SearchQuery"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("PageNumber")
    PAGE_NUMBER("PageNumber"),
    @XmlEnumValue("TopVsOther")
    TOP_VS_OTHER("TopVsOther"),
    @XmlEnumValue("BidMatchType")
    BID_MATCH_TYPE("BidMatchType"),
    @XmlEnumValue("Network")
    NETWORK("Network"),
    @XmlEnumValue("DeviceType")
    DEVICE_TYPE("DeviceType"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("State")
    STATE("State"),
    @XmlEnumValue("MetroArea")
    METRO_AREA("MetroArea"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("Clicks")
    CLICKS("Clicks"),
    @XmlEnumValue("AverageCpc")
    AVERAGE_CPC("AverageCpc"),
    @XmlEnumValue("ConversionsQualified")
    CONVERSIONS_QUALIFIED("ConversionsQualified"),
    @XmlEnumValue("Revenue")
    REVENUE("Revenue");
    private final String value;

    MSClickIdPerformanceReportColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MSClickIdPerformanceReportColumn fromValue(String v) {
        for (MSClickIdPerformanceReportColumn c: MSClickIdPerformanceReportColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
